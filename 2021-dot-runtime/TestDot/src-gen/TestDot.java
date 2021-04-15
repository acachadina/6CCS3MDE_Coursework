
import dot.library.*;
import java.util.HashMap;
import java.util.ArrayList;


public class TestDot {
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
				addNode("anna", "node1", attributes, true);
				attributes.clear();
				
				attributes.put("color","blue");
				attributes.put("marta","hola");
				attributes.put("label","123");
				addNode("anna", "node2", attributes, true);
				attributes.clear();
				
				addNode("anna", "node3", null, true);
				
				addNode("anna", "node4", null, true);
				
				secondNodes.add("node2");		
				secondNodes.add("node3");		
				addEdge("anna", "node1", secondNodes); 
				secondNodes.clear();
				
				secondNodes.add("node4");		
				addEdge("anna", "node3", secondNodes); 
				secondNodes.clear();
				
				// Add graphs to the canvas
				addGraphs();
			}
			
		};
						
		// Draw the graphs
		dot.run();
	}
}

