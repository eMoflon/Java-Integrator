/*
 * generated by Xtext 2.25.0
 */
package org.xtext.simplejava.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SimpleJavaAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/simplejava/parser/antlr/internal/InternalSimpleJava.tokens");
	}
}
