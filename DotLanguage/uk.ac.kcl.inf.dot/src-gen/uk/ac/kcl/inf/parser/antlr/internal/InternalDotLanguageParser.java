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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'{'", "'}'", "'digraph'", "','", "';'", "'['", "']'", "'='", "'->'", "'--'"
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalDotLanguage.g:262:1: ruleDirectedStatement returns [EObject current=null] : ( (this_NodeDeclaration_0= ruleNodeDeclaration | this_DirectedEdgeDeclaration_1= ruleDirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )? ) ;
    public final EObject ruleDirectedStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_NodeDeclaration_0 = null;

        EObject this_DirectedEdgeDeclaration_1 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:268:2: ( ( (this_NodeDeclaration_0= ruleNodeDeclaration | this_DirectedEdgeDeclaration_1= ruleDirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )? ) )
            // InternalDotLanguage.g:269:2: ( (this_NodeDeclaration_0= ruleNodeDeclaration | this_DirectedEdgeDeclaration_1= ruleDirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )? )
            {
            // InternalDotLanguage.g:269:2: ( (this_NodeDeclaration_0= ruleNodeDeclaration | this_DirectedEdgeDeclaration_1= ruleDirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )? )
            // InternalDotLanguage.g:270:3: (this_NodeDeclaration_0= ruleNodeDeclaration | this_DirectedEdgeDeclaration_1= ruleDirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )?
            {
            // InternalDotLanguage.g:270:3: (this_NodeDeclaration_0= ruleNodeDeclaration | this_DirectedEdgeDeclaration_1= ruleDirectedEdgeDeclaration )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==20) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==13||(LA5_1>=15 && LA5_1<=17)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDotLanguage.g:271:4: this_NodeDeclaration_0= ruleNodeDeclaration
                    {

                    				newCompositeNode(grammarAccess.getDirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_NodeDeclaration_0=ruleNodeDeclaration();

                    state._fsp--;


                    				current = this_NodeDeclaration_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:280:4: this_DirectedEdgeDeclaration_1= ruleDirectedEdgeDeclaration
                    {

                    				newCompositeNode(grammarAccess.getDirectedStatementAccess().getDirectedEdgeDeclarationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_DirectedEdgeDeclaration_1=ruleDirectedEdgeDeclaration();

                    state._fsp--;


                    				current = this_DirectedEdgeDeclaration_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalDotLanguage.g:289:3: (otherlv_2= ',' | otherlv_3= ';' )?
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
                    // InternalDotLanguage.g:290:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:295:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_1_1());
                    			

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
    // $ANTLR end "ruleDirectedStatement"


    // $ANTLR start "entryRuleUndirectedStatement"
    // InternalDotLanguage.g:304:1: entryRuleUndirectedStatement returns [EObject current=null] : iv_ruleUndirectedStatement= ruleUndirectedStatement EOF ;
    public final EObject entryRuleUndirectedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndirectedStatement = null;


        try {
            // InternalDotLanguage.g:304:60: (iv_ruleUndirectedStatement= ruleUndirectedStatement EOF )
            // InternalDotLanguage.g:305:2: iv_ruleUndirectedStatement= ruleUndirectedStatement EOF
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
    // InternalDotLanguage.g:311:1: ruleUndirectedStatement returns [EObject current=null] : ( (this_NodeDeclaration_0= ruleNodeDeclaration | this_UndirectedEdgeDeclaration_1= ruleUndirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )? ) ;
    public final EObject ruleUndirectedStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_NodeDeclaration_0 = null;

        EObject this_UndirectedEdgeDeclaration_1 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:317:2: ( ( (this_NodeDeclaration_0= ruleNodeDeclaration | this_UndirectedEdgeDeclaration_1= ruleUndirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )? ) )
            // InternalDotLanguage.g:318:2: ( (this_NodeDeclaration_0= ruleNodeDeclaration | this_UndirectedEdgeDeclaration_1= ruleUndirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )? )
            {
            // InternalDotLanguage.g:318:2: ( (this_NodeDeclaration_0= ruleNodeDeclaration | this_UndirectedEdgeDeclaration_1= ruleUndirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )? )
            // InternalDotLanguage.g:319:3: (this_NodeDeclaration_0= ruleNodeDeclaration | this_UndirectedEdgeDeclaration_1= ruleUndirectedEdgeDeclaration ) (otherlv_2= ',' | otherlv_3= ';' )?
            {
            // InternalDotLanguage.g:319:3: (this_NodeDeclaration_0= ruleNodeDeclaration | this_UndirectedEdgeDeclaration_1= ruleUndirectedEdgeDeclaration )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==21) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_ID||LA7_1==13||(LA7_1>=15 && LA7_1<=17)) ) {
                    alt7=1;
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
                    // InternalDotLanguage.g:320:4: this_NodeDeclaration_0= ruleNodeDeclaration
                    {

                    				newCompositeNode(grammarAccess.getUndirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_NodeDeclaration_0=ruleNodeDeclaration();

                    state._fsp--;


                    				current = this_NodeDeclaration_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:329:4: this_UndirectedEdgeDeclaration_1= ruleUndirectedEdgeDeclaration
                    {

                    				newCompositeNode(grammarAccess.getUndirectedStatementAccess().getUndirectedEdgeDeclarationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_UndirectedEdgeDeclaration_1=ruleUndirectedEdgeDeclaration();

                    state._fsp--;


                    				current = this_UndirectedEdgeDeclaration_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalDotLanguage.g:338:3: (otherlv_2= ',' | otherlv_3= ';' )?
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
                    // InternalDotLanguage.g:339:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:344:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_1_1());
                    			

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
    // $ANTLR end "ruleUndirectedStatement"


    // $ANTLR start "entryRuleNodeDeclaration"
    // InternalDotLanguage.g:353:1: entryRuleNodeDeclaration returns [EObject current=null] : iv_ruleNodeDeclaration= ruleNodeDeclaration EOF ;
    public final EObject entryRuleNodeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDeclaration = null;


        try {
            // InternalDotLanguage.g:353:56: (iv_ruleNodeDeclaration= ruleNodeDeclaration EOF )
            // InternalDotLanguage.g:354:2: iv_ruleNodeDeclaration= ruleNodeDeclaration EOF
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
    // InternalDotLanguage.g:360:1: ruleNodeDeclaration returns [EObject current=null] : ( ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )? ) ;
    public final EObject ruleNodeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeName_0_0 = null;

        EObject lv_optionalAttributes_1_0 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:366:2: ( ( ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )? ) )
            // InternalDotLanguage.g:367:2: ( ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )? )
            {
            // InternalDotLanguage.g:367:2: ( ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )? )
            // InternalDotLanguage.g:368:3: ( (lv_nodeName_0_0= ruleNodeId ) ) ( (lv_optionalAttributes_1_0= ruleAttributeList ) )?
            {
            // InternalDotLanguage.g:368:3: ( (lv_nodeName_0_0= ruleNodeId ) )
            // InternalDotLanguage.g:369:4: (lv_nodeName_0_0= ruleNodeId )
            {
            // InternalDotLanguage.g:369:4: (lv_nodeName_0_0= ruleNodeId )
            // InternalDotLanguage.g:370:5: lv_nodeName_0_0= ruleNodeId
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

            // InternalDotLanguage.g:387:3: ( (lv_optionalAttributes_1_0= ruleAttributeList ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDotLanguage.g:388:4: (lv_optionalAttributes_1_0= ruleAttributeList )
                    {
                    // InternalDotLanguage.g:388:4: (lv_optionalAttributes_1_0= ruleAttributeList )
                    // InternalDotLanguage.g:389:5: lv_optionalAttributes_1_0= ruleAttributeList
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
    // InternalDotLanguage.g:410:1: entryRuleNodeId returns [EObject current=null] : iv_ruleNodeId= ruleNodeId EOF ;
    public final EObject entryRuleNodeId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeId = null;


        try {
            // InternalDotLanguage.g:410:47: (iv_ruleNodeId= ruleNodeId EOF )
            // InternalDotLanguage.g:411:2: iv_ruleNodeId= ruleNodeId EOF
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
    // InternalDotLanguage.g:417:1: ruleNodeId returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNodeId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:423:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDotLanguage.g:424:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDotLanguage.g:424:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDotLanguage.g:425:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDotLanguage.g:425:3: (lv_name_0_0= RULE_ID )
            // InternalDotLanguage.g:426:4: lv_name_0_0= RULE_ID
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
    // InternalDotLanguage.g:445:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalDotLanguage.g:445:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalDotLanguage.g:446:2: iv_ruleAttributeList= ruleAttributeList EOF
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
    // InternalDotLanguage.g:452:1: ruleAttributeList returns [EObject current=null] : (otherlv_0= '[' ( (lv_attr_1_0= ruleAttribute ) )+ otherlv_2= ']' ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_attr_1_0 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:458:2: ( (otherlv_0= '[' ( (lv_attr_1_0= ruleAttribute ) )+ otherlv_2= ']' ) )
            // InternalDotLanguage.g:459:2: (otherlv_0= '[' ( (lv_attr_1_0= ruleAttribute ) )+ otherlv_2= ']' )
            {
            // InternalDotLanguage.g:459:2: (otherlv_0= '[' ( (lv_attr_1_0= ruleAttribute ) )+ otherlv_2= ']' )
            // InternalDotLanguage.g:460:3: otherlv_0= '[' ( (lv_attr_1_0= ruleAttribute ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDotLanguage.g:464:3: ( (lv_attr_1_0= ruleAttribute ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDotLanguage.g:465:4: (lv_attr_1_0= ruleAttribute )
            	    {
            	    // InternalDotLanguage.g:465:4: (lv_attr_1_0= ruleAttribute )
            	    // InternalDotLanguage.g:466:5: lv_attr_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeListAccess().getAttrAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attr_1_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attr",
            	    						lv_attr_1_0,
            	    						"uk.ac.kcl.inf.DotLanguage.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeListAccess().getRightSquareBracketKeyword_2());
            		

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
    // InternalDotLanguage.g:491:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDotLanguage.g:491:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDotLanguage.g:492:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalDotLanguage.g:498:1: ruleAttribute returns [EObject current=null] : ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;
        Token otherlv_1=null;
        Token lv_attributeValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:504:2: ( ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalDotLanguage.g:505:2: ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalDotLanguage.g:505:2: ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalDotLanguage.g:506:3: ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // InternalDotLanguage.g:506:3: ( (lv_attributeName_0_0= RULE_ID ) )
            // InternalDotLanguage.g:507:4: (lv_attributeName_0_0= RULE_ID )
            {
            // InternalDotLanguage.g:507:4: (lv_attributeName_0_0= RULE_ID )
            // InternalDotLanguage.g:508:5: lv_attributeName_0_0= RULE_ID
            {
            lv_attributeName_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_attributeName_0_0, grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributeName",
            						lv_attributeName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
            		
            // InternalDotLanguage.g:528:3: ( (lv_attributeValue_2_0= RULE_ID ) )
            // InternalDotLanguage.g:529:4: (lv_attributeValue_2_0= RULE_ID )
            {
            // InternalDotLanguage.g:529:4: (lv_attributeValue_2_0= RULE_ID )
            // InternalDotLanguage.g:530:5: lv_attributeValue_2_0= RULE_ID
            {
            lv_attributeValue_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_attributeValue_2_0, grammarAccess.getAttributeAccess().getAttributeValueIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributeValue",
            						lv_attributeValue_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDotLanguage.g:546:3: (otherlv_3= ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDotLanguage.g:547:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDirectedEdgeDeclaration"
    // InternalDotLanguage.g:556:1: entryRuleDirectedEdgeDeclaration returns [EObject current=null] : iv_ruleDirectedEdgeDeclaration= ruleDirectedEdgeDeclaration EOF ;
    public final EObject entryRuleDirectedEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedEdgeDeclaration = null;


        try {
            // InternalDotLanguage.g:556:64: (iv_ruleDirectedEdgeDeclaration= ruleDirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:557:2: iv_ruleDirectedEdgeDeclaration= ruleDirectedEdgeDeclaration EOF
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
    // InternalDotLanguage.g:563:1: ruleDirectedEdgeDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_directedEdge_1_0= ruleDirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) ) ) ;
    public final EObject ruleDirectedEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_directedEdge_1_0 = null;

        EObject lv_secondNode_2_0 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:569:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_directedEdge_1_0= ruleDirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) ) ) )
            // InternalDotLanguage.g:570:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_directedEdge_1_0= ruleDirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) ) )
            {
            // InternalDotLanguage.g:570:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_directedEdge_1_0= ruleDirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) ) )
            // InternalDotLanguage.g:571:3: ( (otherlv_0= RULE_ID ) ) ( (lv_directedEdge_1_0= ruleDirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) )
            {
            // InternalDotLanguage.g:571:3: ( (otherlv_0= RULE_ID ) )
            // InternalDotLanguage.g:572:4: (otherlv_0= RULE_ID )
            {
            // InternalDotLanguage.g:572:4: (otherlv_0= RULE_ID )
            // InternalDotLanguage.g:573:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectedEdgeDeclarationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0());
            				

            }


            }

            // InternalDotLanguage.g:584:3: ( (lv_directedEdge_1_0= ruleDirectedEdge ) )
            // InternalDotLanguage.g:585:4: (lv_directedEdge_1_0= ruleDirectedEdge )
            {
            // InternalDotLanguage.g:585:4: (lv_directedEdge_1_0= ruleDirectedEdge )
            // InternalDotLanguage.g:586:5: lv_directedEdge_1_0= ruleDirectedEdge
            {

            					newCompositeNode(grammarAccess.getDirectedEdgeDeclarationAccess().getDirectedEdgeDirectedEdgeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_directedEdge_1_0=ruleDirectedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectedEdgeDeclarationRule());
            					}
            					set(
            						current,
            						"directedEdge",
            						lv_directedEdge_1_0,
            						"uk.ac.kcl.inf.DotLanguage.DirectedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDotLanguage.g:603:3: ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) )
            // InternalDotLanguage.g:604:4: (lv_secondNode_2_0= ruleRightEdgeDeclaration )
            {
            // InternalDotLanguage.g:604:4: (lv_secondNode_2_0= ruleRightEdgeDeclaration )
            // InternalDotLanguage.g:605:5: lv_secondNode_2_0= ruleRightEdgeDeclaration
            {

            					newCompositeNode(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeRightEdgeDeclarationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_secondNode_2_0=ruleRightEdgeDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectedEdgeDeclarationRule());
            					}
            					set(
            						current,
            						"secondNode",
            						lv_secondNode_2_0,
            						"uk.ac.kcl.inf.DotLanguage.RightEdgeDeclaration");
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
    // $ANTLR end "ruleDirectedEdgeDeclaration"


    // $ANTLR start "entryRuleUndirectedEdgeDeclaration"
    // InternalDotLanguage.g:626:1: entryRuleUndirectedEdgeDeclaration returns [EObject current=null] : iv_ruleUndirectedEdgeDeclaration= ruleUndirectedEdgeDeclaration EOF ;
    public final EObject entryRuleUndirectedEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndirectedEdgeDeclaration = null;


        try {
            // InternalDotLanguage.g:626:66: (iv_ruleUndirectedEdgeDeclaration= ruleUndirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:627:2: iv_ruleUndirectedEdgeDeclaration= ruleUndirectedEdgeDeclaration EOF
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
    // InternalDotLanguage.g:633:1: ruleUndirectedEdgeDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_undirectedEdge_1_0= ruleUndirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) ) ) ;
    public final EObject ruleUndirectedEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_undirectedEdge_1_0 = null;

        EObject lv_secondNode_2_0 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:639:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_undirectedEdge_1_0= ruleUndirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) ) ) )
            // InternalDotLanguage.g:640:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_undirectedEdge_1_0= ruleUndirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) ) )
            {
            // InternalDotLanguage.g:640:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_undirectedEdge_1_0= ruleUndirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) ) )
            // InternalDotLanguage.g:641:3: ( (otherlv_0= RULE_ID ) ) ( (lv_undirectedEdge_1_0= ruleUndirectedEdge ) ) ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) )
            {
            // InternalDotLanguage.g:641:3: ( (otherlv_0= RULE_ID ) )
            // InternalDotLanguage.g:642:4: (otherlv_0= RULE_ID )
            {
            // InternalDotLanguage.g:642:4: (otherlv_0= RULE_ID )
            // InternalDotLanguage.g:643:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUndirectedEdgeDeclarationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0());
            				

            }


            }

            // InternalDotLanguage.g:654:3: ( (lv_undirectedEdge_1_0= ruleUndirectedEdge ) )
            // InternalDotLanguage.g:655:4: (lv_undirectedEdge_1_0= ruleUndirectedEdge )
            {
            // InternalDotLanguage.g:655:4: (lv_undirectedEdge_1_0= ruleUndirectedEdge )
            // InternalDotLanguage.g:656:5: lv_undirectedEdge_1_0= ruleUndirectedEdge
            {

            					newCompositeNode(grammarAccess.getUndirectedEdgeDeclarationAccess().getUndirectedEdgeUndirectedEdgeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_undirectedEdge_1_0=ruleUndirectedEdge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUndirectedEdgeDeclarationRule());
            					}
            					set(
            						current,
            						"undirectedEdge",
            						lv_undirectedEdge_1_0,
            						"uk.ac.kcl.inf.DotLanguage.UndirectedEdge");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDotLanguage.g:673:3: ( (lv_secondNode_2_0= ruleRightEdgeDeclaration ) )
            // InternalDotLanguage.g:674:4: (lv_secondNode_2_0= ruleRightEdgeDeclaration )
            {
            // InternalDotLanguage.g:674:4: (lv_secondNode_2_0= ruleRightEdgeDeclaration )
            // InternalDotLanguage.g:675:5: lv_secondNode_2_0= ruleRightEdgeDeclaration
            {

            					newCompositeNode(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeRightEdgeDeclarationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_secondNode_2_0=ruleRightEdgeDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUndirectedEdgeDeclarationRule());
            					}
            					set(
            						current,
            						"secondNode",
            						lv_secondNode_2_0,
            						"uk.ac.kcl.inf.DotLanguage.RightEdgeDeclaration");
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
    // $ANTLR end "ruleUndirectedEdgeDeclaration"


    // $ANTLR start "entryRuleRightEdgeDeclaration"
    // InternalDotLanguage.g:696:1: entryRuleRightEdgeDeclaration returns [EObject current=null] : iv_ruleRightEdgeDeclaration= ruleRightEdgeDeclaration EOF ;
    public final EObject entryRuleRightEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightEdgeDeclaration = null;


        try {
            // InternalDotLanguage.g:696:61: (iv_ruleRightEdgeDeclaration= ruleRightEdgeDeclaration EOF )
            // InternalDotLanguage.g:697:2: iv_ruleRightEdgeDeclaration= ruleRightEdgeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRightEdgeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightEdgeDeclaration=ruleRightEdgeDeclaration();

            state._fsp--;

             current =iv_ruleRightEdgeDeclaration; 
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
    // $ANTLR end "entryRuleRightEdgeDeclaration"


    // $ANTLR start "ruleRightEdgeDeclaration"
    // InternalDotLanguage.g:703:1: ruleRightEdgeDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_NodeList_1= ruleNodeList ) ;
    public final EObject ruleRightEdgeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NodeList_1 = null;



        	enterRule();

        try {
            // InternalDotLanguage.g:709:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_NodeList_1= ruleNodeList ) )
            // InternalDotLanguage.g:710:2: ( ( (otherlv_0= RULE_ID ) ) | this_NodeList_1= ruleNodeList )
            {
            // InternalDotLanguage.g:710:2: ( ( (otherlv_0= RULE_ID ) ) | this_NodeList_1= ruleNodeList )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==12) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDotLanguage.g:711:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalDotLanguage.g:711:3: ( (otherlv_0= RULE_ID ) )
                    // InternalDotLanguage.g:712:4: (otherlv_0= RULE_ID )
                    {
                    // InternalDotLanguage.g:712:4: (otherlv_0= RULE_ID )
                    // InternalDotLanguage.g:713:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRightEdgeDeclarationRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:725:3: this_NodeList_1= ruleNodeList
                    {

                    			newCompositeNode(grammarAccess.getRightEdgeDeclarationAccess().getNodeListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeList_1=ruleNodeList();

                    state._fsp--;


                    			current = this_NodeList_1;
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
    // $ANTLR end "ruleRightEdgeDeclaration"


    // $ANTLR start "entryRuleNodeList"
    // InternalDotLanguage.g:737:1: entryRuleNodeList returns [EObject current=null] : iv_ruleNodeList= ruleNodeList EOF ;
    public final EObject entryRuleNodeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeList = null;


        try {
            // InternalDotLanguage.g:737:49: (iv_ruleNodeList= ruleNodeList EOF )
            // InternalDotLanguage.g:738:2: iv_ruleNodeList= ruleNodeList EOF
            {
             newCompositeNode(grammarAccess.getNodeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeList=ruleNodeList();

            state._fsp--;

             current =iv_ruleNodeList; 
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
    // $ANTLR end "entryRuleNodeList"


    // $ANTLR start "ruleNodeList"
    // InternalDotLanguage.g:744:1: ruleNodeList returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) )+ otherlv_2= '}' ) ;
    public final EObject ruleNodeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:750:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) )+ otherlv_2= '}' ) )
            // InternalDotLanguage.g:751:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) )+ otherlv_2= '}' )
            {
            // InternalDotLanguage.g:751:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) )+ otherlv_2= '}' )
            // InternalDotLanguage.g:752:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeListAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalDotLanguage.g:756:3: ( (otherlv_1= RULE_ID ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDotLanguage.g:757:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalDotLanguage.g:757:4: (otherlv_1= RULE_ID )
            	    // InternalDotLanguage.g:758:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNodeListRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_1, grammarAccess.getNodeListAccess().getNodesNodeIdCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeListAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleNodeList"


    // $ANTLR start "entryRuleDirectedEdge"
    // InternalDotLanguage.g:777:1: entryRuleDirectedEdge returns [String current=null] : iv_ruleDirectedEdge= ruleDirectedEdge EOF ;
    public final String entryRuleDirectedEdge() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirectedEdge = null;


        try {
            // InternalDotLanguage.g:777:52: (iv_ruleDirectedEdge= ruleDirectedEdge EOF )
            // InternalDotLanguage.g:778:2: iv_ruleDirectedEdge= ruleDirectedEdge EOF
            {
             newCompositeNode(grammarAccess.getDirectedEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectedEdge=ruleDirectedEdge();

            state._fsp--;

             current =iv_ruleDirectedEdge.getText(); 
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
    // $ANTLR end "entryRuleDirectedEdge"


    // $ANTLR start "ruleDirectedEdge"
    // InternalDotLanguage.g:784:1: ruleDirectedEdge returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '->' ;
    public final AntlrDatatypeRuleToken ruleDirectedEdge() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:790:2: (kw= '->' )
            // InternalDotLanguage.g:791:2: kw= '->'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDirectedEdgeAccess().getHyphenMinusGreaterThanSignKeyword());
            	

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
    // $ANTLR end "ruleDirectedEdge"


    // $ANTLR start "entryRuleUndirectedEdge"
    // InternalDotLanguage.g:799:1: entryRuleUndirectedEdge returns [String current=null] : iv_ruleUndirectedEdge= ruleUndirectedEdge EOF ;
    public final String entryRuleUndirectedEdge() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUndirectedEdge = null;


        try {
            // InternalDotLanguage.g:799:54: (iv_ruleUndirectedEdge= ruleUndirectedEdge EOF )
            // InternalDotLanguage.g:800:2: iv_ruleUndirectedEdge= ruleUndirectedEdge EOF
            {
             newCompositeNode(grammarAccess.getUndirectedEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUndirectedEdge=ruleUndirectedEdge();

            state._fsp--;

             current =iv_ruleUndirectedEdge.getText(); 
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
    // $ANTLR end "entryRuleUndirectedEdge"


    // $ANTLR start "ruleUndirectedEdge"
    // InternalDotLanguage.g:806:1: ruleUndirectedEdge returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '--' ;
    public final AntlrDatatypeRuleToken ruleUndirectedEdge() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDotLanguage.g:812:2: (kw= '--' )
            // InternalDotLanguage.g:813:2: kw= '--'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUndirectedEdgeAccess().getHyphenMinusHyphenMinusKeyword());
            	

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
    // $ANTLR end "ruleUndirectedEdge"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});

}