package org.itea2.amalthea.variability.util.component;

import java.util.function.Predicate;

import org.itea2.amalthea.variability.vacomo.ComponentInstance;
import org.itea2.amalthea.variability.vacomo.Port;
import org.itea2.amalthea.variability.vacomo.PortInstance;
import org.itea2.amalthea.variability.vacomo.ProvidedPort;
import org.itea2.amalthea.variability.vacomo.RequiredPort;


public class PortScopingPredicate {

	/*
	 * Returns true if the port pair is matching, i.e. required <->
	 * requiredConfiguration
	 */
	public static Predicate<Object> getMismatchingPortPredicate(Port availablePort) {
		Predicate<Object> predicate = (o) -> {
			if (o instanceof PortInstance) {
				PortInstance portInstance = (PortInstance) o;
				if (portInstance.getType() != null) {
					Port port = portInstance.getType();
					if (availablePort instanceof RequiredPort && port instanceof ProvidedPort) {
						return true;
					} else if (availablePort instanceof ProvidedPort && port instanceof RequiredPort) {
						return true;
					}
				}
			}
			return false;
		};
		return predicate;
	}

	/*
	 * Returns true if the port instance hasn't be used in a connector yet
	 */
	public static Predicate<Object> getDuplicatePortPredicate() {
		Predicate<Object> predicate = (o) -> {
			if (o instanceof PortInstance) {
				PortInstance portInstance = (PortInstance) o;
				System.out.println("lalalala" + portInstance.eCrossReferences());
//				if (portInstance.getSourceConnector() == null && portInstance.getTargetConnector() == null
//						&& portInstance.getSourceVariableConnector() == null
//						&& portInstance.getTargetVariableConnector() == null) {
//					return true;
//				}
			}
			return false;
		};
		return predicate;
	}

	/*
	 * Returns true if two given port instances have the same optional value
	 */
	public static Predicate<Object> getOptionalComparismPortPredicate(PortInstance availablePortInstance) {
		Predicate<Object> predicate = (o) -> {
			if (o instanceof PortInstance) {
				PortInstance portInstance = (PortInstance) o;
				if ((availablePortInstance.getIsOptional() && portInstance.getIsOptional())
						|| (!availablePortInstance.getIsOptional() && !portInstance.getIsOptional())) {
					return true;
				}
			}
			return false;
		};
		return predicate;
	}

	/*
	 * Returns true if the ports component instance's is part of a variant
	 */
	public static Predicate<Object> getInvariablePortPredicate() {
		Predicate<Object> predicate = (o) -> {
			if (o instanceof PortInstance) {
				PortInstance portInstance = (PortInstance) o;
				if (portInstance.eContainer() != null && portInstance.eContainer() instanceof ComponentInstance) {
					ComponentInstance compInstance = (ComponentInstance) portInstance.eContainer();
					System.out.println(compInstance.eCrossReferences());
					// if (()
					// getVariant() != null) {
					// return true;
					// }
				}
			}
			return false;
		};
		return predicate;
	}

	/*
	 * All mismatching, duplicate and Delegation ports are filtered
	 */
	public static Predicate<Object> getCommonConnectorPredicate(Port availablePort,
			PortInstance availablePortInstance) {
		Predicate<Object> predicate = getMismatchingPortPredicate(availablePort).and(getDuplicatePortPredicate())
				.and(getOptionalComparismPortPredicate(availablePortInstance));
		return predicate;
	}

	/*
	 * All duplicate ports and ports which are not part of a variant are filtered
	 */
	public static Predicate<Object> getVariableConnectorPredicate(PortInstance availablePortInstance) {
		Predicate<Object> predicate = getInvariablePortPredicate().and(getDuplicatePortPredicate())
				.and(getOptionalComparismPortPredicate(availablePortInstance));
		return predicate;
	}
}
