package uk.ac.kcl.inf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.services.DotLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'{'", "'}'", "'digraph'", "','", "';'", "'['", "']'", "'label='", "'color='", "'->'", "'--'", "'red'", "'blue'", "'green'", "'black'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDotLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDotLanguage.g"; }



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




    // $ANTLR start "entryRuleDotLanguage"
    // InternalDotLanguage.g:65:1: entryRuleDotLanguage returns [EObject current=null] : iv_ruleDotLanguage= ruleDotLanguage EOF ;
    public final EObject entryRuleDotLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotLanguage = null;


        try {
            // InternalDotLanguage.g:65:52: (iv_ruleDotLanguage= ruleDotLanguage EOF )
            // InternalDotLanguage.g:66:2: iv_ruleDotLanguage= ruleDotLanguage EOF
            {
             newCompositeNode(grammarAccess.getDotLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDotLanguage=ruleDotLanguage();

            state._fsp--;

             current =iv_ruleDotLanguage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotLanguage"


    // $ANTLR start "ruleDotLanguage"
    // InternalDotLanguage.g:72:1: ruleDotLanguage returns [EObject current=null] : ( ( (lv_graphs_0_1= ruleGraph | lv_graphs_0_2= ruleDigraph ) ) )* ;
    public final EObject ruleDotLanguage() throws RecognitionException {
        EObject current = null;

        EObject lv_graphs_0_1 = null;

        EObject lv_graphs_0_2 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:78:2: ( ( ( (lv_graphs_0_1= ruleGraph | lv_graphs_0_2= ruleDigraph ) ) )* )
            // InternalDotLanguage.g:79:2: ( ( (lv_graphs_0_1= ruleGraph | lv_graphs_0_2= ruleDigraph ) ) )*
            {
            // InternalDotLanguage.g:79:2: ( ( (lv_graphs_0_1= ruleGraph | lv_graphs_0_2= ruleDigraph ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDotLanguage.g:80:3: ( (lv_graphs_0_1= ruleGraph | lv_graphs_0_2= ruleDigraph ) )
            	    {
            	    // InternalDotLanguage.g:80:3: ( (lv_graphs_0_1= ruleGraph | lv_graphs_0_2= ruleDigraph ) )
            	    // InternalDotLanguage.g:81:4: (lv_graphs_0_1= ruleGraph | lv_graphs_0_2= ruleDigraph )
            	    {
            	    // InternalDotLanguage.g:81:4: (lv_graphs_0_1= ruleGraph | lv_graphs_0_2= ruleDigraph )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==11) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==14) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalDotLanguage.g:82:5: lv_graphs_0_1= ruleGraph
            	            {

            	            					newCompositeNode(grammarAccess.getDotLanguageAccess().getGraphsGraphParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_graphs_0_1=ruleGraph();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getDotLanguageRule());
            	            					}
            	            					add(
            	            						current,
            	            						"graphs",
            	            						lv_graphs_0_1,
            	            						"uk.ac.kcl.inf.DotLanguage.Graph");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDotLanguage.g:98:5: lv_graphs_0_2= ruleDigraph
            	            {

            	            					newCompositeNode(grammarAccess.getDotLanguageAccess().getGraphsDigraphParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_graphs_0_2=ruleDigraph();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getDotLanguageRule());
            	            					}
            	            					add(
            	            						current,
            	            						"graphs",
            	            						lv_graphs_0_2,
            	            						"uk.ac.kcl.inf.DotLanguage.Digraph");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotLanguage"


    // $ANTLR start "entryRuleGraph"
    // InternalDotLanguage.g:119:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalDotLanguage.g:119:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalDotLanguage.g:120:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalDotLanguage.g:126:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleUndirectedStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:132:2: ( (otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleUndirectedStatement ) )* otherlv_4= '}' ) )
            // InternalDotLanguage.g:133:2: (otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleUndirectedStatement ) )* otherlv_4= '}' )
            {
            // InternalDotLanguage.g:133:2: (otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleUndirectedStatement ) )* otherlv_4= '}' )
            // InternalDotLanguage.g:134:3: otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleUndirectedStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
            		
            // InternalDotLanguage.g:138:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDotLanguage.g:139:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDotLanguage.g:139:4: (lv_name_1_0= RULE_ID )
            // InternalDotLanguage.g:140:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDotLanguage.g:160:3: ( (lv_statements_3_0= ruleUndirectedStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDotLanguage.g:161:4: (lv_statements_3_0= ruleUndirectedStatement )
            	    {
            	    // InternalDotLanguage.g:161:4: (lv_statements_3_0= ruleUndirectedStatement )
            	    // InternalDotLanguage.g:162:5: lv_statements_3_0= ruleUndirectedStatement
            	    {

            	    					newCompositeNode(grammarAccess.getGraphAccess().getStatementsUndirectedStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statements_3_0=ruleUndirectedStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"uk.ac.kcl.inf.DotLanguage.UndirectedStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleDigraph"
    // InternalDotLanguage.g:187:1: entryRuleDigraph returns [EObject current=null] : iv_ruleDigraph= ruleDigraph EOF ;
    public final EObject entryRuleDigraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigraph = null;


        try {
            // InternalDotLanguage.g:187:48: (iv_ruleDigraph= ruleDigraph EOF )
            // InternalDotLanguage.g:188:2: iv_ruleDigraph= ruleDigraph EOF
            {
             newCompositeNode(grammarAccess.getDigraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDigraph=ruleDigraph();

            state._fsp--;

             current =iv_ruleDigraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDigraph"


    // $ANTLR start "ruleDigraph"
    // InternalDotLanguage.g:194:1: ruleDigraph returns [EObject current=null] : (otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleDirectedStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleDigraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:200:2: ( (otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleDirectedStatement ) )* otherlv_4= '}' ) )
            // InternalDotLanguage.g:201:2: (otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleDirectedStatement ) )* otherlv_4= '}' )
            {
            // InternalDotLanguage.g:201:2: (otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleDirectedStatement ) )* otherlv_4= '}' )
            // InternalDotLanguage.g:202:3: otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleDirectedStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDigraphAccess().getDigraphKeyword_0());
            		
            // InternalDotLanguage.g:206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDotLanguage.g:207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDotLanguage.g:207:4: (lv_name_1_0= RULE_ID )
            // InternalDotLanguage.g:208:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDigraphAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDigraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDigraphAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDotLanguage.g:228:3: ( (lv_statements_3_0= ruleDirectedStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDotLanguage.g:229:4: (lv_statements_3_0= ruleDirectedStatement )
            	    {
            	    // InternalDotLanguage.g:229:4: (lv_statements_3_0= ruleDirectedStatement )
            	    // InternalDotLanguage.g:230:5: lv_statements_3_0= ruleDirectedStatement
            	    {

            	    					newCompositeNode(grammarAccess.getDigraphAccess().getStatementsDirectedStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statements_3_0=ruleDirectedStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDigraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"uk.ac.kcl.inf.DotLanguage.DirectedStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDigraphAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigraph"


    // $ANTLR start "entryRuleDirectedStatement"
    // InternalDotLanguage.g:255:1: entryRuleDirectedStatement returns [EObject current=null] : iv_ruleDirectedStatement= ruleDirectedStatement EOF ;
    public final EObject entryRuleDirectedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedStatement = null;


        try {
            // InternalDotLanguage.g:255:58: (iv_ruleDirectedStatement= ruleDirectedStatement EOF )
            // InternalDotLanguage.g:256:2: iv_ruleDirectedStatement= ruleDirectedStatement EOF
            {
             newCompositeNode(grammarAccess.getDirectedStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectedStatement=ruleDirectedStatement();

            state._fsp--;

             current =iv_ruleDirectedStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectedStatement"


    // $ANTLR start "ruleDirectedStatement"
    // InternalDotLanguage.g:262:1: ruleDirectedStatement returns [EObject current=null] : ( (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? ) | (this_DirectedEdgeDeclaration_3= ruleDirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? ) ) ;
    public final EObject ruleDirectedStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_NodeDeclaration_0 = null;

        EObject this_DirectedEdgeDeclaration_3 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:268:2: ( ( (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? ) | (this_DirectedEdgeDeclaration_3= ruleDirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? ) ) )
            // InternalDotLanguage.g:269:2: ( (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? ) | (this_DirectedEdgeDeclaration_3= ruleDirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? ) )
            {
            // InternalDotLanguage.g:269:2: ( (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? ) | (this_DirectedEdgeDeclaration_3= ruleDirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==RULE_ID||LA7_1==13||(LA7_1>=15 && LA7_1<=17)) ) {
                    alt7=1;
                }
                else if ( (LA7_1==21) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDotLanguage.g:270:3: (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? )
                    {
                    // InternalDotLanguage.g:270:3: (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? )
                    // InternalDotLanguage.g:271:4: this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )?
                    {

                    				newCompositeNode(grammarAccess.getDirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_NodeDeclaration_0=ruleNodeDeclaration();

                    state._fsp--;


                    				current = this_NodeDeclaration_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDotLanguage.g:279:4: (otherlv_1= ',' | otherlv_2= ';' )?
                    int alt5=3;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==15) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==16) ) {
                        alt5=2;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDotLanguage.g:280:5: otherlv_1= ','
                            {
                            otherlv_1=(Token)match(input,15,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getDirectedStatementAccess().getCommaKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDotLanguage.g:285:5: otherlv_2= ';'
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:292:3: (this_DirectedEdgeDeclaration_3= ruleDirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? )
                    {
                    // InternalDotLanguage.g:292:3: (this_DirectedEdgeDeclaration_3= ruleDirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? )
                    // InternalDotLanguage.g:293:4: this_DirectedEdgeDeclaration_3= ruleDirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )?
                    {

                    				newCompositeNode(grammarAccess.getDirectedStatementAccess().getDirectedEdgeDeclarationParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_DirectedEdgeDeclaration_3=ruleDirectedEdgeDeclaration();

                    state._fsp--;


                    				current = this_DirectedEdgeDeclaration_3;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDotLanguage.g:301:4: (otherlv_4= ',' | otherlv_5= ';' )?
                    int alt6=3;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==16) ) {
                        alt6=2;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDotLanguage.g:302:5: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,15,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDotLanguage.g:307:5: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectedStatement"


    // $ANTLR start "entryRuleUndirectedStatement"
    // InternalDotLanguage.g:317:1: entryRuleUndirectedStatement returns [EObject current=null] : iv_ruleUndirectedStatement= ruleUndirectedStatement EOF ;
    public final EObject entryRuleUndirectedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndirectedStatement = null;


        try {
            // InternalDotLanguage.g:317:60: (iv_ruleUndirectedStatement= ruleUndirectedStatement EOF )
            // InternalDotLanguage.g:318:2: iv_ruleUndirectedStatement= ruleUndirectedStatement EOF
            {
             newCompositeNode(grammarAccess.getUndirectedStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUndirectedStatement=ruleUndirectedStatement();

            state._fsp--;

             current =iv_ruleUndirectedStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUndirectedStatement"


    // $ANTLR start "ruleUndirectedStatement"
    // InternalDotLanguage.g:324:1: ruleUndirectedStatement returns [EObject current=null] : ( (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? ) | (this_UndirectedEdgeDeclaration_3= ruleUndirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? ) ) ;
    public final EObject ruleUndirectedStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_NodeDeclaration_0 = null;

        EObject this_UndirectedEdgeDeclaration_3 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:330:2: ( ( (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? ) | (this_UndirectedEdgeDeclaration_3= ruleUndirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? ) ) )
            // InternalDotLanguage.g:331:2: ( (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? ) | (this_UndirectedEdgeDeclaration_3= ruleUndirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? ) )
            {
            // InternalDotLanguage.g:331:2: ( (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? ) | (this_UndirectedEdgeDeclaration_3= ruleUndirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==RULE_ID||LA10_1==13||(LA10_1>=15 && LA10_1<=17)) ) {
                    alt10=1;
                }
                else if ( (LA10_1==22) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDotLanguage.g:332:3: (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? )
                    {
                    // InternalDotLanguage.g:332:3: (this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )? )
                    // InternalDotLanguage.g:333:4: this_NodeDeclaration_0= ruleNodeDeclaration (otherlv_1= ',' | otherlv_2= ';' )?
                    {

                    				newCompositeNode(grammarAccess.getUndirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_NodeDeclaration_0=ruleNodeDeclaration();

                    state._fsp--;


                    				current = this_NodeDeclaration_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDotLanguage.g:341:4: (otherlv_1= ',' | otherlv_2= ';' )?
                    int alt8=3;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==15) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==16) ) {
                        alt8=2;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDotLanguage.g:342:5: otherlv_1= ','
                            {
                            otherlv_1=(Token)match(input,15,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getUndirectedStatementAccess().getCommaKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDotLanguage.g:347:5: otherlv_2= ';'
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:354:3: (this_UndirectedEdgeDeclaration_3= ruleUndirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? )
                    {
                    // InternalDotLanguage.g:354:3: (this_UndirectedEdgeDeclaration_3= ruleUndirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )? )
                    // InternalDotLanguage.g:355:4: this_UndirectedEdgeDeclaration_3= ruleUndirectedEdgeDeclaration (otherlv_4= ',' | otherlv_5= ';' )?
                    {

                    				newCompositeNode(grammarAccess.getUndirectedStatementAccess().getUndirectedEdgeDeclarationParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_UndirectedEdgeDeclaration_3=ruleUndirectedEdgeDeclaration();

                    state._fsp--;


                    				current = this_UndirectedEdgeDeclaration_3;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDotLanguage.g:363:4: (otherlv_4= ',' | otherlv_5= ';' )?
                    int alt9=3;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==15) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==16) ) {
                        alt9=2;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDotLanguage.g:364:5: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,15,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDotLanguage.g:369:5: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUndirectedStatement"


    // $ANTLR start "entryRuleNodeDeclaration"
    // InternalDotLanguage.g:379:1: entryRuleNodeDeclaration returns [EObject current=null] : iv_ruleNodeDeclaration= ruleNodeDeclaration EOF ;
    public final EObject entryRuleNodeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDeclaration = null;


        try {
            // InternalDotLanguage.g:379:56: (iv_ruleNodeDeclaration= ruleNodeDeclaration EOF )
            // InternalDotLanguage.g:380:2: iv_ruleNodeDeclaration= ruleNodeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNodeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeDeclaration=ruleNodeDeclaration();

            state._fsp--;

             current =iv_ruleNodeDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeDeclaration"


    // $ANTLR start "ruleNodeDeclaration"
    // InternalDotLanguage.g:386:1: ruleNodeDeclaration returns [EObject current=null] : ( ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )? ) ;
    public final EObject ruleNodeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeName_0_0 = null;

        EObject lv_optionalAttributes_1_0 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:392:2: ( ( ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )? ) )
            // InternalDotLanguage.g:393:2: ( ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )? )
            {
            // InternalDotLanguage.g:393:2: ( ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )? )
            // InternalDotLanguage.g:394:3: ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )?
            {
            // InternalDotLanguage.g:394:3: ( (lv_nodeName_0_0= ruleNodeId ) )
            // InternalDotLanguage.g:395:4: (lv_nodeName_0_0= ruleNodeId )
            {
            // InternalDotLanguage.g:395:4: (lv_nodeName_0_0= ruleNodeId )
            // InternalDotLanguage.g:396:5: lv_nodeName_0_0= ruleNodeId
            {

            					newCompositeNode(grammarAccess.getNodeDeclarationAccess().getNodeNameNodeIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_nodeName_0_0=ruleNodeId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
            					}
            					set(
            						current,
            						"nodeName",
            						lv_nodeName_0_0,
            						"uk.ac.kcl.inf.DotLanguage.NodeId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDotLanguage.g:413:3: ( (lv_optionalAttributes_1_0= ruleAttributeList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDotLanguage.g:414:4: (lv_optionalAttributes_1_0= ruleAttributeList )
                    {
                    // InternalDotLanguage.g:414:4: (lv_optionalAttributes_1_0= ruleAttributeList )
                    // InternalDotLanguage.g:415:5: lv_optionalAttributes_1_0= ruleAttributeList
                    {

                    					newCompositeNode(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAttributeListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_optionalAttributes_1_0=ruleAttributeList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"optionalAttributes",
                    						lv_optionalAttributes_1_0,
                    						"uk.ac.kcl.inf.DotLanguage.AttributeList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeDeclaration"


    // $ANTLR start "entryRuleNodeId"
    // InternalDotLanguage.g:436:1: entryRuleNodeId returns [EObject current=null] : iv_ruleNodeId= ruleNodeId EOF ;
    public final EObject entryRuleNodeId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeId = null;


        try {
            // InternalDotLanguage.g:436:47: (iv_ruleNodeId= ruleNodeId EOF )
            // InternalDotLanguage.g:437:2: iv_ruleNodeId= ruleNodeId EOF
            {
             newCompositeNode(grammarAccess.getNodeIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeId=ruleNodeId();

            state._fsp--;

             current =iv_ruleNodeId; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeId"


    // $ANTLR start "ruleNodeId"
    // InternalDotLanguage.g:443:1: ruleNodeId returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNodeId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:449:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDotLanguage.g:450:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDotLanguage.g:450:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDotLanguage.g:451:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDotLanguage.g:451:3: (lv_name_0_0= RULE_ID )
            // InternalDotLanguage.g:452:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNodeIdAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNodeIdRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeId"


    // $ANTLR start "entryRuleAttributeList"
    // InternalDotLanguage.g:471:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalDotLanguage.g:471:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalDotLanguage.g:472:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             newCompositeNode(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeList=ruleAttributeList();

            state._fsp--;

             current =iv_ruleAttributeList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // InternalDotLanguage.g:478:1: ruleAttributeList returns [EObject current=null] : (otherlv_0= '[' ( (lv_attributes_1_0= ruleAttribute ) ) (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_1_0 = null;

        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:484:2: ( (otherlv_0= '[' ( (lv_attributes_1_0= ruleAttribute ) ) (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )? otherlv_4= ']' ) )
            // InternalDotLanguage.g:485:2: (otherlv_0= '[' ( (lv_attributes_1_0= ruleAttribute ) ) (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )? otherlv_4= ']' )
            {
            // InternalDotLanguage.g:485:2: (otherlv_0= '[' ( (lv_attributes_1_0= ruleAttribute ) ) (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )? otherlv_4= ']' )
            // InternalDotLanguage.g:486:3: otherlv_0= '[' ( (lv_attributes_1_0= ruleAttribute ) ) (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDotLanguage.g:490:3: ( (lv_attributes_1_0= ruleAttribute ) )
            // InternalDotLanguage.g:491:4: (lv_attributes_1_0= ruleAttribute )
            {
            // InternalDotLanguage.g:491:4: (lv_attributes_1_0= ruleAttribute )
            // InternalDotLanguage.g:492:5: lv_attributes_1_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_attributes_1_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeListRule());
            					}
            					set(
            						current,
            						"attributes",
            						lv_attributes_1_0,
            						"uk.ac.kcl.inf.DotLanguage.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDotLanguage.g:509:3: (otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDotLanguage.g:510:4: otherlv_2= ',' ( (lv_attributes_3_0= ruleAttribute ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeListAccess().getCommaKeyword_2_0());
                    			
                    // InternalDotLanguage.g:514:4: ( (lv_attributes_3_0= ruleAttribute ) )
                    // InternalDotLanguage.g:515:5: (lv_attributes_3_0= ruleAttribute )
                    {
                    // InternalDotLanguage.g:515:5: (lv_attributes_3_0= ruleAttribute )
                    // InternalDotLanguage.g:516:6: lv_attributes_3_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_attributes_3_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeListRule());
                    						}
                    						set(
                    							current,
                    							"attributes",
                    							lv_attributes_3_0,
                    							"uk.ac.kcl.inf.DotLanguage.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeListAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleAttribute"
    // InternalDotLanguage.g:542:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDotLanguage.g:542:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDotLanguage.g:543:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDotLanguage.g:549:1: ruleAttribute returns [EObject current=null] : (this_LabelAttribute_0= ruleLabelAttribute | this_ColorAttribute_1= ruleColorAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_LabelAttribute_0 = null;

        EObject this_ColorAttribute_1 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:555:2: ( (this_LabelAttribute_0= ruleLabelAttribute | this_ColorAttribute_1= ruleColorAttribute ) )
            // InternalDotLanguage.g:556:2: (this_LabelAttribute_0= ruleLabelAttribute | this_ColorAttribute_1= ruleColorAttribute )
            {
            // InternalDotLanguage.g:556:2: (this_LabelAttribute_0= ruleLabelAttribute | this_ColorAttribute_1= ruleColorAttribute )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDotLanguage.g:557:3: this_LabelAttribute_0= ruleLabelAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getLabelAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LabelAttribute_0=ruleLabelAttribute();

                    state._fsp--;


                    			current = this_LabelAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:566:3: this_ColorAttribute_1= ruleColorAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getColorAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColorAttribute_1=ruleColorAttribute();

                    state._fsp--;


                    			current = this_ColorAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLabelAttribute"
    // InternalDotLanguage.g:578:1: entryRuleLabelAttribute returns [EObject current=null] : iv_ruleLabelAttribute= ruleLabelAttribute EOF ;
    public final EObject entryRuleLabelAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelAttribute = null;


        try {
            // InternalDotLanguage.g:578:55: (iv_ruleLabelAttribute= ruleLabelAttribute EOF )
            // InternalDotLanguage.g:579:2: iv_ruleLabelAttribute= ruleLabelAttribute EOF
            {
             newCompositeNode(grammarAccess.getLabelAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelAttribute=ruleLabelAttribute();

            state._fsp--;

             current =iv_ruleLabelAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelAttribute"


    // $ANTLR start "ruleLabelAttribute"
    // InternalDotLanguage.g:585:1: ruleLabelAttribute returns [EObject current=null] : (otherlv_0= 'label=' ( (lv_label_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLabelAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:591:2: ( (otherlv_0= 'label=' ( (lv_label_1_0= RULE_ID ) ) ) )
            // InternalDotLanguage.g:592:2: (otherlv_0= 'label=' ( (lv_label_1_0= RULE_ID ) ) )
            {
            // InternalDotLanguage.g:592:2: (otherlv_0= 'label=' ( (lv_label_1_0= RULE_ID ) ) )
            // InternalDotLanguage.g:593:3: otherlv_0= 'label=' ( (lv_label_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAttributeAccess().getLabelKeyword_0());
            		
            // InternalDotLanguage.g:597:3: ( (lv_label_1_0= RULE_ID ) )
            // InternalDotLanguage.g:598:4: (lv_label_1_0= RULE_ID )
            {
            // InternalDotLanguage.g:598:4: (lv_label_1_0= RULE_ID )
            // InternalDotLanguage.g:599:5: lv_label_1_0= RULE_ID
            {
            lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_label_1_0, grammarAccess.getLabelAttributeAccess().getLabelIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelAttribute"


    // $ANTLR start "entryRuleColorAttribute"
    // InternalDotLanguage.g:619:1: entryRuleColorAttribute returns [EObject current=null] : iv_ruleColorAttribute= ruleColorAttribute EOF ;
    public final EObject entryRuleColorAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorAttribute = null;


        try {
            // InternalDotLanguage.g:619:55: (iv_ruleColorAttribute= ruleColorAttribute EOF )
            // InternalDotLanguage.g:620:2: iv_ruleColorAttribute= ruleColorAttribute EOF
            {
             newCompositeNode(grammarAccess.getColorAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorAttribute=ruleColorAttribute();

            state._fsp--;

             current =iv_ruleColorAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorAttribute"


    // $ANTLR start "ruleColorAttribute"
    // InternalDotLanguage.g:626:1: ruleColorAttribute returns [EObject current=null] : (otherlv_0= 'color=' ( (lv_color_1_0= ruleColor ) ) ) ;
    public final EObject ruleColorAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_color_1_0 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:632:2: ( (otherlv_0= 'color=' ( (lv_color_1_0= ruleColor ) ) ) )
            // InternalDotLanguage.g:633:2: (otherlv_0= 'color=' ( (lv_color_1_0= ruleColor ) ) )
            {
            // InternalDotLanguage.g:633:2: (otherlv_0= 'color=' ( (lv_color_1_0= ruleColor ) ) )
            // InternalDotLanguage.g:634:3: otherlv_0= 'color=' ( (lv_color_1_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAttributeAccess().getColorKeyword_0());
            		
            // InternalDotLanguage.g:638:3: ( (lv_color_1_0= ruleColor ) )
            // InternalDotLanguage.g:639:4: (lv_color_1_0= ruleColor )
            {
            // InternalDotLanguage.g:639:4: (lv_color_1_0= ruleColor )
            // InternalDotLanguage.g:640:5: lv_color_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getColorAttributeAccess().getColorColorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_1_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorAttributeRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_1_0,
            						"uk.ac.kcl.inf.DotLanguage.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorAttribute"


    // $ANTLR start "entryRuleDirectedEdgeDeclaration"
    // InternalDotLanguage.g:661:1: entryRuleDirectedEdgeDeclaration returns [EObject current=null] : iv_ruleDirectedEdgeDeclaration= ruleDirectedEdgeDeclaration EOF ;
    public final EObject entryRuleDirectedEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedEdgeDeclaration = null;


        try {
            // InternalDotLanguage.g:661:64: (iv_ruleDirectedEdgeDeclaration= ruleDirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:662:2: iv_ruleDirectedEdgeDeclaration= ruleDirectedEdgeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDirectedEdgeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectedEdgeDeclaration=ruleDirectedEdgeDeclaration();

            state._fsp--;

             current =iv_ruleDirectedEdgeDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectedEdgeDeclaration"


    // $ANTLR start "ruleDirectedEdgeDeclaration"
    // InternalDotLanguage.g:668:1: ruleDirectedEdgeDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDirectedEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:674:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDotLanguage.g:675:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDotLanguage.g:675:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalDotLanguage.g:676:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDotLanguage.g:676:3: ( (otherlv_0= RULE_ID ) )
            // InternalDotLanguage.g:677:4: (otherlv_0= RULE_ID )
            {
            // InternalDotLanguage.g:677:4: (otherlv_0= RULE_ID )
            // InternalDotLanguage.g:678:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectedEdgeDeclarationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectedEdgeDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalDotLanguage.g:693:3: ( (otherlv_2= RULE_ID ) )
            // InternalDotLanguage.g:694:4: (otherlv_2= RULE_ID )
            {
            // InternalDotLanguage.g:694:4: (otherlv_2= RULE_ID )
            // InternalDotLanguage.g:695:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectedEdgeDeclarationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectedEdgeDeclaration"


    // $ANTLR start "entryRuleUndirectedEdgeDeclaration"
    // InternalDotLanguage.g:710:1: entryRuleUndirectedEdgeDeclaration returns [EObject current=null] : iv_ruleUndirectedEdgeDeclaration= ruleUndirectedEdgeDeclaration EOF ;
    public final EObject entryRuleUndirectedEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndirectedEdgeDeclaration = null;


        try {
            // InternalDotLanguage.g:710:66: (iv_ruleUndirectedEdgeDeclaration= ruleUndirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:711:2: iv_ruleUndirectedEdgeDeclaration= ruleUndirectedEdgeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUndirectedEdgeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUndirectedEdgeDeclaration=ruleUndirectedEdgeDeclaration();

            state._fsp--;

             current =iv_ruleUndirectedEdgeDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUndirectedEdgeDeclaration"


    // $ANTLR start "ruleUndirectedEdgeDeclaration"
    // InternalDotLanguage.g:717:1: ruleUndirectedEdgeDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '--' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleUndirectedEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:723:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '--' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDotLanguage.g:724:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '--' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDotLanguage.g:724:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '--' ( (otherlv_2= RULE_ID ) ) )
            // InternalDotLanguage.g:725:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '--' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDotLanguage.g:725:3: ( (otherlv_0= RULE_ID ) )
            // InternalDotLanguage.g:726:4: (otherlv_0= RULE_ID )
            {
            // InternalDotLanguage.g:726:4: (otherlv_0= RULE_ID )
            // InternalDotLanguage.g:727:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUndirectedEdgeDeclarationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUndirectedEdgeDeclarationAccess().getHyphenMinusHyphenMinusKeyword_1());
            		
            // InternalDotLanguage.g:742:3: ( (otherlv_2= RULE_ID ) )
            // InternalDotLanguage.g:743:4: (otherlv_2= RULE_ID )
            {
            // InternalDotLanguage.g:743:4: (otherlv_2= RULE_ID )
            // InternalDotLanguage.g:744:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUndirectedEdgeDeclarationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUndirectedEdgeDeclaration"


    // $ANTLR start "ruleColor"
    // InternalDotLanguage.g:759:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'black' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:765:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'black' ) ) )
            // InternalDotLanguage.g:766:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'black' ) )
            {
            // InternalDotLanguage.g:766:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'black' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            case 26:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDotLanguage.g:767:3: (enumLiteral_0= 'red' )
                    {
                    // InternalDotLanguage.g:767:3: (enumLiteral_0= 'red' )
                    // InternalDotLanguage.g:768:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:775:3: (enumLiteral_1= 'blue' )
                    {
                    // InternalDotLanguage.g:775:3: (enumLiteral_1= 'blue' )
                    // InternalDotLanguage.g:776:4: enumLiteral_1= 'blue'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:783:3: (enumLiteral_2= 'green' )
                    {
                    // InternalDotLanguage.g:783:3: (enumLiteral_2= 'green' )
                    // InternalDotLanguage.g:784:4: enumLiteral_2= 'green'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDotLanguage.g:791:3: (enumLiteral_3= 'black' )
                    {
                    // InternalDotLanguage.g:791:3: (enumLiteral_3= 'black' )
                    // InternalDotLanguage.g:792:4: enumLiteral_3= 'black'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}