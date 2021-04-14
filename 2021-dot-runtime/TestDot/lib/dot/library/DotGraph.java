package dot.library;

import org.w3c.dom.Attr;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.awt.geom.Line2D.Float;

public class DotGraph
{
    private static int STEP_LEVEL = 100;

    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private HashMap<String, DotNode> nodes = new HashMap<>();
    private LinkedHashMap<DotNode, List<DotNode>> edges = new LinkedHashMap<>();
    private Attributes attributes = new Attributes();
    private boolean isDirected;

    public DotGraph(boolean isDirected){
        this.isDirected = isDirected;
    }

    public DotNode getNode(String nodeId){
        return nodes.get(nodeId);
    }

    public boolean containsNode(String nodeId){
        return nodes.containsKey(nodeId);
    }

    public void addNode(String nodeId, DotNode node) {
        nodes.put(nodeId, node);
    }

    public void addEdge(DotNode node1, DotNode node2){
        if(!edges.containsKey(node1)) {
            // source node still not in the map, so add with empty list
            List<DotNode> nodes = new ArrayList<>();
            edges.put(node1, nodes);

        }
        edges.get(node1).add(node2);

    }

    public Color getColor(DotNode node){
        // chekc if node has defined attributes, otherwise take the ones
        // for the graph
        Color nodeColor = node.getColor();

        if(nodeColor == null){
            return attributes.getColor();
        }

        return node.getColor();
    }

    public void drawEdge(Graphics g, DotNode node1, DotNode node2) {
        //TODO; if directed, add arrowz

        int x1 = node1.getX();
        int y1 = node1.getY();
        int x2 = node2.getX();
        int y2 = node2.getY();
        g.drawLine(x1, y1, x2, y2);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g2.draw(new Line2D.Float(x1, y1, x2, y2));
    }

    public void drawMultipleChildren(Graphics g, List<DotNode> nodes, DotNode source, int currY){
        int sourceX = source.getX();
        int middleInd = nodes.size() / 2;       // index of middle element
        DotNode middleNode = null;              // placeholder for the middle element, if odd size
        boolean even = nodes.size() % 2 == 0;   // boolean to check if even number of nodes

        // if odd number of nodes, set the middle one to go immediately below source
        // and draw the edge from source to it
        if(!even) {
            middleNode = nodes.get(middleInd);
            middleNode.setCoords(sourceX, currY);
            drawEdge(g, source, middleNode);
        }

        // variables to the decide the position of each node, depending on the
        // space available
        int steps = 1;
        int width = sourceX * 2;
        int x = even ?  width / ( nodes.size()*2 ) : width / ( (nodes.size()-1) *2 );
        for(DotNode node : nodes){
            if(node.equals(middleNode)){
                // middle node has already been drawn, so continue
                continue;
            }
            node.setCoords(x*steps, currY);
            steps += 2;
            drawEdge(g, source, node);

        }

    }

    public  void drawNode(Graphics g, DotNode node, int height, int width){
        // given the center coordinates of the circle, get the
        // ones for the upper left corner
        int upperLeftX = node.getX() - (width/2);
        int upperLeftY = node.getY() - (height/2);

        if(node.getX() != 0 && node.getY() != 0) {
            g.setColor(getColor(node));
            g.fillOval(upperLeftX, upperLeftY, width, height);
            g.drawOval(upperLeftX, upperLeftY, 50, 50);
            g.drawString(node.getLabel(), node.getX(), node.getY());
        }
    }

    public void create(Graphics g, int width, int height){
    	System.out.println("Starting to draw. ");
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
        
        System.out.println("Edges drawn ");

        // Draw nodes
        for(DotNode node : nodes.values()) {
            // int nodeHeight = Math.max(height, f.getHeight());
            // int nodeWidth = Math.max(width, f.stringWidint nodeHeight = Math.max(height, f.getHeight());
            int nodeHeight = 50;
            int nodeWidth = 50;

            drawNode(g, node, nodeHeight, nodeWidth);
        }
        
        System.out.println("Nodes drawn ");
    }
}
