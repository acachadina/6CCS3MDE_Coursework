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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'--'", "','", "';'", "'graph'", "'{'", "'}'", "'digraph'", "'['", "']'", "'='"
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


    // $ANTLR start "entryRuleNodeDeclaration"
    // InternalDotLanguage.g:178:1: entryRuleNodeDeclaration : ruleNodeDeclaration EOF ;
    public final void entryRuleNodeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:179:1: ( ruleNodeDeclaration EOF )
            // InternalDotLanguage.g:180:1: ruleNodeDeclaration EOF
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
    // InternalDotLanguage.g:187:1: ruleNodeDeclaration : ( ( rule__NodeDeclaration__Group__0 ) ) ;
    public final void ruleNodeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:191:2: ( ( ( rule__NodeDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:192:2: ( ( rule__NodeDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:192:2: ( ( rule__NodeDeclaration__Group__0 ) )
            // InternalDotLanguage.g:193:3: ( rule__NodeDeclaration__Group__0 )
            {
             before(grammarAccess.getNodeDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:194:3: ( rule__NodeDeclaration__Group__0 )
            // InternalDotLanguage.g:194:4: rule__NodeDeclaration__Group__0
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
    // InternalDotLanguage.g:203:1: entryRuleNodeId : ruleNodeId EOF ;
    public final void entryRuleNodeId() throws RecognitionException {
        try {
            // InternalDotLanguage.g:204:1: ( ruleNodeId EOF )
            // InternalDotLanguage.g:205:1: ruleNodeId EOF
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
    // InternalDotLanguage.g:212:1: ruleNodeId : ( ( rule__NodeId__NameAssignment ) ) ;
    public final void ruleNodeId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:216:2: ( ( ( rule__NodeId__NameAssignment ) ) )
            // InternalDotLanguage.g:217:2: ( ( rule__NodeId__NameAssignment ) )
            {
            // InternalDotLanguage.g:217:2: ( ( rule__NodeId__NameAssignment ) )
            // InternalDotLanguage.g:218:3: ( rule__NodeId__NameAssignment )
            {
             before(grammarAccess.getNodeIdAccess().getNameAssignment()); 
            // InternalDotLanguage.g:219:3: ( rule__NodeId__NameAssignment )
            // InternalDotLanguage.g:219:4: rule__NodeId__NameAssignment
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
    // InternalDotLanguage.g:228:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // InternalDotLanguage.g:229:1: ( ruleAttributeList EOF )
            // InternalDotLanguage.g:230:1: ruleAttributeList EOF
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
    // InternalDotLanguage.g:237:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:241:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // InternalDotLanguage.g:242:2: ( ( rule__AttributeList__Group__0 ) )
            {
            // InternalDotLanguage.g:242:2: ( ( rule__AttributeList__Group__0 ) )
            // InternalDotLanguage.g:243:3: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // InternalDotLanguage.g:244:3: ( rule__AttributeList__Group__0 )
            // InternalDotLanguage.g:244:4: rule__AttributeList__Group__0
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
    // InternalDotLanguage.g:253:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDotLanguage.g:254:1: ( ruleAttribute EOF )
            // InternalDotLanguage.g:255:1: ruleAttribute EOF
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
    // InternalDotLanguage.g:262:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:266:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDotLanguage.g:267:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDotLanguage.g:267:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDotLanguage.g:268:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDotLanguage.g:269:3: ( rule__Attribute__Group__0 )
            // InternalDotLanguage.g:269:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleIDORINT"
    // InternalDotLanguage.g:278:1: entryRuleIDORINT : ruleIDORINT EOF ;
    public final void entryRuleIDORINT() throws RecognitionException {
        try {
            // InternalDotLanguage.g:279:1: ( ruleIDORINT EOF )
            // InternalDotLanguage.g:280:1: ruleIDORINT EOF
            {
             before(grammarAccess.getIDORINTRule()); 
            pushFollow(FOLLOW_1);
            ruleIDORINT();

            state._fsp--;

             after(grammarAccess.getIDORINTRule()); 
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
    // $ANTLR end "entryRuleIDORINT"


    // $ANTLR start "ruleIDORINT"
    // InternalDotLanguage.g:287:1: ruleIDORINT : ( ( rule__IDORINT__Alternatives ) ) ;
    public final void ruleIDORINT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:291:2: ( ( ( rule__IDORINT__Alternatives ) ) )
            // InternalDotLanguage.g:292:2: ( ( rule__IDORINT__Alternatives ) )
            {
            // InternalDotLanguage.g:292:2: ( ( rule__IDORINT__Alternatives ) )
            // InternalDotLanguage.g:293:3: ( rule__IDORINT__Alternatives )
            {
             before(grammarAccess.getIDORINTAccess().getAlternatives()); 
            // InternalDotLanguage.g:294:3: ( rule__IDORINT__Alternatives )
            // InternalDotLanguage.g:294:4: rule__IDORINT__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IDORINT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIDORINTAccess().getAlternatives()); 

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
    // $ANTLR end "ruleIDORINT"


    // $ANTLR start "entryRuleDirectedEdgeDeclaration"
    // InternalDotLanguage.g:303:1: entryRuleDirectedEdgeDeclaration : ruleDirectedEdgeDeclaration EOF ;
    public final void entryRuleDirectedEdgeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:304:1: ( ruleDirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:305:1: ruleDirectedEdgeDeclaration EOF
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
    // InternalDotLanguage.g:312:1: ruleDirectedEdgeDeclaration : ( ( rule__DirectedEdgeDeclaration__Group__0 ) ) ;
    public final void ruleDirectedEdgeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:316:2: ( ( ( rule__DirectedEdgeDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:317:2: ( ( rule__DirectedEdgeDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:317:2: ( ( rule__DirectedEdgeDeclaration__Group__0 ) )
            // InternalDotLanguage.g:318:3: ( rule__DirectedEdgeDeclaration__Group__0 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:319:3: ( rule__DirectedEdgeDeclaration__Group__0 )
            // InternalDotLanguage.g:319:4: rule__DirectedEdgeDeclaration__Group__0
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
    // InternalDotLanguage.g:328:1: entryRuleUndirectedEdgeDeclaration : ruleUndirectedEdgeDeclaration EOF ;
    public final void entryRuleUndirectedEdgeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:329:1: ( ruleUndirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:330:1: ruleUndirectedEdgeDeclaration EOF
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
    // InternalDotLanguage.g:337:1: ruleUndirectedEdgeDeclaration : ( ( rule__UndirectedEdgeDeclaration__Group__0 ) ) ;
    public final void ruleUndirectedEdgeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:341:2: ( ( ( rule__UndirectedEdgeDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:342:2: ( ( rule__UndirectedEdgeDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:342:2: ( ( rule__UndirectedEdgeDeclaration__Group__0 ) )
            // InternalDotLanguage.g:343:3: ( rule__UndirectedEdgeDeclaration__Group__0 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:344:3: ( rule__UndirectedEdgeDeclaration__Group__0 )
            // InternalDotLanguage.g:344:4: rule__UndirectedEdgeDeclaration__Group__0
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


    // $ANTLR start "entryRuleRightEdgeDeclaration"
    // InternalDotLanguage.g:353:1: entryRuleRightEdgeDeclaration : ruleRightEdgeDeclaration EOF ;
    public final void entryRuleRightEdgeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:354:1: ( ruleRightEdgeDeclaration EOF )
            // InternalDotLanguage.g:355:1: ruleRightEdgeDeclaration EOF
            {
             before(grammarAccess.getRightEdgeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleRightEdgeDeclaration();

            state._fsp--;

             after(grammarAccess.getRightEdgeDeclarationRule()); 
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
    // $ANTLR end "entryRuleRightEdgeDeclaration"


    // $ANTLR start "ruleRightEdgeDeclaration"
    // InternalDotLanguage.g:362:1: ruleRightEdgeDeclaration : ( ( rule__RightEdgeDeclaration__Alternatives ) ) ;
    public final void ruleRightEdgeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:366:2: ( ( ( rule__RightEdgeDeclaration__Alternatives ) ) )
            // InternalDotLanguage.g:367:2: ( ( rule__RightEdgeDeclaration__Alternatives ) )
            {
            // InternalDotLanguage.g:367:2: ( ( rule__RightEdgeDeclaration__Alternatives ) )
            // InternalDotLanguage.g:368:3: ( rule__RightEdgeDeclaration__Alternatives )
            {
             before(grammarAccess.getRightEdgeDeclarationAccess().getAlternatives()); 
            // InternalDotLanguage.g:369:3: ( rule__RightEdgeDeclaration__Alternatives )
            // InternalDotLanguage.g:369:4: rule__RightEdgeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RightEdgeDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRightEdgeDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRightEdgeDeclaration"


    // $ANTLR start "entryRuleNodeList"
    // InternalDotLanguage.g:378:1: entryRuleNodeList : ruleNodeList EOF ;
    public final void entryRuleNodeList() throws RecognitionException {
        try {
            // InternalDotLanguage.g:379:1: ( ruleNodeList EOF )
            // InternalDotLanguage.g:380:1: ruleNodeList EOF
            {
             before(grammarAccess.getNodeListRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeList();

            state._fsp--;

             after(grammarAccess.getNodeListRule()); 
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
    // $ANTLR end "entryRuleNodeList"


    // $ANTLR start "ruleNodeList"
    // InternalDotLanguage.g:387:1: ruleNodeList : ( ( rule__NodeList__Group__0 ) ) ;
    public final void ruleNodeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:391:2: ( ( ( rule__NodeList__Group__0 ) ) )
            // InternalDotLanguage.g:392:2: ( ( rule__NodeList__Group__0 ) )
            {
            // InternalDotLanguage.g:392:2: ( ( rule__NodeList__Group__0 ) )
            // InternalDotLanguage.g:393:3: ( rule__NodeList__Group__0 )
            {
             before(grammarAccess.getNodeListAccess().getGroup()); 
            // InternalDotLanguage.g:394:3: ( rule__NodeList__Group__0 )
            // InternalDotLanguage.g:394:4: rule__NodeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeListAccess().getGroup()); 

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
    // $ANTLR end "ruleNodeList"


    // $ANTLR start "entryRuleDirectedEdge"
    // InternalDotLanguage.g:403:1: entryRuleDirectedEdge : ruleDirectedEdge EOF ;
    public final void entryRuleDirectedEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:404:1: ( ruleDirectedEdge EOF )
            // InternalDotLanguage.g:405:1: ruleDirectedEdge EOF
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
    // InternalDotLanguage.g:412:1: ruleDirectedEdge : ( '->' ) ;
    public final void ruleDirectedEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:416:2: ( ( '->' ) )
            // InternalDotLanguage.g:417:2: ( '->' )
            {
            // InternalDotLanguage.g:417:2: ( '->' )
            // InternalDotLanguage.g:418:3: '->'
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
    // InternalDotLanguage.g:428:1: entryRuleUndirectedEdge : ruleUndirectedEdge EOF ;
    public final void entryRuleUndirectedEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:429:1: ( ruleUndirectedEdge EOF )
            // InternalDotLanguage.g:430:1: ruleUndirectedEdge EOF
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
    // InternalDotLanguage.g:437:1: ruleUndirectedEdge : ( '--' ) ;
    public final void ruleUndirectedEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:441:2: ( ( '--' ) )
            // InternalDotLanguage.g:442:2: ( '--' )
            {
            // InternalDotLanguage.g:442:2: ( '--' )
            // InternalDotLanguage.g:443:3: '--'
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
    // InternalDotLanguage.g:452:1: rule__DotLanguage__GraphsAlternatives_0 : ( ( ruleGraph ) | ( ruleDigraph ) );
    public final void rule__DotLanguage__GraphsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:456:1: ( ( ruleGraph ) | ( ruleDigraph ) )
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
                    // InternalDotLanguage.g:457:2: ( ruleGraph )
                    {
                    // InternalDotLanguage.g:457:2: ( ruleGraph )
                    // InternalDotLanguage.g:458:3: ruleGraph
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
                    // InternalDotLanguage.g:463:2: ( ruleDigraph )
                    {
                    // InternalDotLanguage.g:463:2: ( ruleDigraph )
                    // InternalDotLanguage.g:464:3: ruleDigraph
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
    // InternalDotLanguage.g:473:1: rule__DirectedStatement__Alternatives_0 : ( ( ruleNodeDeclaration ) | ( ruleDirectedEdgeDeclaration ) );
    public final void rule__DirectedStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:477:1: ( ( ruleNodeDeclaration ) | ( ruleDirectedEdgeDeclaration ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||(LA3_1>=13 && LA3_1<=14)||LA3_1==17||LA3_1==19) ) {
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
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDotLanguage.g:478:2: ( ruleNodeDeclaration )
                    {
                    // InternalDotLanguage.g:478:2: ( ruleNodeDeclaration )
                    // InternalDotLanguage.g:479:3: ruleNodeDeclaration
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
                    // InternalDotLanguage.g:484:2: ( ruleDirectedEdgeDeclaration )
                    {
                    // InternalDotLanguage.g:484:2: ( ruleDirectedEdgeDeclaration )
                    // InternalDotLanguage.g:485:3: ruleDirectedEdgeDeclaration
                    {
                     before(grammarAccess.getDirectedStatementAccess().getDirectedEdgeDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectedEdgeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDirectedStatementAccess().getDirectedEdgeDeclarationParserRuleCall_0_1()); 

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
    // InternalDotLanguage.g:494:1: rule__DirectedStatement__Alternatives_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__DirectedStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:498:1: ( ( ',' ) | ( ';' ) )
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
                    // InternalDotLanguage.g:499:2: ( ',' )
                    {
                    // InternalDotLanguage.g:499:2: ( ',' )
                    // InternalDotLanguage.g:500:3: ','
                    {
                     before(grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:505:2: ( ';' )
                    {
                    // InternalDotLanguage.g:505:2: ( ';' )
                    // InternalDotLanguage.g:506:3: ';'
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
    // InternalDotLanguage.g:515:1: rule__UndirectedStatement__Alternatives_0 : ( ( ruleNodeDeclaration ) | ( ruleUndirectedEdgeDeclaration ) );
    public final void rule__UndirectedStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:519:1: ( ( ruleNodeDeclaration ) | ( ruleUndirectedEdgeDeclaration ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==12) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=13 && LA5_1<=14)||LA5_1==17||LA5_1==19) ) {
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
                    // InternalDotLanguage.g:520:2: ( ruleNodeDeclaration )
                    {
                    // InternalDotLanguage.g:520:2: ( ruleNodeDeclaration )
                    // InternalDotLanguage.g:521:3: ruleNodeDeclaration
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
                    // InternalDotLanguage.g:526:2: ( ruleUndirectedEdgeDeclaration )
                    {
                    // InternalDotLanguage.g:526:2: ( ruleUndirectedEdgeDeclaration )
                    // InternalDotLanguage.g:527:3: ruleUndirectedEdgeDeclaration
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getUndirectedEdgeDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUndirectedEdgeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUndirectedStatementAccess().getUndirectedEdgeDeclarationParserRuleCall_0_1()); 

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
    // InternalDotLanguage.g:536:1: rule__UndirectedStatement__Alternatives_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__UndirectedStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:540:1: ( ( ',' ) | ( ';' ) )
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
                    // InternalDotLanguage.g:541:2: ( ',' )
                    {
                    // InternalDotLanguage.g:541:2: ( ',' )
                    // InternalDotLanguage.g:542:3: ','
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:547:2: ( ';' )
                    {
                    // InternalDotLanguage.g:547:2: ( ';' )
                    // InternalDotLanguage.g:548:3: ';'
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


    // $ANTLR start "rule__IDORINT__Alternatives"
    // InternalDotLanguage.g:557:1: rule__IDORINT__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__IDORINT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:561:1: ( ( RULE_ID ) | ( RULE_INT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDotLanguage.g:562:2: ( RULE_ID )
                    {
                    // InternalDotLanguage.g:562:2: ( RULE_ID )
                    // InternalDotLanguage.g:563:3: RULE_ID
                    {
                     before(grammarAccess.getIDORINTAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIDORINTAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:568:2: ( RULE_INT )
                    {
                    // InternalDotLanguage.g:568:2: ( RULE_INT )
                    // InternalDotLanguage.g:569:3: RULE_INT
                    {
                     before(grammarAccess.getIDORINTAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIDORINTAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__IDORINT__Alternatives"


    // $ANTLR start "rule__RightEdgeDeclaration__Alternatives"
    // InternalDotLanguage.g:578:1: rule__RightEdgeDeclaration__Alternatives : ( ( ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 ) ) | ( ( rule__RightEdgeDeclaration__NodeListAssignment_1 ) ) );
    public final void rule__RightEdgeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:582:1: ( ( ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 ) ) | ( ( rule__RightEdgeDeclaration__NodeListAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDotLanguage.g:583:2: ( ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 ) )
                    {
                    // InternalDotLanguage.g:583:2: ( ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 ) )
                    // InternalDotLanguage.g:584:3: ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 )
                    {
                     before(grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeAssignment_0()); 
                    // InternalDotLanguage.g:585:3: ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 )
                    // InternalDotLanguage.g:585:4: rule__RightEdgeDeclaration__SecondNodeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RightEdgeDeclaration__SecondNodeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:589:2: ( ( rule__RightEdgeDeclaration__NodeListAssignment_1 ) )
                    {
                    // InternalDotLanguage.g:589:2: ( ( rule__RightEdgeDeclaration__NodeListAssignment_1 ) )
                    // InternalDotLanguage.g:590:3: ( rule__RightEdgeDeclaration__NodeListAssignment_1 )
                    {
                     before(grammarAccess.getRightEdgeDeclarationAccess().getNodeListAssignment_1()); 
                    // InternalDotLanguage.g:591:3: ( rule__RightEdgeDeclaration__NodeListAssignment_1 )
                    // InternalDotLanguage.g:591:4: rule__RightEdgeDeclaration__NodeListAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RightEdgeDeclaration__NodeListAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRightEdgeDeclarationAccess().getNodeListAssignment_1()); 

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
    // $ANTLR end "rule__RightEdgeDeclaration__Alternatives"


    // $ANTLR start "rule__Graph__Group__0"
    // InternalDotLanguage.g:599:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:603:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalDotLanguage.g:604:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalDotLanguage.g:611:1: rule__Graph__Group__0__Impl : ( 'graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:615:1: ( ( 'graph' ) )
            // InternalDotLanguage.g:616:1: ( 'graph' )
            {
            // InternalDotLanguage.g:616:1: ( 'graph' )
            // InternalDotLanguage.g:617:2: 'graph'
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
    // InternalDotLanguage.g:626:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:630:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalDotLanguage.g:631:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
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
    // InternalDotLanguage.g:638:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NameAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:642:1: ( ( ( rule__Graph__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:643:1: ( ( rule__Graph__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:643:1: ( ( rule__Graph__NameAssignment_1 ) )
            // InternalDotLanguage.g:644:2: ( rule__Graph__NameAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:645:2: ( rule__Graph__NameAssignment_1 )
            // InternalDotLanguage.g:645:3: rule__Graph__NameAssignment_1
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
    // InternalDotLanguage.g:653:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:657:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalDotLanguage.g:658:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
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
    // InternalDotLanguage.g:665:1: rule__Graph__Group__2__Impl : ( '{' ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:669:1: ( ( '{' ) )
            // InternalDotLanguage.g:670:1: ( '{' )
            {
            // InternalDotLanguage.g:670:1: ( '{' )
            // InternalDotLanguage.g:671:2: '{'
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
    // InternalDotLanguage.g:680:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:684:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // InternalDotLanguage.g:685:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
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
    // InternalDotLanguage.g:692:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__StatementsAssignment_3 )* ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:696:1: ( ( ( rule__Graph__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:697:1: ( ( rule__Graph__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:697:1: ( ( rule__Graph__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:698:2: ( rule__Graph__StatementsAssignment_3 )*
            {
             before(grammarAccess.getGraphAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:699:2: ( rule__Graph__StatementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDotLanguage.g:699:3: rule__Graph__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Graph__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDotLanguage.g:707:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:711:1: ( rule__Graph__Group__4__Impl )
            // InternalDotLanguage.g:712:2: rule__Graph__Group__4__Impl
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
    // InternalDotLanguage.g:718:1: rule__Graph__Group__4__Impl : ( '}' ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:722:1: ( ( '}' ) )
            // InternalDotLanguage.g:723:1: ( '}' )
            {
            // InternalDotLanguage.g:723:1: ( '}' )
            // InternalDotLanguage.g:724:2: '}'
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
    // InternalDotLanguage.g:734:1: rule__Digraph__Group__0 : rule__Digraph__Group__0__Impl rule__Digraph__Group__1 ;
    public final void rule__Digraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:738:1: ( rule__Digraph__Group__0__Impl rule__Digraph__Group__1 )
            // InternalDotLanguage.g:739:2: rule__Digraph__Group__0__Impl rule__Digraph__Group__1
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
    // InternalDotLanguage.g:746:1: rule__Digraph__Group__0__Impl : ( 'digraph' ) ;
    public final void rule__Digraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:750:1: ( ( 'digraph' ) )
            // InternalDotLanguage.g:751:1: ( 'digraph' )
            {
            // InternalDotLanguage.g:751:1: ( 'digraph' )
            // InternalDotLanguage.g:752:2: 'digraph'
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
    // InternalDotLanguage.g:761:1: rule__Digraph__Group__1 : rule__Digraph__Group__1__Impl rule__Digraph__Group__2 ;
    public final void rule__Digraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:765:1: ( rule__Digraph__Group__1__Impl rule__Digraph__Group__2 )
            // InternalDotLanguage.g:766:2: rule__Digraph__Group__1__Impl rule__Digraph__Group__2
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
    // InternalDotLanguage.g:773:1: rule__Digraph__Group__1__Impl : ( ( rule__Digraph__NameAssignment_1 ) ) ;
    public final void rule__Digraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:777:1: ( ( ( rule__Digraph__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:778:1: ( ( rule__Digraph__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:778:1: ( ( rule__Digraph__NameAssignment_1 ) )
            // InternalDotLanguage.g:779:2: ( rule__Digraph__NameAssignment_1 )
            {
             before(grammarAccess.getDigraphAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:780:2: ( rule__Digraph__NameAssignment_1 )
            // InternalDotLanguage.g:780:3: rule__Digraph__NameAssignment_1
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
    // InternalDotLanguage.g:788:1: rule__Digraph__Group__2 : rule__Digraph__Group__2__Impl rule__Digraph__Group__3 ;
    public final void rule__Digraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:792:1: ( rule__Digraph__Group__2__Impl rule__Digraph__Group__3 )
            // InternalDotLanguage.g:793:2: rule__Digraph__Group__2__Impl rule__Digraph__Group__3
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
    // InternalDotLanguage.g:800:1: rule__Digraph__Group__2__Impl : ( '{' ) ;
    public final void rule__Digraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:804:1: ( ( '{' ) )
            // InternalDotLanguage.g:805:1: ( '{' )
            {
            // InternalDotLanguage.g:805:1: ( '{' )
            // InternalDotLanguage.g:806:2: '{'
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
    // InternalDotLanguage.g:815:1: rule__Digraph__Group__3 : rule__Digraph__Group__3__Impl rule__Digraph__Group__4 ;
    public final void rule__Digraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:819:1: ( rule__Digraph__Group__3__Impl rule__Digraph__Group__4 )
            // InternalDotLanguage.g:820:2: rule__Digraph__Group__3__Impl rule__Digraph__Group__4
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
    // InternalDotLanguage.g:827:1: rule__Digraph__Group__3__Impl : ( ( rule__Digraph__StatementsAssignment_3 )* ) ;
    public final void rule__Digraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:831:1: ( ( ( rule__Digraph__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:832:1: ( ( rule__Digraph__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:832:1: ( ( rule__Digraph__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:833:2: ( rule__Digraph__StatementsAssignment_3 )*
            {
             before(grammarAccess.getDigraphAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:834:2: ( rule__Digraph__StatementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDotLanguage.g:834:3: rule__Digraph__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Digraph__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDotLanguage.g:842:1: rule__Digraph__Group__4 : rule__Digraph__Group__4__Impl ;
    public final void rule__Digraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:846:1: ( rule__Digraph__Group__4__Impl )
            // InternalDotLanguage.g:847:2: rule__Digraph__Group__4__Impl
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
    // InternalDotLanguage.g:853:1: rule__Digraph__Group__4__Impl : ( '}' ) ;
    public final void rule__Digraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:857:1: ( ( '}' ) )
            // InternalDotLanguage.g:858:1: ( '}' )
            {
            // InternalDotLanguage.g:858:1: ( '}' )
            // InternalDotLanguage.g:859:2: '}'
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
    // InternalDotLanguage.g:869:1: rule__DirectedStatement__Group__0 : rule__DirectedStatement__Group__0__Impl rule__DirectedStatement__Group__1 ;
    public final void rule__DirectedStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:873:1: ( rule__DirectedStatement__Group__0__Impl rule__DirectedStatement__Group__1 )
            // InternalDotLanguage.g:874:2: rule__DirectedStatement__Group__0__Impl rule__DirectedStatement__Group__1
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
    // InternalDotLanguage.g:881:1: rule__DirectedStatement__Group__0__Impl : ( ( rule__DirectedStatement__Alternatives_0 ) ) ;
    public final void rule__DirectedStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:885:1: ( ( ( rule__DirectedStatement__Alternatives_0 ) ) )
            // InternalDotLanguage.g:886:1: ( ( rule__DirectedStatement__Alternatives_0 ) )
            {
            // InternalDotLanguage.g:886:1: ( ( rule__DirectedStatement__Alternatives_0 ) )
            // InternalDotLanguage.g:887:2: ( rule__DirectedStatement__Alternatives_0 )
            {
             before(grammarAccess.getDirectedStatementAccess().getAlternatives_0()); 
            // InternalDotLanguage.g:888:2: ( rule__DirectedStatement__Alternatives_0 )
            // InternalDotLanguage.g:888:3: rule__DirectedStatement__Alternatives_0
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
    // InternalDotLanguage.g:896:1: rule__DirectedStatement__Group__1 : rule__DirectedStatement__Group__1__Impl ;
    public final void rule__DirectedStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:900:1: ( rule__DirectedStatement__Group__1__Impl )
            // InternalDotLanguage.g:901:2: rule__DirectedStatement__Group__1__Impl
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
    // InternalDotLanguage.g:907:1: rule__DirectedStatement__Group__1__Impl : ( ( rule__DirectedStatement__Alternatives_1 )? ) ;
    public final void rule__DirectedStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:911:1: ( ( ( rule__DirectedStatement__Alternatives_1 )? ) )
            // InternalDotLanguage.g:912:1: ( ( rule__DirectedStatement__Alternatives_1 )? )
            {
            // InternalDotLanguage.g:912:1: ( ( rule__DirectedStatement__Alternatives_1 )? )
            // InternalDotLanguage.g:913:2: ( rule__DirectedStatement__Alternatives_1 )?
            {
             before(grammarAccess.getDirectedStatementAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:914:2: ( rule__DirectedStatement__Alternatives_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=13 && LA11_0<=14)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDotLanguage.g:914:3: rule__DirectedStatement__Alternatives_1
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
    // InternalDotLanguage.g:923:1: rule__UndirectedStatement__Group__0 : rule__UndirectedStatement__Group__0__Impl rule__UndirectedStatement__Group__1 ;
    public final void rule__UndirectedStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:927:1: ( rule__UndirectedStatement__Group__0__Impl rule__UndirectedStatement__Group__1 )
            // InternalDotLanguage.g:928:2: rule__UndirectedStatement__Group__0__Impl rule__UndirectedStatement__Group__1
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
    // InternalDotLanguage.g:935:1: rule__UndirectedStatement__Group__0__Impl : ( ( rule__UndirectedStatement__Alternatives_0 ) ) ;
    public final void rule__UndirectedStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:939:1: ( ( ( rule__UndirectedStatement__Alternatives_0 ) ) )
            // InternalDotLanguage.g:940:1: ( ( rule__UndirectedStatement__Alternatives_0 ) )
            {
            // InternalDotLanguage.g:940:1: ( ( rule__UndirectedStatement__Alternatives_0 ) )
            // InternalDotLanguage.g:941:2: ( rule__UndirectedStatement__Alternatives_0 )
            {
             before(grammarAccess.getUndirectedStatementAccess().getAlternatives_0()); 
            // InternalDotLanguage.g:942:2: ( rule__UndirectedStatement__Alternatives_0 )
            // InternalDotLanguage.g:942:3: rule__UndirectedStatement__Alternatives_0
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
    // InternalDotLanguage.g:950:1: rule__UndirectedStatement__Group__1 : rule__UndirectedStatement__Group__1__Impl ;
    public final void rule__UndirectedStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:954:1: ( rule__UndirectedStatement__Group__1__Impl )
            // InternalDotLanguage.g:955:2: rule__UndirectedStatement__Group__1__Impl
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
    // InternalDotLanguage.g:961:1: rule__UndirectedStatement__Group__1__Impl : ( ( rule__UndirectedStatement__Alternatives_1 )? ) ;
    public final void rule__UndirectedStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:965:1: ( ( ( rule__UndirectedStatement__Alternatives_1 )? ) )
            // InternalDotLanguage.g:966:1: ( ( rule__UndirectedStatement__Alternatives_1 )? )
            {
            // InternalDotLanguage.g:966:1: ( ( rule__UndirectedStatement__Alternatives_1 )? )
            // InternalDotLanguage.g:967:2: ( rule__UndirectedStatement__Alternatives_1 )?
            {
             before(grammarAccess.getUndirectedStatementAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:968:2: ( rule__UndirectedStatement__Alternatives_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDotLanguage.g:968:3: rule__UndirectedStatement__Alternatives_1
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


    // $ANTLR start "rule__NodeDeclaration__Group__0"
    // InternalDotLanguage.g:977:1: rule__NodeDeclaration__Group__0 : rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 ;
    public final void rule__NodeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:981:1: ( rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 )
            // InternalDotLanguage.g:982:2: rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1
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
    // InternalDotLanguage.g:989:1: rule__NodeDeclaration__Group__0__Impl : ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) ) ;
    public final void rule__NodeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:993:1: ( ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) ) )
            // InternalDotLanguage.g:994:1: ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) )
            {
            // InternalDotLanguage.g:994:1: ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) )
            // InternalDotLanguage.g:995:2: ( rule__NodeDeclaration__NodeNameAssignment_0 )
            {
             before(grammarAccess.getNodeDeclarationAccess().getNodeNameAssignment_0()); 
            // InternalDotLanguage.g:996:2: ( rule__NodeDeclaration__NodeNameAssignment_0 )
            // InternalDotLanguage.g:996:3: rule__NodeDeclaration__NodeNameAssignment_0
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
    // InternalDotLanguage.g:1004:1: rule__NodeDeclaration__Group__1 : rule__NodeDeclaration__Group__1__Impl ;
    public final void rule__NodeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1008:1: ( rule__NodeDeclaration__Group__1__Impl )
            // InternalDotLanguage.g:1009:2: rule__NodeDeclaration__Group__1__Impl
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
    // InternalDotLanguage.g:1015:1: rule__NodeDeclaration__Group__1__Impl : ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? ) ;
    public final void rule__NodeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1019:1: ( ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? ) )
            // InternalDotLanguage.g:1020:1: ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? )
            {
            // InternalDotLanguage.g:1020:1: ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? )
            // InternalDotLanguage.g:1021:2: ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )?
            {
             before(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAssignment_1()); 
            // InternalDotLanguage.g:1022:2: ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDotLanguage.g:1022:3: rule__NodeDeclaration__OptionalAttributesAssignment_1
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
    // InternalDotLanguage.g:1031:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1035:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalDotLanguage.g:1036:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
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
    // InternalDotLanguage.g:1043:1: rule__AttributeList__Group__0__Impl : ( '[' ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1047:1: ( ( '[' ) )
            // InternalDotLanguage.g:1048:1: ( '[' )
            {
            // InternalDotLanguage.g:1048:1: ( '[' )
            // InternalDotLanguage.g:1049:2: '['
            {
             before(grammarAccess.getAttributeListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDotLanguage.g:1058:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1062:1: ( rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 )
            // InternalDotLanguage.g:1063:2: rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2
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
    // InternalDotLanguage.g:1070:1: rule__AttributeList__Group__1__Impl : ( ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* ) ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1074:1: ( ( ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* ) ) )
            // InternalDotLanguage.g:1075:1: ( ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* ) )
            {
            // InternalDotLanguage.g:1075:1: ( ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* ) )
            // InternalDotLanguage.g:1076:2: ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* )
            {
            // InternalDotLanguage.g:1076:2: ( ( rule__AttributeList__AttrAssignment_1 ) )
            // InternalDotLanguage.g:1077:3: ( rule__AttributeList__AttrAssignment_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttrAssignment_1()); 
            // InternalDotLanguage.g:1078:3: ( rule__AttributeList__AttrAssignment_1 )
            // InternalDotLanguage.g:1078:4: rule__AttributeList__AttrAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__AttributeList__AttrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttrAssignment_1()); 

            }

            // InternalDotLanguage.g:1081:2: ( ( rule__AttributeList__AttrAssignment_1 )* )
            // InternalDotLanguage.g:1082:3: ( rule__AttributeList__AttrAssignment_1 )*
            {
             before(grammarAccess.getAttributeListAccess().getAttrAssignment_1()); 
            // InternalDotLanguage.g:1083:3: ( rule__AttributeList__AttrAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDotLanguage.g:1083:4: rule__AttributeList__AttrAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AttributeList__AttrAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAttributeListAccess().getAttrAssignment_1()); 

            }


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
    // InternalDotLanguage.g:1092:1: rule__AttributeList__Group__2 : rule__AttributeList__Group__2__Impl ;
    public final void rule__AttributeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1096:1: ( rule__AttributeList__Group__2__Impl )
            // InternalDotLanguage.g:1097:2: rule__AttributeList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__2__Impl();

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
    // InternalDotLanguage.g:1103:1: rule__AttributeList__Group__2__Impl : ( ']' ) ;
    public final void rule__AttributeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1107:1: ( ( ']' ) )
            // InternalDotLanguage.g:1108:1: ( ']' )
            {
            // InternalDotLanguage.g:1108:1: ( ']' )
            // InternalDotLanguage.g:1109:2: ']'
            {
             before(grammarAccess.getAttributeListAccess().getRightSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeListAccess().getRightSquareBracketKeyword_2()); 

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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDotLanguage.g:1119:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1123:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDotLanguage.g:1124:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalDotLanguage.g:1131:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AttributeNameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1135:1: ( ( ( rule__Attribute__AttributeNameAssignment_0 ) ) )
            // InternalDotLanguage.g:1136:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            {
            // InternalDotLanguage.g:1136:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            // InternalDotLanguage.g:1137:2: ( rule__Attribute__AttributeNameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); 
            // InternalDotLanguage.g:1138:2: ( rule__Attribute__AttributeNameAssignment_0 )
            // InternalDotLanguage.g:1138:3: rule__Attribute__AttributeNameAssignment_0
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
    // InternalDotLanguage.g:1146:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1150:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDotLanguage.g:1151:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalDotLanguage.g:1158:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1162:1: ( ( '=' ) )
            // InternalDotLanguage.g:1163:1: ( '=' )
            {
            // InternalDotLanguage.g:1163:1: ( '=' )
            // InternalDotLanguage.g:1164:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDotLanguage.g:1173:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1177:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDotLanguage.g:1178:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // InternalDotLanguage.g:1185:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributeValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1189:1: ( ( ( rule__Attribute__AttributeValueAssignment_2 ) ) )
            // InternalDotLanguage.g:1190:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            {
            // InternalDotLanguage.g:1190:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            // InternalDotLanguage.g:1191:2: ( rule__Attribute__AttributeValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); 
            // InternalDotLanguage.g:1192:2: ( rule__Attribute__AttributeValueAssignment_2 )
            // InternalDotLanguage.g:1192:3: rule__Attribute__AttributeValueAssignment_2
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


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalDotLanguage.g:1200:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1204:1: ( rule__Attribute__Group__3__Impl )
            // InternalDotLanguage.g:1205:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalDotLanguage.g:1211:1: rule__Attribute__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1215:1: ( ( ( ',' )? ) )
            // InternalDotLanguage.g:1216:1: ( ( ',' )? )
            {
            // InternalDotLanguage.g:1216:1: ( ( ',' )? )
            // InternalDotLanguage.g:1217:2: ( ',' )?
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_3()); 
            // InternalDotLanguage.g:1218:2: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDotLanguage.g:1218:3: ','
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__DirectedEdgeDeclaration__Group__0"
    // InternalDotLanguage.g:1227:1: rule__DirectedEdgeDeclaration__Group__0 : rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1 ;
    public final void rule__DirectedEdgeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1231:1: ( rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1 )
            // InternalDotLanguage.g:1232:2: rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDotLanguage.g:1239:1: rule__DirectedEdgeDeclaration__Group__0__Impl : ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1243:1: ( ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) )
            // InternalDotLanguage.g:1244:1: ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            {
            // InternalDotLanguage.g:1244:1: ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            // InternalDotLanguage.g:1245:2: ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 
            // InternalDotLanguage.g:1246:2: ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 )
            // InternalDotLanguage.g:1246:3: rule__DirectedEdgeDeclaration__FirstNodeAssignment_0
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
    // InternalDotLanguage.g:1254:1: rule__DirectedEdgeDeclaration__Group__1 : rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2 ;
    public final void rule__DirectedEdgeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1258:1: ( rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2 )
            // InternalDotLanguage.g:1259:2: rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDotLanguage.g:1266:1: rule__DirectedEdgeDeclaration__Group__1__Impl : ( ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1270:1: ( ( ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 ) ) )
            // InternalDotLanguage.g:1271:1: ( ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 ) )
            {
            // InternalDotLanguage.g:1271:1: ( ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 ) )
            // InternalDotLanguage.g:1272:2: ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getEdgeAssignment_1()); 
            // InternalDotLanguage.g:1273:2: ( rule__DirectedEdgeDeclaration__EdgeAssignment_1 )
            // InternalDotLanguage.g:1273:3: rule__DirectedEdgeDeclaration__EdgeAssignment_1
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
    // InternalDotLanguage.g:1281:1: rule__DirectedEdgeDeclaration__Group__2 : rule__DirectedEdgeDeclaration__Group__2__Impl ;
    public final void rule__DirectedEdgeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1285:1: ( rule__DirectedEdgeDeclaration__Group__2__Impl )
            // InternalDotLanguage.g:1286:2: rule__DirectedEdgeDeclaration__Group__2__Impl
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
    // InternalDotLanguage.g:1292:1: rule__DirectedEdgeDeclaration__Group__2__Impl : ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1296:1: ( ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) )
            // InternalDotLanguage.g:1297:1: ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            {
            // InternalDotLanguage.g:1297:1: ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            // InternalDotLanguage.g:1298:2: ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 
            // InternalDotLanguage.g:1299:2: ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 )
            // InternalDotLanguage.g:1299:3: rule__DirectedEdgeDeclaration__SecondNodeAssignment_2
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
    // InternalDotLanguage.g:1308:1: rule__UndirectedEdgeDeclaration__Group__0 : rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1 ;
    public final void rule__UndirectedEdgeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1312:1: ( rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1 )
            // InternalDotLanguage.g:1313:2: rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDotLanguage.g:1320:1: rule__UndirectedEdgeDeclaration__Group__0__Impl : ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1324:1: ( ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) )
            // InternalDotLanguage.g:1325:1: ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            {
            // InternalDotLanguage.g:1325:1: ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            // InternalDotLanguage.g:1326:2: ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 
            // InternalDotLanguage.g:1327:2: ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 )
            // InternalDotLanguage.g:1327:3: rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0
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
    // InternalDotLanguage.g:1335:1: rule__UndirectedEdgeDeclaration__Group__1 : rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2 ;
    public final void rule__UndirectedEdgeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1339:1: ( rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2 )
            // InternalDotLanguage.g:1340:2: rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDotLanguage.g:1347:1: rule__UndirectedEdgeDeclaration__Group__1__Impl : ( ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1351:1: ( ( ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 ) ) )
            // InternalDotLanguage.g:1352:1: ( ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 ) )
            {
            // InternalDotLanguage.g:1352:1: ( ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 ) )
            // InternalDotLanguage.g:1353:2: ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getEdgeAssignment_1()); 
            // InternalDotLanguage.g:1354:2: ( rule__UndirectedEdgeDeclaration__EdgeAssignment_1 )
            // InternalDotLanguage.g:1354:3: rule__UndirectedEdgeDeclaration__EdgeAssignment_1
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
    // InternalDotLanguage.g:1362:1: rule__UndirectedEdgeDeclaration__Group__2 : rule__UndirectedEdgeDeclaration__Group__2__Impl ;
    public final void rule__UndirectedEdgeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1366:1: ( rule__UndirectedEdgeDeclaration__Group__2__Impl )
            // InternalDotLanguage.g:1367:2: rule__UndirectedEdgeDeclaration__Group__2__Impl
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
    // InternalDotLanguage.g:1373:1: rule__UndirectedEdgeDeclaration__Group__2__Impl : ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1377:1: ( ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) )
            // InternalDotLanguage.g:1378:1: ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            {
            // InternalDotLanguage.g:1378:1: ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            // InternalDotLanguage.g:1379:2: ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 
            // InternalDotLanguage.g:1380:2: ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 )
            // InternalDotLanguage.g:1380:3: rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2
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


    // $ANTLR start "rule__NodeList__Group__0"
    // InternalDotLanguage.g:1389:1: rule__NodeList__Group__0 : rule__NodeList__Group__0__Impl rule__NodeList__Group__1 ;
    public final void rule__NodeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1393:1: ( rule__NodeList__Group__0__Impl rule__NodeList__Group__1 )
            // InternalDotLanguage.g:1394:2: rule__NodeList__Group__0__Impl rule__NodeList__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeList__Group__1();

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
    // $ANTLR end "rule__NodeList__Group__0"


    // $ANTLR start "rule__NodeList__Group__0__Impl"
    // InternalDotLanguage.g:1401:1: rule__NodeList__Group__0__Impl : ( '{' ) ;
    public final void rule__NodeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1405:1: ( ( '{' ) )
            // InternalDotLanguage.g:1406:1: ( '{' )
            {
            // InternalDotLanguage.g:1406:1: ( '{' )
            // InternalDotLanguage.g:1407:2: '{'
            {
             before(grammarAccess.getNodeListAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNodeListAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__NodeList__Group__0__Impl"


    // $ANTLR start "rule__NodeList__Group__1"
    // InternalDotLanguage.g:1416:1: rule__NodeList__Group__1 : rule__NodeList__Group__1__Impl rule__NodeList__Group__2 ;
    public final void rule__NodeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1420:1: ( rule__NodeList__Group__1__Impl rule__NodeList__Group__2 )
            // InternalDotLanguage.g:1421:2: rule__NodeList__Group__1__Impl rule__NodeList__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__NodeList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeList__Group__2();

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
    // $ANTLR end "rule__NodeList__Group__1"


    // $ANTLR start "rule__NodeList__Group__1__Impl"
    // InternalDotLanguage.g:1428:1: rule__NodeList__Group__1__Impl : ( ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* ) ) ;
    public final void rule__NodeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1432:1: ( ( ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* ) ) )
            // InternalDotLanguage.g:1433:1: ( ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* ) )
            {
            // InternalDotLanguage.g:1433:1: ( ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* ) )
            // InternalDotLanguage.g:1434:2: ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* )
            {
            // InternalDotLanguage.g:1434:2: ( ( rule__NodeList__NodesAssignment_1 ) )
            // InternalDotLanguage.g:1435:3: ( rule__NodeList__NodesAssignment_1 )
            {
             before(grammarAccess.getNodeListAccess().getNodesAssignment_1()); 
            // InternalDotLanguage.g:1436:3: ( rule__NodeList__NodesAssignment_1 )
            // InternalDotLanguage.g:1436:4: rule__NodeList__NodesAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__NodeList__NodesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeListAccess().getNodesAssignment_1()); 

            }

            // InternalDotLanguage.g:1439:2: ( ( rule__NodeList__NodesAssignment_1 )* )
            // InternalDotLanguage.g:1440:3: ( rule__NodeList__NodesAssignment_1 )*
            {
             before(grammarAccess.getNodeListAccess().getNodesAssignment_1()); 
            // InternalDotLanguage.g:1441:3: ( rule__NodeList__NodesAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDotLanguage.g:1441:4: rule__NodeList__NodesAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NodeList__NodesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getNodeListAccess().getNodesAssignment_1()); 

            }


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
    // $ANTLR end "rule__NodeList__Group__1__Impl"


    // $ANTLR start "rule__NodeList__Group__2"
    // InternalDotLanguage.g:1450:1: rule__NodeList__Group__2 : rule__NodeList__Group__2__Impl ;
    public final void rule__NodeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1454:1: ( rule__NodeList__Group__2__Impl )
            // InternalDotLanguage.g:1455:2: rule__NodeList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeList__Group__2__Impl();

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
    // $ANTLR end "rule__NodeList__Group__2"


    // $ANTLR start "rule__NodeList__Group__2__Impl"
    // InternalDotLanguage.g:1461:1: rule__NodeList__Group__2__Impl : ( '}' ) ;
    public final void rule__NodeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1465:1: ( ( '}' ) )
            // InternalDotLanguage.g:1466:1: ( '}' )
            {
            // InternalDotLanguage.g:1466:1: ( '}' )
            // InternalDotLanguage.g:1467:2: '}'
            {
             before(grammarAccess.getNodeListAccess().getRightCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNodeListAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__NodeList__Group__2__Impl"


    // $ANTLR start "rule__DotLanguage__GraphsAssignment"
    // InternalDotLanguage.g:1477:1: rule__DotLanguage__GraphsAssignment : ( ( rule__DotLanguage__GraphsAlternatives_0 ) ) ;
    public final void rule__DotLanguage__GraphsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1481:1: ( ( ( rule__DotLanguage__GraphsAlternatives_0 ) ) )
            // InternalDotLanguage.g:1482:2: ( ( rule__DotLanguage__GraphsAlternatives_0 ) )
            {
            // InternalDotLanguage.g:1482:2: ( ( rule__DotLanguage__GraphsAlternatives_0 ) )
            // InternalDotLanguage.g:1483:3: ( rule__DotLanguage__GraphsAlternatives_0 )
            {
             before(grammarAccess.getDotLanguageAccess().getGraphsAlternatives_0()); 
            // InternalDotLanguage.g:1484:3: ( rule__DotLanguage__GraphsAlternatives_0 )
            // InternalDotLanguage.g:1484:4: rule__DotLanguage__GraphsAlternatives_0
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
    // InternalDotLanguage.g:1492:1: rule__Graph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Graph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1496:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1497:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1497:2: ( RULE_ID )
            // InternalDotLanguage.g:1498:3: RULE_ID
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
    // InternalDotLanguage.g:1507:1: rule__Graph__StatementsAssignment_3 : ( ruleUndirectedStatement ) ;
    public final void rule__Graph__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1511:1: ( ( ruleUndirectedStatement ) )
            // InternalDotLanguage.g:1512:2: ( ruleUndirectedStatement )
            {
            // InternalDotLanguage.g:1512:2: ( ruleUndirectedStatement )
            // InternalDotLanguage.g:1513:3: ruleUndirectedStatement
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
    // InternalDotLanguage.g:1522:1: rule__Digraph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Digraph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1526:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1527:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1527:2: ( RULE_ID )
            // InternalDotLanguage.g:1528:3: RULE_ID
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
    // InternalDotLanguage.g:1537:1: rule__Digraph__StatementsAssignment_3 : ( ruleDirectedStatement ) ;
    public final void rule__Digraph__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1541:1: ( ( ruleDirectedStatement ) )
            // InternalDotLanguage.g:1542:2: ( ruleDirectedStatement )
            {
            // InternalDotLanguage.g:1542:2: ( ruleDirectedStatement )
            // InternalDotLanguage.g:1543:3: ruleDirectedStatement
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


    // $ANTLR start "rule__NodeDeclaration__NodeNameAssignment_0"
    // InternalDotLanguage.g:1552:1: rule__NodeDeclaration__NodeNameAssignment_0 : ( ruleNodeId ) ;
    public final void rule__NodeDeclaration__NodeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1556:1: ( ( ruleNodeId ) )
            // InternalDotLanguage.g:1557:2: ( ruleNodeId )
            {
            // InternalDotLanguage.g:1557:2: ( ruleNodeId )
            // InternalDotLanguage.g:1558:3: ruleNodeId
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
    // InternalDotLanguage.g:1567:1: rule__NodeDeclaration__OptionalAttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__NodeDeclaration__OptionalAttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1571:1: ( ( ruleAttributeList ) )
            // InternalDotLanguage.g:1572:2: ( ruleAttributeList )
            {
            // InternalDotLanguage.g:1572:2: ( ruleAttributeList )
            // InternalDotLanguage.g:1573:3: ruleAttributeList
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
    // InternalDotLanguage.g:1582:1: rule__NodeId__NameAssignment : ( RULE_ID ) ;
    public final void rule__NodeId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1586:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1587:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1587:2: ( RULE_ID )
            // InternalDotLanguage.g:1588:3: RULE_ID
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
    // InternalDotLanguage.g:1597:1: rule__AttributeList__AttrAssignment_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1601:1: ( ( ruleAttribute ) )
            // InternalDotLanguage.g:1602:2: ( ruleAttribute )
            {
            // InternalDotLanguage.g:1602:2: ( ruleAttribute )
            // InternalDotLanguage.g:1603:3: ruleAttribute
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


    // $ANTLR start "rule__Attribute__AttributeNameAssignment_0"
    // InternalDotLanguage.g:1612:1: rule__Attribute__AttributeNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1616:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1617:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1617:2: ( RULE_ID )
            // InternalDotLanguage.g:1618:3: RULE_ID
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
    // InternalDotLanguage.g:1627:1: rule__Attribute__AttributeValueAssignment_2 : ( ruleIDORINT ) ;
    public final void rule__Attribute__AttributeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1631:1: ( ( ruleIDORINT ) )
            // InternalDotLanguage.g:1632:2: ( ruleIDORINT )
            {
            // InternalDotLanguage.g:1632:2: ( ruleIDORINT )
            // InternalDotLanguage.g:1633:3: ruleIDORINT
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueIDORINTParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIDORINT();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttributeValueIDORINTParserRuleCall_2_0()); 

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
    // InternalDotLanguage.g:1642:1: rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DirectedEdgeDeclaration__FirstNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1646:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1647:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1647:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1648:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1649:3: ( RULE_ID )
            // InternalDotLanguage.g:1650:4: RULE_ID
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
    // InternalDotLanguage.g:1661:1: rule__DirectedEdgeDeclaration__EdgeAssignment_1 : ( ruleDirectedEdge ) ;
    public final void rule__DirectedEdgeDeclaration__EdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1665:1: ( ( ruleDirectedEdge ) )
            // InternalDotLanguage.g:1666:2: ( ruleDirectedEdge )
            {
            // InternalDotLanguage.g:1666:2: ( ruleDirectedEdge )
            // InternalDotLanguage.g:1667:3: ruleDirectedEdge
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
    // InternalDotLanguage.g:1676:1: rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 : ( ruleRightEdgeDeclaration ) ;
    public final void rule__DirectedEdgeDeclaration__SecondNodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1680:1: ( ( ruleRightEdgeDeclaration ) )
            // InternalDotLanguage.g:1681:2: ( ruleRightEdgeDeclaration )
            {
            // InternalDotLanguage.g:1681:2: ( ruleRightEdgeDeclaration )
            // InternalDotLanguage.g:1682:3: ruleRightEdgeDeclaration
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeRightEdgeDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRightEdgeDeclaration();

            state._fsp--;

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeRightEdgeDeclarationParserRuleCall_2_0()); 

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
    // InternalDotLanguage.g:1691:1: rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1695:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1696:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1696:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1697:3: ( RULE_ID )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1698:3: ( RULE_ID )
            // InternalDotLanguage.g:1699:4: RULE_ID
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
    // InternalDotLanguage.g:1710:1: rule__UndirectedEdgeDeclaration__EdgeAssignment_1 : ( ruleUndirectedEdge ) ;
    public final void rule__UndirectedEdgeDeclaration__EdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1714:1: ( ( ruleUndirectedEdge ) )
            // InternalDotLanguage.g:1715:2: ( ruleUndirectedEdge )
            {
            // InternalDotLanguage.g:1715:2: ( ruleUndirectedEdge )
            // InternalDotLanguage.g:1716:3: ruleUndirectedEdge
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
    // InternalDotLanguage.g:1725:1: rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 : ( ruleRightEdgeDeclaration ) ;
    public final void rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1729:1: ( ( ruleRightEdgeDeclaration ) )
            // InternalDotLanguage.g:1730:2: ( ruleRightEdgeDeclaration )
            {
            // InternalDotLanguage.g:1730:2: ( ruleRightEdgeDeclaration )
            // InternalDotLanguage.g:1731:3: ruleRightEdgeDeclaration
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeRightEdgeDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRightEdgeDeclaration();

            state._fsp--;

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeRightEdgeDeclarationParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__RightEdgeDeclaration__SecondNodeAssignment_0"
    // InternalDotLanguage.g:1740:1: rule__RightEdgeDeclaration__SecondNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RightEdgeDeclaration__SecondNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1744:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1745:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1745:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1746:3: ( RULE_ID )
            {
             before(grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1747:3: ( RULE_ID )
            // InternalDotLanguage.g:1748:4: RULE_ID
            {
             before(grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeNodeIdIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeNodeIdIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_0_0()); 

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
    // $ANTLR end "rule__RightEdgeDeclaration__SecondNodeAssignment_0"


    // $ANTLR start "rule__RightEdgeDeclaration__NodeListAssignment_1"
    // InternalDotLanguage.g:1759:1: rule__RightEdgeDeclaration__NodeListAssignment_1 : ( ruleNodeList ) ;
    public final void rule__RightEdgeDeclaration__NodeListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1763:1: ( ( ruleNodeList ) )
            // InternalDotLanguage.g:1764:2: ( ruleNodeList )
            {
            // InternalDotLanguage.g:1764:2: ( ruleNodeList )
            // InternalDotLanguage.g:1765:3: ruleNodeList
            {
             before(grammarAccess.getRightEdgeDeclarationAccess().getNodeListNodeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeList();

            state._fsp--;

             after(grammarAccess.getRightEdgeDeclarationAccess().getNodeListNodeListParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RightEdgeDeclaration__NodeListAssignment_1"


    // $ANTLR start "rule__NodeList__NodesAssignment_1"
    // InternalDotLanguage.g:1774:1: rule__NodeList__NodesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeList__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1778:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1779:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1779:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1780:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeListAccess().getNodesNodeIdCrossReference_1_0()); 
            // InternalDotLanguage.g:1781:3: ( RULE_ID )
            // InternalDotLanguage.g:1782:4: RULE_ID
            {
             before(grammarAccess.getNodeListAccess().getNodesNodeIdIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeListAccess().getNodesNodeIdIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNodeListAccess().getNodesNodeIdCrossReference_1_0()); 

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
    // $ANTLR end "rule__NodeList__NodesAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});

}