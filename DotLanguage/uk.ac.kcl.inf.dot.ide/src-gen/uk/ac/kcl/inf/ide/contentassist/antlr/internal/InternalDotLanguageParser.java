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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "';'", "'red'", "'blue'", "'green'", "'black'", "'graph'", "'{'", "'}'", "'digraph'", "'['", "']'", "'label='", "'color='", "'->'", "'--'"
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

                if ( (LA1_0==17||LA1_0==20) ) {
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
    // InternalDotLanguage.g:137:1: ruleDirectedStatement : ( ( rule__DirectedStatement__Alternatives ) ) ;
    public final void ruleDirectedStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:141:2: ( ( ( rule__DirectedStatement__Alternatives ) ) )
            // InternalDotLanguage.g:142:2: ( ( rule__DirectedStatement__Alternatives ) )
            {
            // InternalDotLanguage.g:142:2: ( ( rule__DirectedStatement__Alternatives ) )
            // InternalDotLanguage.g:143:3: ( rule__DirectedStatement__Alternatives )
            {
             before(grammarAccess.getDirectedStatementAccess().getAlternatives()); 
            // InternalDotLanguage.g:144:3: ( rule__DirectedStatement__Alternatives )
            // InternalDotLanguage.g:144:4: rule__DirectedStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DirectedStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectedStatementAccess().getAlternatives()); 

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
    // InternalDotLanguage.g:162:1: ruleUndirectedStatement : ( ( rule__UndirectedStatement__Alternatives ) ) ;
    public final void ruleUndirectedStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:166:2: ( ( ( rule__UndirectedStatement__Alternatives ) ) )
            // InternalDotLanguage.g:167:2: ( ( rule__UndirectedStatement__Alternatives ) )
            {
            // InternalDotLanguage.g:167:2: ( ( rule__UndirectedStatement__Alternatives ) )
            // InternalDotLanguage.g:168:3: ( rule__UndirectedStatement__Alternatives )
            {
             before(grammarAccess.getUndirectedStatementAccess().getAlternatives()); 
            // InternalDotLanguage.g:169:3: ( rule__UndirectedStatement__Alternatives )
            // InternalDotLanguage.g:169:4: rule__UndirectedStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedStatementAccess().getAlternatives()); 

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
    // InternalDotLanguage.g:262:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:266:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalDotLanguage.g:267:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalDotLanguage.g:267:2: ( ( rule__Attribute__Alternatives ) )
            // InternalDotLanguage.g:268:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalDotLanguage.g:269:3: ( rule__Attribute__Alternatives )
            // InternalDotLanguage.g:269:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleLabelAttribute"
    // InternalDotLanguage.g:278:1: entryRuleLabelAttribute : ruleLabelAttribute EOF ;
    public final void entryRuleLabelAttribute() throws RecognitionException {
        try {
            // InternalDotLanguage.g:279:1: ( ruleLabelAttribute EOF )
            // InternalDotLanguage.g:280:1: ruleLabelAttribute EOF
            {
             before(grammarAccess.getLabelAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleLabelAttribute();

            state._fsp--;

             after(grammarAccess.getLabelAttributeRule()); 
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
    // $ANTLR end "entryRuleLabelAttribute"


    // $ANTLR start "ruleLabelAttribute"
    // InternalDotLanguage.g:287:1: ruleLabelAttribute : ( ( rule__LabelAttribute__Group__0 ) ) ;
    public final void ruleLabelAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:291:2: ( ( ( rule__LabelAttribute__Group__0 ) ) )
            // InternalDotLanguage.g:292:2: ( ( rule__LabelAttribute__Group__0 ) )
            {
            // InternalDotLanguage.g:292:2: ( ( rule__LabelAttribute__Group__0 ) )
            // InternalDotLanguage.g:293:3: ( rule__LabelAttribute__Group__0 )
            {
             before(grammarAccess.getLabelAttributeAccess().getGroup()); 
            // InternalDotLanguage.g:294:3: ( rule__LabelAttribute__Group__0 )
            // InternalDotLanguage.g:294:4: rule__LabelAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LabelAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleLabelAttribute"


    // $ANTLR start "entryRuleColorAttribute"
    // InternalDotLanguage.g:303:1: entryRuleColorAttribute : ruleColorAttribute EOF ;
    public final void entryRuleColorAttribute() throws RecognitionException {
        try {
            // InternalDotLanguage.g:304:1: ( ruleColorAttribute EOF )
            // InternalDotLanguage.g:305:1: ruleColorAttribute EOF
            {
             before(grammarAccess.getColorAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleColorAttribute();

            state._fsp--;

             after(grammarAccess.getColorAttributeRule()); 
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
    // $ANTLR end "entryRuleColorAttribute"


    // $ANTLR start "ruleColorAttribute"
    // InternalDotLanguage.g:312:1: ruleColorAttribute : ( ( rule__ColorAttribute__Group__0 ) ) ;
    public final void ruleColorAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:316:2: ( ( ( rule__ColorAttribute__Group__0 ) ) )
            // InternalDotLanguage.g:317:2: ( ( rule__ColorAttribute__Group__0 ) )
            {
            // InternalDotLanguage.g:317:2: ( ( rule__ColorAttribute__Group__0 ) )
            // InternalDotLanguage.g:318:3: ( rule__ColorAttribute__Group__0 )
            {
             before(grammarAccess.getColorAttributeAccess().getGroup()); 
            // InternalDotLanguage.g:319:3: ( rule__ColorAttribute__Group__0 )
            // InternalDotLanguage.g:319:4: rule__ColorAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleColorAttribute"


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


    // $ANTLR start "ruleColor"
    // InternalDotLanguage.g:378:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:382:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalDotLanguage.g:383:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalDotLanguage.g:383:2: ( ( rule__Color__Alternatives ) )
            // InternalDotLanguage.g:384:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalDotLanguage.g:385:3: ( rule__Color__Alternatives )
            // InternalDotLanguage.g:385:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "rule__DotLanguage__GraphsAlternatives_0"
    // InternalDotLanguage.g:393:1: rule__DotLanguage__GraphsAlternatives_0 : ( ( ruleGraph ) | ( ruleDigraph ) );
    public final void rule__DotLanguage__GraphsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:397:1: ( ( ruleGraph ) | ( ruleDigraph ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDotLanguage.g:398:2: ( ruleGraph )
                    {
                    // InternalDotLanguage.g:398:2: ( ruleGraph )
                    // InternalDotLanguage.g:399:3: ruleGraph
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
                    // InternalDotLanguage.g:404:2: ( ruleDigraph )
                    {
                    // InternalDotLanguage.g:404:2: ( ruleDigraph )
                    // InternalDotLanguage.g:405:3: ruleDigraph
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


    // $ANTLR start "rule__DirectedStatement__Alternatives"
    // InternalDotLanguage.g:414:1: rule__DirectedStatement__Alternatives : ( ( ( rule__DirectedStatement__Group_0__0 ) ) | ( ( rule__DirectedStatement__Group_1__0 ) ) );
    public final void rule__DirectedStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:418:1: ( ( ( rule__DirectedStatement__Group_0__0 ) ) | ( ( rule__DirectedStatement__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||(LA3_1>=11 && LA3_1<=12)||LA3_1==19||LA3_1==21) ) {
                    alt3=1;
                }
                else if ( (LA3_1==25) ) {
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
                    // InternalDotLanguage.g:419:2: ( ( rule__DirectedStatement__Group_0__0 ) )
                    {
                    // InternalDotLanguage.g:419:2: ( ( rule__DirectedStatement__Group_0__0 ) )
                    // InternalDotLanguage.g:420:3: ( rule__DirectedStatement__Group_0__0 )
                    {
                     before(grammarAccess.getDirectedStatementAccess().getGroup_0()); 
                    // InternalDotLanguage.g:421:3: ( rule__DirectedStatement__Group_0__0 )
                    // InternalDotLanguage.g:421:4: rule__DirectedStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedStatement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectedStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:425:2: ( ( rule__DirectedStatement__Group_1__0 ) )
                    {
                    // InternalDotLanguage.g:425:2: ( ( rule__DirectedStatement__Group_1__0 ) )
                    // InternalDotLanguage.g:426:3: ( rule__DirectedStatement__Group_1__0 )
                    {
                     before(grammarAccess.getDirectedStatementAccess().getGroup_1()); 
                    // InternalDotLanguage.g:427:3: ( rule__DirectedStatement__Group_1__0 )
                    // InternalDotLanguage.g:427:4: rule__DirectedStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedStatement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectedStatementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DirectedStatement__Alternatives"


    // $ANTLR start "rule__DirectedStatement__Alternatives_0_1"
    // InternalDotLanguage.g:435:1: rule__DirectedStatement__Alternatives_0_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__DirectedStatement__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:439:1: ( ( ',' ) | ( ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDotLanguage.g:440:2: ( ',' )
                    {
                    // InternalDotLanguage.g:440:2: ( ',' )
                    // InternalDotLanguage.g:441:3: ','
                    {
                     before(grammarAccess.getDirectedStatementAccess().getCommaKeyword_0_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDirectedStatementAccess().getCommaKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:446:2: ( ';' )
                    {
                    // InternalDotLanguage.g:446:2: ( ';' )
                    // InternalDotLanguage.g:447:3: ';'
                    {
                     before(grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_0_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_0_1_1()); 

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
    // $ANTLR end "rule__DirectedStatement__Alternatives_0_1"


    // $ANTLR start "rule__DirectedStatement__Alternatives_1_1"
    // InternalDotLanguage.g:456:1: rule__DirectedStatement__Alternatives_1_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__DirectedStatement__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:460:1: ( ( ',' ) | ( ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDotLanguage.g:461:2: ( ',' )
                    {
                    // InternalDotLanguage.g:461:2: ( ',' )
                    // InternalDotLanguage.g:462:3: ','
                    {
                     before(grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDirectedStatementAccess().getCommaKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:467:2: ( ';' )
                    {
                    // InternalDotLanguage.g:467:2: ( ';' )
                    // InternalDotLanguage.g:468:3: ';'
                    {
                     before(grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_1_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDirectedStatementAccess().getSemicolonKeyword_1_1_1()); 

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
    // $ANTLR end "rule__DirectedStatement__Alternatives_1_1"


    // $ANTLR start "rule__UndirectedStatement__Alternatives"
    // InternalDotLanguage.g:477:1: rule__UndirectedStatement__Alternatives : ( ( ( rule__UndirectedStatement__Group_0__0 ) ) | ( ( rule__UndirectedStatement__Group_1__0 ) ) );
    public final void rule__UndirectedStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:481:1: ( ( ( rule__UndirectedStatement__Group_0__0 ) ) | ( ( rule__UndirectedStatement__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==26) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||(LA6_1>=11 && LA6_1<=12)||LA6_1==19||LA6_1==21) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDotLanguage.g:482:2: ( ( rule__UndirectedStatement__Group_0__0 ) )
                    {
                    // InternalDotLanguage.g:482:2: ( ( rule__UndirectedStatement__Group_0__0 ) )
                    // InternalDotLanguage.g:483:3: ( rule__UndirectedStatement__Group_0__0 )
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getGroup_0()); 
                    // InternalDotLanguage.g:484:3: ( rule__UndirectedStatement__Group_0__0 )
                    // InternalDotLanguage.g:484:4: rule__UndirectedStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UndirectedStatement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUndirectedStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:488:2: ( ( rule__UndirectedStatement__Group_1__0 ) )
                    {
                    // InternalDotLanguage.g:488:2: ( ( rule__UndirectedStatement__Group_1__0 ) )
                    // InternalDotLanguage.g:489:3: ( rule__UndirectedStatement__Group_1__0 )
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getGroup_1()); 
                    // InternalDotLanguage.g:490:3: ( rule__UndirectedStatement__Group_1__0 )
                    // InternalDotLanguage.g:490:4: rule__UndirectedStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UndirectedStatement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUndirectedStatementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UndirectedStatement__Alternatives"


    // $ANTLR start "rule__UndirectedStatement__Alternatives_0_1"
    // InternalDotLanguage.g:498:1: rule__UndirectedStatement__Alternatives_0_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__UndirectedStatement__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:502:1: ( ( ',' ) | ( ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDotLanguage.g:503:2: ( ',' )
                    {
                    // InternalDotLanguage.g:503:2: ( ',' )
                    // InternalDotLanguage.g:504:3: ','
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_0_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:509:2: ( ';' )
                    {
                    // InternalDotLanguage.g:509:2: ( ';' )
                    // InternalDotLanguage.g:510:3: ';'
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_0_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_0_1_1()); 

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
    // $ANTLR end "rule__UndirectedStatement__Alternatives_0_1"


    // $ANTLR start "rule__UndirectedStatement__Alternatives_1_1"
    // InternalDotLanguage.g:519:1: rule__UndirectedStatement__Alternatives_1_1 : ( ( ',' ) | ( ';' ) );
    public final void rule__UndirectedStatement__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:523:1: ( ( ',' ) | ( ';' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDotLanguage.g:524:2: ( ',' )
                    {
                    // InternalDotLanguage.g:524:2: ( ',' )
                    // InternalDotLanguage.g:525:3: ','
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getUndirectedStatementAccess().getCommaKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:530:2: ( ';' )
                    {
                    // InternalDotLanguage.g:530:2: ( ';' )
                    // InternalDotLanguage.g:531:3: ';'
                    {
                     before(grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_1_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getUndirectedStatementAccess().getSemicolonKeyword_1_1_1()); 

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
    // $ANTLR end "rule__UndirectedStatement__Alternatives_1_1"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalDotLanguage.g:540:1: rule__Attribute__Alternatives : ( ( ruleLabelAttribute ) | ( ruleColorAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:544:1: ( ( ruleLabelAttribute ) | ( ruleColorAttribute ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDotLanguage.g:545:2: ( ruleLabelAttribute )
                    {
                    // InternalDotLanguage.g:545:2: ( ruleLabelAttribute )
                    // InternalDotLanguage.g:546:3: ruleLabelAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getLabelAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLabelAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getLabelAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:551:2: ( ruleColorAttribute )
                    {
                    // InternalDotLanguage.g:551:2: ( ruleColorAttribute )
                    // InternalDotLanguage.g:552:3: ruleColorAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getColorAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColorAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getColorAttributeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalDotLanguage.g:561:1: rule__Color__Alternatives : ( ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'green' ) ) | ( ( 'black' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:565:1: ( ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'green' ) ) | ( ( 'black' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case 15:
                {
                alt10=3;
                }
                break;
            case 16:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDotLanguage.g:566:2: ( ( 'red' ) )
                    {
                    // InternalDotLanguage.g:566:2: ( ( 'red' ) )
                    // InternalDotLanguage.g:567:3: ( 'red' )
                    {
                     before(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                    // InternalDotLanguage.g:568:3: ( 'red' )
                    // InternalDotLanguage.g:568:4: 'red'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:572:2: ( ( 'blue' ) )
                    {
                    // InternalDotLanguage.g:572:2: ( ( 'blue' ) )
                    // InternalDotLanguage.g:573:3: ( 'blue' )
                    {
                     before(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1()); 
                    // InternalDotLanguage.g:574:3: ( 'blue' )
                    // InternalDotLanguage.g:574:4: 'blue'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:578:2: ( ( 'green' ) )
                    {
                    // InternalDotLanguage.g:578:2: ( ( 'green' ) )
                    // InternalDotLanguage.g:579:3: ( 'green' )
                    {
                     before(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2()); 
                    // InternalDotLanguage.g:580:3: ( 'green' )
                    // InternalDotLanguage.g:580:4: 'green'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDotLanguage.g:584:2: ( ( 'black' ) )
                    {
                    // InternalDotLanguage.g:584:2: ( ( 'black' ) )
                    // InternalDotLanguage.g:585:3: ( 'black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_3()); 
                    // InternalDotLanguage.g:586:3: ( 'black' )
                    // InternalDotLanguage.g:586:4: 'black'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Graph__Group__0"
    // InternalDotLanguage.g:594:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:598:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalDotLanguage.g:599:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalDotLanguage.g:606:1: rule__Graph__Group__0__Impl : ( 'graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:610:1: ( ( 'graph' ) )
            // InternalDotLanguage.g:611:1: ( 'graph' )
            {
            // InternalDotLanguage.g:611:1: ( 'graph' )
            // InternalDotLanguage.g:612:2: 'graph'
            {
             before(grammarAccess.getGraphAccess().getGraphKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDotLanguage.g:621:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:625:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalDotLanguage.g:626:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
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
    // InternalDotLanguage.g:633:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NameAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:637:1: ( ( ( rule__Graph__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:638:1: ( ( rule__Graph__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:638:1: ( ( rule__Graph__NameAssignment_1 ) )
            // InternalDotLanguage.g:639:2: ( rule__Graph__NameAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:640:2: ( rule__Graph__NameAssignment_1 )
            // InternalDotLanguage.g:640:3: rule__Graph__NameAssignment_1
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
    // InternalDotLanguage.g:648:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:652:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalDotLanguage.g:653:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
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
    // InternalDotLanguage.g:660:1: rule__Graph__Group__2__Impl : ( '{' ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:664:1: ( ( '{' ) )
            // InternalDotLanguage.g:665:1: ( '{' )
            {
            // InternalDotLanguage.g:665:1: ( '{' )
            // InternalDotLanguage.g:666:2: '{'
            {
             before(grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDotLanguage.g:675:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:679:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // InternalDotLanguage.g:680:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
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
    // InternalDotLanguage.g:687:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__StatementsAssignment_3 )* ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:691:1: ( ( ( rule__Graph__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:692:1: ( ( rule__Graph__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:692:1: ( ( rule__Graph__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:693:2: ( rule__Graph__StatementsAssignment_3 )*
            {
             before(grammarAccess.getGraphAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:694:2: ( rule__Graph__StatementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDotLanguage.g:694:3: rule__Graph__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Graph__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDotLanguage.g:702:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:706:1: ( rule__Graph__Group__4__Impl )
            // InternalDotLanguage.g:707:2: rule__Graph__Group__4__Impl
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
    // InternalDotLanguage.g:713:1: rule__Graph__Group__4__Impl : ( '}' ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:717:1: ( ( '}' ) )
            // InternalDotLanguage.g:718:1: ( '}' )
            {
            // InternalDotLanguage.g:718:1: ( '}' )
            // InternalDotLanguage.g:719:2: '}'
            {
             before(grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDotLanguage.g:729:1: rule__Digraph__Group__0 : rule__Digraph__Group__0__Impl rule__Digraph__Group__1 ;
    public final void rule__Digraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:733:1: ( rule__Digraph__Group__0__Impl rule__Digraph__Group__1 )
            // InternalDotLanguage.g:734:2: rule__Digraph__Group__0__Impl rule__Digraph__Group__1
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
    // InternalDotLanguage.g:741:1: rule__Digraph__Group__0__Impl : ( 'digraph' ) ;
    public final void rule__Digraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:745:1: ( ( 'digraph' ) )
            // InternalDotLanguage.g:746:1: ( 'digraph' )
            {
            // InternalDotLanguage.g:746:1: ( 'digraph' )
            // InternalDotLanguage.g:747:2: 'digraph'
            {
             before(grammarAccess.getDigraphAccess().getDigraphKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDotLanguage.g:756:1: rule__Digraph__Group__1 : rule__Digraph__Group__1__Impl rule__Digraph__Group__2 ;
    public final void rule__Digraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:760:1: ( rule__Digraph__Group__1__Impl rule__Digraph__Group__2 )
            // InternalDotLanguage.g:761:2: rule__Digraph__Group__1__Impl rule__Digraph__Group__2
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
    // InternalDotLanguage.g:768:1: rule__Digraph__Group__1__Impl : ( ( rule__Digraph__NameAssignment_1 ) ) ;
    public final void rule__Digraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:772:1: ( ( ( rule__Digraph__NameAssignment_1 ) ) )
            // InternalDotLanguage.g:773:1: ( ( rule__Digraph__NameAssignment_1 ) )
            {
            // InternalDotLanguage.g:773:1: ( ( rule__Digraph__NameAssignment_1 ) )
            // InternalDotLanguage.g:774:2: ( rule__Digraph__NameAssignment_1 )
            {
             before(grammarAccess.getDigraphAccess().getNameAssignment_1()); 
            // InternalDotLanguage.g:775:2: ( rule__Digraph__NameAssignment_1 )
            // InternalDotLanguage.g:775:3: rule__Digraph__NameAssignment_1
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
    // InternalDotLanguage.g:783:1: rule__Digraph__Group__2 : rule__Digraph__Group__2__Impl rule__Digraph__Group__3 ;
    public final void rule__Digraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:787:1: ( rule__Digraph__Group__2__Impl rule__Digraph__Group__3 )
            // InternalDotLanguage.g:788:2: rule__Digraph__Group__2__Impl rule__Digraph__Group__3
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
    // InternalDotLanguage.g:795:1: rule__Digraph__Group__2__Impl : ( '{' ) ;
    public final void rule__Digraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:799:1: ( ( '{' ) )
            // InternalDotLanguage.g:800:1: ( '{' )
            {
            // InternalDotLanguage.g:800:1: ( '{' )
            // InternalDotLanguage.g:801:2: '{'
            {
             before(grammarAccess.getDigraphAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDotLanguage.g:810:1: rule__Digraph__Group__3 : rule__Digraph__Group__3__Impl rule__Digraph__Group__4 ;
    public final void rule__Digraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:814:1: ( rule__Digraph__Group__3__Impl rule__Digraph__Group__4 )
            // InternalDotLanguage.g:815:2: rule__Digraph__Group__3__Impl rule__Digraph__Group__4
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
    // InternalDotLanguage.g:822:1: rule__Digraph__Group__3__Impl : ( ( rule__Digraph__StatementsAssignment_3 )* ) ;
    public final void rule__Digraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:826:1: ( ( ( rule__Digraph__StatementsAssignment_3 )* ) )
            // InternalDotLanguage.g:827:1: ( ( rule__Digraph__StatementsAssignment_3 )* )
            {
            // InternalDotLanguage.g:827:1: ( ( rule__Digraph__StatementsAssignment_3 )* )
            // InternalDotLanguage.g:828:2: ( rule__Digraph__StatementsAssignment_3 )*
            {
             before(grammarAccess.getDigraphAccess().getStatementsAssignment_3()); 
            // InternalDotLanguage.g:829:2: ( rule__Digraph__StatementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDotLanguage.g:829:3: rule__Digraph__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Digraph__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDotLanguage.g:837:1: rule__Digraph__Group__4 : rule__Digraph__Group__4__Impl ;
    public final void rule__Digraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:841:1: ( rule__Digraph__Group__4__Impl )
            // InternalDotLanguage.g:842:2: rule__Digraph__Group__4__Impl
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
    // InternalDotLanguage.g:848:1: rule__Digraph__Group__4__Impl : ( '}' ) ;
    public final void rule__Digraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:852:1: ( ( '}' ) )
            // InternalDotLanguage.g:853:1: ( '}' )
            {
            // InternalDotLanguage.g:853:1: ( '}' )
            // InternalDotLanguage.g:854:2: '}'
            {
             before(grammarAccess.getDigraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__DirectedStatement__Group_0__0"
    // InternalDotLanguage.g:864:1: rule__DirectedStatement__Group_0__0 : rule__DirectedStatement__Group_0__0__Impl rule__DirectedStatement__Group_0__1 ;
    public final void rule__DirectedStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:868:1: ( rule__DirectedStatement__Group_0__0__Impl rule__DirectedStatement__Group_0__1 )
            // InternalDotLanguage.g:869:2: rule__DirectedStatement__Group_0__0__Impl rule__DirectedStatement__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__DirectedStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedStatement__Group_0__1();

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
    // $ANTLR end "rule__DirectedStatement__Group_0__0"


    // $ANTLR start "rule__DirectedStatement__Group_0__0__Impl"
    // InternalDotLanguage.g:876:1: rule__DirectedStatement__Group_0__0__Impl : ( ruleNodeDeclaration ) ;
    public final void rule__DirectedStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:880:1: ( ( ruleNodeDeclaration ) )
            // InternalDotLanguage.g:881:1: ( ruleNodeDeclaration )
            {
            // InternalDotLanguage.g:881:1: ( ruleNodeDeclaration )
            // InternalDotLanguage.g:882:2: ruleNodeDeclaration
            {
             before(grammarAccess.getDirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeDeclaration();

            state._fsp--;

             after(grammarAccess.getDirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DirectedStatement__Group_0__0__Impl"


    // $ANTLR start "rule__DirectedStatement__Group_0__1"
    // InternalDotLanguage.g:891:1: rule__DirectedStatement__Group_0__1 : rule__DirectedStatement__Group_0__1__Impl ;
    public final void rule__DirectedStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:895:1: ( rule__DirectedStatement__Group_0__1__Impl )
            // InternalDotLanguage.g:896:2: rule__DirectedStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectedStatement__Group_0__1__Impl();

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
    // $ANTLR end "rule__DirectedStatement__Group_0__1"


    // $ANTLR start "rule__DirectedStatement__Group_0__1__Impl"
    // InternalDotLanguage.g:902:1: rule__DirectedStatement__Group_0__1__Impl : ( ( rule__DirectedStatement__Alternatives_0_1 )? ) ;
    public final void rule__DirectedStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:906:1: ( ( ( rule__DirectedStatement__Alternatives_0_1 )? ) )
            // InternalDotLanguage.g:907:1: ( ( rule__DirectedStatement__Alternatives_0_1 )? )
            {
            // InternalDotLanguage.g:907:1: ( ( rule__DirectedStatement__Alternatives_0_1 )? )
            // InternalDotLanguage.g:908:2: ( rule__DirectedStatement__Alternatives_0_1 )?
            {
             before(grammarAccess.getDirectedStatementAccess().getAlternatives_0_1()); 
            // InternalDotLanguage.g:909:2: ( rule__DirectedStatement__Alternatives_0_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDotLanguage.g:909:3: rule__DirectedStatement__Alternatives_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedStatement__Alternatives_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectedStatementAccess().getAlternatives_0_1()); 

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
    // $ANTLR end "rule__DirectedStatement__Group_0__1__Impl"


    // $ANTLR start "rule__DirectedStatement__Group_1__0"
    // InternalDotLanguage.g:918:1: rule__DirectedStatement__Group_1__0 : rule__DirectedStatement__Group_1__0__Impl rule__DirectedStatement__Group_1__1 ;
    public final void rule__DirectedStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:922:1: ( rule__DirectedStatement__Group_1__0__Impl rule__DirectedStatement__Group_1__1 )
            // InternalDotLanguage.g:923:2: rule__DirectedStatement__Group_1__0__Impl rule__DirectedStatement__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__DirectedStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedStatement__Group_1__1();

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
    // $ANTLR end "rule__DirectedStatement__Group_1__0"


    // $ANTLR start "rule__DirectedStatement__Group_1__0__Impl"
    // InternalDotLanguage.g:930:1: rule__DirectedStatement__Group_1__0__Impl : ( ruleDirectedEdgeDeclaration ) ;
    public final void rule__DirectedStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:934:1: ( ( ruleDirectedEdgeDeclaration ) )
            // InternalDotLanguage.g:935:1: ( ruleDirectedEdgeDeclaration )
            {
            // InternalDotLanguage.g:935:1: ( ruleDirectedEdgeDeclaration )
            // InternalDotLanguage.g:936:2: ruleDirectedEdgeDeclaration
            {
             before(grammarAccess.getDirectedStatementAccess().getDirectedEdgeDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectedEdgeDeclaration();

            state._fsp--;

             after(grammarAccess.getDirectedStatementAccess().getDirectedEdgeDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DirectedStatement__Group_1__0__Impl"


    // $ANTLR start "rule__DirectedStatement__Group_1__1"
    // InternalDotLanguage.g:945:1: rule__DirectedStatement__Group_1__1 : rule__DirectedStatement__Group_1__1__Impl ;
    public final void rule__DirectedStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:949:1: ( rule__DirectedStatement__Group_1__1__Impl )
            // InternalDotLanguage.g:950:2: rule__DirectedStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectedStatement__Group_1__1__Impl();

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
    // $ANTLR end "rule__DirectedStatement__Group_1__1"


    // $ANTLR start "rule__DirectedStatement__Group_1__1__Impl"
    // InternalDotLanguage.g:956:1: rule__DirectedStatement__Group_1__1__Impl : ( ( rule__DirectedStatement__Alternatives_1_1 )? ) ;
    public final void rule__DirectedStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:960:1: ( ( ( rule__DirectedStatement__Alternatives_1_1 )? ) )
            // InternalDotLanguage.g:961:1: ( ( rule__DirectedStatement__Alternatives_1_1 )? )
            {
            // InternalDotLanguage.g:961:1: ( ( rule__DirectedStatement__Alternatives_1_1 )? )
            // InternalDotLanguage.g:962:2: ( rule__DirectedStatement__Alternatives_1_1 )?
            {
             before(grammarAccess.getDirectedStatementAccess().getAlternatives_1_1()); 
            // InternalDotLanguage.g:963:2: ( rule__DirectedStatement__Alternatives_1_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=12)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDotLanguage.g:963:3: rule__DirectedStatement__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedStatement__Alternatives_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectedStatementAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__DirectedStatement__Group_1__1__Impl"


    // $ANTLR start "rule__UndirectedStatement__Group_0__0"
    // InternalDotLanguage.g:972:1: rule__UndirectedStatement__Group_0__0 : rule__UndirectedStatement__Group_0__0__Impl rule__UndirectedStatement__Group_0__1 ;
    public final void rule__UndirectedStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:976:1: ( rule__UndirectedStatement__Group_0__0__Impl rule__UndirectedStatement__Group_0__1 )
            // InternalDotLanguage.g:977:2: rule__UndirectedStatement__Group_0__0__Impl rule__UndirectedStatement__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__UndirectedStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedStatement__Group_0__1();

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
    // $ANTLR end "rule__UndirectedStatement__Group_0__0"


    // $ANTLR start "rule__UndirectedStatement__Group_0__0__Impl"
    // InternalDotLanguage.g:984:1: rule__UndirectedStatement__Group_0__0__Impl : ( ruleNodeDeclaration ) ;
    public final void rule__UndirectedStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:988:1: ( ( ruleNodeDeclaration ) )
            // InternalDotLanguage.g:989:1: ( ruleNodeDeclaration )
            {
            // InternalDotLanguage.g:989:1: ( ruleNodeDeclaration )
            // InternalDotLanguage.g:990:2: ruleNodeDeclaration
            {
             before(grammarAccess.getUndirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeDeclaration();

            state._fsp--;

             after(grammarAccess.getUndirectedStatementAccess().getNodeDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__UndirectedStatement__Group_0__0__Impl"


    // $ANTLR start "rule__UndirectedStatement__Group_0__1"
    // InternalDotLanguage.g:999:1: rule__UndirectedStatement__Group_0__1 : rule__UndirectedStatement__Group_0__1__Impl ;
    public final void rule__UndirectedStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1003:1: ( rule__UndirectedStatement__Group_0__1__Impl )
            // InternalDotLanguage.g:1004:2: rule__UndirectedStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedStatement__Group_0__1__Impl();

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
    // $ANTLR end "rule__UndirectedStatement__Group_0__1"


    // $ANTLR start "rule__UndirectedStatement__Group_0__1__Impl"
    // InternalDotLanguage.g:1010:1: rule__UndirectedStatement__Group_0__1__Impl : ( ( rule__UndirectedStatement__Alternatives_0_1 )? ) ;
    public final void rule__UndirectedStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1014:1: ( ( ( rule__UndirectedStatement__Alternatives_0_1 )? ) )
            // InternalDotLanguage.g:1015:1: ( ( rule__UndirectedStatement__Alternatives_0_1 )? )
            {
            // InternalDotLanguage.g:1015:1: ( ( rule__UndirectedStatement__Alternatives_0_1 )? )
            // InternalDotLanguage.g:1016:2: ( rule__UndirectedStatement__Alternatives_0_1 )?
            {
             before(grammarAccess.getUndirectedStatementAccess().getAlternatives_0_1()); 
            // InternalDotLanguage.g:1017:2: ( rule__UndirectedStatement__Alternatives_0_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=12)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDotLanguage.g:1017:3: rule__UndirectedStatement__Alternatives_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UndirectedStatement__Alternatives_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUndirectedStatementAccess().getAlternatives_0_1()); 

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
    // $ANTLR end "rule__UndirectedStatement__Group_0__1__Impl"


    // $ANTLR start "rule__UndirectedStatement__Group_1__0"
    // InternalDotLanguage.g:1026:1: rule__UndirectedStatement__Group_1__0 : rule__UndirectedStatement__Group_1__0__Impl rule__UndirectedStatement__Group_1__1 ;
    public final void rule__UndirectedStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1030:1: ( rule__UndirectedStatement__Group_1__0__Impl rule__UndirectedStatement__Group_1__1 )
            // InternalDotLanguage.g:1031:2: rule__UndirectedStatement__Group_1__0__Impl rule__UndirectedStatement__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__UndirectedStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedStatement__Group_1__1();

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
    // $ANTLR end "rule__UndirectedStatement__Group_1__0"


    // $ANTLR start "rule__UndirectedStatement__Group_1__0__Impl"
    // InternalDotLanguage.g:1038:1: rule__UndirectedStatement__Group_1__0__Impl : ( ruleUndirectedEdgeDeclaration ) ;
    public final void rule__UndirectedStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1042:1: ( ( ruleUndirectedEdgeDeclaration ) )
            // InternalDotLanguage.g:1043:1: ( ruleUndirectedEdgeDeclaration )
            {
            // InternalDotLanguage.g:1043:1: ( ruleUndirectedEdgeDeclaration )
            // InternalDotLanguage.g:1044:2: ruleUndirectedEdgeDeclaration
            {
             before(grammarAccess.getUndirectedStatementAccess().getUndirectedEdgeDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUndirectedEdgeDeclaration();

            state._fsp--;

             after(grammarAccess.getUndirectedStatementAccess().getUndirectedEdgeDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UndirectedStatement__Group_1__0__Impl"


    // $ANTLR start "rule__UndirectedStatement__Group_1__1"
    // InternalDotLanguage.g:1053:1: rule__UndirectedStatement__Group_1__1 : rule__UndirectedStatement__Group_1__1__Impl ;
    public final void rule__UndirectedStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1057:1: ( rule__UndirectedStatement__Group_1__1__Impl )
            // InternalDotLanguage.g:1058:2: rule__UndirectedStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedStatement__Group_1__1__Impl();

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
    // $ANTLR end "rule__UndirectedStatement__Group_1__1"


    // $ANTLR start "rule__UndirectedStatement__Group_1__1__Impl"
    // InternalDotLanguage.g:1064:1: rule__UndirectedStatement__Group_1__1__Impl : ( ( rule__UndirectedStatement__Alternatives_1_1 )? ) ;
    public final void rule__UndirectedStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1068:1: ( ( ( rule__UndirectedStatement__Alternatives_1_1 )? ) )
            // InternalDotLanguage.g:1069:1: ( ( rule__UndirectedStatement__Alternatives_1_1 )? )
            {
            // InternalDotLanguage.g:1069:1: ( ( rule__UndirectedStatement__Alternatives_1_1 )? )
            // InternalDotLanguage.g:1070:2: ( rule__UndirectedStatement__Alternatives_1_1 )?
            {
             before(grammarAccess.getUndirectedStatementAccess().getAlternatives_1_1()); 
            // InternalDotLanguage.g:1071:2: ( rule__UndirectedStatement__Alternatives_1_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=11 && LA16_0<=12)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDotLanguage.g:1071:3: rule__UndirectedStatement__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UndirectedStatement__Alternatives_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUndirectedStatementAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__UndirectedStatement__Group_1__1__Impl"


    // $ANTLR start "rule__NodeDeclaration__Group__0"
    // InternalDotLanguage.g:1080:1: rule__NodeDeclaration__Group__0 : rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 ;
    public final void rule__NodeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1084:1: ( rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 )
            // InternalDotLanguage.g:1085:2: rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1
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
    // InternalDotLanguage.g:1092:1: rule__NodeDeclaration__Group__0__Impl : ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) ) ;
    public final void rule__NodeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1096:1: ( ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) ) )
            // InternalDotLanguage.g:1097:1: ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) )
            {
            // InternalDotLanguage.g:1097:1: ( ( rule__NodeDeclaration__NodeNameAssignment_0 ) )
            // InternalDotLanguage.g:1098:2: ( rule__NodeDeclaration__NodeNameAssignment_0 )
            {
             before(grammarAccess.getNodeDeclarationAccess().getNodeNameAssignment_0()); 
            // InternalDotLanguage.g:1099:2: ( rule__NodeDeclaration__NodeNameAssignment_0 )
            // InternalDotLanguage.g:1099:3: rule__NodeDeclaration__NodeNameAssignment_0
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
    // InternalDotLanguage.g:1107:1: rule__NodeDeclaration__Group__1 : rule__NodeDeclaration__Group__1__Impl ;
    public final void rule__NodeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1111:1: ( rule__NodeDeclaration__Group__1__Impl )
            // InternalDotLanguage.g:1112:2: rule__NodeDeclaration__Group__1__Impl
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
    // InternalDotLanguage.g:1118:1: rule__NodeDeclaration__Group__1__Impl : ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? ) ;
    public final void rule__NodeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1122:1: ( ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? ) )
            // InternalDotLanguage.g:1123:1: ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? )
            {
            // InternalDotLanguage.g:1123:1: ( ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )? )
            // InternalDotLanguage.g:1124:2: ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )?
            {
             before(grammarAccess.getNodeDeclarationAccess().getOptionalAttributesAssignment_1()); 
            // InternalDotLanguage.g:1125:2: ( rule__NodeDeclaration__OptionalAttributesAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDotLanguage.g:1125:3: rule__NodeDeclaration__OptionalAttributesAssignment_1
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
    // InternalDotLanguage.g:1134:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1138:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalDotLanguage.g:1139:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDotLanguage.g:1146:1: rule__AttributeList__Group__0__Impl : ( '[' ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1150:1: ( ( '[' ) )
            // InternalDotLanguage.g:1151:1: ( '[' )
            {
            // InternalDotLanguage.g:1151:1: ( '[' )
            // InternalDotLanguage.g:1152:2: '['
            {
             before(grammarAccess.getAttributeListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDotLanguage.g:1161:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1165:1: ( rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 )
            // InternalDotLanguage.g:1166:2: rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDotLanguage.g:1173:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__AttributesAssignment_1 ) ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1177:1: ( ( ( rule__AttributeList__AttributesAssignment_1 ) ) )
            // InternalDotLanguage.g:1178:1: ( ( rule__AttributeList__AttributesAssignment_1 ) )
            {
            // InternalDotLanguage.g:1178:1: ( ( rule__AttributeList__AttributesAssignment_1 ) )
            // InternalDotLanguage.g:1179:2: ( rule__AttributeList__AttributesAssignment_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_1()); 
            // InternalDotLanguage.g:1180:2: ( rule__AttributeList__AttributesAssignment_1 )
            // InternalDotLanguage.g:1180:3: rule__AttributeList__AttributesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__AttributesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributesAssignment_1()); 

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
    // InternalDotLanguage.g:1188:1: rule__AttributeList__Group__2 : rule__AttributeList__Group__2__Impl rule__AttributeList__Group__3 ;
    public final void rule__AttributeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1192:1: ( rule__AttributeList__Group__2__Impl rule__AttributeList__Group__3 )
            // InternalDotLanguage.g:1193:2: rule__AttributeList__Group__2__Impl rule__AttributeList__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalDotLanguage.g:1200:1: rule__AttributeList__Group__2__Impl : ( ( rule__AttributeList__Group_2__0 )? ) ;
    public final void rule__AttributeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1204:1: ( ( ( rule__AttributeList__Group_2__0 )? ) )
            // InternalDotLanguage.g:1205:1: ( ( rule__AttributeList__Group_2__0 )? )
            {
            // InternalDotLanguage.g:1205:1: ( ( rule__AttributeList__Group_2__0 )? )
            // InternalDotLanguage.g:1206:2: ( rule__AttributeList__Group_2__0 )?
            {
             before(grammarAccess.getAttributeListAccess().getGroup_2()); 
            // InternalDotLanguage.g:1207:2: ( rule__AttributeList__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDotLanguage.g:1207:3: rule__AttributeList__Group_2__0
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
    // InternalDotLanguage.g:1215:1: rule__AttributeList__Group__3 : rule__AttributeList__Group__3__Impl ;
    public final void rule__AttributeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1219:1: ( rule__AttributeList__Group__3__Impl )
            // InternalDotLanguage.g:1220:2: rule__AttributeList__Group__3__Impl
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
    // InternalDotLanguage.g:1226:1: rule__AttributeList__Group__3__Impl : ( ']' ) ;
    public final void rule__AttributeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1230:1: ( ( ']' ) )
            // InternalDotLanguage.g:1231:1: ( ']' )
            {
            // InternalDotLanguage.g:1231:1: ( ']' )
            // InternalDotLanguage.g:1232:2: ']'
            {
             before(grammarAccess.getAttributeListAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDotLanguage.g:1242:1: rule__AttributeList__Group_2__0 : rule__AttributeList__Group_2__0__Impl rule__AttributeList__Group_2__1 ;
    public final void rule__AttributeList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1246:1: ( rule__AttributeList__Group_2__0__Impl rule__AttributeList__Group_2__1 )
            // InternalDotLanguage.g:1247:2: rule__AttributeList__Group_2__0__Impl rule__AttributeList__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDotLanguage.g:1254:1: rule__AttributeList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1258:1: ( ( ',' ) )
            // InternalDotLanguage.g:1259:1: ( ',' )
            {
            // InternalDotLanguage.g:1259:1: ( ',' )
            // InternalDotLanguage.g:1260:2: ','
            {
             before(grammarAccess.getAttributeListAccess().getCommaKeyword_2_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalDotLanguage.g:1269:1: rule__AttributeList__Group_2__1 : rule__AttributeList__Group_2__1__Impl ;
    public final void rule__AttributeList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1273:1: ( rule__AttributeList__Group_2__1__Impl )
            // InternalDotLanguage.g:1274:2: rule__AttributeList__Group_2__1__Impl
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
    // InternalDotLanguage.g:1280:1: rule__AttributeList__Group_2__1__Impl : ( ( rule__AttributeList__AttributesAssignment_2_1 ) ) ;
    public final void rule__AttributeList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1284:1: ( ( ( rule__AttributeList__AttributesAssignment_2_1 ) ) )
            // InternalDotLanguage.g:1285:1: ( ( rule__AttributeList__AttributesAssignment_2_1 ) )
            {
            // InternalDotLanguage.g:1285:1: ( ( rule__AttributeList__AttributesAssignment_2_1 ) )
            // InternalDotLanguage.g:1286:2: ( rule__AttributeList__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_2_1()); 
            // InternalDotLanguage.g:1287:2: ( rule__AttributeList__AttributesAssignment_2_1 )
            // InternalDotLanguage.g:1287:3: rule__AttributeList__AttributesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__AttributesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributesAssignment_2_1()); 

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


    // $ANTLR start "rule__LabelAttribute__Group__0"
    // InternalDotLanguage.g:1296:1: rule__LabelAttribute__Group__0 : rule__LabelAttribute__Group__0__Impl rule__LabelAttribute__Group__1 ;
    public final void rule__LabelAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1300:1: ( rule__LabelAttribute__Group__0__Impl rule__LabelAttribute__Group__1 )
            // InternalDotLanguage.g:1301:2: rule__LabelAttribute__Group__0__Impl rule__LabelAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LabelAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabelAttribute__Group__1();

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
    // $ANTLR end "rule__LabelAttribute__Group__0"


    // $ANTLR start "rule__LabelAttribute__Group__0__Impl"
    // InternalDotLanguage.g:1308:1: rule__LabelAttribute__Group__0__Impl : ( 'label=' ) ;
    public final void rule__LabelAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1312:1: ( ( 'label=' ) )
            // InternalDotLanguage.g:1313:1: ( 'label=' )
            {
            // InternalDotLanguage.g:1313:1: ( 'label=' )
            // InternalDotLanguage.g:1314:2: 'label='
            {
             before(grammarAccess.getLabelAttributeAccess().getLabelKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLabelAttributeAccess().getLabelKeyword_0()); 

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
    // $ANTLR end "rule__LabelAttribute__Group__0__Impl"


    // $ANTLR start "rule__LabelAttribute__Group__1"
    // InternalDotLanguage.g:1323:1: rule__LabelAttribute__Group__1 : rule__LabelAttribute__Group__1__Impl ;
    public final void rule__LabelAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1327:1: ( rule__LabelAttribute__Group__1__Impl )
            // InternalDotLanguage.g:1328:2: rule__LabelAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LabelAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__LabelAttribute__Group__1"


    // $ANTLR start "rule__LabelAttribute__Group__1__Impl"
    // InternalDotLanguage.g:1334:1: rule__LabelAttribute__Group__1__Impl : ( ( rule__LabelAttribute__LabelAssignment_1 ) ) ;
    public final void rule__LabelAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1338:1: ( ( ( rule__LabelAttribute__LabelAssignment_1 ) ) )
            // InternalDotLanguage.g:1339:1: ( ( rule__LabelAttribute__LabelAssignment_1 ) )
            {
            // InternalDotLanguage.g:1339:1: ( ( rule__LabelAttribute__LabelAssignment_1 ) )
            // InternalDotLanguage.g:1340:2: ( rule__LabelAttribute__LabelAssignment_1 )
            {
             before(grammarAccess.getLabelAttributeAccess().getLabelAssignment_1()); 
            // InternalDotLanguage.g:1341:2: ( rule__LabelAttribute__LabelAssignment_1 )
            // InternalDotLanguage.g:1341:3: rule__LabelAttribute__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LabelAttribute__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAttributeAccess().getLabelAssignment_1()); 

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
    // $ANTLR end "rule__LabelAttribute__Group__1__Impl"


    // $ANTLR start "rule__ColorAttribute__Group__0"
    // InternalDotLanguage.g:1350:1: rule__ColorAttribute__Group__0 : rule__ColorAttribute__Group__0__Impl rule__ColorAttribute__Group__1 ;
    public final void rule__ColorAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1354:1: ( rule__ColorAttribute__Group__0__Impl rule__ColorAttribute__Group__1 )
            // InternalDotLanguage.g:1355:2: rule__ColorAttribute__Group__0__Impl rule__ColorAttribute__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ColorAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorAttribute__Group__1();

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
    // $ANTLR end "rule__ColorAttribute__Group__0"


    // $ANTLR start "rule__ColorAttribute__Group__0__Impl"
    // InternalDotLanguage.g:1362:1: rule__ColorAttribute__Group__0__Impl : ( 'color=' ) ;
    public final void rule__ColorAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1366:1: ( ( 'color=' ) )
            // InternalDotLanguage.g:1367:1: ( 'color=' )
            {
            // InternalDotLanguage.g:1367:1: ( 'color=' )
            // InternalDotLanguage.g:1368:2: 'color='
            {
             before(grammarAccess.getColorAttributeAccess().getColorKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColorAttributeAccess().getColorKeyword_0()); 

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
    // $ANTLR end "rule__ColorAttribute__Group__0__Impl"


    // $ANTLR start "rule__ColorAttribute__Group__1"
    // InternalDotLanguage.g:1377:1: rule__ColorAttribute__Group__1 : rule__ColorAttribute__Group__1__Impl ;
    public final void rule__ColorAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1381:1: ( rule__ColorAttribute__Group__1__Impl )
            // InternalDotLanguage.g:1382:2: rule__ColorAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__ColorAttribute__Group__1"


    // $ANTLR start "rule__ColorAttribute__Group__1__Impl"
    // InternalDotLanguage.g:1388:1: rule__ColorAttribute__Group__1__Impl : ( ( rule__ColorAttribute__ColorAssignment_1 ) ) ;
    public final void rule__ColorAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1392:1: ( ( ( rule__ColorAttribute__ColorAssignment_1 ) ) )
            // InternalDotLanguage.g:1393:1: ( ( rule__ColorAttribute__ColorAssignment_1 ) )
            {
            // InternalDotLanguage.g:1393:1: ( ( rule__ColorAttribute__ColorAssignment_1 ) )
            // InternalDotLanguage.g:1394:2: ( rule__ColorAttribute__ColorAssignment_1 )
            {
             before(grammarAccess.getColorAttributeAccess().getColorAssignment_1()); 
            // InternalDotLanguage.g:1395:2: ( rule__ColorAttribute__ColorAssignment_1 )
            // InternalDotLanguage.g:1395:3: rule__ColorAttribute__ColorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColorAttribute__ColorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAttributeAccess().getColorAssignment_1()); 

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
    // $ANTLR end "rule__ColorAttribute__Group__1__Impl"


    // $ANTLR start "rule__DirectedEdgeDeclaration__Group__0"
    // InternalDotLanguage.g:1404:1: rule__DirectedEdgeDeclaration__Group__0 : rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1 ;
    public final void rule__DirectedEdgeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1408:1: ( rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1 )
            // InternalDotLanguage.g:1409:2: rule__DirectedEdgeDeclaration__Group__0__Impl rule__DirectedEdgeDeclaration__Group__1
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
    // InternalDotLanguage.g:1416:1: rule__DirectedEdgeDeclaration__Group__0__Impl : ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1420:1: ( ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) )
            // InternalDotLanguage.g:1421:1: ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            {
            // InternalDotLanguage.g:1421:1: ( ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            // InternalDotLanguage.g:1422:2: ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 
            // InternalDotLanguage.g:1423:2: ( rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 )
            // InternalDotLanguage.g:1423:3: rule__DirectedEdgeDeclaration__FirstNodeAssignment_0
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
    // InternalDotLanguage.g:1431:1: rule__DirectedEdgeDeclaration__Group__1 : rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2 ;
    public final void rule__DirectedEdgeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1435:1: ( rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2 )
            // InternalDotLanguage.g:1436:2: rule__DirectedEdgeDeclaration__Group__1__Impl rule__DirectedEdgeDeclaration__Group__2
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
    // InternalDotLanguage.g:1443:1: rule__DirectedEdgeDeclaration__Group__1__Impl : ( '->' ) ;
    public final void rule__DirectedEdgeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1447:1: ( ( '->' ) )
            // InternalDotLanguage.g:1448:1: ( '->' )
            {
            // InternalDotLanguage.g:1448:1: ( '->' )
            // InternalDotLanguage.g:1449:2: '->'
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDirectedEdgeDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // InternalDotLanguage.g:1458:1: rule__DirectedEdgeDeclaration__Group__2 : rule__DirectedEdgeDeclaration__Group__2__Impl ;
    public final void rule__DirectedEdgeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1462:1: ( rule__DirectedEdgeDeclaration__Group__2__Impl )
            // InternalDotLanguage.g:1463:2: rule__DirectedEdgeDeclaration__Group__2__Impl
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
    // InternalDotLanguage.g:1469:1: rule__DirectedEdgeDeclaration__Group__2__Impl : ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) ;
    public final void rule__DirectedEdgeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1473:1: ( ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) )
            // InternalDotLanguage.g:1474:1: ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            {
            // InternalDotLanguage.g:1474:1: ( ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            // InternalDotLanguage.g:1475:2: ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 
            // InternalDotLanguage.g:1476:2: ( rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 )
            // InternalDotLanguage.g:1476:3: rule__DirectedEdgeDeclaration__SecondNodeAssignment_2
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
    // InternalDotLanguage.g:1485:1: rule__UndirectedEdgeDeclaration__Group__0 : rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1 ;
    public final void rule__UndirectedEdgeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1489:1: ( rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1 )
            // InternalDotLanguage.g:1490:2: rule__UndirectedEdgeDeclaration__Group__0__Impl rule__UndirectedEdgeDeclaration__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDotLanguage.g:1497:1: rule__UndirectedEdgeDeclaration__Group__0__Impl : ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1501:1: ( ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) ) )
            // InternalDotLanguage.g:1502:1: ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            {
            // InternalDotLanguage.g:1502:1: ( ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 ) )
            // InternalDotLanguage.g:1503:2: ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeAssignment_0()); 
            // InternalDotLanguage.g:1504:2: ( rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 )
            // InternalDotLanguage.g:1504:3: rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0
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
    // InternalDotLanguage.g:1512:1: rule__UndirectedEdgeDeclaration__Group__1 : rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2 ;
    public final void rule__UndirectedEdgeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1516:1: ( rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2 )
            // InternalDotLanguage.g:1517:2: rule__UndirectedEdgeDeclaration__Group__1__Impl rule__UndirectedEdgeDeclaration__Group__2
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
    // InternalDotLanguage.g:1524:1: rule__UndirectedEdgeDeclaration__Group__1__Impl : ( '--' ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1528:1: ( ( '--' ) )
            // InternalDotLanguage.g:1529:1: ( '--' )
            {
            // InternalDotLanguage.g:1529:1: ( '--' )
            // InternalDotLanguage.g:1530:2: '--'
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUndirectedEdgeDeclarationAccess().getHyphenMinusHyphenMinusKeyword_1()); 

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
    // InternalDotLanguage.g:1539:1: rule__UndirectedEdgeDeclaration__Group__2 : rule__UndirectedEdgeDeclaration__Group__2__Impl ;
    public final void rule__UndirectedEdgeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1543:1: ( rule__UndirectedEdgeDeclaration__Group__2__Impl )
            // InternalDotLanguage.g:1544:2: rule__UndirectedEdgeDeclaration__Group__2__Impl
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
    // InternalDotLanguage.g:1550:1: rule__UndirectedEdgeDeclaration__Group__2__Impl : ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) ;
    public final void rule__UndirectedEdgeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1554:1: ( ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) ) )
            // InternalDotLanguage.g:1555:1: ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            {
            // InternalDotLanguage.g:1555:1: ( ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 ) )
            // InternalDotLanguage.g:1556:2: ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeAssignment_2()); 
            // InternalDotLanguage.g:1557:2: ( rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 )
            // InternalDotLanguage.g:1557:3: rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2
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
    // InternalDotLanguage.g:1566:1: rule__DotLanguage__GraphsAssignment : ( ( rule__DotLanguage__GraphsAlternatives_0 ) ) ;
    public final void rule__DotLanguage__GraphsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1570:1: ( ( ( rule__DotLanguage__GraphsAlternatives_0 ) ) )
            // InternalDotLanguage.g:1571:2: ( ( rule__DotLanguage__GraphsAlternatives_0 ) )
            {
            // InternalDotLanguage.g:1571:2: ( ( rule__DotLanguage__GraphsAlternatives_0 ) )
            // InternalDotLanguage.g:1572:3: ( rule__DotLanguage__GraphsAlternatives_0 )
            {
             before(grammarAccess.getDotLanguageAccess().getGraphsAlternatives_0()); 
            // InternalDotLanguage.g:1573:3: ( rule__DotLanguage__GraphsAlternatives_0 )
            // InternalDotLanguage.g:1573:4: rule__DotLanguage__GraphsAlternatives_0
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
    // InternalDotLanguage.g:1581:1: rule__Graph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Graph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1585:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1586:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1586:2: ( RULE_ID )
            // InternalDotLanguage.g:1587:3: RULE_ID
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
    // InternalDotLanguage.g:1596:1: rule__Graph__StatementsAssignment_3 : ( ruleUndirectedStatement ) ;
    public final void rule__Graph__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1600:1: ( ( ruleUndirectedStatement ) )
            // InternalDotLanguage.g:1601:2: ( ruleUndirectedStatement )
            {
            // InternalDotLanguage.g:1601:2: ( ruleUndirectedStatement )
            // InternalDotLanguage.g:1602:3: ruleUndirectedStatement
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
    // InternalDotLanguage.g:1611:1: rule__Digraph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Digraph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1615:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1616:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1616:2: ( RULE_ID )
            // InternalDotLanguage.g:1617:3: RULE_ID
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
    // InternalDotLanguage.g:1626:1: rule__Digraph__StatementsAssignment_3 : ( ruleDirectedStatement ) ;
    public final void rule__Digraph__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1630:1: ( ( ruleDirectedStatement ) )
            // InternalDotLanguage.g:1631:2: ( ruleDirectedStatement )
            {
            // InternalDotLanguage.g:1631:2: ( ruleDirectedStatement )
            // InternalDotLanguage.g:1632:3: ruleDirectedStatement
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
    // InternalDotLanguage.g:1641:1: rule__NodeDeclaration__NodeNameAssignment_0 : ( ruleNodeId ) ;
    public final void rule__NodeDeclaration__NodeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1645:1: ( ( ruleNodeId ) )
            // InternalDotLanguage.g:1646:2: ( ruleNodeId )
            {
            // InternalDotLanguage.g:1646:2: ( ruleNodeId )
            // InternalDotLanguage.g:1647:3: ruleNodeId
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
    // InternalDotLanguage.g:1656:1: rule__NodeDeclaration__OptionalAttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__NodeDeclaration__OptionalAttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1660:1: ( ( ruleAttributeList ) )
            // InternalDotLanguage.g:1661:2: ( ruleAttributeList )
            {
            // InternalDotLanguage.g:1661:2: ( ruleAttributeList )
            // InternalDotLanguage.g:1662:3: ruleAttributeList
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
    // InternalDotLanguage.g:1671:1: rule__NodeId__NameAssignment : ( RULE_ID ) ;
    public final void rule__NodeId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1675:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1676:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1676:2: ( RULE_ID )
            // InternalDotLanguage.g:1677:3: RULE_ID
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


    // $ANTLR start "rule__AttributeList__AttributesAssignment_1"
    // InternalDotLanguage.g:1686:1: rule__AttributeList__AttributesAssignment_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1690:1: ( ( ruleAttribute ) )
            // InternalDotLanguage.g:1691:2: ( ruleAttribute )
            {
            // InternalDotLanguage.g:1691:2: ( ruleAttribute )
            // InternalDotLanguage.g:1692:3: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributeList__AttributesAssignment_1"


    // $ANTLR start "rule__AttributeList__AttributesAssignment_2_1"
    // InternalDotLanguage.g:1701:1: rule__AttributeList__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1705:1: ( ( ruleAttribute ) )
            // InternalDotLanguage.g:1706:2: ( ruleAttribute )
            {
            // InternalDotLanguage.g:1706:2: ( ruleAttribute )
            // InternalDotLanguage.g:1707:3: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AttributeList__AttributesAssignment_2_1"


    // $ANTLR start "rule__LabelAttribute__LabelAssignment_1"
    // InternalDotLanguage.g:1716:1: rule__LabelAttribute__LabelAssignment_1 : ( RULE_ID ) ;
    public final void rule__LabelAttribute__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1720:1: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1721:2: ( RULE_ID )
            {
            // InternalDotLanguage.g:1721:2: ( RULE_ID )
            // InternalDotLanguage.g:1722:3: RULE_ID
            {
             before(grammarAccess.getLabelAttributeAccess().getLabelIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLabelAttributeAccess().getLabelIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LabelAttribute__LabelAssignment_1"


    // $ANTLR start "rule__ColorAttribute__ColorAssignment_1"
    // InternalDotLanguage.g:1731:1: rule__ColorAttribute__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__ColorAttribute__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1735:1: ( ( ruleColor ) )
            // InternalDotLanguage.g:1736:2: ( ruleColor )
            {
            // InternalDotLanguage.g:1736:2: ( ruleColor )
            // InternalDotLanguage.g:1737:3: ruleColor
            {
             before(grammarAccess.getColorAttributeAccess().getColorColorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorAttributeAccess().getColorColorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__ColorAttribute__ColorAssignment_1"


    // $ANTLR start "rule__DirectedEdgeDeclaration__FirstNodeAssignment_0"
    // InternalDotLanguage.g:1746:1: rule__DirectedEdgeDeclaration__FirstNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DirectedEdgeDeclaration__FirstNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1750:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1751:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1751:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1752:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1753:3: ( RULE_ID )
            // InternalDotLanguage.g:1754:4: RULE_ID
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


    // $ANTLR start "rule__DirectedEdgeDeclaration__SecondNodeAssignment_2"
    // InternalDotLanguage.g:1765:1: rule__DirectedEdgeDeclaration__SecondNodeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DirectedEdgeDeclaration__SecondNodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1769:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1770:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1770:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1771:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectedEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_2_0()); 
            // InternalDotLanguage.g:1772:3: ( RULE_ID )
            // InternalDotLanguage.g:1773:4: RULE_ID
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
    // InternalDotLanguage.g:1784:1: rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UndirectedEdgeDeclaration__FirstNodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1788:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1789:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1789:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1790:3: ( RULE_ID )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getFirstNodeNodeIdCrossReference_0_0()); 
            // InternalDotLanguage.g:1791:3: ( RULE_ID )
            // InternalDotLanguage.g:1792:4: RULE_ID
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


    // $ANTLR start "rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2"
    // InternalDotLanguage.g:1803:1: rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__UndirectedEdgeDeclaration__SecondNodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDotLanguage.g:1807:1: ( ( ( RULE_ID ) ) )
            // InternalDotLanguage.g:1808:2: ( ( RULE_ID ) )
            {
            // InternalDotLanguage.g:1808:2: ( ( RULE_ID ) )
            // InternalDotLanguage.g:1809:3: ( RULE_ID )
            {
             before(grammarAccess.getUndirectedEdgeDeclarationAccess().getSecondNodeNodeIdCrossReference_2_0()); 
            // InternalDotLanguage.g:1810:3: ( RULE_ID )
            // InternalDotLanguage.g:1811:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});

}