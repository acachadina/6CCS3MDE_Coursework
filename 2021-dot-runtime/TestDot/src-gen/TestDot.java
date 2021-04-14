
import dot.library.*;
import java.util.HashMap;
import java.util.ArrayList;


public class TestDot {
	public static void main (String args[]){
		DotFrame tf = new DotFrame();
		
		Dot dot = new Dot(tf){
			@Override
			
			public void run() {
				HashMap<String, String> attributes = new HashMap<>();
				ArrayList<String> secondNodes = new ArrayList<>();
				attributes.put("color","red");
				attributes.put("label","node1");
				addNode("anna", "node1", attributes, false);
				attributes.clear();
				
				attributes.put("color","blue");
				attributes.put("marta","hola");
				attributes.put("label","123");
				addNode("anna", "node2", attributes, false);
				attributes.clear();
				
				addNode("anna", "node3", null, false);
				attributes.clear();
				
				addNode("anna", "node4", null, false);
				attributes.clear();
				
				secondNodes.add("node2");		
				secondNodes.add("node3");		
				addEdge("anna", "node1", secondNodes); 
				secondNodes.clear();
				addGraphs();
			}
			
		};
		
		dot.run();
	}
}

