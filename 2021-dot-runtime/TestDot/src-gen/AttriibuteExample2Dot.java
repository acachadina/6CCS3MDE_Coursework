
import dot.library.*;
import java.util.HashMap;
import java.util.ArrayList;


public class AttriibuteExample2Dot {
	public static void main (String args[]){
		DotFrame tf = new DotFrame();
		
		Dot dot = new Dot(tf){
			@Override
			
			public void run() {
				// Placeholders for the attributes and, in case of a declaration of a subgraph,
				// the nodes that are connected to the source node
				HashMap<String, String> attributes = new HashMap<>();
				ArrayList<String> secondNodes = new ArrayList<>();
				
				// Add defined nodes and edges
				attributes.put("fillColor","red");
				attributes.put("lineColor","blue");
				attributes.put("label","LABEL");
				addNode("example", "node1", attributes, true);
				attributes.clear();
				
				addNode("example", "node2", null, true);
				
				addNode("example", "node3", null, true);
				
				secondNodes.add("node2");		
				secondNodes.add("node3");		
							
				addEdge("example", "node1", secondNodes); 
				secondNodes.clear();
				
				// Add graphs to the canvas
				addGraphs();
			}
			
		};
						
		// Draw the graphs
		dot.run();
	}
}

