/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.dotLanguage.DotLanguage
import uk.ac.kcl.inf.dotLanguage.Graph
import uk.ac.kcl.inf.dotLanguage.Digraph
import uk.ac.kcl.inf.dotLanguage.NodeDeclaration
import uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration
import uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration
import uk.ac.kcl.inf.dotLanguage.NodeId
import uk.ac.kcl.inf.dotLanguage.NodeList
import uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DotLanguageGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as DotLanguage
		
		val className = resource.deriveClassName
		fsa.generateFile(className + ".java", model.doGenerateClass(className))
		
				
	}
		
	def deriveClassName(Resource resource) {
		val originalFilename = resource.URI.lastSegment
		
		// string to the first dot
		originalFilename.substring(0, originalFilename.indexOf('.')).toFirstUpper + "Dot"
		
	}
	
	
	def doGenerateClass(DotLanguage program, String className) '''
		
		import dot.library.*;
		import java.util.HashMap;
		import java.util.ArrayList;
		
		
		public class «className» {
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
						« program.graphs.map[generateGraphStatements].join("\n")»	
						
						// Add graphs to the canvas
						addGraphs();
					}
					
				};
								
				// Draw the graphs
				dot.run();
			}
		}
		
	'''
		
	dispatch def generateGraphStatements(Graph graph) '''
		« graph.statements.map[generateGraphCreationStatements(graph)].join("\n")»
	'''
	
	dispatch def generateGraphStatements(Digraph digraph)'''
		« digraph.statements.map[generateGraphCreationStatements(digraph)].join("\n")»
	'''
	
	// GRAPHS: 
	dispatch def generateGraphCreationStatements(NodeDeclaration node, Graph graph)'''		
		«node.nodeDeclarationStatement(graph.name)»
	'''
	dispatch def generateGraphCreationStatements(UndirectedEdgeDeclaration edge, Graph graph)'''		
		«edge.secondNode.getRightSideEdgeDeclaration»
		«edgeDeclarationStatement(graph.name, edge.firstNode.name)»
	'''		
		
	//DIGRAPHS
	dispatch def generateGraphCreationStatements(NodeDeclaration node, Digraph digraph)'''
		«node.nodeDeclarationStatement(digraph.name)»	
	'''
	
	dispatch def generateGraphCreationStatements(DirectedEdgeDeclaration edge, Digraph digraph)'''
		«edge.secondNode.getRightSideEdgeDeclaration»
		«edgeDeclarationStatement(digraph.name, edge.firstNode.name)»
	'''
	
	//	GENERAL
	def nodeDeclarationStatement(NodeDeclaration node, String graphName)'''
		«IF node.optionalAttributes === null»
			addNode("«graphName»", "«node.nodeName.name»", null, true);
		«ELSE»
			«FOR attr : node.optionalAttributes.attr»
				attributes.put("«attr.attributeName»","«attr.attributeValue»");
			«ENDFOR »
			addNode("«graphName»", "«node.nodeName.name»", attributes, true);
			attributes.clear();
		«ENDIF»				
	'''
	
	def edgeDeclarationStatement(String graphName, String firstNodeName)'''
		addEdge("«graphName»", "«firstNodeName»", secondNodes); 
		secondNodes.clear();
	'''	
	
	dispatch def getRightSideEdgeDeclaration(RightEdgeDeclaration node)'''
		secondNodes.add("«node.secondNode.name»");		
	'''
	
	dispatch def getRightSideEdgeDeclaration(NodeList nodeList)'''
		«FOR node : nodeList.nodes»
		 	secondNodes.add("«node.name»");		
		 «ENDFOR »
	'''
	
		
}
