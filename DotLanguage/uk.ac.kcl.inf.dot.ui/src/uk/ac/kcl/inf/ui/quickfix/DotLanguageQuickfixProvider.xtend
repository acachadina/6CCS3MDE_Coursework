/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import uk.ac.kcl.inf.validation.DotLanguageValidator
import org.eclipse.xtext.ui.editor.quickfix.Fix

/** 
 * Custom quickfixes.
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class DotLanguageQuickfixProvider extends DefaultQuickfixProvider { 	

	@Fix(DotLanguageValidator.MULTIPLE_NODE_DECLARATION_GRAPH)
	def removeDeclarationGraph(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Remove duplicate declaration', 
		'Remove the node declaration which is duplicated in the code. ', null) [
			context |
			val xtextDocument = context.xtextDocument
//			val duplicateDeclaration = xtextDocument.get(issue.offset, issue.length)
			xtextDocument.replace(issue.offset, issue.length, "")
		]
	}
	
	@Fix(DotLanguageValidator.MULTIPLE_NODE_DECLARATION_DIGRAPH)
	def removeDeclarationDigraph(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Remove duplicate declaration', 
		'Remove the node declaration which is duplicated in the code. ', null) [
			context |
			val xtextDocument = context.xtextDocument
//			val duplicateDeclaration = xtextDocument.get(issue.offset, issue.length)
			xtextDocument.replace(issue.offset, issue.length, "")
		]
	}
}
