
import dot.library.*;

public class TestDot {
	public static void main (String args[]){
		DotFrame tf = new DotFrame();
		
		Dot dot = new Dot(tf){
			@Override
			
			public void run() {
			addNode("anna", "node1", null, false);
			
			addNode("anna", "node2", null, false);
			
			addNode("anna", "node3", null, false);
			
			addNode("anna", "node4", null, false);
			
			addNode("anna", "node5", null, false);
			
			addNode("anna", "node6", null, false);
			
			addEdge("anna", "node1", "node2"); 
			
			addEdge("anna", "node1", "node3"); 
			addGraphs();
			}
			
		};
		
		dot.run();
	}
}

