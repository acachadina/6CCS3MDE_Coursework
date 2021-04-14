
import dot.library.*;
import java.util.HashMap;
import java.util.ArrayList;


public class TestDot {
	public static void main (String args[]){
		DotFrame tf = new DotFrame();
		
		Dot dot = new Dot(tf){
			@Override
			
			public void run() {
			HashMap<String, String> attrnode1 = new HashMap<>();
			attrnode1.put("color","red");
			attrnode1.put("label","node1");
			addNode("anna", "node1", attrnode1, false);
			
			HashMap<String, String> attrnode2 = new HashMap<>();
			attrnode2.put("color","blue");
			attrnode2.put("marta","hola");
			attrnode2.put("label","hello");
			addNode("anna", "node2", attrnode2, false);
			
			addNode("anna", "node3", null, false);
			
			ArrayList<String> secondNodes = new ArrayList<>();
			secondNodes.add("node2");		
			secondNodes.add("node3");		
			addEdge("anna", "node1", secondNodes); 
			addGraphs();
			}
			
		};
		
		dot.run();
	}
}

