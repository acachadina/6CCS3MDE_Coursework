/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.inf.parser.antlr.internal.InternalDotLanguageParser;
import uk.ac.kcl.inf.services.DotLanguageGrammarAccess;

public class DotLanguageParser extends AbstractAntlrParser {

	@Inject
	private DotLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDotLanguageParser createParser(XtextTokenStream stream) {
		return new InternalDotLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DotLanguage";
	}

	public DotLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DotLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
