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


    // $ANTLR start "entryRuleDirectedEdgeDeclaration"
    // InternalDotLanguage.g:278:1: entryRuleDirectedEdgeDeclaration : ruleDirectedEdgeDeclaration EOF ;
    public final void entryRuleDirectedEdgeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:279:1: ( ruleDirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:280:1: ruleDirectedEdgeDeclaration EOF
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
    // InternalDotLanguage.g:287:1: ruleDirectedEdgeDeclaration : ( ( rule__DirectedEdgeDeclaration__Group__0 ) ) ;
    public final void ruleDirectedEdgeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:291:2: ( ( ( rule__DirectedEdgeDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:292:2: ( ( rule__DirectedEdgeDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:292:2: ( ( rule__DirectedEdgeDeclaration__Group__0 ) )
            // InternalDotLanguage.g:293:3: ( rule__DirectedEdgeDeclaration__Group__0 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:294:3: ( rule__DirectedEdgeDeclaration__Group__0 )
            // InternalDotLanguage.g:294:4: rule__DirectedEdgeDeclaration__Group__0
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
    // InternalDotLanguage.g:303:1: entryRuleUndirectedEdgeDeclaration : ruleUndirectedEdgeDeclaration EOF ;
    public final void entryRuleUndirectedEdgeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:304:1: ( ruleUndirectedEdgeDeclaration EOF )
            // InternalDotLanguage.g:305:1: ruleUndirectedEdgeDeclaration EOF
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
    // InternalDotLanguage.g:312:1: ruleUndirectedEdgeDeclaration : ( ( rule__UndirectedEdgeDeclaration__Group__0 ) ) ;
    public final void ruleUndirectedEdgeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:316:2: ( ( ( rule__UndirectedEdgeDeclaration__Group__0 ) ) )
            // InternalDotLanguage.g:317:2: ( ( rule__UndirectedEdgeDeclaration__Group__0 ) )
            {
            // InternalDotLanguage.g:317:2: ( ( rule__UndirectedEdgeDeclaration__Group__0 ) )
            // InternalDotLanguage.g:318:3: ( rule__UndirectedEdgeDeclaration__Group__0 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getGroup()); 
            // InternalDotLanguage.g:319:3: ( rule__UndirectedEdgeDeclaration__Group__0 )
            // InternalDotLanguage.g:319:4: rule__UndirectedEdgeDeclaration__Group__0
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
    // InternalDotLanguage.g:328:1: entryRuleRightEdgeDeclaration : ruleRightEdgeDeclaration EOF ;
    public final void entryRuleRightEdgeDeclaration() throws RecognitionException {
        try {
            // InternalDotLanguage.g:329:1: ( ruleRightEdgeDeclaration EOF )
            // InternalDotLanguage.g:330:1: ruleRightEdgeDeclaration EOF
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
    // InternalDotLanguage.g:337:1: ruleRightEdgeDeclaration : ( ( rule__RightEdgeDeclaration__Alternatives ) ) ;
    public final void ruleRightEdgeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:341:2: ( ( ( rule__RightEdgeDeclaration__Alternatives ) ) )
            // InternalDotLanguage.g:342:2: ( ( rule__RightEdgeDeclaration__Alternatives ) )
            {
            // InternalDotLanguage.g:342:2: ( ( rule__RightEdgeDeclaration__Alternatives ) )
            // InternalDotLanguage.g:343:3: ( rule__RightEdgeDeclaration__Alternatives )
            {
             before(grammarAccess.getRightEdgeDeclarationAccess().getAlternatives()); 
            // InternalDotLanguage.g:344:3: ( rule__RightEdgeDeclaration__Alternatives )
            // InternalDotLanguage.g:344:4: rule__RightEdgeDeclaration__Alternatives
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
    // InternalDotLanguage.g:353:1: entryRuleNodeList : ruleNodeList EOF ;
    public final void entryRuleNodeList() throws RecognitionException {
        try {
            // InternalDotLanguage.g:354:1: ( ruleNodeList EOF )
            // InternalDotLanguage.g:355:1: ruleNodeList EOF
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
    // InternalDotLanguage.g:362:1: ruleNodeList : ( ( rule__NodeList__Group__0 ) ) ;
    public final void ruleNodeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:366:2: ( ( ( rule__NodeList__Group__0 ) ) )
            // InternalDotLanguage.g:367:2: ( ( rule__NodeList__Group__0 ) )
            {
            // InternalDotLanguage.g:367:2: ( ( rule__NodeList__Group__0 ) )
            // InternalDotLanguage.g:368:3: ( rule__NodeList__Group__0 )
            {
             before(grammarAccess.getNodeListAccess().getGroup()); 
            // InternalDotLanguage.g:369:3: ( rule__NodeList__Group__0 )
            // InternalDotLanguage.g:369:4: rule__NodeList__Group__0
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
    // InternalDotLanguage.g:448:1: rule__DirectedStatement__Alternatives_0 : ( ( ruleNodeDeclaration ) | ( ruleDirectedEdgeDeclaration ) );
    public final void rule__DirectedStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:452:1: ( ( ruleNodeDeclaration ) | ( ruleDirectedEdgeDeclaration ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==11) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==RULE_ID||(LA3_1>=13 && LA3_1<=14)||LA3_1==17||LA3_1==19) ) {
                    alt3=1;
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
    // InternalDotLanguage.g:469:1: rule__DirectedStatement__Alternatives_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__DirectedStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:473:1: ( ( ',' ) | ( ';' ) )
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
                    // InternalDotLanguage.g:474:2: ( ',' )
                    {
                    // InternalDotLanguage.g:474:2: ( ',' )
                    // InternalDotLanguage.g:475:3: ','
                    {
                     before(grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:480:2: ( ';' )
                    {
                    // InternalDotLanguage.g:480:2: ( ';' )
                    // InternalDotLanguage.g:481:3: ';'
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
    // InternalDotLanguage.g:490:1: rule__UndirectedStatement__Alternatives_0 : ( ( ruleNodeDeclaration ) | ( ruleUndirectedEdgeDeclaration ) );
    public final void rule__UndirectedStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:494:1: ( ( ruleNodeDeclaration ) | ( ruleUndirectedEdgeDeclaration ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=13 && LA5_1<=14)||LA5_1==17||LA5_1==19) ) {
                    alt5=1;
                }
                else if ( (LA5_1==12) ) {
                    alt5=2;
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
                    // InternalDotLanguage.g:495:2: ( ruleNodeDeclaration )
                    {
                    // InternalDotLanguage.g:495:2: ( ruleNodeDeclaration )
                    // InternalDotLanguage.g:496:3: ruleNodeDeclaration
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
                    // InternalDotLanguage.g:501:2: ( ruleUndirectedEdgeDeclaration )
                    {
                    // InternalDotLanguage.g:501:2: ( ruleUndirectedEdgeDeclaration )
                    // InternalDotLanguage.g:502:3: ruleUndirectedEdgeDeclaration
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
    // InternalDotLanguage.g:511:1: rule__UndirectedStatement__Alternatives_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__UndirectedStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:515:1: ( ( ',' ) | ( ';' ) )
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
                    // InternalDotLanguage.g:516:2: ( ',' )
                    {
                    // InternalDotLanguage.g:516:2: ( ',' )
                    // InternalDotLanguage.g:517:3: ','
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:522:2: ( ';' )
                    {
                    // InternalDotLanguage.g:522:2: ( ';' )
                    // InternalDotLanguage.g:523:3: ';'
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


    // $ANTLR start "rule__RightEdgeDeclaration__Alternatives"
    // InternalDotLanguage.g:532:1: rule__RightEdgeDeclaration__Alternatives : ( ( ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 ) ) | ( ruleNodeList ) );
    public final void rule__RightEdgeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:536:1: ( ( ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 ) ) | ( ruleNodeList ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDotLanguage.g:537:2: ( ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 ) )
                    {
                    // InternalDotLanguage.g:537:2: ( ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 ) )
                    // InternalDotLanguage.g:538:3: ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 )
                    {
                     before(grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeAssignment_0()); 
                    // InternalDotLanguage.g:539:3: ( rule__RightEdgeDeclaration__SecondNodeAssignment_0 )
                    // InternalDotLanguage.g:539:4: rule__RightEdgeDeclaration__SecondNodeAssignment_0
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
                    // InternalDotLanguage.g:543:2: ( ruleNodeList )
                    {
                    // InternalDotLanguage.g:543:2: ( ruleNodeList )
                    // InternalDotLanguage.g:544:3: ruleNodeList
                    {
                     before(grammarAccess.getRightEdgeDeclarationAccess().getNodeListParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeList();

                    state._fsp--;

                     after(grammarAccess.getRightEdgeDeclarationAccess().getNodeListParserRuleCall_1()); 

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
    // InternalDotLanguage.g:553:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:557:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalDotLanguage.g:558:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalDotLanguage.g:565:1: rule__Graph__Group__0__Impl : ( 'graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:569:1: ( ( 'graph' ) )
            // InternalDotLanguage.g:570:1: ( 'graph' )
            {
            // InternalDotLanguage.g:570:1: ( 'graph' )
            // InternalDotLanguage.g:571:2: 'graph'
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
    // InternalDotLanguage.g:580:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:584:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalDotLanguage.g:585:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
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
    // InternalDotLanguage.g:592:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NameAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:596:1: ( ( ( rule__Graph__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:597:1: ( ( rule__Graph__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:597:1: ( ( rule__Graph__NameAssignment_1 ) )
            // InternalDotLanguage.g:598:2: ( rule__Graph__NameAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:599:2: ( rule__Graph__NameAssignment_1 )
            // InternalDotLanguage.g:599:3: rule__Graph__NameAssignment_1
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
    // InternalDotLanguage.g:607:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:611:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalDotLanguage.g:612:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
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
    // InternalDotLanguage.g:619:1: rule__Graph__Group__2__Impl : ( '{' ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:623:1: ( ( '{' ) )
            // InternalDotLanguage.g:624:1: ( '{' )
            {
            // InternalDotLanguage.g:624:1: ( '{' )
            // InternalDotLanguage.g:625:2: '{'
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
    // InternalDotLanguage.g:634:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:638:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // InternalDotLanguage.g:639:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
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
    // InternalDotLanguage.g:646:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__StatementsAssignment_3 )* ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:650:1: ( ( ( rule__Graph__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:651:1: ( ( rule__Graph__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:651:1: ( ( rule__Graph__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:652:2: ( rule__Graph__StatementsAssignment_3 )*
            {
             before(grammarAccess.getGraphAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:653:2: ( rule__Graph__StatementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDotLanguage.g:653:3: rule__Graph__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Graph__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDotLanguage.g:661:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:665:1: ( rule__Graph__Group__4__Impl )
            // InternalDotLanguage.g:666:2: rule__Graph__Group__4__Impl
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
    // InternalDotLanguage.g:672:1: rule__Graph__Group__4__Impl : ( '}' ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:676:1: ( ( '}' ) )
            // InternalDotLanguage.g:677:1: ( '}' )
            {
            // InternalDotLanguage.g:677:1: ( '}' )
            // InternalDotLanguage.g:678:2: '}'
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
    // InternalDotLanguage.g:688:1: rule__Digraph__Group__0 : rule__Digraph__Group__0__Impl rule__Digraph__Group__1 ;
    public final void rule__Digraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:692:1: ( rule__Digraph__Group__0__Impl rule__Digraph__Group__1 )
            // InternalDotLanguage.g:693:2: rule__Digraph__Group__0__Impl rule__Digraph__Group__1
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
    // InternalDotLanguage.g:700:1: rule__Digraph__Group__0__Impl : ( 'digraph' ) ;
    public final void rule__Digraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:704:1: ( ( 'digraph' ) )
            // InternalDotLanguage.g:705:1: ( 'digraph' )
            {
            // InternalDotLanguage.g:705:1: ( 'digraph' )
            // InternalDotLanguage.g:706:2: 'digraph'
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
    // InternalDotLanguage.g:715:1: rule__Digraph__Group__1 : rule__Digraph__Group__1__Impl rule__Digraph__Group__2 ;
    public final void rule__Digraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:719:1: ( rule__Digraph__Group__1__Impl rule__Digraph__Group__2 )
            // InternalDotLanguage.g:720:2: rule__Digraph__Group__1__Impl rule__Digraph__Group__2
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
    // InternalDotLanguage.g:727:1: rule__Digraph__Group__1__Impl : ( ( rule__Digraph__NameAssignment_1 ) ) ;
    public final void rule__Digraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:731:1: ( ( ( rule__Digraph__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:732:1: ( ( rule__Digraph__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:732:1: ( ( rule__Digraph__NameAssignment_1 ) )
            // InternalDotLanguage.g:733:2: ( rule__Digraph__NameAssignment_1 )
            {
             before(grammarAccess.getDigraphAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:734:2: ( rule__Digraph__NameAssignment_1 )
            // InternalDotLanguage.g:734:3: rule__Digraph__NameAssignment_1
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
    // InternalDotLanguage.g:742:1: rule__Digraph__Group__2 : rule__Digraph__Group__2__Impl rule__Digraph__Group__3 ;
    public final void rule__Digraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:746:1: ( rule__Digraph__Group__2__Impl rule__Digraph__Group__3 )
            // InternalDotLanguage.g:747:2: rule__Digraph__Group__2__Impl rule__Digraph__Group__3
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
    // InternalDotLanguage.g:754:1: rule__Digraph__Group__2__Impl : ( '{' ) ;
    public final void rule__Digraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:758:1: ( ( '{' ) )
            // InternalDotLanguage.g:759:1: ( '{' )
            {
            // InternalDotLanguage.g:759:1: ( '{' )
            // InternalDotLanguage.g:760:2: '{'
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
    // InternalDotLanguage.g:769:1: rule__Digraph__Group__3 : rule__Digraph__Group__3__Impl rule__Digraph__Group__4 ;
    public final void rule__Digraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:773:1: ( rule__Digraph__Group__3__Impl rule__Digraph__Group__4 )
            // InternalDotLanguage.g:774:2: rule__Digraph__Group__3__Impl rule__Digraph__Group__4
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
    // InternalDotLanguage.g:781:1: rule__Digraph__Group__3__Impl : ( ( rule__Digraph__StatementsAssignment_3 )* ) ;
    public final void rule__Digraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:785:1: ( ( ( rule__Digraph__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:786:1: ( ( rule__Digraph__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:786:1: ( ( rule__Digraph__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:787:2: ( rule__Digraph__StatementsAssignment_3 )*
            {
             before(grammarAccess.getDigraphAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:788:2: ( rule__Digraph__StatementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDotLanguage.g:788:3: rule__Digraph__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Digraph__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDotLanguage.g:796:1: rule__Digraph__Group__4 : rule__Digraph__Group__4__Impl ;
    public final void rule__Digraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:800:1: ( rule__Digraph__Group__4__Impl )
            // InternalDotLanguage.g:801:2: rule__Digraph__Group__4__Impl
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
    // InternalDotLanguage.g:807:1: rule__Digraph__Group__4__Impl : ( '}' ) ;
    public final void rule__Digraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:811:1: ( ( '}' ) )
            // InternalDotLanguage.g:812:1: ( '}' )
            {
            // InternalDotLanguage.g:812:1: ( '}' )
            // InternalDotLanguage.g:813:2: '}'
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
    // InternalDotLanguage.g:823:1: rule__DirectedStatement__Group__0 : rule__DirectedStatement__Group__0__Impl rule__DirectedStatement__Group__1 ;
    public final void rule__DirectedStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:827:1: ( rule__DirectedStatement__Group__0__Impl rule__DirectedStatement__Group__1 )
            // InternalDotLanguage.g:828:2: rule__DirectedStatement__Group__0__Impl rule__DirectedStatement__Group__1
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
    // InternalDotLanguage.g:835:1: rule__DirectedStatement__Group__0__Impl : ( ( rule__DirectedStatement__Alternatives_0 ) ) ;
    public final void rule__DirectedStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:839:1: ( ( ( rule__DirectedStatement__Alternatives_0 ) ) )
            // InternalDotLanguage.g:840:1: ( ( rule__DirectedStatement__Alternatives_0 ) )
            {
            // InternalDotLanguage.g:840:1: ( ( rule__DirectedStatement__Alternatives_0 ) )
            // InternalDotLanguage.g:841:2: ( rule__DirectedStatement__Alternatives_0 )
            {
             before(grammarAccess.getDirectedStatementAccess().getAlternatives_0()); 
            // InternalDotLanguage.g:842:2: ( rule__DirectedStatement__Alternatives_0 )
            // InternalDotLanguage.g:842:3: rule__DirectedStatement__Alternatives_0
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
    // InternalDotLanguage.g:850:1: rule__DirectedStatement__Group__1 : rule__DirectedStatement__Group__1__Impl ;
    public final void rule__DirectedStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:854:1: ( rule__DirectedStatement__Group__1__Impl )
            // InternalDotLanguage.g:855:2: rule__DirectedStatement__Group__1__Impl
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
    // InternalDotLanguage.g:861:1: rule__DirectedStatement__Group__1__Impl : ( ( rule__DirectedStatement__Alternatives_1 )? ) ;
    public final void rule__DirectedStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:865:1: ( ( ( rule__DirectedStatement__Alternatives_1 )? ) )
            // InternalDotLanguage.g:866:1: ( ( rule__DirectedStatement__Alternatives_1 )? )
            {
            // InternalDotLanguage.g:866:1: ( ( rule__DirectedStatement__Alternatives_1 )? )
            // InternalDotLanguage.g:867:2: ( rule__DirectedStatement__Alternatives_1 )?
            {
             before(grammarAccess.getDirectedStatementAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:868:2: ( rule__DirectedStatement__Alternatives_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDotLanguage.g:868:3: rule__DirectedStatement__Alternatives_1
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
    // InternalDotLanguage.g:877:1: rule__UndirectedStatement__Group__0 : rule__UndirectedStatement__Group__0__Impl rule__UndirectedStatement__Group__1 ;
    public final void rule__UndirectedStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:881:1: ( rule__UndirectedStatement__Group__0__Impl rule__UndirectedStatement__Group__1 )
            // InternalDotLanguage.g:882:2: rule__UndirectedStatement__Group__0__Impl rule__UndirectedStatement__Group__1
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
    // InternalDotLanguage.g:889:1: rule__UndirectedStatement__Group__0__Impl : ( ( rule__UndirectedStatement__Alternatives_0 ) ) ;
    public final void rule__UndirectedStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:893:1: ( ( ( rule__UndirectedStatement__Alternatives_0 ) ) )
            // InternalDotLanguage.g:894:1: ( ( rule__UndirectedStatement__Alternatives_0 ) )
            {
            // InternalDotLanguage.g:894:1: ( ( rule__UndirectedStatement__Alternatives_0 ) )
            // InternalDotLanguage.g:895:2: ( rule__UndirectedStatement__Alternatives_0 )
            {
             before(grammarAccess.getUndirectedStatementAccess().getAlternatives_0()); 
            // InternalDotLanguage.g:896:2: ( rule__UndirectedStatement__Alternatives_0 )
            // InternalDotLanguage.g:896:3: rule__UndirectedStatement__Alternatives_0
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
    // InternalDotLanguage.g:904:1: rule__UndirectedStatement__Group__1 : rule__UndirectedStatement__Group__1__Impl ;
    public final void rule__UndirectedStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:908:1: ( rule__UndirectedStatement__Group__1__Impl )
            // InternalDotLanguage.g:909:2: rule__UndirectedStatement__Group__1__Impl
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
    // InternalDotLanguage.g:915:1: rule__UndirectedStatement__Group__1__Impl : ( ( rule__UndirectedStatement__Alternatives_1 )? ) ;
    public final void rule__UndirectedStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:919:1: ( ( ( rule__UndirectedStatement__Alternatives_1 )? ) )
            // InternalDotLanguage.g:920:1: ( ( rule__UndirectedStatement__Alternatives_1 )? )
            {
            // InternalDotLanguage.g:920:1: ( ( rule__UndirectedStatement__Alternatives_1 )? )
            // InternalDotLanguage.g:921:2: ( rule__UndirectedStatement__Alternatives_1 )?
            {
             before(grammarAccess.getUndirectedStatementAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:922:2: ( rule__UndirectedStatement__Alternatives_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=13 && LA11_0<=14)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDotLanguage.g:922:3: rule__UndirectedStatement__Alternatives_1
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
    // InternalDotLanguage.g:931:1: rule__NodeDeclaration__Group__0 : rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 ;
    public final void rule__NodeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:935:1: ( rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 )
            // InternalDotLanguage.g:936:2: rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1
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
    // InternalDotLanguage.g:943:1: rule__NodeDeclaration__Group__0__Impl : ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) ) ;
    public final void rule__NodeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:947:1: ( ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) ) )
            // InternalDotLanguage.g:948:1: ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) )
            {
            // InternalDotLanguage.g:948:1: ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) )
            // InternalDotLanguage.g:949:2: ( rule__NodeDeclaration__NodeNameAssignment_0 )
            {
             before(grammarAccess.getNodeDeclarationAccess().getNodeNameAssignment_0()); 
            // InternalDotLanguage.g:950:2: ( rule__NodeDeclaration__NodeNameAssignment_0 )
            // InternalDotLanguage.g:950:3: rule__NodeDeclaration__NodeNameAssignment_0
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
    // InternalDotLanguage.g:958:1: rule__NodeDeclaration__Group__1 : rule__NodeDeclaration__Group__1__Impl ;
    public final void rule__NodeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:962:1: ( rule__NodeDeclaration__Group__1__Impl )
            // InternalDotLanguage.g:963:2: rule__NodeDeclaration__Group__1__Impl
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
    // InternalDotLanguage.g:969:1: rule__NodeDeclaration__Group__1__Impl : ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? ) ;
    public final void rule__NodeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:973:1: ( ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? ) )
            // InternalDotLanguage.g:974:1: ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? )
            {
            // InternalDotLanguage.g:974:1: ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? )
            // InternalDotLanguage.g:975:2: ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )?
            {
             before(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAssignment_1()); 
            // InternalDotLanguage.g:976:2: ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDotLanguage.g:976:3: rule__NodeDeclaration__OptionalAttributesAssignment_1
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
    // InternalDotLanguage.g:985:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:989:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalDotLanguage.g:990:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
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
    // InternalDotLanguage.g:997:1: rule__AttributeList__Group__0__Impl : ( '[' ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1001:1: ( ( '[' ) )
            // InternalDotLanguage.g:1002:1: ( '[' )
            {
            // InternalDotLanguage.g:1002:1: ( '[' )
            // InternalDotLanguage.g:1003:2: '['
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
    // InternalDotLanguage.g:1012:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1016:1: ( rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 )
            // InternalDotLanguage.g:1017:2: rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2
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
    // InternalDotLanguage.g:1024:1: rule__AttributeList__Group__1__Impl : ( ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* ) ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1028:1: ( ( ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* ) ) )
            // InternalDotLanguage.g:1029:1: ( ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* ) )
            {
            // InternalDotLanguage.g:1029:1: ( ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* ) )
            // InternalDotLanguage.g:1030:2: ( ( rule__AttributeList__AttrAssignment_1 ) ) ( ( rule__AttributeList__AttrAssignment_1 )* )
            {
            // InternalDotLanguage.g:1030:2: ( ( rule__AttributeList__AttrAssignment_1 ) )
            // InternalDotLanguage.g:1031:3: ( rule__AttributeList__AttrAssignment_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttrAssignment_1()); 
            // InternalDotLanguage.g:1032:3: ( rule__AttributeList__AttrAssignment_1 )
            // InternalDotLanguage.g:1032:4: rule__AttributeList__AttrAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__AttributeList__AttrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttrAssignment_1()); 

            }

            // InternalDotLanguage.g:1035:2: ( ( rule__AttributeList__AttrAssignment_1 )* )
            // InternalDotLanguage.g:1036:3: ( rule__AttributeList__AttrAssignment_1 )*
            {
             before(grammarAccess.getAttributeListAccess().getAttrAssignment_1()); 
            // InternalDotLanguage.g:1037:3: ( rule__AttributeList__AttrAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDotLanguage.g:1037:4: rule__AttributeList__AttrAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AttributeList__AttrAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalDotLanguage.g:1046:1: rule__AttributeList__Group__2 : rule__AttributeList__Group__2__Impl ;
    public final void rule__AttributeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1050:1: ( rule__AttributeList__Group__2__Impl )
            // InternalDotLanguage.g:1051:2: rule__AttributeList__Group__2__Impl
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
    // InternalDotLanguage.g:1057:1: rule__AttributeList__Group__2__Impl : ( ']' ) ;
    public final void rule__AttributeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1061:1: ( ( ']' ) )
            // InternalDotLanguage.g:1062:1: ( ']' )
            {
            // InternalDotLanguage.g:1062:1: ( ']' )
            // InternalDotLanguage.g:1063:2: ']'
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
    // InternalDotLanguage.g:1073:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1077:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDotLanguage.g:1078:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalDotLanguage.g:1085:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AttributeNameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1089:1: ( ( ( rule__Attribute__AttributeNameAssignment_0 ) ) )
            // InternalDotLanguage.g:1090:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            {
            // InternalDotLanguage.g:1090:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            // InternalDotLanguage.g:1091:2: ( rule__Attribute__AttributeNameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); 
            // InternalDotLanguage.g:1092:2: ( rule__Attribute__AttributeNameAssignment_0 )
            // InternalDotLanguage.g:1092:3: rule__Attribute__AttributeNameAssignment_0
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
    // InternalDotLanguage.g:1100:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1104:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDotLanguage.g:1105:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalDotLanguage.g:1112:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1116:1: ( ( '=' ) )
            // InternalDotLanguage.g:1117:1: ( '=' )
            {
            // InternalDotLanguage.g:1117:1: ( '=' )
            // InternalDotLanguage.g:1118:2: '='
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
    // InternalDotLanguage.g:1127:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1131:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDotLanguage.g:1132:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalDotLanguage.g:1139:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributeValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1143:1: ( ( ( rule__Attribute__AttributeValueAssignment_2 ) ) )
            // InternalDotLanguage.g:1144:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            {
            // InternalDotLanguage.g:1144:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            // InternalDotLanguage.g:1145:2: ( rule__Attribute__AttributeValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); 
            // InternalDotLanguage.g:1146:2: ( rule__Attribute__AttributeValueAssignment_2 )
            // InternalDotLanguage.g:1146:3: rule__Attribute__AttributeValueAssignment_2
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
    // InternalDotLanguage.g:1154:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1158:1: ( rule__Attribute__Group__3__Impl )
            // InternalDotLanguage.g:1159:2: rule__Attribute__Group__3__Impl
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
    // InternalDotLanguage.g:1165:1: rule__Attribute__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1169:1: ( ( ( ',' )? ) )
            // InternalDotLanguage.g:1170:1: ( ( ',' )? )
            {
            // InternalDotLanguage.g:1170:1: ( ( ',' )? )
            // InternalDotLanguage.g:1171:2: ( ',' )?
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_3()); 
            // InternalDotLanguage.g:1172:2: ( ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDotLanguage.g:1172:3: ','
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
    // InternalDotLanguage.g:1181:1: rule__DirectedEdgeDeclaration__Group__0 : rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1 ;
    public final void rule__DirectedEdgeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1185:1: ( rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1 )
            // InternalDotLanguage.g:1186:2: rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDotLanguage.g:1193:1: rule__DirectedEdgeDeclaration__Group__0__Impl : ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1197:1: ( ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) )
            // InternalDotLanguage.g:1198:1: ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            {
            // InternalDotLanguage.g:1198:1: ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            // InternalDotLanguage.g:1199:2: ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 
            // InternalDotLanguage.g:1200:2: ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 )
            // InternalDotLanguage.g:1200:3: rule__DirectedEdgeDeclaration__FirstNodeAssignment_0
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
    // InternalDotLanguage.g:1208:1: rule__DirectedEdgeDeclaration__Group__1 : rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2 ;
    public final void rule__DirectedEdgeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1212:1: ( rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2 )
            // InternalDotLanguage.g:1213:2: rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDotLanguage.g:1220:1: rule__DirectedEdgeDeclaration__Group__1__Impl : ( ( rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1224:1: ( ( ( rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1 ) ) )
            // InternalDotLanguage.g:1225:1: ( ( rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1 ) )
            {
            // InternalDotLanguage.g:1225:1: ( ( rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1 ) )
            // InternalDotLanguage.g:1226:2: ( rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getDirectedEdgeAssignment_1()); 
            // InternalDotLanguage.g:1227:2: ( rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1 )
            // InternalDotLanguage.g:1227:3: rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getDirectedEdgeAssignment_1()); 

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
    // InternalDotLanguage.g:1235:1: rule__DirectedEdgeDeclaration__Group__2 : rule__DirectedEdgeDeclaration__Group__2__Impl ;
    public final void rule__DirectedEdgeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1239:1: ( rule__DirectedEdgeDeclaration__Group__2__Impl )
            // InternalDotLanguage.g:1240:2: rule__DirectedEdgeDeclaration__Group__2__Impl
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
    // InternalDotLanguage.g:1246:1: rule__DirectedEdgeDeclaration__Group__2__Impl : ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1250:1: ( ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) )
            // InternalDotLanguage.g:1251:1: ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            {
            // InternalDotLanguage.g:1251:1: ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            // InternalDotLanguage.g:1252:2: ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 
            // InternalDotLanguage.g:1253:2: ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 )
            // InternalDotLanguage.g:1253:3: rule__DirectedEdgeDeclaration__SecondNodeAssignment_2
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
    // InternalDotLanguage.g:1262:1: rule__UndirectedEdgeDeclaration__Group__0 : rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1 ;
    public final void rule__UndirectedEdgeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1266:1: ( rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1 )
            // InternalDotLanguage.g:1267:2: rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDotLanguage.g:1274:1: rule__UndirectedEdgeDeclaration__Group__0__Impl : ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1278:1: ( ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) )
            // InternalDotLanguage.g:1279:1: ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            {
            // InternalDotLanguage.g:1279:1: ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            // InternalDotLanguage.g:1280:2: ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 
            // InternalDotLanguage.g:1281:2: ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 )
            // InternalDotLanguage.g:1281:3: rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0
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
    // InternalDotLanguage.g:1289:1: rule__UndirectedEdgeDeclaration__Group__1 : rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2 ;
    public final void rule__UndirectedEdgeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1293:1: ( rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2 )
            // InternalDotLanguage.g:1294:2: rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDotLanguage.g:1301:1: rule__UndirectedEdgeDeclaration__Group__1__Impl : ( ( rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1305:1: ( ( ( rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1 ) ) )
            // InternalDotLanguage.g:1306:1: ( ( rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1 ) )
            {
            // InternalDotLanguage.g:1306:1: ( ( rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1 ) )
            // InternalDotLanguage.g:1307:2: ( rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getUndirectedEdgeAssignment_1()); 
            // InternalDotLanguage.g:1308:2: ( rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1 )
            // InternalDotLanguage.g:1308:3: rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getUndirectedEdgeAssignment_1()); 

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
    // InternalDotLanguage.g:1316:1: rule__UndirectedEdgeDeclaration__Group__2 : rule__UndirectedEdgeDeclaration__Group__2__Impl ;
    public final void rule__UndirectedEdgeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1320:1: ( rule__UndirectedEdgeDeclaration__Group__2__Impl )
            // InternalDotLanguage.g:1321:2: rule__UndirectedEdgeDeclaration__Group__2__Impl
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
    // InternalDotLanguage.g:1327:1: rule__UndirectedEdgeDeclaration__Group__2__Impl : ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1331:1: ( ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) )
            // InternalDotLanguage.g:1332:1: ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            {
            // InternalDotLanguage.g:1332:1: ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            // InternalDotLanguage.g:1333:2: ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 
            // InternalDotLanguage.g:1334:2: ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 )
            // InternalDotLanguage.g:1334:3: rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2
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
    // InternalDotLanguage.g:1343:1: rule__NodeList__Group__0 : rule__NodeList__Group__0__Impl rule__NodeList__Group__1 ;
    public final void rule__NodeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1347:1: ( rule__NodeList__Group__0__Impl rule__NodeList__Group__1 )
            // InternalDotLanguage.g:1348:2: rule__NodeList__Group__0__Impl rule__NodeList__Group__1
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
    // InternalDotLanguage.g:1355:1: rule__NodeList__Group__0__Impl : ( '{' ) ;
    public final void rule__NodeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1359:1: ( ( '{' ) )
            // InternalDotLanguage.g:1360:1: ( '{' )
            {
            // InternalDotLanguage.g:1360:1: ( '{' )
            // InternalDotLanguage.g:1361:2: '{'
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
    // InternalDotLanguage.g:1370:1: rule__NodeList__Group__1 : rule__NodeList__Group__1__Impl rule__NodeList__Group__2 ;
    public final void rule__NodeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1374:1: ( rule__NodeList__Group__1__Impl rule__NodeList__Group__2 )
            // InternalDotLanguage.g:1375:2: rule__NodeList__Group__1__Impl rule__NodeList__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDotLanguage.g:1382:1: rule__NodeList__Group__1__Impl : ( ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* ) ) ;
    public final void rule__NodeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1386:1: ( ( ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* ) ) )
            // InternalDotLanguage.g:1387:1: ( ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* ) )
            {
            // InternalDotLanguage.g:1387:1: ( ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* ) )
            // InternalDotLanguage.g:1388:2: ( ( rule__NodeList__NodesAssignment_1 ) ) ( ( rule__NodeList__NodesAssignment_1 )* )
            {
            // InternalDotLanguage.g:1388:2: ( ( rule__NodeList__NodesAssignment_1 ) )
            // InternalDotLanguage.g:1389:3: ( rule__NodeList__NodesAssignment_1 )
            {
             before(grammarAccess.getNodeListAccess().getNodesAssignment_1()); 
            // InternalDotLanguage.g:1390:3: ( rule__NodeList__NodesAssignment_1 )
            // InternalDotLanguage.g:1390:4: rule__NodeList__NodesAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__NodeList__NodesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeListAccess().getNodesAssignment_1()); 

            }

            // InternalDotLanguage.g:1393:2: ( ( rule__NodeList__NodesAssignment_1 )* )
            // InternalDotLanguage.g:1394:3: ( rule__NodeList__NodesAssignment_1 )*
            {
             before(grammarAccess.getNodeListAccess().getNodesAssignment_1()); 
            // InternalDotLanguage.g:1395:3: ( rule__NodeList__NodesAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDotLanguage.g:1395:4: rule__NodeList__NodesAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NodeList__NodesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDotLanguage.g:1404:1: rule__NodeList__Group__2 : rule__NodeList__Group__2__Impl ;
    public final void rule__NodeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1408:1: ( rule__NodeList__Group__2__Impl )
            // InternalDotLanguage.g:1409:2: rule__NodeList__Group__2__Impl
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
    // InternalDotLanguage.g:1415:1: rule__NodeList__Group__2__Impl : ( '}' ) ;
    public final void rule__NodeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1419:1: ( ( '}' ) )
            // InternalDotLanguage.g:1420:1: ( '}' )
            {
            // InternalDotLanguage.g:1420:1: ( '}' )
            // InternalDotLanguage.g:1421:2: '}'
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
    // InternalDotLanguage.g:1431:1: rule__DotLanguage__GraphsAssignment : ( ( rule__DotLanguage__GraphsAlternatives_0 ) ) ;
    public final void rule__DotLanguage__GraphsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1435:1: ( ( ( rule__DotLanguage__GraphsAlternatives_0 ) ) )
            // InternalDotLanguage.g:1436:2: ( ( rule__DotLanguage__GraphsAlternatives_0 ) )
            {
            // InternalDotLanguage.g:1436:2: ( ( rule__DotLanguage__GraphsAlternatives_0 ) )
            // InternalDotLanguage.g:1437:3: ( rule__DotLanguage__GraphsAlternatives_0 )
            {
             before(grammarAccess.getDotLanguageAccess().getGraphsAlternatives_0()); 
            // InternalDotLanguage.g:1438:3: ( rule__DotLanguage__GraphsAlternatives_0 )
            // InternalDotLanguage.g:1438:4: rule__DotLanguage__GraphsAlternatives_0
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
    // InternalDotLanguage.g:1446:1: rule__Graph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Graph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1450:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1451:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1451:2: ( RULE_ID )
            // InternalDotLanguage.g:1452:3: RULE_ID
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
    // InternalDotLanguage.g:1461:1: rule__Graph__StatementsAssignment_3 : ( ruleUndirectedStatement ) ;
    public final void rule__Graph__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1465:1: ( ( ruleUndirectedStatement ) )
            // InternalDotLanguage.g:1466:2: ( ruleUndirectedStatement )
            {
            // InternalDotLanguage.g:1466:2: ( ruleUndirectedStatement )
            // InternalDotLanguage.g:1467:3: ruleUndirectedStatement
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
    // InternalDotLanguage.g:1476:1: rule__Digraph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Digraph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1480:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1481:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1481:2: ( RULE_ID )
            // InternalDotLanguage.g:1482:3: RULE_ID
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
    // InternalDotLanguage.g:1491:1: rule__Digraph__StatementsAssignment_3 : ( ruleDirectedStatement ) ;
    public final void rule__Digraph__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1495:1: ( ( ruleDirectedStatement ) )
            // InternalDotLanguage.g:1496:2: ( ruleDirectedStatement )
            {
            // InternalDotLanguage.g:1496:2: ( ruleDirectedStatement )
            // InternalDotLanguage.g:1497:3: ruleDirectedStatement
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
    // InternalDotLanguage.g:1506:1: rule__NodeDeclaration__NodeNameAssignment_0 : ( ruleNodeId ) ;
    public final void rule__NodeDeclaration__NodeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1510:1: ( ( ruleNodeId ) )
            // InternalDotLanguage.g:1511:2: ( ruleNodeId )
            {
            // InternalDotLanguage.g:1511:2: ( ruleNodeId )
            // InternalDotLanguage.g:1512:3: ruleNodeId
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
    // InternalDotLanguage.g:1521:1: rule__NodeDeclaration__OptionalAttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__NodeDeclaration__OptionalAttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1525:1: ( ( ruleAttributeList ) )
            // InternalDotLanguage.g:1526:2: ( ruleAttributeList )
            {
            // InternalDotLanguage.g:1526:2: ( ruleAttributeList )
            // InternalDotLanguage.g:1527:3: ruleAttributeList
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
    // InternalDotLanguage.g:1536:1: rule__NodeId__NameAssignment : ( RULE_ID ) ;
    public final void rule__NodeId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1540:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1541:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1541:2: ( RULE_ID )
            // InternalDotLanguage.g:1542:3: RULE_ID
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
    // InternalDotLanguage.g:1551:1: rule__AttributeList__AttrAssignment_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1555:1: ( ( ruleAttribute ) )
            // InternalDotLanguage.g:1556:2: ( ruleAttribute )
            {
            // InternalDotLanguage.g:1556:2: ( ruleAttribute )
            // InternalDotLanguage.g:1557:3: ruleAttribute
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
    // InternalDotLanguage.g:1566:1: rule__Attribute__AttributeNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1570:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1571:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1571:2: ( RULE_ID )
            // InternalDotLanguage.g:1572:3: RULE_ID
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
    // InternalDotLanguage.g:1581:1: rule__Attribute__AttributeValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1585:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1586:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1586:2: ( RULE_ID )
            // InternalDotLanguage.g:1587:3: RULE_ID
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
    // InternalDotLanguage.g:1596:1: rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DirectedEdgeDeclaration__FirstNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1600:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1601:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1601:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1602:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1603:3: ( RULE_ID )
            // InternalDotLanguage.g:1604:4: RULE_ID
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


    // $ANTLR start "rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1"
    // InternalDotLanguage.g:1615:1: rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1 : ( ruleDirectedEdge ) ;
    public final void rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1619:1: ( ( ruleDirectedEdge ) )
            // InternalDotLanguage.g:1620:2: ( ruleDirectedEdge )
            {
            // InternalDotLanguage.g:1620:2: ( ruleDirectedEdge )
            // InternalDotLanguage.g:1621:3: ruleDirectedEdge
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getDirectedEdgeDirectedEdgeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectedEdge();

            state._fsp--;

             after(grammarAccess.getDirectedEdgeDeclarationAccess().getDirectedEdgeDirectedEdgeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DirectedEdgeDeclaration__DirectedEdgeAssignment_1"


    // $ANTLR start "rule__DirectedEdgeDeclaration__SecondNodeAssignment_2"
    // InternalDotLanguage.g:1630:1: rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 : ( ruleRightEdgeDeclaration ) ;
    public final void rule__DirectedEdgeDeclaration__SecondNodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1634:1: ( ( ruleRightEdgeDeclaration ) )
            // InternalDotLanguage.g:1635:2: ( ruleRightEdgeDeclaration )
            {
            // InternalDotLanguage.g:1635:2: ( ruleRightEdgeDeclaration )
            // InternalDotLanguage.g:1636:3: ruleRightEdgeDeclaration
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
    // InternalDotLanguage.g:1645:1: rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1649:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1650:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1650:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1651:3: ( RULE_ID )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1652:3: ( RULE_ID )
            // InternalDotLanguage.g:1653:4: RULE_ID
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


    // $ANTLR start "rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1"
    // InternalDotLanguage.g:1664:1: rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1 : ( ruleUndirectedEdge ) ;
    public final void rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1668:1: ( ( ruleUndirectedEdge ) )
            // InternalDotLanguage.g:1669:2: ( ruleUndirectedEdge )
            {
            // InternalDotLanguage.g:1669:2: ( ruleUndirectedEdge )
            // InternalDotLanguage.g:1670:3: ruleUndirectedEdge
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getUndirectedEdgeUndirectedEdgeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUndirectedEdge();

            state._fsp--;

             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getUndirectedEdgeUndirectedEdgeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UndirectedEdgeDeclaration__UndirectedEdgeAssignment_1"


    // $ANTLR start "rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2"
    // InternalDotLanguage.g:1679:1: rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 : ( ruleRightEdgeDeclaration ) ;
    public final void rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1683:1: ( ( ruleRightEdgeDeclaration ) )
            // InternalDotLanguage.g:1684:2: ( ruleRightEdgeDeclaration )
            {
            // InternalDotLanguage.g:1684:2: ( ruleRightEdgeDeclaration )
            // InternalDotLanguage.g:1685:3: ruleRightEdgeDeclaration
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
    // InternalDotLanguage.g:1694:1: rule__RightEdgeDeclaration__SecondNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RightEdgeDeclaration__SecondNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1698:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1699:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1699:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1700:3: ( RULE_ID )
            {
             before(grammarAccess.getRightEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1701:3: ( RULE_ID )
            // InternalDotLanguage.g:1702:4: RULE_ID
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


    // $ANTLR start "rule__NodeList__NodesAssignment_1"
    // InternalDotLanguage.g:1713:1: rule__NodeList__NodesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeList__NodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1717:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1718:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1718:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1719:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeListAccess().getNodesNodeIdCrossReference_1_0()); 
            // InternalDotLanguage.g:1720:3: ( RULE_ID )
            // InternalDotLanguage.g:1721:4: RULE_ID
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});

}