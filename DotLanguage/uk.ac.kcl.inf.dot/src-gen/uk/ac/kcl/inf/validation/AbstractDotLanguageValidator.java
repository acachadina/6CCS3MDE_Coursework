/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDotLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.ac.kcl.inf.dotLanguage.DotLanguagePackage.eINSTANCE);
		return result;
	}
}