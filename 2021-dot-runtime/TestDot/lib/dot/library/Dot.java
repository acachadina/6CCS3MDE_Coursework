package dot.library;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class to create Dot graphs.
 *
 */
public abstract class Dot
{
    
    private HashMap<String, DotGraph> graphs;	// Maps the graph ID to the graph		
    private DotFrame df;						// Frame for the UI.

    public Dot(DotFrame df) {
        this.df = df;
        this.graphs = new HashMap<>();
    }

    /**
     * Add a node to the graph corresponding to graphId. A node can have attributes 
     * and can be part from a directed or undirected graph. 
     * @param graphID : id of the graph where the node will be added
     * @param nodeName : specified name for the node
     * @param attributes : list of attributes for the node (can be null)
     * @param isDirected : true if the node is part of a directed graph 
     */
    protected void addNode(String graphId, String nodeName, 
    		HashMap<String, String> attributes, boolean isDirected) {
    	// Get the graph corresponding to the given ID
        DotGraph graph = getGraph(graphId, isDirected);        
        
        Attributes attr;
        if(attributes != null) {
        	// If attributes are defined, create Attributes object with them.
        	attr = new Attributes(attributes);
        } else {
        	// If null, initialize to default attributes.
        	attr = new Attributes();
        }        
        
        DotNode node = new DotNode(nodeName, attr);
        graph.addNode(nodeName, node);

    }
    
    /**
     * Add an edge to the graph corresponding to graphId. An edge can connect
     * a node with another node or a node with a group of other nodes. 
     * @param graphId : id of the graph where the node will be added
     * @param firstNode : starting node of the edge
     * @param secondNodes : List of nodes to which the first one is connected.
     */
    protected void addEdge(String graphId, String firstNode, 
    		ArrayList<String> secondNodes){
       
        DotGraph graph = graphs.get(graphId);
        DotNode node1, node2;

        // Get the first node of the edge and set as connected
        node1 = graph.getNode(firstNode);
        node1.setConnected();
        
        // Create an edge from the first node to every second node.
        for(String secondNode : secondNodes) {
        	node2 = graph.getNode(secondNode);
            node2.setConnected();
        	
        	graph.addEdge(node1, node2);	
        }
    }
    
    /**
     * Get the graph corresponding to the graphId. If it doesn't exist
     * yet, create one.
     * @param graphId : id of the graph to return or create
     * @param isDirected : True if the graph is directed
     * @return DotGraph
     */
    private DotGraph getGraph(String graphId, boolean isDirected) {
    	if(! graphs.containsKey(graphId)){
            graphs.put(graphId, new DotGraph(isDirected));
        }

        return graphs.get(graphId);
    }
    
    /**
     * Add graphs to the frame.
     */
    protected void addGraphs(){
        df.addGraphs(graphs);
    }
    
    public abstract void run();
}
