package dot.library;


import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.awt.geom.Path2D.Double;

/**
 * Class representing a graph specified in Dot Language. 
 *
 */
public class DotGraph
{
    private static int STEP_LEVEL = 100;		
    
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    private HashMap<String, DotNode> nodes = new HashMap<>();
    private LinkedHashMap<DotNode, List<DotNode>> edges = new LinkedHashMap<>();
    private boolean isDirected;
    private int notConnectedY = 40;

    public DotGraph(boolean isDirected){
        this.isDirected = isDirected;
    }
    
    /**
     * Get the node in the graph corresponding to the given id. 
     * @param nodeId
     * @return
     */
    public DotNode getNode(String nodeId){
        return nodes.get(nodeId);
    }
    
    /**
     * True if the node represented by the nodeId is in the
     * graph. 
     * @param nodeId
     * @return boolean
     */
    public boolean containsNode(String nodeId){
        return nodes.containsKey(nodeId);
    }
    
    /**
     * Get the label attribute of the given node. If not defined,
     * return the name of the node. 
     * @param node
     * @return String
     */
    public String getLabel(DotNode node) {
    	if(node.getLabel() == null) {
    		return node.getName();
    	}
    	return node.getLabel();
    }
   
    /**
     * Given an id and a DotNode instagram, add node to the graph.
     * @param nodeId
     * @param node
     */
    public void addNode(String nodeId, DotNode node) {
        nodes.put(nodeId, node);
    }

    /**
     * Given two DotNode instances, add edge to the graph. 
     * @param node1
     * @param node2
     */
    public void addEdge(DotNode node1, DotNode node2){   	
        if(!edges.containsKey(node1)) {
            // First node still not in the graph so add it and
        	// connect to an empty list of second nodes. 
            List<DotNode> nodes = new ArrayList<>();
            edges.put(node1, nodes);
        }
        
        // Add the edge to the graph
        edges.get(node1).add(node2);

    }
    
    /**
     * Draw the edge between node1 and node2.
     * @param g
     * @param node1
     * @param node2
     */
    public void drawEdge(Graphics g, DotNode node1, DotNode node2) {    	   	
    	Graphics2D g2 = (Graphics2D) g;

    	// Coordinates for starting point
        int x1 = node1.getX();
        int y1 = node1.getY();
        // Coordinates for ending point
        int x2 = node2.getX();
        int y2 = node2.getY();
        
        g.drawLine(x1, y1, x2, y2);
        g2.setStroke(new BasicStroke(3));
        g2.draw(new Line2D.Float(x1, y1, x2, y2));
        
    }

    /**
     * Draw edges from starting node to all the connecting nodes. 
     * @param g
     * @param nodes
     * @param node1
     * @param currY : current y coordinate being used
     */
    public void drawMultipleChildren(Graphics g, List<DotNode> nodes, DotNode node1, int currY){
        int node1X = node1.getX();				
        int middleInd = nodes.size() / 2;       // index of middle element 
        DotNode middleNode = null;              // placeholder for the middle element, if odd size
        boolean even = nodes.size() % 2 == 0;   // boolean to check if even number of nodes

        // If odd number of nodes, set the middle one to go immediately below node1
        // and draw the edge from node1 to it
        if(!even) {
            middleNode = nodes.get(middleInd);
            middleNode.setCoords(node1X, currY);
            drawEdge(g, node1, middleNode);
        }

        // variables to the decide the position of each node, depending on the
        // available space 
        int steps = 1;
        int width = node1X * 2;
        int x = even ?  width / ( nodes.size()*2 ) : width / ( (nodes.size()-1) *2 );
        
        for(DotNode node2 : nodes){
            if(node2.equals(middleNode)){
                // middle node has already been drawn, so continue
                continue;
            }
            node2.setCoords(x*steps, currY);
            steps += 2;
            drawEdge(g, node1, node2);
        }
    }
    
    /**
     * Given an instance of a DotNode, draw the node with the previously
     * specified attributes. 
     * @param g
     * @param node
     * @param height
     * @param width
     * @param x
     * @param y
     */
    public  void drawNode(Graphics g, DotNode node, int height, int width, int x, int y){
    	g.setColor(node.getFillColor());
        g.fillOval(x, y, width, height);
        
        g.setColor(node.getLineColor());
        g.drawOval(x, y, width, height);
        
        //reset color
        g.setColor(new Color(0,0,0)); 
        
        // draw the label of the node 
        int labelX = node.getX() - (width/3);
        int labelY = node.getY();
        g.drawString(getLabel(node), labelX, labelY); 
    }

    /**
     * Draw the graph with the information hold in the fields. 
     * @param g
     * @param width
     * @param height
     */
    public void create(Graphics g, int width, int height){
        FontMetrics f = g.getFontMetrics();

        // Coordinates for the top node
        int currLevelX = width / 2;
        int currLevelY = 50;

        // Draw edges
        for(DotNode source : edges.keySet()) {
            List<DotNode> endNodes = edges.get(source);
            if( source.getY() == 0) {
                // Top node, so we set the coordinates
                source.setCoords(currLevelX, currLevelY);
            } else {
                // Get X coordinate of the source
                currLevelX = source.getX();
            }
            currLevelY += STEP_LEVEL;

            if(endNodes.size() > 1) {
                // Source node connected to more than one edge
                drawMultipleChildren(g, endNodes, source, currLevelY);
            } else {
                // Only one node, so it goes immediately below
                DotNode node = endNodes.get(0);
                node.setCoords(currLevelX, currLevelY);
                drawEdge(g, source, node);
            }
        }

        // Draw nodes
        for(DotNode node : nodes.values()) {
        	// Decide the dimensions of the node depending on the label.
        	int nodeHeight = Math.max(50, f.getHeight());
            int nodeWidth = Math.max(50, f.stringWidth(getLabel(node))+50/2);
            
            // If a node is isolated, draw on a side
            if(!node.isConnected()) {
        		node.setCoords(50, notConnectedY);
            	notConnectedY += (nodeHeight + 5);
        	}
            
            // Get the upper left coordinates for the node. 
            int upperLeftX = node.getX() - (nodeWidth/2);
            int upperLeftY = node.getY() - (nodeHeight/2);
            
            drawNode(g, node, nodeHeight, nodeWidth, upperLeftX, upperLeftY);       	            	                      
        }
    }    
    
}
