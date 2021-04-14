/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.dotLanguage.Attribute;
import uk.ac.kcl.inf.dotLanguage.AttributeList;
import uk.ac.kcl.inf.dotLanguage.Digraph;
import uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.DirectedSubgraphDeclaration;
import uk.ac.kcl.inf.dotLanguage.DotLanguage;
import uk.ac.kcl.inf.dotLanguage.DotLanguagePackage;
import uk.ac.kcl.inf.dotLanguage.Graph;
import uk.ac.kcl.inf.dotLanguage.NodeDeclaration;
import uk.ac.kcl.inf.dotLanguage.NodeId;
import uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.UndirectedSubgraphDeclaration;
import uk.ac.kcl.inf.services.DotLanguageGrammarAccess;

@SuppressWarnings("all")
public class DotLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DotLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DotLanguagePackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case DotLanguagePackage.ATTRIBUTE_LIST:
				sequence_AttributeList(context, (AttributeList) semanticObject); 
				return; 
			case DotLanguagePackage.DIGRAPH:
				sequence_Digraph(context, (Digraph) semanticObject); 
				return; 
			case DotLanguagePackage.DIRECTED_EDGE_DECLARATION:
				sequence_DirectedEdgeDeclaration(context, (DirectedEdgeDeclaration) semanticObject); 
				return; 
			case DotLanguagePackage.DIRECTED_SUBGRAPH_DECLARATION:
				sequence_DirectedSubgraphDeclaration(context, (DirectedSubgraphDeclaration) semanticObject); 
				return; 
			case DotLanguagePackage.DOT_LANGUAGE:
				sequence_DotLanguage(context, (DotLanguage) semanticObject); 
				return; 
			case DotLanguagePackage.GRAPH:
				sequence_Graph(context, (Graph) semanticObject); 
				return; 
			case DotLanguagePackage.NODE_DECLARATION:
				sequence_NodeDeclaration(context, (NodeDeclaration) semanticObject); 
				return; 
			case DotLanguagePackage.NODE_ID:
				sequence_NodeId(context, (NodeId) semanticObject); 
				return; 
			case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION:
				sequence_UndirectedEdgeDeclaration(context, (UndirectedEdgeDeclaration) semanticObject); 
				return; 
			case DotLanguagePackage.UNDIRECTED_SUBGRAPH_DECLARATION:
				sequence_UndirectedSubgraphDeclaration(context, (UndirectedSubgraphDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AttributeList returns AttributeList
	 *
	 * Constraint:
	 *     attr+=Attribute+
	 */
	protected void sequence_AttributeList(ISerializationContext context, AttributeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (attributeName=ID attributeValue=ID)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DotLanguagePackage.Literals.ATTRIBUTE__ATTRIBUTE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotLanguagePackage.Literals.ATTRIBUTE__ATTRIBUTE_NAME));
			if (transientValues.isValueTransient(semanticObject, DotLanguagePackage.Literals.ATTRIBUTE__ATTRIBUTE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotLanguagePackage.Literals.ATTRIBUTE__ATTRIBUTE_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0(), semanticObject.getAttributeName());
		feeder.accept(grammarAccess.getAttributeAccess().getAttributeValueIDTerminalRuleCall_2_0(), semanticObject.getAttributeValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Digraph returns Digraph
	 *
	 * Constraint:
	 *     (name=ID statements+=DirectedStatement*)
	 */
	protected void sequence_Digraph(ISerializationContext context, Digraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DirectedStatement returns DirectedEdgeDeclaration
	 *     DirectedEdgeDeclaration returns DirectedEdgeDeclaration
	 *
	 * Constraint:
	 *     (firstNode=[NodeId|ID] directedEdge=DirectedEdge secondNode=[NodeId|ID])
	 */
	protected void sequence_DirectedEdgeDeclaration(ISerializationContext context, DirectedEdgeDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DotLanguagePackage.Literals.DIRECTED_EDGE_DECLARATION__FIRST_NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotLanguagePackage.Literals.DIRECTED_EDGE_DECLARATION__FIRST_NODE));
			if (transientValues.isValueTransient(semanticObject, DotLanguagePackage.Literals.DIRECTED_EDGE_DECLARATION__DIRECTED_EDGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotLanguagePackage.Literals.DIRECTED_EDGE_DECLARATION__DIRECTED_EDGE));
			if (transientValues.isValueTransient(semanticObject, DotLanguagePackage.Literals.DIRECTED_EDGE_DECLARATION__SECOND_NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotLanguagePackage.Literals.DIRECTED_EDGE_DECLARATION__SECOND_NODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdIDTerminalRuleCall_0_0_1(), semanticObject.eGet(DotLanguagePackage.Literals.DIRECTED_EDGE_DECLARATION__FIRST_NODE, false));
		feeder.accept(grammarAccess.getDirectedEdgeDeclarationAccess().getDirectedEdgeDirectedEdgeParserRuleCall_1_0(), semanticObject.getDirectedEdge());
		feeder.accept(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeNodeIdIDTerminalRuleCall_2_0_1(), semanticObject.eGet(DotLanguagePackage.Literals.DIRECTED_EDGE_DECLARATION__SECOND_NODE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DirectedStatement returns DirectedSubgraphDeclaration
	 *     DirectedSubgraphDeclaration returns DirectedSubgraphDeclaration
	 *
	 * Constraint:
	 *     (name=ID statements+=DirectedStatement*)
	 */
	protected void sequence_DirectedSubgraphDeclaration(ISerializationContext context, DirectedSubgraphDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DotLanguage returns DotLanguage
	 *
	 * Constraint:
	 *     (graphs+=Graph | graphs+=Digraph)+
	 */
	protected void sequence_DotLanguage(ISerializationContext context, DotLanguage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Graph returns Graph
	 *
	 * Constraint:
	 *     (name=ID statements+=UndirectedStatement*)
	 */
	protected void sequence_Graph(ISerializationContext context, Graph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DirectedStatement returns NodeDeclaration
	 *     UndirectedStatement returns NodeDeclaration
	 *     NodeDeclaration returns NodeDeclaration
	 *
	 * Constraint:
	 *     (nodeName=NodeId optionalAttributes=AttributeList?)
	 */
	protected void sequence_NodeDeclaration(ISerializationContext context, NodeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NodeId returns NodeId
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NodeId(ISerializationContext context, NodeId semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DotLanguagePackage.Literals.NODE_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotLanguagePackage.Literals.NODE_ID__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNodeIdAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UndirectedStatement returns UndirectedEdgeDeclaration
	 *     UndirectedEdgeDeclaration returns UndirectedEdgeDeclaration
	 *
	 * Constraint:
	 *     (firstNode=[NodeId|ID] undirectedEdge=UndirectedEdge secondNode=[NodeId|ID])
	 */
	protected void sequence_UndirectedEdgeDeclaration(ISerializationContext context, UndirectedEdgeDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DotLanguagePackage.Literals.UNDIRECTED_EDGE_DECLARATION__FIRST_NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotLanguagePackage.Literals.UNDIRECTED_EDGE_DECLARATION__FIRST_NODE));
			if (transientValues.isValueTransient(semanticObject, DotLanguagePackage.Literals.UNDIRECTED_EDGE_DECLARATION__UNDIRECTED_EDGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotLanguagePackage.Literals.UNDIRECTED_EDGE_DECLARATION__UNDIRECTED_EDGE));
			if (transientValues.isValueTransient(semanticObject, DotLanguagePackage.Literals.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotLanguagePackage.Literals.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdIDTerminalRuleCall_0_0_1(), semanticObject.eGet(DotLanguagePackage.Literals.UNDIRECTED_EDGE_DECLARATION__FIRST_NODE, false));
		feeder.accept(grammarAccess.getUndirectedEdgeDeclarationAccess().getUndirectedEdgeUndirectedEdgeParserRuleCall_1_0(), semanticObject.getUndirectedEdge());
		feeder.accept(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeNodeIdIDTerminalRuleCall_2_0_1(), semanticObject.eGet(DotLanguagePackage.Literals.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UndirectedStatement returns UndirectedSubgraphDeclaration
	 *     UndirectedSubgraphDeclaration returns UndirectedSubgraphDeclaration
	 *
	 * Constraint:
	 *     (name=ID statements+=UndirectedStatement*)
	 */
	protected void sequence_UndirectedSubgraphDeclaration(ISerializationContext context, UndirectedSubgraphDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
