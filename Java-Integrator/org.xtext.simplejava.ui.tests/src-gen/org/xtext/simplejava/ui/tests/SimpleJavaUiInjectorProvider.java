/*
 * generated by Xtext 2.25.0
 */
package org.xtext.simplejava.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.simplejava.ui.internal.SimplejavaActivator;

public class SimpleJavaUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SimplejavaActivator.getInstance().getInjector("org.xtext.simplejava.SimpleJava");
	}

}
