/**
 * generated by Xtext 2.12.0
 */
package org.itea2.amalthea.variability.dependency.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.itea2.amalthea.variability.dependency.DependencyRuntimeModule;
import org.itea2.amalthea.variability.dependency.DependencyStandaloneSetup;
import org.itea2.amalthea.variability.dependency.ide.DependencyIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DependencyIdeSetup extends DependencyStandaloneSetup {
  @Override
  public Injector createInjector() {
    DependencyRuntimeModule _dependencyRuntimeModule = new DependencyRuntimeModule();
    DependencyIdeModule _dependencyIdeModule = new DependencyIdeModule();
    return Guice.createInjector(Modules2.mixin(_dependencyRuntimeModule, _dependencyIdeModule));
  }
}
