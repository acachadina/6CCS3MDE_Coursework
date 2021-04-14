
import dot.library.*;
import java.util.HashMap;

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
			attrnode2.put("label","node2");
			addNode("anna", "node2", attrnode2, false);
			
			addNode("anna", "node3", null, false);
			
			addEdge("anna", "node1", "node2"); 
			
			addEdge("anna", "node1", "node3"); 
			addGraphs();
			}
			
		};
		
		dot.run();
	}
}

