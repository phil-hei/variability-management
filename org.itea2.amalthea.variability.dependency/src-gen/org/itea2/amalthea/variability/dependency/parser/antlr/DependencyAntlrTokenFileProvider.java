/*
 * generated by Xtext 2.12.0
 */
package org.itea2.amalthea.variability.dependency.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DependencyAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/itea2/amalthea/variability/dependency/parser/antlr/internal/InternalDependency.tokens");
	}
}