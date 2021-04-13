/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.kcl.inf.ide.contentassist.antlr.internal.InternalDotLanguageParser;
import uk.ac.kcl.inf.services.DotLanguageGrammarAccess;

public class DotLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DotLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DotLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDotLanguageAccess().getGraphsAlternatives_0(), "rule__DotLanguage__GraphsAlternatives_0");
			builder.put(grammarAccess.getDirectedStatementAccess().getAlternatives_0(), "rule__DirectedStatement__Alternatives_0");
			builder.put(grammarAccess.getDirectedStatementAccess().getAlternatives_1(), "rule__DirectedStatement__Alternatives_1");
			builder.put(grammarAccess.getUndirectedStatementAccess().getAlternatives_0(), "rule__UndirectedStatement__Alternatives_0");
			builder.put(grammarAccess.getUndirectedStatementAccess().getAlternatives_1(), "rule__UndirectedStatement__Alternatives_1");
			builder.put(grammarAccess.getColorAccess().getAlternatives(), "rule__Color__Alternatives");
			builder.put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
			builder.put(grammarAccess.getDigraphAccess().getGroup(), "rule__Digraph__Group__0");
			builder.put(grammarAccess.getDirectedStatementAccess().getGroup(), "rule__DirectedStatement__Group__0");
			builder.put(grammarAccess.getUndirectedStatementAccess().getGroup(), "rule__UndirectedStatement__Group__0");
			builder.put(grammarAccess.getDirectedSubgraphDeclarationAccess().getGroup(), "rule__DirectedSubgraphDeclaration__Group__0");
			builder.put(grammarAccess.getUndirectedSubgraphDeclarationAccess().getGroup(), "rule__UndirectedSubgraphDeclaration__Group__0");
			builder.put(grammarAccess.getNodeDeclarationAccess().getGroup(), "rule__NodeDeclaration__Group__0");
			builder.put(grammarAccess.getAttributeListAccess().getGroup(), "rule__AttributeList__Group__0");
			builder.put(grammarAccess.getAttributeListAccess().getGroup_2(), "rule__AttributeList__Group_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getDirectedEdgeDeclarationAccess().getGroup(), "rule__DirectedEdgeDeclaration__Group__0");
			builder.put(grammarAccess.getUndirectedEdgeDeclarationAccess().getGroup(), "rule__UndirectedEdgeDeclaration__Group__0");
			builder.put(grammarAccess.getDotLanguageAccess().getGraphsAssignment(), "rule__DotLanguage__GraphsAssignment");
			builder.put(grammarAccess.getGraphAccess().getNameAssignment_1(), "rule__Graph__NameAssignment_1");
			builder.put(grammarAccess.getGraphAccess().getStatementsAssignment_3(), "rule__Graph__StatementsAssignment_3");
			builder.put(grammarAccess.getDigraphAccess().getNameAssignment_1(), "rule__Digraph__NameAssignment_1");
			builder.put(grammarAccess.getDigraphAccess().getStatementsAssignment_3(), "rule__Digraph__StatementsAssignment_3");
			builder.put(grammarAccess.getDirectedSubgraphDeclarationAccess().getNameAssignment_1(), "rule__DirectedSubgraphDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getDirectedSubgraphDeclarationAccess().getStatementsAssignment_3(), "rule__DirectedSubgraphDeclaration__StatementsAssignment_3");
			builder.put(grammarAccess.getUndirectedSubgraphDeclarationAccess().getNameAssignment_1(), "rule__UndirectedSubgraphDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getUndirectedSubgraphDeclarationAccess().getStatementsAssignment_3(), "rule__UndirectedSubgraphDeclaration__StatementsAssignment_3");
			builder.put(grammarAccess.getNodeDeclarationAccess().getNodeNameAssignment_0(), "rule__NodeDeclaration__NodeNameAssignment_0");
			builder.put(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAssignment_1(), "rule__NodeDeclaration__OptionalAttributesAssignment_1");
			builder.put(grammarAccess.getNodeIdAccess().getNameAssignment(), "rule__NodeId__NameAssignment");
			builder.put(grammarAccess.getAttributeListAccess().getAttrAssignment_1(), "rule__AttributeList__AttrAssignment_1");
			builder.put(grammarAccess.getAttributeListAccess().getAttrAssignment_2_1(), "rule__AttributeList__AttrAssignment_2_1");
			builder.put(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0(), "rule__Attribute__AttributeNameAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2(), "rule__Attribute__AttributeValueAssignment_2");
			builder.put(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeAssignment_0(), "rule__DirectedEdgeDeclaration__FirstNodeAssignment_0");
			builder.put(grammarAccess.getDirectedEdgeDeclarationAccess().getEdgeAssignment_1(), "rule__DirectedEdgeDeclaration__EdgeAssignment_1");
			builder.put(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeAssignment_2(), "rule__DirectedEdgeDeclaration__SecondNodeAssignment_2");
			builder.put(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeAssignment_0(), "rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0");
			builder.put(grammarAccess.getUndirectedEdgeDeclarationAccess().getEdgeAssignment_1(), "rule__UndirectedEdgeDeclaration__EdgeAssignment_1");
			builder.put(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeAssignment_2(), "rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DotLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalDotLanguageParser createParser() {
		InternalDotLanguageParser result = new InternalDotLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DotLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DotLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
