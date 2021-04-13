package uk.ac.kcl.inf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.services.DotLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'--'", "','", "';'", "'graph'", "'{'", "'}'", "'digraph'", "'subgraph'", "'['", "']'", "'='"
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
    public static final int T__22=22;
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

    	public void setGrammarAccess(DotLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDotLanguage"
    // InternalDotLanguage.g:53:1: entryRuleDotLanguage : ruleDotLanguage EOF ;
    public final void entryRuleDotLanguage() throws RecognitionException {
        try {
            // InternalDotLanguage.g:54:1: ( ruleDotLanguage EOF )
            // InternalDotLanguage.g:55:1: ruleDotLanguage EOF
            {
             before(grammarAccess.getDotLanguageRule()); 
            pushFollow(FOLLOW_1);
            ruleDotLanguage();

            state._fsp--;

             after(grammarAccess.getDotLanguageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDotLanguage"


    // $ANTLR start "ruleDotLanguage"
    // InternalDotLanguage.g:62:1: ruleDotLanguage : ( ( rule__DotLanguage__GraphsAssignment )* ) ;
    public final void ruleDotLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:66:2: ( ( ( rule__DotLanguage__GraphsAssignment )* ) )
            // InternalDotLanguage.g:67:2: ( ( rule__DotLanguage__GraphsAssignment )* )
            {
            // InternalDotLanguage.g:67:2: ( ( rule__DotLanguage__GraphsAssignment )* )
            // InternalDotLanguage.g:68:3: ( rule__DotLanguage__GraphsAssignment )*
            {
             before(grammarAccess.getDotLanguageAccess().getGraphsAssignment()); 
            // InternalDotLanguage.g:69:3: ( rule__DotLanguage__GraphsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDotLanguage.g:69:4: rule__DotLanguage__GraphsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DotLanguage__GraphsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDotLanguageAccess().getGraphsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotLanguage"


    // $ANTLR start "entryRuleGraph"
    // InternalDotLanguage.g:78:1: entryRuleGraph : ruleGraph EOF ;
    public final void entryRuleGraph() throws RecognitionException {
        try {
            // InternalDotLanguage.g:79:1: ( ruleGraph EOF )
            // InternalDotLanguage.g:80:1: ruleGraph EOF
            {
             before(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getGraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalDotLanguage.g:87:1: ruleGraph : ( ( rule__Graph__Group__0 ) ) ;
    public final void ruleGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:91:2: ( ( ( rule__Graph__Group__0 ) ) )
            // InternalDotLanguage.g:92:2: ( ( rule__Graph__Group__0 ) )
            {
            // InternalDotLanguage.g:92:2: ( ( rule__Graph__Group__0 ) )
            // InternalDotLanguage.g:93:3: ( rule__Graph__Group__0 )
            {
             before(grammarAccess.getGraphAccess().getGroup()); 
            // InternalDotLanguage.g:94:3: ( rule__Graph__Group__0 )
            // InternalDotLanguage.g:94:4: rule__Graph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleDigraph"
    // InternalDotLanguage.g:103:1: entryRuleDigraph : ruleDigraph EOF ;
    public final void entryRuleDigraph() throws RecognitionException {
        try {
            // InternalDotLanguage.g:104:1: ( ruleDigraph EOF )
            // InternalDotLanguage.g:105:1: ruleDigraph EOF
            {
             before(grammarAccess.getDigraphRule()); 
            pushFollow(FOLLOW_1);
            ruleDigraph();

            state._fsp--;

             after(grammarAccess.getDigraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDigraph"


    // $ANTLR start "ruleDigraph"
    // InternalDotLanguage.g:112:1: ruleDigraph : ( ( rule__Digraph__Group__0 ) ) ;
    public final void ruleDigraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:116:2: ( ( ( rule__Digraph__Group__0 ) ) )
            // InternalDotLanguage.g:117:2: ( ( rule__Digraph__Group__0 ) )
            {
            // InternalDotLanguage.g:117:2: ( ( rule__Digraph__Group__0 ) )
            // InternalDotLanguage.g:118:3: ( rule__Digraph__Group__0 )
            {
             before(grammarAccess.getDigraphAccess().getGroup()); 
            // InternalDotLanguage.g:119:3: ( rule__Digraph__Group__0 )
            // InternalDotLanguage.g:119:4: rule__Digraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Digraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDigraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDigraph"


    // $ANTLR start "entryRuleDirectedStatement"
    // InternalDotLanguage.g:128:1: entryRuleDirectedStatement : ruleDirectedStatement EOF ;
    public final void entryRuleDirectedStatement() throws RecognitionException {
        try {
            // InternalDotLanguage.g:129:1: ( ruleDirectedStatement EOF )
            // InternalDotLanguage.g:130:1: ruleDirectedStatement EOF
            {
             before(grammarAccess.getDirectedStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectedStatement();

            state._fsp--;

             after(grammarAccess.getDirectedStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectedStatement"


    // $ANTLR start "ruleDirectedStatement"
    // InternalDotLanguage.g:137:1: ruleDirectedStatement : ( ( rule__DirectedStatement__Group__0 ) ) ;
    public final void ruleDirectedStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:141:2: ( ( ( rule__DirectedStatement__Group__0 ) ) )
            // InternalDotLanguage.g:142:2: ( ( rule__DirectedStatement__Group__0 ) )
            {
            // InternalDotLanguage.g:142:2: ( ( rule__DirectedStatement__Group__0 ) )
            // InternalDotLanguage.g:143:3: ( rule__DirectedStatement__Group__0 )
            {
             before(grammarAccess.getDirectedStatementAccess().getGroup()); 
            // InternalDotLanguage.g:144:3: ( rule__DirectedStatement__Group__0 )
            // InternalDotLanguage.g:144:4: rule__DirectedStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectedStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectedStatement"


    // $ANTLR start "entryRuleUndirectedStatement"
    // InternalDotLanguage.g:153:1: entryRuleUndirectedStatement : ruleUndirectedStatement EOF ;
    public final void entryRuleUndirectedStatement() throws RecognitionException {
        try {
            // InternalDotLanguage.g:154:1: ( ruleUndirectedStatement EOF )
            // InternalDotLanguage.g:155:1: ruleUndirectedStatement EOF
            {
             before(grammarAccess.getUndirectedStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleUndirectedStatement();

            state._fsp--;

             after(grammarAccess.getUndirectedStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUndirectedStatement"


    // $ANTLR start "ruleUndirectedStatement"
    // InternalDotLanguage.g:162:1: ruleUndirectedStatement : ( ( rule__UndirectedStatement__Group__0 ) ) ;
    public final void ruleUndirectedStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:166:2: ( ( ( rule__UndirectedStatement__Group__0 ) ) )
            // InternalDotLanguage.g:167:2: ( ( rule__UndirectedStatement__Group__0 ) )
            {
            // InternalDotLanguage.g:167:2: ( ( rule__UndirectedStatement__Group__0 ) )
            // InternalDotLanguage.g:168:3: ( rule__UndirectedStatement__Group__0 )
            {
             before(grammarAccess.getUndirectedStatementAccess().getGroup()); 
            // InternalDotLanguage.g:169:3: ( rule__UndirectedStatement__Group__0 )
            // InternalDotLanguage.g:169:4: rule__UndirectedStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUndirectedStatement"


    // $ANTLR start "entryRuleDirectedSubgraphDeclaration"
    // InternalDotLanguage.g:178:1: entryRuleDirectedSubgraphDeclaration : ruleDirectedSubgraphDeclaration EOF ;
    public final void entryRuleDirectedSubgraphDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:179:1: ( ruleDirectedSubgraphDeclaration EOF )
            // InternalDotLanguage.g:180:1: ruleDirectedSubgraphDeclaration EOF
            {
             before(grammarAccess.getDirectedSubgraphDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectedSubgraphDeclaration();

            state._fsp--;

             after(grammarAccess.getDirectedSubgraphDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectedSubgraphDeclaration"


    // $ANTLR start "ruleDirectedSubgraphDeclaration"
    // InternalDotLanguage.g:187:1: ruleDirectedSubgraphDeclaration : ( ( rule__DirectedSubgraphDeclaration__Group__0 ) ) ;
    public final void ruleDirectedSubgraphDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:191:2: ( ( ( rule__DirectedSubgraphDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:192:2: ( ( rule__DirectedSubgraphDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:192:2: ( ( rule__DirectedSubgraphDeclaration__Group__0 ) )
            // InternalDotLanguage.g:193:3: ( rule__DirectedSubgraphDeclaration__Group__0 )
            {
             before(grammarAccess.getDirectedSubgraphDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:194:3: ( rule__DirectedSubgraphDeclaration__Group__0 )
            // InternalDotLanguage.g:194:4: rule__DirectedSubgraphDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectedSubgraphDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedSubgraphDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectedSubgraphDeclaration"


    // $ANTLR start "entryRuleUndirectedSubgraphDeclaration"
    // InternalDotLanguage.g:203:1: entryRuleUndirectedSubgraphDeclaration : ruleUndirectedSubgraphDeclaration EOF ;
    public final void entryRuleUndirectedSubgraphDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:204:1: ( ruleUndirectedSubgraphDeclaration EOF )
            // InternalDotLanguage.g:205:1: ruleUndirectedSubgraphDeclaration EOF
            {
             before(grammarAccess.getUndirectedSubgraphDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleUndirectedSubgraphDeclaration();

            state._fsp--;

             after(grammarAccess.getUndirectedSubgraphDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUndirectedSubgraphDeclaration"


    // $ANTLR start "ruleUndirectedSubgraphDeclaration"
    // InternalDotLanguage.g:212:1: ruleUndirectedSubgraphDeclaration : ( ( rule__UndirectedSubgraphDeclaration__Group__0 ) ) ;
    public final void ruleUndirectedSubgraphDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:216:2: ( ( ( rule__UndirectedSubgraphDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:217:2: ( ( rule__UndirectedSubgraphDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:217:2: ( ( rule__UndirectedSubgraphDeclaration__Group__0 ) )
            // InternalDotLanguage.g:218:3: ( rule__UndirectedSubgraphDeclaration__Group__0 )
            {
             before(grammarAccess.getUndirectedSubgraphDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:219:3: ( rule__UndirectedSubgraphDeclaration__Group__0 )
            // InternalDotLanguage.g:219:4: rule__UndirectedSubgraphDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedSubgraphDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedSubgraphDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUndirectedSubgraphDeclaration"


    // $ANTLR start "entryRuleNodeDeclaration"
    // InternalDotLanguage.g:228:1: entryRuleNodeDeclaration : ruleNodeDeclaration EOF ;
    public final void entryRuleNodeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:229:1: ( ruleNodeDeclaration EOF )
            // InternalDotLanguage.g:230:1: ruleNodeDeclaration EOF
            {
             before(grammarAccess.getNodeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeDeclaration();

            state._fsp--;

             after(grammarAccess.getNodeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeDeclaration"


    // $ANTLR start "ruleNodeDeclaration"
    // InternalDotLanguage.g:237:1: ruleNodeDeclaration : ( ( rule__NodeDeclaration__Group__0 ) ) ;
    public final void ruleNodeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:241:2: ( ( ( rule__NodeDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:242:2: ( ( rule__NodeDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:242:2: ( ( rule__NodeDeclaration__Group__0 ) )
            // InternalDotLanguage.g:243:3: ( rule__NodeDeclaration__Group__0 )
            {
             before(grammarAccess.getNodeDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:244:3: ( rule__NodeDeclaration__Group__0 )
            // InternalDotLanguage.g:244:4: rule__NodeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeDeclaration"


    // $ANTLR start "entryRuleNodeId"
    // InternalDotLanguage.g:253:1: entryRuleNodeId : ruleNodeId EOF ;
    public final void entryRuleNodeId() throws RecognitionException {
        try {
            // InternalDotLanguage.g:254:1: ( ruleNodeId EOF )
            // InternalDotLanguage.g:255:1: ruleNodeId EOF
            {
             before(grammarAccess.getNodeIdRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeId();

            state._fsp--;

             after(grammarAccess.getNodeIdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeId"


    // $ANTLR start "ruleNodeId"
    // InternalDotLanguage.g:262:1: ruleNodeId : ( ( rule__NodeId__NameAssignment ) ) ;
    public final void ruleNodeId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:266:2: ( ( ( rule__NodeId__NameAssignment ) ) )
            // InternalDotLanguage.g:267:2: ( ( rule__NodeId__NameAssignment ) )
            {
            // InternalDotLanguage.g:267:2: ( ( rule__NodeId__NameAssignment ) )
            // InternalDotLanguage.g:268:3: ( rule__NodeId__NameAssignment )
            {
             before(grammarAccess.getNodeIdAccess().getNameAssignment()); 
            // InternalDotLanguage.g:269:3: ( rule__NodeId__NameAssignment )
            // InternalDotLanguage.g:269:4: rule__NodeId__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NodeId__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNodeIdAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeId"


    // $ANTLR start "entryRuleAttributeList"
    // InternalDotLanguage.g:278:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // InternalDotLanguage.g:279:1: ( ruleAttributeList EOF )
            // InternalDotLanguage.g:280:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // InternalDotLanguage.g:287:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:291:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // InternalDotLanguage.g:292:2: ( ( rule__AttributeList__Group__0 ) )
            {
            // InternalDotLanguage.g:292:2: ( ( rule__AttributeList__Group__0 ) )
            // InternalDotLanguage.g:293:3: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // InternalDotLanguage.g:294:3: ( rule__AttributeList__Group__0 )
            // InternalDotLanguage.g:294:4: rule__AttributeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleAttribute"
    // InternalDotLanguage.g:303:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDotLanguage.g:304:1: ( ruleAttribute EOF )
            // InternalDotLanguage.g:305:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDotLanguage.g:312:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:316:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDotLanguage.g:317:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDotLanguage.g:317:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDotLanguage.g:318:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDotLanguage.g:319:3: ( rule__Attribute__Group__0 )
            // InternalDotLanguage.g:319:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDirectedEdgeDeclaration"
    // InternalDotLanguage.g:328:1: entryRuleDirectedEdgeDeclaration : ruleDirectedEdgeDeclaration EOF ;
    public final void entryRuleDirectedEdgeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:329:1: ( ruleDirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:330:1: ruleDirectedEdgeDeclaration EOF
            {
             before(grammarAccess.getDirectedEdgeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectedEdgeDeclaration();

            state._fsp--;

             after(grammarAccess.getDirectedEdgeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectedEdgeDeclaration"


    // $ANTLR start "ruleDirectedEdgeDeclaration"
    // InternalDotLanguage.g:337:1: ruleDirectedEdgeDeclaration : ( ( rule__DirectedEdgeDeclaration__Group__0 ) ) ;
    public final void ruleDirectedEdgeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:341:2: ( ( ( rule__DirectedEdgeDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:342:2: ( ( rule__DirectedEdgeDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:342:2: ( ( rule__DirectedEdgeDeclaration__Group__0 ) )
            // InternalDotLanguage.g:343:3: ( rule__DirectedEdgeDeclaration__Group__0 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:344:3: ( rule__DirectedEdgeDeclaration__Group__0 )
            // InternalDotLanguage.g:344:4: rule__DirectedEdgeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectedEdgeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectedEdgeDeclaration"


    // $ANTLR start "entryRuleUndirectedEdgeDeclaration"
    // InternalDotLanguage.g:353:1: entryRuleUndirectedEdgeDeclaration : ruleUndirectedEdgeDeclaration EOF ;
    public final void entryRuleUndirectedEdgeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:354:1: ( ruleUndirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:355:1: ruleUndirectedEdgeDeclaration EOF
            {
             before(grammarAccess.getUndirectedEdgeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleUndirectedEdgeDeclaration();

            state._fsp--;

             after(grammarAccess.getUndirectedEdgeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUndirectedEdgeDeclaration"


    // $ANTLR start "ruleUndirectedEdgeDeclaration"
    // InternalDotLanguage.g:362:1: ruleUndirectedEdgeDeclaration : ( ( rule__UndirectedEdgeDeclaration__Group__0 ) ) ;
    public final void ruleUndirectedEdgeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:366:2: ( ( ( rule__UndirectedEdgeDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:367:2: ( ( rule__UndirectedEdgeDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:367:2: ( ( rule__UndirectedEdgeDeclaration__Group__0 ) )
            // InternalDotLanguage.g:368:3: ( rule__UndirectedEdgeDeclaration__Group__0 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:369:3: ( rule__UndirectedEdgeDeclaration__Group__0 )
            // InternalDotLanguage.g:369:4: rule__UndirectedEdgeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedEdgeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUndirectedEdgeDeclaration"


    // $ANTLR start "entryRuleDirectedEdge"
    // InternalDotLanguage.g:378:1: entryRuleDirectedEdge : ruleDirectedEdge EOF ;
    public final void entryRuleDirectedEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:379:1: ( ruleDirectedEdge EOF )
            // InternalDotLanguage.g:380:1: ruleDirectedEdge EOF
            {
             before(grammarAccess.getDirectedEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectedEdge();

            state._fsp--;

             after(grammarAccess.getDirectedEdgeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectedEdge"


    // $ANTLR start "ruleDirectedEdge"
    // InternalDotLanguage.g:387:1: ruleDirectedEdge : ( '->' ) ;
    public final void ruleDirectedEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:391:2: ( ( '->' ) )
            // InternalDotLanguage.g:392:2: ( '->' )
            {
            // InternalDotLanguage.g:392:2: ( '->' )
            // InternalDotLanguage.g:393:3: '->'
            {
             before(grammarAccess.getDirectedEdgeAccess().getHyphenMinusGreaterThanSignKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDirectedEdgeAccess().getHyphenMinusGreaterThanSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectedEdge"


    // $ANTLR start "entryRuleUndirectedEdge"
    // InternalDotLanguage.g:403:1: entryRuleUndirectedEdge : ruleUndirectedEdge EOF ;
    public final void entryRuleUndirectedEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:404:1: ( ruleUndirectedEdge EOF )
            // InternalDotLanguage.g:405:1: ruleUndirectedEdge EOF
            {
             before(grammarAccess.getUndirectedEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleUndirectedEdge();

            state._fsp--;

             after(grammarAccess.getUndirectedEdgeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUndirectedEdge"


    // $ANTLR start "ruleUndirectedEdge"
    // InternalDotLanguage.g:412:1: ruleUndirectedEdge : ( '--' ) ;
    public final void ruleUndirectedEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:416:2: ( ( '--' ) )
            // InternalDotLanguage.g:417:2: ( '--' )
            {
            // InternalDotLanguage.g:417:2: ( '--' )
            // InternalDotLanguage.g:418:3: '--'
            {
             before(grammarAccess.getUndirectedEdgeAccess().getHyphenMinusHyphenMinusKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUndirectedEdgeAccess().getHyphenMinusHyphenMinusKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUndirectedEdge"


    // $ANTLR start "rule__DotLanguage__GraphsAlternatives_0"
    // InternalDotLanguage.g:427:1: rule__DotLanguage__GraphsAlternatives_0 : ( ( ruleGraph ) | ( ruleDigraph ) );
    public final void rule__DotLanguage__GraphsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:431:1: ( ( ruleGraph ) | ( ruleDigraph ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDotLanguage.g:432:2: ( ruleGraph )
                    {
                    // InternalDotLanguage.g:432:2: ( ruleGraph )
                    // InternalDotLanguage.g:433:3: ruleGraph
                    {
                     before(grammarAccess.getDotLanguageAccess().getGraphsGraphParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGraph();

                    state._fsp--;

                     after(grammarAccess.getDotLanguageAccess().getGraphsGraphParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:438:2: ( ruleDigraph )
                    {
                    // InternalDotLanguage.g:438:2: ( ruleDigraph )
                    // InternalDotLanguage.g:439:3: ruleDigraph
                    {
                     before(grammarAccess.getDotLanguageAccess().getGraphsDigraphParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDigraph();

                    state._fsp--;

                     after(grammarAccess.getDotLanguageAccess().getGraphsDigraphParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotLanguage__GraphsAlternatives_0"


    // $ANTLR start "rule__DirectedStatement__Alternatives_0"
    // InternalDotLanguage.g:448:1: rule__DirectedStatement__Alternatives_0 : ( ( ruleNodeDeclaration ) | ( ruleDirectedEdgeDeclaration ) | ( ruleDirectedSubgraphDeclaration ) );
    public final void rule__DirectedStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:452:1: ( ( ruleNodeDeclaration ) | ( ruleDirectedEdgeDeclaration ) | ( ruleDirectedSubgraphDeclaration ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||(LA3_1>=13 && LA3_1<=14)||LA3_1==17||(LA3_1>=19 && LA3_1<=20)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==11) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==19) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDotLanguage.g:453:2: ( ruleNodeDeclaration )
                    {
                    // InternalDotLanguage.g:453:2: ( ruleNodeDeclaration )
                    // InternalDotLanguage.g:454:3: ruleNodeDeclaration
                    {
                     before(grammarAccess.getDirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:459:2: ( ruleDirectedEdgeDeclaration )
                    {
                    // InternalDotLanguage.g:459:2: ( ruleDirectedEdgeDeclaration )
                    // InternalDotLanguage.g:460:3: ruleDirectedEdgeDeclaration
                    {
                     before(grammarAccess.getDirectedStatementAccess().getDirectedEdgeDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectedEdgeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDirectedStatementAccess().getDirectedEdgeDeclarationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:465:2: ( ruleDirectedSubgraphDeclaration )
                    {
                    // InternalDotLanguage.g:465:2: ( ruleDirectedSubgraphDeclaration )
                    // InternalDotLanguage.g:466:3: ruleDirectedSubgraphDeclaration
                    {
                     before(grammarAccess.getDirectedStatementAccess().getDirectedSubgraphDeclarationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectedSubgraphDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDirectedStatementAccess().getDirectedSubgraphDeclarationParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedStatement__Alternatives_0"


    // $ANTLR start "rule__DirectedStatement__Alternatives_1"
    // InternalDotLanguage.g:475:1: rule__DirectedStatement__Alternatives_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__DirectedStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:479:1: ( ( ',' ) | ( ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDotLanguage.g:480:2: ( ',' )
                    {
                    // InternalDotLanguage.g:480:2: ( ',' )
                    // InternalDotLanguage.g:481:3: ','
                    {
                     before(grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:486:2: ( ';' )
                    {
                    // InternalDotLanguage.g:486:2: ( ';' )
                    // InternalDotLanguage.g:487:3: ';'
                    {
                     before(grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedStatement__Alternatives_1"


    // $ANTLR start "rule__UndirectedStatement__Alternatives_0"
    // InternalDotLanguage.g:496:1: rule__UndirectedStatement__Alternatives_0 : ( ( ruleNodeDeclaration ) | ( ruleUndirectedEdgeDeclaration ) | ( ruleUndirectedSubgraphDeclaration ) );
    public final void rule__UndirectedStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:500:1: ( ( ruleNodeDeclaration ) | ( ruleUndirectedEdgeDeclaration ) | ( ruleUndirectedSubgraphDeclaration ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==12) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=13 && LA5_1<=14)||LA5_1==17||(LA5_1>=19 && LA5_1<=20)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==19) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDotLanguage.g:501:2: ( ruleNodeDeclaration )
                    {
                    // InternalDotLanguage.g:501:2: ( ruleNodeDeclaration )
                    // InternalDotLanguage.g:502:3: ruleNodeDeclaration
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUndirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:507:2: ( ruleUndirectedEdgeDeclaration )
                    {
                    // InternalDotLanguage.g:507:2: ( ruleUndirectedEdgeDeclaration )
                    // InternalDotLanguage.g:508:3: ruleUndirectedEdgeDeclaration
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getUndirectedEdgeDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUndirectedEdgeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUndirectedStatementAccess().getUndirectedEdgeDeclarationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:513:2: ( ruleUndirectedSubgraphDeclaration )
                    {
                    // InternalDotLanguage.g:513:2: ( ruleUndirectedSubgraphDeclaration )
                    // InternalDotLanguage.g:514:3: ruleUndirectedSubgraphDeclaration
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getUndirectedSubgraphDeclarationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUndirectedSubgraphDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUndirectedStatementAccess().getUndirectedSubgraphDeclarationParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedStatement__Alternatives_0"


    // $ANTLR start "rule__UndirectedStatement__Alternatives_1"
    // InternalDotLanguage.g:523:1: rule__UndirectedStatement__Alternatives_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__UndirectedStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:527:1: ( ( ',' ) | ( ';' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDotLanguage.g:528:2: ( ',' )
                    {
                    // InternalDotLanguage.g:528:2: ( ',' )
                    // InternalDotLanguage.g:529:3: ','
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:534:2: ( ';' )
                    {
                    // InternalDotLanguage.g:534:2: ( ';' )
                    // InternalDotLanguage.g:535:3: ';'
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedStatement__Alternatives_1"


    // $ANTLR start "rule__Graph__Group__0"
    // InternalDotLanguage.g:544:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:548:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalDotLanguage.g:549:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Graph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0"


    // $ANTLR start "rule__Graph__Group__0__Impl"
    // InternalDotLanguage.g:556:1: rule__Graph__Group__0__Impl : ( 'graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:560:1: ( ( 'graph' ) )
            // InternalDotLanguage.g:561:1: ( 'graph' )
            {
            // InternalDotLanguage.g:561:1: ( 'graph' )
            // InternalDotLanguage.g:562:2: 'graph'
            {
             before(grammarAccess.getGraphAccess().getGraphKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getGraphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0__Impl"


    // $ANTLR start "rule__Graph__Group__1"
    // InternalDotLanguage.g:571:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:575:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalDotLanguage.g:576:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Graph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1"


    // $ANTLR start "rule__Graph__Group__1__Impl"
    // InternalDotLanguage.g:583:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NameAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:587:1: ( ( ( rule__Graph__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:588:1: ( ( rule__Graph__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:588:1: ( ( rule__Graph__NameAssignment_1 ) )
            // InternalDotLanguage.g:589:2: ( rule__Graph__NameAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:590:2: ( rule__Graph__NameAssignment_1 )
            // InternalDotLanguage.g:590:3: rule__Graph__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Graph__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1__Impl"


    // $ANTLR start "rule__Graph__Group__2"
    // InternalDotLanguage.g:598:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:602:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalDotLanguage.g:603:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Graph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2"


    // $ANTLR start "rule__Graph__Group__2__Impl"
    // InternalDotLanguage.g:610:1: rule__Graph__Group__2__Impl : ( '{' ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:614:1: ( ( '{' ) )
            // InternalDotLanguage.g:615:1: ( '{' )
            {
            // InternalDotLanguage.g:615:1: ( '{' )
            // InternalDotLanguage.g:616:2: '{'
            {
             before(grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2__Impl"


    // $ANTLR start "rule__Graph__Group__3"
    // InternalDotLanguage.g:625:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:629:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // InternalDotLanguage.g:630:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Graph__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3"


    // $ANTLR start "rule__Graph__Group__3__Impl"
    // InternalDotLanguage.g:637:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__StatementsAssignment_3 )* ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:641:1: ( ( ( rule__Graph__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:642:1: ( ( rule__Graph__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:642:1: ( ( rule__Graph__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:643:2: ( rule__Graph__StatementsAssignment_3 )*
            {
             before(grammarAccess.getGraphAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:644:2: ( rule__Graph__StatementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDotLanguage.g:644:3: rule__Graph__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Graph__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGraphAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3__Impl"


    // $ANTLR start "rule__Graph__Group__4"
    // InternalDotLanguage.g:652:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:656:1: ( rule__Graph__Group__4__Impl )
            // InternalDotLanguage.g:657:2: rule__Graph__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4"


    // $ANTLR start "rule__Graph__Group__4__Impl"
    // InternalDotLanguage.g:663:1: rule__Graph__Group__4__Impl : ( '}' ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:667:1: ( ( '}' ) )
            // InternalDotLanguage.g:668:1: ( '}' )
            {
            // InternalDotLanguage.g:668:1: ( '}' )
            // InternalDotLanguage.g:669:2: '}'
            {
             before(grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4__Impl"


    // $ANTLR start "rule__Digraph__Group__0"
    // InternalDotLanguage.g:679:1: rule__Digraph__Group__0 : rule__Digraph__Group__0__Impl rule__Digraph__Group__1 ;
    public final void rule__Digraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:683:1: ( rule__Digraph__Group__0__Impl rule__Digraph__Group__1 )
            // InternalDotLanguage.g:684:2: rule__Digraph__Group__0__Impl rule__Digraph__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Digraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Digraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__0"


    // $ANTLR start "rule__Digraph__Group__0__Impl"
    // InternalDotLanguage.g:691:1: rule__Digraph__Group__0__Impl : ( 'digraph' ) ;
    public final void rule__Digraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:695:1: ( ( 'digraph' ) )
            // InternalDotLanguage.g:696:1: ( 'digraph' )
            {
            // InternalDotLanguage.g:696:1: ( 'digraph' )
            // InternalDotLanguage.g:697:2: 'digraph'
            {
             before(grammarAccess.getDigraphAccess().getDigraphKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDigraphAccess().getDigraphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__0__Impl"


    // $ANTLR start "rule__Digraph__Group__1"
    // InternalDotLanguage.g:706:1: rule__Digraph__Group__1 : rule__Digraph__Group__1__Impl rule__Digraph__Group__2 ;
    public final void rule__Digraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:710:1: ( rule__Digraph__Group__1__Impl rule__Digraph__Group__2 )
            // InternalDotLanguage.g:711:2: rule__Digraph__Group__1__Impl rule__Digraph__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Digraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Digraph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__1"


    // $ANTLR start "rule__Digraph__Group__1__Impl"
    // InternalDotLanguage.g:718:1: rule__Digraph__Group__1__Impl : ( ( rule__Digraph__NameAssignment_1 ) ) ;
    public final void rule__Digraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:722:1: ( ( ( rule__Digraph__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:723:1: ( ( rule__Digraph__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:723:1: ( ( rule__Digraph__NameAssignment_1 ) )
            // InternalDotLanguage.g:724:2: ( rule__Digraph__NameAssignment_1 )
            {
             before(grammarAccess.getDigraphAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:725:2: ( rule__Digraph__NameAssignment_1 )
            // InternalDotLanguage.g:725:3: rule__Digraph__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Digraph__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDigraphAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__1__Impl"


    // $ANTLR start "rule__Digraph__Group__2"
    // InternalDotLanguage.g:733:1: rule__Digraph__Group__2 : rule__Digraph__Group__2__Impl rule__Digraph__Group__3 ;
    public final void rule__Digraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:737:1: ( rule__Digraph__Group__2__Impl rule__Digraph__Group__3 )
            // InternalDotLanguage.g:738:2: rule__Digraph__Group__2__Impl rule__Digraph__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Digraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Digraph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__2"


    // $ANTLR start "rule__Digraph__Group__2__Impl"
    // InternalDotLanguage.g:745:1: rule__Digraph__Group__2__Impl : ( '{' ) ;
    public final void rule__Digraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:749:1: ( ( '{' ) )
            // InternalDotLanguage.g:750:1: ( '{' )
            {
            // InternalDotLanguage.g:750:1: ( '{' )
            // InternalDotLanguage.g:751:2: '{'
            {
             before(grammarAccess.getDigraphAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDigraphAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__2__Impl"


    // $ANTLR start "rule__Digraph__Group__3"
    // InternalDotLanguage.g:760:1: rule__Digraph__Group__3 : rule__Digraph__Group__3__Impl rule__Digraph__Group__4 ;
    public final void rule__Digraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:764:1: ( rule__Digraph__Group__3__Impl rule__Digraph__Group__4 )
            // InternalDotLanguage.g:765:2: rule__Digraph__Group__3__Impl rule__Digraph__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Digraph__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Digraph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__3"


    // $ANTLR start "rule__Digraph__Group__3__Impl"
    // InternalDotLanguage.g:772:1: rule__Digraph__Group__3__Impl : ( ( rule__Digraph__StatementsAssignment_3 )* ) ;
    public final void rule__Digraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:776:1: ( ( ( rule__Digraph__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:777:1: ( ( rule__Digraph__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:777:1: ( ( rule__Digraph__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:778:2: ( rule__Digraph__StatementsAssignment_3 )*
            {
             before(grammarAccess.getDigraphAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:779:2: ( rule__Digraph__StatementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDotLanguage.g:779:3: rule__Digraph__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Digraph__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDigraphAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__3__Impl"


    // $ANTLR start "rule__Digraph__Group__4"
    // InternalDotLanguage.g:787:1: rule__Digraph__Group__4 : rule__Digraph__Group__4__Impl ;
    public final void rule__Digraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:791:1: ( rule__Digraph__Group__4__Impl )
            // InternalDotLanguage.g:792:2: rule__Digraph__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Digraph__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__4"


    // $ANTLR start "rule__Digraph__Group__4__Impl"
    // InternalDotLanguage.g:798:1: rule__Digraph__Group__4__Impl : ( '}' ) ;
    public final void rule__Digraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:802:1: ( ( '}' ) )
            // InternalDotLanguage.g:803:1: ( '}' )
            {
            // InternalDotLanguage.g:803:1: ( '}' )
            // InternalDotLanguage.g:804:2: '}'
            {
             before(grammarAccess.getDigraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDigraphAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__Group__4__Impl"


    // $ANTLR start "rule__DirectedStatement__Group__0"
    // InternalDotLanguage.g:814:1: rule__DirectedStatement__Group__0 : rule__DirectedStatement__Group__0__Impl rule__DirectedStatement__Group__1 ;
    public final void rule__DirectedStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:818:1: ( rule__DirectedStatement__Group__0__Impl rule__DirectedStatement__Group__1 )
            // InternalDotLanguage.g:819:2: rule__DirectedStatement__Group__0__Impl rule__DirectedStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DirectedStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedStatement__Group__0"


    // $ANTLR start "rule__DirectedStatement__Group__0__Impl"
    // InternalDotLanguage.g:826:1: rule__DirectedStatement__Group__0__Impl : ( ( rule__DirectedStatement__Alternatives_0 ) ) ;
    public final void rule__DirectedStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:830:1: ( ( ( rule__DirectedStatement__Alternatives_0 ) ) )
            // InternalDotLanguage.g:831:1: ( ( rule__DirectedStatement__Alternatives_0 ) )
            {
            // InternalDotLanguage.g:831:1: ( ( rule__DirectedStatement__Alternatives_0 ) )
            // InternalDotLanguage.g:832:2: ( rule__DirectedStatement__Alternatives_0 )
            {
             before(grammarAccess.getDirectedStatementAccess().getAlternatives_0()); 
            // InternalDotLanguage.g:833:2: ( rule__DirectedStatement__Alternatives_0 )
            // InternalDotLanguage.g:833:3: rule__DirectedStatement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DirectedStatement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedStatementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedStatement__Group__0__Impl"


    // $ANTLR start "rule__DirectedStatement__Group__1"
    // InternalDotLanguage.g:841:1: rule__DirectedStatement__Group__1 : rule__DirectedStatement__Group__1__Impl ;
    public final void rule__DirectedStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:845:1: ( rule__DirectedStatement__Group__1__Impl )
            // InternalDotLanguage.g:846:2: rule__DirectedStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectedStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedStatement__Group__1"


    // $ANTLR start "rule__DirectedStatement__Group__1__Impl"
    // InternalDotLanguage.g:852:1: rule__DirectedStatement__Group__1__Impl : ( ( rule__DirectedStatement__Alternatives_1 )? ) ;
    public final void rule__DirectedStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:856:1: ( ( ( rule__DirectedStatement__Alternatives_1 )? ) )
            // InternalDotLanguage.g:857:1: ( ( rule__DirectedStatement__Alternatives_1 )? )
            {
            // InternalDotLanguage.g:857:1: ( ( rule__DirectedStatement__Alternatives_1 )? )
            // InternalDotLanguage.g:858:2: ( rule__DirectedStatement__Alternatives_1 )?
            {
             before(grammarAccess.getDirectedStatementAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:859:2: ( rule__DirectedStatement__Alternatives_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=14)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDotLanguage.g:859:3: rule__DirectedStatement__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedStatement__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectedStatementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedStatement__Group__1__Impl"


    // $ANTLR start "rule__UndirectedStatement__Group__0"
    // InternalDotLanguage.g:868:1: rule__UndirectedStatement__Group__0 : rule__UndirectedStatement__Group__0__Impl rule__UndirectedStatement__Group__1 ;
    public final void rule__UndirectedStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:872:1: ( rule__UndirectedStatement__Group__0__Impl rule__UndirectedStatement__Group__1 )
            // InternalDotLanguage.g:873:2: rule__UndirectedStatement__Group__0__Impl rule__UndirectedStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__UndirectedStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedStatement__Group__0"


    // $ANTLR start "rule__UndirectedStatement__Group__0__Impl"
    // InternalDotLanguage.g:880:1: rule__UndirectedStatement__Group__0__Impl : ( ( rule__UndirectedStatement__Alternatives_0 ) ) ;
    public final void rule__UndirectedStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:884:1: ( ( ( rule__UndirectedStatement__Alternatives_0 ) ) )
            // InternalDotLanguage.g:885:1: ( ( rule__UndirectedStatement__Alternatives_0 ) )
            {
            // InternalDotLanguage.g:885:1: ( ( rule__UndirectedStatement__Alternatives_0 ) )
            // InternalDotLanguage.g:886:2: ( rule__UndirectedStatement__Alternatives_0 )
            {
             before(grammarAccess.getUndirectedStatementAccess().getAlternatives_0()); 
            // InternalDotLanguage.g:887:2: ( rule__UndirectedStatement__Alternatives_0 )
            // InternalDotLanguage.g:887:3: rule__UndirectedStatement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedStatement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedStatementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedStatement__Group__0__Impl"


    // $ANTLR start "rule__UndirectedStatement__Group__1"
    // InternalDotLanguage.g:895:1: rule__UndirectedStatement__Group__1 : rule__UndirectedStatement__Group__1__Impl ;
    public final void rule__UndirectedStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:899:1: ( rule__UndirectedStatement__Group__1__Impl )
            // InternalDotLanguage.g:900:2: rule__UndirectedStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedStatement__Group__1"


    // $ANTLR start "rule__UndirectedStatement__Group__1__Impl"
    // InternalDotLanguage.g:906:1: rule__UndirectedStatement__Group__1__Impl : ( ( rule__UndirectedStatement__Alternatives_1 )? ) ;
    public final void rule__UndirectedStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:910:1: ( ( ( rule__UndirectedStatement__Alternatives_1 )? ) )
            // InternalDotLanguage.g:911:1: ( ( rule__UndirectedStatement__Alternatives_1 )? )
            {
            // InternalDotLanguage.g:911:1: ( ( rule__UndirectedStatement__Alternatives_1 )? )
            // InternalDotLanguage.g:912:2: ( rule__UndirectedStatement__Alternatives_1 )?
            {
             before(grammarAccess.getUndirectedStatementAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:913:2: ( rule__UndirectedStatement__Alternatives_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDotLanguage.g:913:3: rule__UndirectedStatement__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UndirectedStatement__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUndirectedStatementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedStatement__Group__1__Impl"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__0"
    // InternalDotLanguage.g:922:1: rule__DirectedSubgraphDeclaration__Group__0 : rule__DirectedSubgraphDeclaration__Group__0__Impl rule__DirectedSubgraphDeclaration__Group__1 ;
    public final void rule__DirectedSubgraphDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:926:1: ( rule__DirectedSubgraphDeclaration__Group__0__Impl rule__DirectedSubgraphDeclaration__Group__1 )
            // InternalDotLanguage.g:927:2: rule__DirectedSubgraphDeclaration__Group__0__Impl rule__DirectedSubgraphDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DirectedSubgraphDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedSubgraphDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__0"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__0__Impl"
    // InternalDotLanguage.g:934:1: rule__DirectedSubgraphDeclaration__Group__0__Impl : ( 'subgraph' ) ;
    public final void rule__DirectedSubgraphDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:938:1: ( ( 'subgraph' ) )
            // InternalDotLanguage.g:939:1: ( 'subgraph' )
            {
            // InternalDotLanguage.g:939:1: ( 'subgraph' )
            // InternalDotLanguage.g:940:2: 'subgraph'
            {
             before(grammarAccess.getDirectedSubgraphDeclarationAccess().getSubgraphKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDirectedSubgraphDeclarationAccess().getSubgraphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__0__Impl"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__1"
    // InternalDotLanguage.g:949:1: rule__DirectedSubgraphDeclaration__Group__1 : rule__DirectedSubgraphDeclaration__Group__1__Impl rule__DirectedSubgraphDeclaration__Group__2 ;
    public final void rule__DirectedSubgraphDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:953:1: ( rule__DirectedSubgraphDeclaration__Group__1__Impl rule__DirectedSubgraphDeclaration__Group__2 )
            // InternalDotLanguage.g:954:2: rule__DirectedSubgraphDeclaration__Group__1__Impl rule__DirectedSubgraphDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DirectedSubgraphDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedSubgraphDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__1"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__1__Impl"
    // InternalDotLanguage.g:961:1: rule__DirectedSubgraphDeclaration__Group__1__Impl : ( ( rule__DirectedSubgraphDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DirectedSubgraphDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:965:1: ( ( ( rule__DirectedSubgraphDeclaration__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:966:1: ( ( rule__DirectedSubgraphDeclaration__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:966:1: ( ( rule__DirectedSubgraphDeclaration__NameAssignment_1 ) )
            // InternalDotLanguage.g:967:2: ( rule__DirectedSubgraphDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getDirectedSubgraphDeclarationAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:968:2: ( rule__DirectedSubgraphDeclaration__NameAssignment_1 )
            // InternalDotLanguage.g:968:3: rule__DirectedSubgraphDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectedSubgraphDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectedSubgraphDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__1__Impl"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__2"
    // InternalDotLanguage.g:976:1: rule__DirectedSubgraphDeclaration__Group__2 : rule__DirectedSubgraphDeclaration__Group__2__Impl rule__DirectedSubgraphDeclaration__Group__3 ;
    public final void rule__DirectedSubgraphDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:980:1: ( rule__DirectedSubgraphDeclaration__Group__2__Impl rule__DirectedSubgraphDeclaration__Group__3 )
            // InternalDotLanguage.g:981:2: rule__DirectedSubgraphDeclaration__Group__2__Impl rule__DirectedSubgraphDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DirectedSubgraphDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedSubgraphDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__2"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__2__Impl"
    // InternalDotLanguage.g:988:1: rule__DirectedSubgraphDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__DirectedSubgraphDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:992:1: ( ( '{' ) )
            // InternalDotLanguage.g:993:1: ( '{' )
            {
            // InternalDotLanguage.g:993:1: ( '{' )
            // InternalDotLanguage.g:994:2: '{'
            {
             before(grammarAccess.getDirectedSubgraphDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDirectedSubgraphDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__2__Impl"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__3"
    // InternalDotLanguage.g:1003:1: rule__DirectedSubgraphDeclaration__Group__3 : rule__DirectedSubgraphDeclaration__Group__3__Impl rule__DirectedSubgraphDeclaration__Group__4 ;
    public final void rule__DirectedSubgraphDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1007:1: ( rule__DirectedSubgraphDeclaration__Group__3__Impl rule__DirectedSubgraphDeclaration__Group__4 )
            // InternalDotLanguage.g:1008:2: rule__DirectedSubgraphDeclaration__Group__3__Impl rule__DirectedSubgraphDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DirectedSubgraphDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedSubgraphDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__3"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__3__Impl"
    // InternalDotLanguage.g:1015:1: rule__DirectedSubgraphDeclaration__Group__3__Impl : ( ( rule__DirectedSubgraphDeclaration__StatementsAssignment_3 )* ) ;
    public final void rule__DirectedSubgraphDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1019:1: ( ( ( rule__DirectedSubgraphDeclaration__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:1020:1: ( ( rule__DirectedSubgraphDeclaration__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:1020:1: ( ( rule__DirectedSubgraphDeclaration__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:1021:2: ( rule__DirectedSubgraphDeclaration__StatementsAssignment_3 )*
            {
             before(grammarAccess.getDirectedSubgraphDeclarationAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:1022:2: ( rule__DirectedSubgraphDeclaration__StatementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDotLanguage.g:1022:3: rule__DirectedSubgraphDeclaration__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DirectedSubgraphDeclaration__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDirectedSubgraphDeclarationAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__3__Impl"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__4"
    // InternalDotLanguage.g:1030:1: rule__DirectedSubgraphDeclaration__Group__4 : rule__DirectedSubgraphDeclaration__Group__4__Impl ;
    public final void rule__DirectedSubgraphDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1034:1: ( rule__DirectedSubgraphDeclaration__Group__4__Impl )
            // InternalDotLanguage.g:1035:2: rule__DirectedSubgraphDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectedSubgraphDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__4"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__Group__4__Impl"
    // InternalDotLanguage.g:1041:1: rule__DirectedSubgraphDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__DirectedSubgraphDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1045:1: ( ( '}' ) )
            // InternalDotLanguage.g:1046:1: ( '}' )
            {
            // InternalDotLanguage.g:1046:1: ( '}' )
            // InternalDotLanguage.g:1047:2: '}'
            {
             before(grammarAccess.getDirectedSubgraphDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDirectedSubgraphDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__Group__4__Impl"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__0"
    // InternalDotLanguage.g:1057:1: rule__UndirectedSubgraphDeclaration__Group__0 : rule__UndirectedSubgraphDeclaration__Group__0__Impl rule__UndirectedSubgraphDeclaration__Group__1 ;
    public final void rule__UndirectedSubgraphDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1061:1: ( rule__UndirectedSubgraphDeclaration__Group__0__Impl rule__UndirectedSubgraphDeclaration__Group__1 )
            // InternalDotLanguage.g:1062:2: rule__UndirectedSubgraphDeclaration__Group__0__Impl rule__UndirectedSubgraphDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UndirectedSubgraphDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedSubgraphDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__0"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__0__Impl"
    // InternalDotLanguage.g:1069:1: rule__UndirectedSubgraphDeclaration__Group__0__Impl : ( 'subgraph' ) ;
    public final void rule__UndirectedSubgraphDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1073:1: ( ( 'subgraph' ) )
            // InternalDotLanguage.g:1074:1: ( 'subgraph' )
            {
            // InternalDotLanguage.g:1074:1: ( 'subgraph' )
            // InternalDotLanguage.g:1075:2: 'subgraph'
            {
             before(grammarAccess.getUndirectedSubgraphDeclarationAccess().getSubgraphKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUndirectedSubgraphDeclarationAccess().getSubgraphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__0__Impl"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__1"
    // InternalDotLanguage.g:1084:1: rule__UndirectedSubgraphDeclaration__Group__1 : rule__UndirectedSubgraphDeclaration__Group__1__Impl rule__UndirectedSubgraphDeclaration__Group__2 ;
    public final void rule__UndirectedSubgraphDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1088:1: ( rule__UndirectedSubgraphDeclaration__Group__1__Impl rule__UndirectedSubgraphDeclaration__Group__2 )
            // InternalDotLanguage.g:1089:2: rule__UndirectedSubgraphDeclaration__Group__1__Impl rule__UndirectedSubgraphDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__UndirectedSubgraphDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedSubgraphDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__1"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__1__Impl"
    // InternalDotLanguage.g:1096:1: rule__UndirectedSubgraphDeclaration__Group__1__Impl : ( ( rule__UndirectedSubgraphDeclaration__NameAssignment_1 ) ) ;
    public final void rule__UndirectedSubgraphDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1100:1: ( ( ( rule__UndirectedSubgraphDeclaration__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:1101:1: ( ( rule__UndirectedSubgraphDeclaration__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:1101:1: ( ( rule__UndirectedSubgraphDeclaration__NameAssignment_1 ) )
            // InternalDotLanguage.g:1102:2: ( rule__UndirectedSubgraphDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getUndirectedSubgraphDeclarationAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:1103:2: ( rule__UndirectedSubgraphDeclaration__NameAssignment_1 )
            // InternalDotLanguage.g:1103:3: rule__UndirectedSubgraphDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedSubgraphDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedSubgraphDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__1__Impl"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__2"
    // InternalDotLanguage.g:1111:1: rule__UndirectedSubgraphDeclaration__Group__2 : rule__UndirectedSubgraphDeclaration__Group__2__Impl rule__UndirectedSubgraphDeclaration__Group__3 ;
    public final void rule__UndirectedSubgraphDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1115:1: ( rule__UndirectedSubgraphDeclaration__Group__2__Impl rule__UndirectedSubgraphDeclaration__Group__3 )
            // InternalDotLanguage.g:1116:2: rule__UndirectedSubgraphDeclaration__Group__2__Impl rule__UndirectedSubgraphDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__UndirectedSubgraphDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedSubgraphDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__2"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__2__Impl"
    // InternalDotLanguage.g:1123:1: rule__UndirectedSubgraphDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__UndirectedSubgraphDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1127:1: ( ( '{' ) )
            // InternalDotLanguage.g:1128:1: ( '{' )
            {
            // InternalDotLanguage.g:1128:1: ( '{' )
            // InternalDotLanguage.g:1129:2: '{'
            {
             before(grammarAccess.getUndirectedSubgraphDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUndirectedSubgraphDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__2__Impl"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__3"
    // InternalDotLanguage.g:1138:1: rule__UndirectedSubgraphDeclaration__Group__3 : rule__UndirectedSubgraphDeclaration__Group__3__Impl rule__UndirectedSubgraphDeclaration__Group__4 ;
    public final void rule__UndirectedSubgraphDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1142:1: ( rule__UndirectedSubgraphDeclaration__Group__3__Impl rule__UndirectedSubgraphDeclaration__Group__4 )
            // InternalDotLanguage.g:1143:2: rule__UndirectedSubgraphDeclaration__Group__3__Impl rule__UndirectedSubgraphDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__UndirectedSubgraphDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedSubgraphDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__3"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__3__Impl"
    // InternalDotLanguage.g:1150:1: rule__UndirectedSubgraphDeclaration__Group__3__Impl : ( ( rule__UndirectedSubgraphDeclaration__StatementsAssignment_3 )* ) ;
    public final void rule__UndirectedSubgraphDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1154:1: ( ( ( rule__UndirectedSubgraphDeclaration__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:1155:1: ( ( rule__UndirectedSubgraphDeclaration__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:1155:1: ( ( rule__UndirectedSubgraphDeclaration__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:1156:2: ( rule__UndirectedSubgraphDeclaration__StatementsAssignment_3 )*
            {
             before(grammarAccess.getUndirectedSubgraphDeclarationAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:1157:2: ( rule__UndirectedSubgraphDeclaration__StatementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDotLanguage.g:1157:3: rule__UndirectedSubgraphDeclaration__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UndirectedSubgraphDeclaration__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getUndirectedSubgraphDeclarationAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__3__Impl"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__4"
    // InternalDotLanguage.g:1165:1: rule__UndirectedSubgraphDeclaration__Group__4 : rule__UndirectedSubgraphDeclaration__Group__4__Impl ;
    public final void rule__UndirectedSubgraphDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1169:1: ( rule__UndirectedSubgraphDeclaration__Group__4__Impl )
            // InternalDotLanguage.g:1170:2: rule__UndirectedSubgraphDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedSubgraphDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__4"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__Group__4__Impl"
    // InternalDotLanguage.g:1176:1: rule__UndirectedSubgraphDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__UndirectedSubgraphDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1180:1: ( ( '}' ) )
            // InternalDotLanguage.g:1181:1: ( '}' )
            {
            // InternalDotLanguage.g:1181:1: ( '}' )
            // InternalDotLanguage.g:1182:2: '}'
            {
             before(grammarAccess.getUndirectedSubgraphDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUndirectedSubgraphDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__Group__4__Impl"


    // $ANTLR start "rule__NodeDeclaration__Group__0"
    // InternalDotLanguage.g:1192:1: rule__NodeDeclaration__Group__0 : rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 ;
    public final void rule__NodeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1196:1: ( rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 )
            // InternalDotLanguage.g:1197:2: rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NodeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDeclaration__Group__0"


    // $ANTLR start "rule__NodeDeclaration__Group__0__Impl"
    // InternalDotLanguage.g:1204:1: rule__NodeDeclaration__Group__0__Impl : ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) ) ;
    public final void rule__NodeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1208:1: ( ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) ) )
            // InternalDotLanguage.g:1209:1: ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) )
            {
            // InternalDotLanguage.g:1209:1: ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) )
            // InternalDotLanguage.g:1210:2: ( rule__NodeDeclaration__NodeNameAssignment_0 )
            {
             before(grammarAccess.getNodeDeclarationAccess().getNodeNameAssignment_0()); 
            // InternalDotLanguage.g:1211:2: ( rule__NodeDeclaration__NodeNameAssignment_0 )
            // InternalDotLanguage.g:1211:3: rule__NodeDeclaration__NodeNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__NodeNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDeclarationAccess().getNodeNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__NodeDeclaration__Group__1"
    // InternalDotLanguage.g:1219:1: rule__NodeDeclaration__Group__1 : rule__NodeDeclaration__Group__1__Impl ;
    public final void rule__NodeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1223:1: ( rule__NodeDeclaration__Group__1__Impl )
            // InternalDotLanguage.g:1224:2: rule__NodeDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDeclaration__Group__1"


    // $ANTLR start "rule__NodeDeclaration__Group__1__Impl"
    // InternalDotLanguage.g:1230:1: rule__NodeDeclaration__Group__1__Impl : ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? ) ;
    public final void rule__NodeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1234:1: ( ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? ) )
            // InternalDotLanguage.g:1235:1: ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? )
            {
            // InternalDotLanguage.g:1235:1: ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? )
            // InternalDotLanguage.g:1236:2: ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )?
            {
             before(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAssignment_1()); 
            // InternalDotLanguage.g:1237:2: ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDotLanguage.g:1237:3: rule__NodeDeclaration__OptionalAttributesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeDeclaration__OptionalAttributesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__AttributeList__Group__0"
    // InternalDotLanguage.g:1246:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1250:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalDotLanguage.g:1251:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AttributeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__0"


    // $ANTLR start "rule__AttributeList__Group__0__Impl"
    // InternalDotLanguage.g:1258:1: rule__AttributeList__Group__0__Impl : ( '[' ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1262:1: ( ( '[' ) )
            // InternalDotLanguage.g:1263:1: ( '[' )
            {
            // InternalDotLanguage.g:1263:1: ( '[' )
            // InternalDotLanguage.g:1264:2: '['
            {
             before(grammarAccess.getAttributeListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeListAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__0__Impl"


    // $ANTLR start "rule__AttributeList__Group__1"
    // InternalDotLanguage.g:1273:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1277:1: ( rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 )
            // InternalDotLanguage.g:1278:2: rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AttributeList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__1"


    // $ANTLR start "rule__AttributeList__Group__1__Impl"
    // InternalDotLanguage.g:1285:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__AttrAssignment_1 ) ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1289:1: ( ( ( rule__AttributeList__AttrAssignment_1 ) ) )
            // InternalDotLanguage.g:1290:1: ( ( rule__AttributeList__AttrAssignment_1 ) )
            {
            // InternalDotLanguage.g:1290:1: ( ( rule__AttributeList__AttrAssignment_1 ) )
            // InternalDotLanguage.g:1291:2: ( rule__AttributeList__AttrAssignment_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttrAssignment_1()); 
            // InternalDotLanguage.g:1292:2: ( rule__AttributeList__AttrAssignment_1 )
            // InternalDotLanguage.g:1292:3: rule__AttributeList__AttrAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__AttrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttrAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__1__Impl"


    // $ANTLR start "rule__AttributeList__Group__2"
    // InternalDotLanguage.g:1300:1: rule__AttributeList__Group__2 : rule__AttributeList__Group__2__Impl rule__AttributeList__Group__3 ;
    public final void rule__AttributeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1304:1: ( rule__AttributeList__Group__2__Impl rule__AttributeList__Group__3 )
            // InternalDotLanguage.g:1305:2: rule__AttributeList__Group__2__Impl rule__AttributeList__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__AttributeList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__2"


    // $ANTLR start "rule__AttributeList__Group__2__Impl"
    // InternalDotLanguage.g:1312:1: rule__AttributeList__Group__2__Impl : ( ( rule__AttributeList__Group_2__0 )? ) ;
    public final void rule__AttributeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1316:1: ( ( ( rule__AttributeList__Group_2__0 )? ) )
            // InternalDotLanguage.g:1317:1: ( ( rule__AttributeList__Group_2__0 )? )
            {
            // InternalDotLanguage.g:1317:1: ( ( rule__AttributeList__Group_2__0 )? )
            // InternalDotLanguage.g:1318:2: ( rule__AttributeList__Group_2__0 )?
            {
             before(grammarAccess.getAttributeListAccess().getGroup_2()); 
            // InternalDotLanguage.g:1319:2: ( rule__AttributeList__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDotLanguage.g:1319:3: rule__AttributeList__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeList__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__2__Impl"


    // $ANTLR start "rule__AttributeList__Group__3"
    // InternalDotLanguage.g:1327:1: rule__AttributeList__Group__3 : rule__AttributeList__Group__3__Impl ;
    public final void rule__AttributeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1331:1: ( rule__AttributeList__Group__3__Impl )
            // InternalDotLanguage.g:1332:2: rule__AttributeList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__3"


    // $ANTLR start "rule__AttributeList__Group__3__Impl"
    // InternalDotLanguage.g:1338:1: rule__AttributeList__Group__3__Impl : ( ']' ) ;
    public final void rule__AttributeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1342:1: ( ( ']' ) )
            // InternalDotLanguage.g:1343:1: ( ']' )
            {
            // InternalDotLanguage.g:1343:1: ( ']' )
            // InternalDotLanguage.g:1344:2: ']'
            {
             before(grammarAccess.getAttributeListAccess().getRightSquareBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeListAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__3__Impl"


    // $ANTLR start "rule__AttributeList__Group_2__0"
    // InternalDotLanguage.g:1354:1: rule__AttributeList__Group_2__0 : rule__AttributeList__Group_2__0__Impl rule__AttributeList__Group_2__1 ;
    public final void rule__AttributeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1358:1: ( rule__AttributeList__Group_2__0__Impl rule__AttributeList__Group_2__1 )
            // InternalDotLanguage.g:1359:2: rule__AttributeList__Group_2__0__Impl rule__AttributeList__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__AttributeList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group_2__0"


    // $ANTLR start "rule__AttributeList__Group_2__0__Impl"
    // InternalDotLanguage.g:1366:1: rule__AttributeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1370:1: ( ( ',' ) )
            // InternalDotLanguage.g:1371:1: ( ',' )
            {
            // InternalDotLanguage.g:1371:1: ( ',' )
            // InternalDotLanguage.g:1372:2: ','
            {
             before(grammarAccess.getAttributeListAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeListAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeList__Group_2__1"
    // InternalDotLanguage.g:1381:1: rule__AttributeList__Group_2__1 : rule__AttributeList__Group_2__1__Impl ;
    public final void rule__AttributeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1385:1: ( rule__AttributeList__Group_2__1__Impl )
            // InternalDotLanguage.g:1386:2: rule__AttributeList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group_2__1"


    // $ANTLR start "rule__AttributeList__Group_2__1__Impl"
    // InternalDotLanguage.g:1392:1: rule__AttributeList__Group_2__1__Impl : ( ( rule__AttributeList__AttrAssignment_2_1 ) ) ;
    public final void rule__AttributeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1396:1: ( ( ( rule__AttributeList__AttrAssignment_2_1 ) ) )
            // InternalDotLanguage.g:1397:1: ( ( rule__AttributeList__AttrAssignment_2_1 ) )
            {
            // InternalDotLanguage.g:1397:1: ( ( rule__AttributeList__AttrAssignment_2_1 ) )
            // InternalDotLanguage.g:1398:2: ( rule__AttributeList__AttrAssignment_2_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttrAssignment_2_1()); 
            // InternalDotLanguage.g:1399:2: ( rule__AttributeList__AttrAssignment_2_1 )
            // InternalDotLanguage.g:1399:3: rule__AttributeList__AttrAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__AttrAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttrAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDotLanguage.g:1408:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1412:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDotLanguage.g:1413:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalDotLanguage.g:1420:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AttributeNameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1424:1: ( ( ( rule__Attribute__AttributeNameAssignment_0 ) ) )
            // InternalDotLanguage.g:1425:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            {
            // InternalDotLanguage.g:1425:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            // InternalDotLanguage.g:1426:2: ( rule__Attribute__AttributeNameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); 
            // InternalDotLanguage.g:1427:2: ( rule__Attribute__AttributeNameAssignment_0 )
            // InternalDotLanguage.g:1427:3: rule__Attribute__AttributeNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributeNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalDotLanguage.g:1435:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1439:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDotLanguage.g:1440:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalDotLanguage.g:1447:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1451:1: ( ( '=' ) )
            // InternalDotLanguage.g:1452:1: ( '=' )
            {
            // InternalDotLanguage.g:1452:1: ( '=' )
            // InternalDotLanguage.g:1453:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalDotLanguage.g:1462:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1466:1: ( rule__Attribute__Group__2__Impl )
            // InternalDotLanguage.g:1467:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalDotLanguage.g:1473:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributeValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1477:1: ( ( ( rule__Attribute__AttributeValueAssignment_2 ) ) )
            // InternalDotLanguage.g:1478:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            {
            // InternalDotLanguage.g:1478:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            // InternalDotLanguage.g:1479:2: ( rule__Attribute__AttributeValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); 
            // InternalDotLanguage.g:1480:2: ( rule__Attribute__AttributeValueAssignment_2 )
            // InternalDotLanguage.g:1480:3: rule__Attribute__AttributeValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributeValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__DirectedEdgeDeclaration__Group__0"
    // InternalDotLanguage.g:1489:1: rule__DirectedEdgeDeclaration__Group__0 : rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1 ;
    public final void rule__DirectedEdgeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1493:1: ( rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1 )
            // InternalDotLanguage.g:1494:2: rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DirectedEdgeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedEdgeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdgeDeclaration__Group__0"


    // $ANTLR start "rule__DirectedEdgeDeclaration__Group__0__Impl"
    // InternalDotLanguage.g:1501:1: rule__DirectedEdgeDeclaration__Group__0__Impl : ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1505:1: ( ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) )
            // InternalDotLanguage.g:1506:1: ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            {
            // InternalDotLanguage.g:1506:1: ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            // InternalDotLanguage.g:1507:2: ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 
            // InternalDotLanguage.g:1508:2: ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 )
            // InternalDotLanguage.g:1508:3: rule__DirectedEdgeDeclaration__FirstNodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DirectedEdgeDeclaration__FirstNodeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdgeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__DirectedEdgeDeclaration__Group__1"
    // InternalDotLanguage.g:1516:1: rule__DirectedEdgeDeclaration__Group__1 : rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2 ;
    public final void rule__DirectedEdgeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1520:1: ( rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2 )
            // InternalDotLanguage.g:1521:2: rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DirectedEdgeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedEdgeDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdgeDeclaration__Group__1"


    // $ANTLR start "rule__DirectedEdgeDeclaration__Group__1__Impl"
    // InternalDotLanguage.g:1528:1: rule__DirectedEdgeDeclaration__Group__1__Impl : ( ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1532:1: ( ( ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 ) ) )
            // InternalDotLanguage.g:1533:1: ( ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 ) )
            {
            // InternalDotLanguage.g:1533:1: ( ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 ) )
            // InternalDotLanguage.g:1534:2: ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getEdgeAssignment_1()); 
            // InternalDotLanguage.g:1535:2: ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 )
            // InternalDotLanguage.g:1535:3: rule__DirectedEdgeDeclaration__EdgeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectedEdgeDeclaration__EdgeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getEdgeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdgeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__DirectedEdgeDeclaration__Group__2"
    // InternalDotLanguage.g:1543:1: rule__DirectedEdgeDeclaration__Group__2 : rule__DirectedEdgeDeclaration__Group__2__Impl ;
    public final void rule__DirectedEdgeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1547:1: ( rule__DirectedEdgeDeclaration__Group__2__Impl )
            // InternalDotLanguage.g:1548:2: rule__DirectedEdgeDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectedEdgeDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdgeDeclaration__Group__2"


    // $ANTLR start "rule__DirectedEdgeDeclaration__Group__2__Impl"
    // InternalDotLanguage.g:1554:1: rule__DirectedEdgeDeclaration__Group__2__Impl : ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1558:1: ( ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) )
            // InternalDotLanguage.g:1559:1: ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            {
            // InternalDotLanguage.g:1559:1: ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            // InternalDotLanguage.g:1560:2: ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 
            // InternalDotLanguage.g:1561:2: ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 )
            // InternalDotLanguage.g:1561:3: rule__DirectedEdgeDeclaration__SecondNodeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DirectedEdgeDeclaration__SecondNodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdgeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__Group__0"
    // InternalDotLanguage.g:1570:1: rule__UndirectedEdgeDeclaration__Group__0 : rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1 ;
    public final void rule__UndirectedEdgeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1574:1: ( rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1 )
            // InternalDotLanguage.g:1575:2: rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__UndirectedEdgeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedEdgeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedEdgeDeclaration__Group__0"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__Group__0__Impl"
    // InternalDotLanguage.g:1582:1: rule__UndirectedEdgeDeclaration__Group__0__Impl : ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1586:1: ( ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) )
            // InternalDotLanguage.g:1587:1: ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            {
            // InternalDotLanguage.g:1587:1: ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            // InternalDotLanguage.g:1588:2: ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 
            // InternalDotLanguage.g:1589:2: ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 )
            // InternalDotLanguage.g:1589:3: rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedEdgeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__Group__1"
    // InternalDotLanguage.g:1597:1: rule__UndirectedEdgeDeclaration__Group__1 : rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2 ;
    public final void rule__UndirectedEdgeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1601:1: ( rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2 )
            // InternalDotLanguage.g:1602:2: rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UndirectedEdgeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedEdgeDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedEdgeDeclaration__Group__1"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__Group__1__Impl"
    // InternalDotLanguage.g:1609:1: rule__UndirectedEdgeDeclaration__Group__1__Impl : ( ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1613:1: ( ( ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 ) ) )
            // InternalDotLanguage.g:1614:1: ( ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 ) )
            {
            // InternalDotLanguage.g:1614:1: ( ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 ) )
            // InternalDotLanguage.g:1615:2: ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getEdgeAssignment_1()); 
            // InternalDotLanguage.g:1616:2: ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 )
            // InternalDotLanguage.g:1616:3: rule__UndirectedEdgeDeclaration__EdgeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedEdgeDeclaration__EdgeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getEdgeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedEdgeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__Group__2"
    // InternalDotLanguage.g:1624:1: rule__UndirectedEdgeDeclaration__Group__2 : rule__UndirectedEdgeDeclaration__Group__2__Impl ;
    public final void rule__UndirectedEdgeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1628:1: ( rule__UndirectedEdgeDeclaration__Group__2__Impl )
            // InternalDotLanguage.g:1629:2: rule__UndirectedEdgeDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedEdgeDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedEdgeDeclaration__Group__2"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__Group__2__Impl"
    // InternalDotLanguage.g:1635:1: rule__UndirectedEdgeDeclaration__Group__2__Impl : ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1639:1: ( ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) )
            // InternalDotLanguage.g:1640:1: ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            {
            // InternalDotLanguage.g:1640:1: ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            // InternalDotLanguage.g:1641:2: ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 
            // InternalDotLanguage.g:1642:2: ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 )
            // InternalDotLanguage.g:1642:3: rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedEdgeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__DotLanguage__GraphsAssignment"
    // InternalDotLanguage.g:1651:1: rule__DotLanguage__GraphsAssignment : ( ( rule__DotLanguage__GraphsAlternatives_0 ) ) ;
    public final void rule__DotLanguage__GraphsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1655:1: ( ( ( rule__DotLanguage__GraphsAlternatives_0 ) ) )
            // InternalDotLanguage.g:1656:2: ( ( rule__DotLanguage__GraphsAlternatives_0 ) )
            {
            // InternalDotLanguage.g:1656:2: ( ( rule__DotLanguage__GraphsAlternatives_0 ) )
            // InternalDotLanguage.g:1657:3: ( rule__DotLanguage__GraphsAlternatives_0 )
            {
             before(grammarAccess.getDotLanguageAccess().getGraphsAlternatives_0()); 
            // InternalDotLanguage.g:1658:3: ( rule__DotLanguage__GraphsAlternatives_0 )
            // InternalDotLanguage.g:1658:4: rule__DotLanguage__GraphsAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DotLanguage__GraphsAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDotLanguageAccess().getGraphsAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotLanguage__GraphsAssignment"


    // $ANTLR start "rule__Graph__NameAssignment_1"
    // InternalDotLanguage.g:1666:1: rule__Graph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Graph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1670:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1671:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1671:2: ( RULE_ID )
            // InternalDotLanguage.g:1672:3: RULE_ID
            {
             before(grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__NameAssignment_1"


    // $ANTLR start "rule__Graph__StatementsAssignment_3"
    // InternalDotLanguage.g:1681:1: rule__Graph__StatementsAssignment_3 : ( ruleUndirectedStatement ) ;
    public final void rule__Graph__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1685:1: ( ( ruleUndirectedStatement ) )
            // InternalDotLanguage.g:1686:2: ( ruleUndirectedStatement )
            {
            // InternalDotLanguage.g:1686:2: ( ruleUndirectedStatement )
            // InternalDotLanguage.g:1687:3: ruleUndirectedStatement
            {
             before(grammarAccess.getGraphAccess().getStatementsUndirectedStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUndirectedStatement();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getStatementsUndirectedStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__StatementsAssignment_3"


    // $ANTLR start "rule__Digraph__NameAssignment_1"
    // InternalDotLanguage.g:1696:1: rule__Digraph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Digraph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1700:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1701:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1701:2: ( RULE_ID )
            // InternalDotLanguage.g:1702:3: RULE_ID
            {
             before(grammarAccess.getDigraphAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDigraphAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__NameAssignment_1"


    // $ANTLR start "rule__Digraph__StatementsAssignment_3"
    // InternalDotLanguage.g:1711:1: rule__Digraph__StatementsAssignment_3 : ( ruleDirectedStatement ) ;
    public final void rule__Digraph__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1715:1: ( ( ruleDirectedStatement ) )
            // InternalDotLanguage.g:1716:2: ( ruleDirectedStatement )
            {
            // InternalDotLanguage.g:1716:2: ( ruleDirectedStatement )
            // InternalDotLanguage.g:1717:3: ruleDirectedStatement
            {
             before(grammarAccess.getDigraphAccess().getStatementsDirectedStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectedStatement();

            state._fsp--;

             after(grammarAccess.getDigraphAccess().getStatementsDirectedStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digraph__StatementsAssignment_3"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__NameAssignment_1"
    // InternalDotLanguage.g:1726:1: rule__DirectedSubgraphDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DirectedSubgraphDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1730:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1731:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1731:2: ( RULE_ID )
            // InternalDotLanguage.g:1732:3: RULE_ID
            {
             before(grammarAccess.getDirectedSubgraphDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDirectedSubgraphDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__NameAssignment_1"


    // $ANTLR start "rule__DirectedSubgraphDeclaration__StatementsAssignment_3"
    // InternalDotLanguage.g:1741:1: rule__DirectedSubgraphDeclaration__StatementsAssignment_3 : ( ruleDirectedStatement ) ;
    public final void rule__DirectedSubgraphDeclaration__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1745:1: ( ( ruleDirectedStatement ) )
            // InternalDotLanguage.g:1746:2: ( ruleDirectedStatement )
            {
            // InternalDotLanguage.g:1746:2: ( ruleDirectedStatement )
            // InternalDotLanguage.g:1747:3: ruleDirectedStatement
            {
             before(grammarAccess.getDirectedSubgraphDeclarationAccess().getStatementsDirectedStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectedStatement();

            state._fsp--;

             after(grammarAccess.getDirectedSubgraphDeclarationAccess().getStatementsDirectedStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedSubgraphDeclaration__StatementsAssignment_3"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__NameAssignment_1"
    // InternalDotLanguage.g:1756:1: rule__UndirectedSubgraphDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UndirectedSubgraphDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1760:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1761:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1761:2: ( RULE_ID )
            // InternalDotLanguage.g:1762:3: RULE_ID
            {
             before(grammarAccess.getUndirectedSubgraphDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUndirectedSubgraphDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__NameAssignment_1"


    // $ANTLR start "rule__UndirectedSubgraphDeclaration__StatementsAssignment_3"
    // InternalDotLanguage.g:1771:1: rule__UndirectedSubgraphDeclaration__StatementsAssignment_3 : ( ruleUndirectedStatement ) ;
    public final void rule__UndirectedSubgraphDeclaration__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1775:1: ( ( ruleUndirectedStatement ) )
            // InternalDotLanguage.g:1776:2: ( ruleUndirectedStatement )
            {
            // InternalDotLanguage.g:1776:2: ( ruleUndirectedStatement )
            // InternalDotLanguage.g:1777:3: ruleUndirectedStatement
            {
             before(grammarAccess.getUndirectedSubgraphDeclarationAccess().getStatementsUndirectedStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUndirectedStatement();

            state._fsp--;

             after(grammarAccess.getUndirectedSubgraphDeclarationAccess().getStatementsUndirectedStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedSubgraphDeclaration__StatementsAssignment_3"


    // $ANTLR start "rule__NodeDeclaration__NodeNameAssignment_0"
    // InternalDotLanguage.g:1786:1: rule__NodeDeclaration__NodeNameAssignment_0 : ( ruleNodeId ) ;
    public final void rule__NodeDeclaration__NodeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1790:1: ( ( ruleNodeId ) )
            // InternalDotLanguage.g:1791:2: ( ruleNodeId )
            {
            // InternalDotLanguage.g:1791:2: ( ruleNodeId )
            // InternalDotLanguage.g:1792:3: ruleNodeId
            {
             before(grammarAccess.getNodeDeclarationAccess().getNodeNameNodeIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeId();

            state._fsp--;

             after(grammarAccess.getNodeDeclarationAccess().getNodeNameNodeIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDeclaration__NodeNameAssignment_0"


    // $ANTLR start "rule__NodeDeclaration__OptionalAttributesAssignment_1"
    // InternalDotLanguage.g:1801:1: rule__NodeDeclaration__OptionalAttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__NodeDeclaration__OptionalAttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1805:1: ( ( ruleAttributeList ) )
            // InternalDotLanguage.g:1806:2: ( ruleAttributeList )
            {
            // InternalDotLanguage.g:1806:2: ( ruleAttributeList )
            // InternalDotLanguage.g:1807:3: ruleAttributeList
            {
             before(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAttributeListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDeclaration__OptionalAttributesAssignment_1"


    // $ANTLR start "rule__NodeId__NameAssignment"
    // InternalDotLanguage.g:1816:1: rule__NodeId__NameAssignment : ( RULE_ID ) ;
    public final void rule__NodeId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1820:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1821:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1821:2: ( RULE_ID )
            // InternalDotLanguage.g:1822:3: RULE_ID
            {
             before(grammarAccess.getNodeIdAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeIdAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__NameAssignment"


    // $ANTLR start "rule__AttributeList__AttrAssignment_1"
    // InternalDotLanguage.g:1831:1: rule__AttributeList__AttrAssignment_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1835:1: ( ( ruleAttribute ) )
            // InternalDotLanguage.g:1836:2: ( ruleAttribute )
            {
            // InternalDotLanguage.g:1836:2: ( ruleAttribute )
            // InternalDotLanguage.g:1837:3: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttrAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttrAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__AttrAssignment_1"


    // $ANTLR start "rule__AttributeList__AttrAssignment_2_1"
    // InternalDotLanguage.g:1846:1: rule__AttributeList__AttrAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttrAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1850:1: ( ( ruleAttribute ) )
            // InternalDotLanguage.g:1851:2: ( ruleAttribute )
            {
            // InternalDotLanguage.g:1851:2: ( ruleAttribute )
            // InternalDotLanguage.g:1852:3: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttrAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttrAttributeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__AttrAssignment_2_1"


    // $ANTLR start "rule__Attribute__AttributeNameAssignment_0"
    // InternalDotLanguage.g:1861:1: rule__Attribute__AttributeNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1865:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1866:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1866:2: ( RULE_ID )
            // InternalDotLanguage.g:1867:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeNameAssignment_0"


    // $ANTLR start "rule__Attribute__AttributeValueAssignment_2"
    // InternalDotLanguage.g:1876:1: rule__Attribute__AttributeValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1880:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1881:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1881:2: ( RULE_ID )
            // InternalDotLanguage.g:1882:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeValueAssignment_2"


    // $ANTLR start "rule__DirectedEdgeDeclaration__FirstNodeAssignment_0"
    // InternalDotLanguage.g:1891:1: rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DirectedEdgeDeclaration__FirstNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1895:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1896:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1896:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1897:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1898:3: ( RULE_ID )
            // InternalDotLanguage.g:1899:4: RULE_ID
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdgeDeclaration__FirstNodeAssignment_0"


    // $ANTLR start "rule__DirectedEdgeDeclaration__EdgeAssignment_1"
    // InternalDotLanguage.g:1910:1: rule__DirectedEdgeDeclaration__EdgeAssignment_1 : ( ruleDirectedEdge ) ;
    public final void rule__DirectedEdgeDeclaration__EdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1914:1: ( ( ruleDirectedEdge ) )
            // InternalDotLanguage.g:1915:2: ( ruleDirectedEdge )
            {
            // InternalDotLanguage.g:1915:2: ( ruleDirectedEdge )
            // InternalDotLanguage.g:1916:3: ruleDirectedEdge
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getEdgeDirectedEdgeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectedEdge();

            state._fsp--;

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getEdgeDirectedEdgeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdgeDeclaration__EdgeAssignment_1"


    // $ANTLR start "rule__DirectedEdgeDeclaration__SecondNodeAssignment_2"
    // InternalDotLanguage.g:1925:1: rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DirectedEdgeDeclaration__SecondNodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1929:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1930:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1930:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1931:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_2_0()); 
            // InternalDotLanguage.g:1932:3: ( RULE_ID )
            // InternalDotLanguage.g:1933:4: RULE_ID
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeNodeIdIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeNodeIdIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdgeDeclaration__SecondNodeAssignment_2"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0"
    // InternalDotLanguage.g:1944:1: rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1948:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1949:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1949:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1950:3: ( RULE_ID )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1951:3: ( RULE_ID )
            // InternalDotLanguage.g:1952:4: RULE_ID
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__EdgeAssignment_1"
    // InternalDotLanguage.g:1963:1: rule__UndirectedEdgeDeclaration__EdgeAssignment_1 : ( ruleUndirectedEdge ) ;
    public final void rule__UndirectedEdgeDeclaration__EdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1967:1: ( ( ruleUndirectedEdge ) )
            // InternalDotLanguage.g:1968:2: ( ruleUndirectedEdge )
            {
            // InternalDotLanguage.g:1968:2: ( ruleUndirectedEdge )
            // InternalDotLanguage.g:1969:3: ruleUndirectedEdge
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getEdgeUndirectedEdgeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUndirectedEdge();

            state._fsp--;

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getEdgeUndirectedEdgeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedEdgeDeclaration__EdgeAssignment_1"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2"
    // InternalDotLanguage.g:1978:1: rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1982:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1983:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1983:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1984:3: ( RULE_ID )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_2_0()); 
            // InternalDotLanguage.g:1985:3: ( RULE_ID )
            // InternalDotLanguage.g:1986:4: RULE_ID
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeNodeIdIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeNodeIdIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});

}