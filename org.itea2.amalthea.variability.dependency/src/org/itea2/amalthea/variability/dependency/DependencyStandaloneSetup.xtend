/*
 * generated by Xtext 2.12.0
 */
package org.itea2.amalthea.variability.dependency


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DependencyStandaloneSetup extends DependencyStandaloneSetupGenerated {

	def static void doSetup() {
		new DependencyStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}