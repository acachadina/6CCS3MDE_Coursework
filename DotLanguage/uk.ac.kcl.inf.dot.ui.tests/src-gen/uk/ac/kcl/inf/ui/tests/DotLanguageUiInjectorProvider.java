/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.kcl.inf.dot.ui.internal.DotActivator;

public class DotLanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DotActivator.getInstance().getInjector("uk.ac.kcl.inf.DotLanguage");
	}

}
