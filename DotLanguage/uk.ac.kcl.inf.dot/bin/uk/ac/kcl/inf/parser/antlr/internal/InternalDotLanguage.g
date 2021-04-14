/*
 * generated by Xtext 2.20.0
 */
grammar InternalDotLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.inf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.services.DotLanguageGrammarAccess;

}

@parser::members {

 	private DotLanguageGrammarAccess grammarAccess;

    public InternalDotLanguageParser(TokenStream input, DotLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DotLanguage";
   	}

   	@Override
   	protected DotLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDotLanguage
entryRuleDotLanguage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDotLanguageRule()); }
	iv_ruleDotLanguage=ruleDotLanguage
	{ $current=$iv_ruleDotLanguage.current; }
	EOF;

// Rule DotLanguage
ruleDotLanguage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDotLanguageAccess().getGraphsGraphParserRuleCall_0_0());
				}
				lv_graphs_0_1=ruleGraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDotLanguageRule());
					}
					add(
						$current,
						"graphs",
						lv_graphs_0_1,
						"uk.ac.kcl.inf.DotLanguage.Graph");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getDotLanguageAccess().getGraphsDigraphParserRuleCall_0_1());
				}
				lv_graphs_0_2=ruleDigraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDotLanguageRule());
					}
					add(
						$current,
						"graphs",
						lv_graphs_0_2,
						"uk.ac.kcl.inf.DotLanguage.Digraph");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
;

// Entry rule entryRuleGraph
entryRuleGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGraphRule()); }
	iv_ruleGraph=ruleGraph
	{ $current=$iv_ruleGraph.current; }
	EOF;

// Rule Graph
ruleGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='graph'
		{
			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphAccess().getStatementsUndirectedStatementParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleUndirectedStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"uk.ac.kcl.inf.DotLanguage.UndirectedStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDigraph
entryRuleDigraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDigraphRule()); }
	iv_ruleDigraph=ruleDigraph
	{ $current=$iv_ruleDigraph.current; }
	EOF;

// Rule Digraph
ruleDigraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='digraph'
		{
			newLeafNode(otherlv_0, grammarAccess.getDigraphAccess().getDigraphKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDigraphAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDigraphRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDigraphAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDigraphAccess().getStatementsDirectedStatementParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleDirectedStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDigraphRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"uk.ac.kcl.inf.DotLanguage.DirectedStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getDigraphAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDirectedStatement
entryRuleDirectedStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirectedStatementRule()); }
	iv_ruleDirectedStatement=ruleDirectedStatement
	{ $current=$iv_ruleDirectedStatement.current; }
	EOF;

// Rule DirectedStatement
ruleDirectedStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0());
			}
			this_NodeDeclaration_0=ruleNodeDeclaration
			{
				$current = $this_NodeDeclaration_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getDirectedStatementAccess().getDirectedEdgeDeclarationParserRuleCall_0_1());
			}
			this_DirectedEdgeDeclaration_1=ruleDirectedEdgeDeclaration
			{
				$current = $this_DirectedEdgeDeclaration_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_0());
			}
			    |
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_1_1());
			}
		)?
	)
;

// Entry rule entryRuleUndirectedStatement
entryRuleUndirectedStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUndirectedStatementRule()); }
	iv_ruleUndirectedStatement=ruleUndirectedStatement
	{ $current=$iv_ruleUndirectedStatement.current; }
	EOF;

// Rule UndirectedStatement
ruleUndirectedStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getUndirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0());
			}
			this_NodeDeclaration_0=ruleNodeDeclaration
			{
				$current = $this_NodeDeclaration_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getUndirectedStatementAccess().getUndirectedEdgeDeclarationParserRuleCall_0_1());
			}
			this_UndirectedEdgeDeclaration_1=ruleUndirectedEdgeDeclaration
			{
				$current = $this_UndirectedEdgeDeclaration_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_0());
			}
			    |
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_1_1());
			}
		)?
	)
;

// Entry rule entryRuleNodeDeclaration
entryRuleNodeDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeDeclarationRule()); }
	iv_ruleNodeDeclaration=ruleNodeDeclaration
	{ $current=$iv_ruleNodeDeclaration.current; }
	EOF;

// Rule NodeDeclaration
ruleNodeDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getNodeDeclarationAccess().getNodeNameNodeIdParserRuleCall_0_0());
				}
				lv_nodeName_0_0=ruleNodeId
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
					}
					set(
						$current,
						"nodeName",
						lv_nodeName_0_0,
						"uk.ac.kcl.inf.DotLanguage.NodeId");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAttributeListParserRuleCall_1_0());
				}
				lv_optionalAttributes_1_0=ruleAttributeList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
					}
					set(
						$current,
						"optionalAttributes",
						lv_optionalAttributes_1_0,
						"uk.ac.kcl.inf.DotLanguage.AttributeList");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleNodeId
entryRuleNodeId returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeIdRule()); }
	iv_ruleNodeId=ruleNodeId
	{ $current=$iv_ruleNodeId.current; }
	EOF;

// Rule NodeId
ruleNodeId returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getNodeIdAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNodeIdRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleAttributeList
entryRuleAttributeList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeListRule()); }
	iv_ruleAttributeList=ruleAttributeList
	{ $current=$iv_ruleAttributeList.current; }
	EOF;

