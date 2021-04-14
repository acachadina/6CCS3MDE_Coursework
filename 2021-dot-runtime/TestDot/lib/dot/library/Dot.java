package dot.library;

import java.util.HashMap;

public abstract class Dot
{
    public static void main(String[] args) {
        DotFrame df = new DotFrame();

        Dot dot = new Dot(df)
        {
            @Override
            public void run() {
                addNode("anna", "node1", null, false);
                addNode("anna", "node2", null, false);
                addNode("anna", "node3", null, false);
                addNode("anna", "node4", null, false);
                addNode("anna", "node5", null, false);


                addEdge("anna", "node1", "node2");
                addEdge("anna", "node2", "node3");
                addEdge("anna", "node1", "node4");
                addEdge("anna", "node3", "node5");

                addGraphs();
            }
        };

        dot.run();
    }

    // Maps the graph ID to the graph
    private HashMap<String, DotGraph> graphs = new HashMap<>();
    private DotFrame df;

    public Dot(DotFrame df) {
        this.df = df;
    }

    protected void addNode(String graphID, String nodeName, HashMap<String, String> attributes, boolean directed) {
        System.out.println("Adding node: " + nodeName);
        // get attributes in code generation:
        // graph.optionalAttributes.attributes

        // TODO: Put here necessary "preprocessing"
        if(! graphs.containsKey(graphID)){
            graphs.put(graphID, new DotGraph(directed));
        }

        DotGraph graph = graphs.get(graphID);
        
        Attributes attr;
        
        if(attributes != null) {
        	attr = new Attributes(attributes);
        } else {
        	attr = new Attributes();
        }
        
        DotNode node = new DotNode(nodeName, attr);

        System.out.println("Node object created!! Adding node to graph:");
        System.out.println(node);
        graph.addNode(nodeName, node);

    }

    protected void addEdge(String graphID, String firstNode, String secondNode){
        // DirectedEdgeDeclaration.firstNode // .secondNode
        DotGraph graph = graphs.get(graphID);
        DotNode node1, node2;

        if(graph.containsNode(firstNode)) {
            node1 = graph.getNode(firstNode);
            node1.setConnected();
        } else{
            node1 = new DotNode(firstNode, new Attributes());
        }

        if(graph.containsNode(secondNode)) {
            node2 = graph.getNode(secondNode);
            node2.setConnected();
        } else{
            node2 = new DotNode(secondNode, new Attributes());
        }

        graph.addEdge(node1, node2);

    }

    protected void addGraphs(){
        df.addGraphs(graphs);
    }

    public abstract void run();
}