// Rule AttributeList
ruleAttributeList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeListAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeListAccess().getAttrAttributeParserRuleCall_1_0());
				}
				lv_attr_1_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeListRule());
					}
					add(
						$current,
						"attr",
						lv_attr_1_0,
						"uk.ac.kcl.inf.DotLanguage.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2=']'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributeListAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_attributeName_0_0=RULE_ID
				{
					newLeafNode(lv_attributeName_0_0, grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"attributeName",
						lv_attributeName_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getAttributeValueIDORINTParserRuleCall_2_0());
				}
				lv_attributeValue_2_0=ruleIDORINT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"attributeValue",
						lv_attributeValue_2_0,
						"uk.ac.kcl.inf.DotLanguage.IDORINT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleIDORINT
entryRuleIDORINT returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIDORINTRule()); }
	iv_ruleIDORINT=ruleIDORINT
	{ $current=$iv_ruleIDORINT.current.getText(); }
	EOF;

// Rule IDORINT
ruleIDORINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getIDORINTAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getIDORINTAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleDirectedEdgeDeclaration
entryRuleDirectedEdgeDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirectedEdgeDeclarationRule()); }
	iv_ruleDirectedEdgeDeclaration=ruleDirectedEdgeDeclaration
	{ $current=$iv_ruleDirectedEdgeDeclaration.current; }
	EOF;

// Rule DirectedEdgeDeclaration
ruleDirectedEdgeDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDirectedEdgeDeclarationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDirectedEdgeDeclarationAccess().getEdgeDirectedEdgeParserRuleCall_1_0());
				}
				lv_edge_1_0=ruleDirectedEdge
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDirectedEdgeDeclarationRule());
					}
					set(
						$current,
						"edge",
						lv_edge_1_0,
						"uk.ac.kcl.inf.DotLanguage.DirectedEdge");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeRightEdgeDeclarationParserRuleCall_2_0());
				}
				lv_secondNode_2_0=ruleRightEdgeDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDirectedEdgeDeclarationRule());
					}
					set(
						$current,
						"secondNode",
						lv_secondNode_2_0,
						"uk.ac.kcl.inf.DotLanguage.RightEdgeDeclaration");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUndirectedEdgeDeclaration
entryRuleUndirectedEdgeDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUndirectedEdgeDeclarationRule()); }
	iv_ruleUndirectedEdgeDeclaration=ruleUndirectedEdgeDeclaration
	{ $current=$iv_ruleUndirectedEdgeDeclaration.current; }
	EOF;

// Rule UndirectedEdgeDeclaration
ruleUndirectedEdgeDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUndirectedEdgeDeclarationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUndirectedEdgeDeclarationAccess().getEdgeUndirectedEdgeParserRuleCall_1_0());
				}
				lv_edge_1_0=ruleUndirectedEdge
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUndirectedEdgeDeclarationRule());
					}
					set(
						$current,
						"edge",
						lv_edge_1_0,
						"uk.ac.kcl.inf.DotLanguage.UndirectedEdge");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeRightEdgeDeclarationParserRuleCall_2_0());
				}
				lv_secondNode_2_0=ruleRightEdgeDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUndirectedEdgeDeclarationRule());
					}
					set(
						$current,
						"secondNode",
						lv_secondNode_2_0,
						"uk.ac.kcl.inf.DotLanguage.RightEdgeDeclaration");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRightEdgeDeclaration
entryRuleRightEdgeDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRightEdgeDeclarationRule()); }
	iv_ruleRightEdgeDeclaration=ruleRightEdgeDeclaration
	{ $current=$iv_ruleRightEdgeDeclaration.current; }
	EOF;

// Rule RightEdgeDeclaration
ruleRightEdgeDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRightEdgeDeclarationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_0_0());
				}
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getRightEdgeDeclarationAccess().getNodeListParserRuleCall_1());
		}
		this_NodeList_1=ruleNodeList
		{
			$current = $this_NodeList_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNodeList
entryRuleNodeList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeListRule()); }
	iv_ruleNodeList=ruleNodeList
	{ $current=$iv_ruleNodeList.current; }
	EOF;

// Rule NodeList
ruleNodeList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getNodeListAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeListRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getNodeListAccess().getNodesNodeIdCrossReference_1_0());
				}
			)
		)+
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getNodeListAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleDirectedEdge
entryRuleDirectedEdge returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDirectedEdgeRule()); }
	iv_ruleDirectedEdge=ruleDirectedEdge
	{ $current=$iv_ruleDirectedEdge.current.getText(); }
	EOF;

// Rule DirectedEdge
ruleDirectedEdge returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='->'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getDirectedEdgeAccess().getHyphenMinusGreaterThanSignKeyword());
	}
;

// Entry rule entryRuleUndirectedEdge
entryRuleUndirectedEdge returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUndirectedEdgeRule()); }
	iv_ruleUndirectedEdge=ruleUndirectedEdge
	{ $current=$iv_ruleUndirectedEdge.current.getText(); }
	EOF;

// Rule UndirectedEdge
ruleUndirectedEdge returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='--'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getUndirectedEdgeAccess().getHyphenMinusHyphenMinusKeyword());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;