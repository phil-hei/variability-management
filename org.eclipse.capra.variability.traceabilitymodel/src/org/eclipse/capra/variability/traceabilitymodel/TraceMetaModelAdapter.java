package org.eclipse.capra.variability.traceabilitymodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.capra.core.helpers.ExtensionPointHelper;
import org.eclipse.capra.generic.artifactmodel.ArtifactWrapper;
import org.eclipse.capra.variability.Alternative2VariationPoint;
import org.eclipse.capra.variability.DomainTraceability;
import org.eclipse.capra.variability.Feature2Component;
import org.eclipse.capra.variability.Feature2ReqIf;
import org.eclipse.capra.variability.Reqif2Vacomo;
import org.eclipse.capra.variability.SPL_TraceModel;
import org.eclipse.capra.variability.Statechart2Cimpl;
import org.eclipse.capra.variability.Vacomo2Yakindu;
import org.eclipse.capra.variability.VariabilityFactory;
import org.eclipse.capra.variability.VariabilityPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.itea2.amalthea.variability.ample.Alternative;
import org.itea2.amalthea.variability.ample.AlternativeGroup;
import org.itea2.amalthea.variability.ample.Feature;
import org.itea2.amalthea.variability.vacomo.ComponentInstance;
import org.itea2.amalthea.variability.vacomo.VariationPoint;

public class TraceMetaModelAdapter implements org.eclipse.capra.core.adapters.TraceMetaModelAdapter {

	public TraceMetaModelAdapter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public EObject createModel() {
		return VariabilityFactory.eINSTANCE.createSPL_TraceModel();
	}

	@Override
	public EObject createTrace(EClass traceType, EObject traceModel, List<EObject> selection) {
		if (traceModel instanceof SPL_TraceModel) {
			SPL_TraceModel tm = (SPL_TraceModel) traceModel;
			EObject trace = VariabilityFactory.eINSTANCE.create(traceType);

			if (trace instanceof Feature2ReqIf) {
				for (EObject sel : selection) {
					if (sel instanceof Feature) {
						((Feature2ReqIf) trace).setFeature((Feature) sel);
					} else if (sel instanceof SpecHierarchy) {
						((Feature2ReqIf) trace).getSpec().add((SpecHierarchy) sel);
					}
				}
				tm.getDomainTraces().add((Feature2ReqIf) trace);
			}

			else if (trace instanceof Reqif2Vacomo) {
				for (EObject sel : selection) {
					if (sel instanceof SpecHierarchy) {
						((Reqif2Vacomo) trace).getSpec().add((SpecHierarchy) sel);
					} else if (sel instanceof ComponentInstance) {
						((Reqif2Vacomo) trace).getComponent().add((ComponentInstance) sel);
					}
				}
				tm.getDomainTraces().add((Reqif2Vacomo) trace);
			}

			else if (trace instanceof Vacomo2Yakindu) {
				for (EObject sel : selection) {
					String s = ExtensionPointHelper.getArtifactWrapperMetaModelAdapter().get()
							.getArtifactIdentifier(sel);
					if (sel instanceof ComponentInstance) {
						((Vacomo2Yakindu) trace).setComponent((ComponentInstance) sel);
					} else if (s.substring(s.length() - 3).equalsIgnoreCase("sct")) {
						((Vacomo2Yakindu) trace).setStatechart(sel);
					}
				}
				tm.getDomainTraces().add((Vacomo2Yakindu) trace);
			}

			else if (trace instanceof Statechart2Cimpl) {
				for (EObject sel : selection) {
					String s = ExtensionPointHelper.getArtifactWrapperMetaModelAdapter().get()
							.getArtifactIdentifier(sel);
					if (s.substring(s.length() - 1).equalsIgnoreCase("c")
							|| s.substring(s.length() - 1).equalsIgnoreCase("h")) {
						((Statechart2Cimpl) trace).getCElements().add((EObject) sel);
					} else if (s.substring(s.length() - 3).equalsIgnoreCase("sct")) {
						((Statechart2Cimpl) trace).setStatechart((EObject) sel);
					}
				}
				tm.getDomainTraces().add((Statechart2Cimpl) trace);
			}

			else if (trace instanceof Feature2Component) {
				for (EObject sel : selection) {
					if (sel instanceof Feature) {
						((Feature2Component) trace).setFeature((Feature) sel);
					} else if (sel instanceof ComponentInstance) {
						((Feature2Component) trace).getComponents().add((ComponentInstance) sel);
					}
				}
				tm.getDomainTraces().add((Feature2Component) trace);
			}

			else if (trace instanceof Alternative2VariationPoint) {
				for (EObject sel : selection) {
					if (sel instanceof AlternativeGroup) {
						((Alternative2VariationPoint) trace).setAltGroup((AlternativeGroup) sel);
					} else if (sel instanceof VariationPoint) {
						((Alternative2VariationPoint) trace).setVacomoVP((VariationPoint) sel);
					}
				}
				tm.getDomainTraces().add((Alternative2VariationPoint) trace);
			}

			return tm;
		}
		return null;

	}

	@Override
	public void deleteTrace(List<Connection> arg0, EObject arg1) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Connection> getAllTraceLinks(EObject arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<EClass> getAvailableTraceTypes(List<EObject> selection) {
		Collection<EClass> traceTypes = new ArrayList<>();
		int features = 0;
		int reqIfArtifacts = 0;
		int vacomoCompArtifacts = 0;
		int stateChartArtifacts = 0;
		int cElements = 0;
		int amaltheaCompArtifacts = 0;
		int alternativeFeature = 0;
		int variationPoint = 0;

		for (EObject obj : selection) {
			if (obj instanceof Feature) {
				features++;
			} else if (obj instanceof SpecHierarchy) {
				reqIfArtifacts++;
			} else if (obj instanceof ComponentInstance) {
				vacomoCompArtifacts++;
			}  else if (obj instanceof Alternative) {
				alternativeFeature++;
			} else if (obj instanceof VariationPoint) {
				variationPoint++;
			} else if (obj instanceof ArtifactWrapper) {
				ArtifactWrapper wrapper = (ArtifactWrapper) obj;
				String s = ExtensionPointHelper.getArtifactWrapperMetaModelAdapter().get()
						.getArtifactIdentifier(wrapper);
				if (s.substring(s.length() - 1).equalsIgnoreCase("c")
						|| s.substring(s.length() - 1).equalsIgnoreCase("h")) {
					cElements++;
				} else if (s.substring(s.length() - 3).equalsIgnoreCase("sct")) {
					stateChartArtifacts++;
				}
			}
		}

		// Refinement Traceability Links
		if (features == 1 && reqIfArtifacts >= 1) {
			traceTypes.add(VariabilityPackage.eINSTANCE.getFeature2ReqIf());
		}
		if (reqIfArtifacts >= 1 && vacomoCompArtifacts >= 1) {
			traceTypes.add(VariabilityPackage.eINSTANCE.getReqif2Vacomo());
		}
		if (vacomoCompArtifacts == 1 && stateChartArtifacts == 1) {
			traceTypes.add(VariabilityPackage.eINSTANCE.getVacomo2Yakindu());
		}
		if (stateChartArtifacts == 1 && cElements >= 1) {
			traceTypes.add(VariabilityPackage.eINSTANCE.getStatechart2Cimpl());
		}

		// Variability-related Traceability Links
		if (features == 1 && vacomoCompArtifacts >= 1) {
			traceTypes.add(VariabilityPackage.eINSTANCE.getFeature2Component());
		}
		if (alternativeFeature == 1 && variationPoint == 1) {
			traceTypes.add(VariabilityPackage.eINSTANCE.getAlternative2VariationPoint());
		}

		// Domain to Application Engineering
		if (reqIfArtifacts >= 2 && vacomoCompArtifacts == 0) {
			traceTypes.add(VariabilityPackage.eINSTANCE.getReqif2Reqif());
		}

		return traceTypes;
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject traceModel) {
		List<Connection> connections = new ArrayList<>();
		if (traceModel instanceof SPL_TraceModel) {
			SPL_TraceModel tm = (SPL_TraceModel) traceModel;

			if (element instanceof Feature2ReqIf) {
				Feature2ReqIf link = (Feature2ReqIf) element;
				if (link.getFeature() != null && link.getSpec() != null && !link.getSpec().isEmpty()) {
					List<EObject> list = new ArrayList<EObject>();
					list.add(link.getFeature());
					list.addAll(link.getSpec());
					connections.add(new Connection(link, list, link));
				}
			}

			else if (element instanceof Reqif2Vacomo) {
				Reqif2Vacomo link = (Reqif2Vacomo) element;
				if (link.getComponent() != null && !link.getComponent().isEmpty() && link.getSpec() != null
						&& !link.getSpec().isEmpty()) {
					List<EObject> list = new ArrayList<EObject>();
					list.addAll(link.getSpec());
					list.addAll(link.getComponent());
					connections.add(new Connection(link, list, link));
				}
			}

			else if (element instanceof Vacomo2Yakindu) {
				Vacomo2Yakindu link = (Vacomo2Yakindu) element;
				if (link.getComponent() != null && link.getStatechart() != null) {
					List<EObject> list = new ArrayList<EObject>();
					list.add(link.getStatechart());
					list.add(link.getComponent());
					connections.add(new Connection(link, list, link));
				}
			}

			else if (element instanceof Vacomo2Yakindu) {
				Vacomo2Yakindu link = (Vacomo2Yakindu) element;
				if (link.getComponent() != null && link.getStatechart() != null) {
					List<EObject> list = new ArrayList<EObject>();
					list.add(link.getStatechart());
					list.add(link.getComponent());
					connections.add(new Connection(link, list, link));
				}
			}

			else if (element instanceof Statechart2Cimpl) {
				Statechart2Cimpl link = (Statechart2Cimpl) element;
				if (link.getStatechart() != null && link.getCElements() != null && !link.getCElements().isEmpty()) {
					List<EObject> list = new ArrayList<EObject>();
					list.add(link.getStatechart());
					list.addAll(link.getCElements());
					connections.add(new Connection(link, list, link));
				}
			}

			else if (element instanceof Feature2Component) {
				Feature2Component link = (Feature2Component) element;
				if (link.getFeature() != null && link.getComponents() != null && !link.getComponents().isEmpty()) {
					List<EObject> list = new ArrayList<EObject>();
					list.add(link.getFeature());
					list.addAll(link.getComponents());
					connections.add(new Connection(link, list, link));
				}
			}

			else if (element instanceof Alternative2VariationPoint) {
				Alternative2VariationPoint link = (Alternative2VariationPoint) element;
				if (link.getAltGroup() != null && link.getVacomoVP() != null) {
					List<EObject> list = new ArrayList<EObject>();
					list.add(link.getAltGroup());
					list.add(link.getVacomoVP());
					connections.add(new Connection(link, list, link));
				}
			}


			for (DomainTraceability trace : tm.getDomainTraces()) {
				if (trace instanceof Feature2ReqIf) {
					Feature2ReqIf link = (Feature2ReqIf) trace;
					if (link.getFeature() != null && link.getSpec() != null && !link.getSpec().isEmpty()) {
						if (link.getFeature() == element) {
							List<EObject> list = new ArrayList<EObject>();
							list.addAll(link.getSpec());
							connections.add(new Connection(element, list, link));
						} else if (link.getSpec().contains(element)) {
							connections.add(new Connection(element, Arrays.asList(link.getFeature()), link));
						}
					}
				}

				else if (trace instanceof Reqif2Vacomo) {
					Reqif2Vacomo link = (Reqif2Vacomo) trace;
					if (link.getSpec() != null && !link.getSpec().isEmpty() && link.getComponent() != null
							&& !link.getComponent().isEmpty()) {
						if (link.getSpec().contains(element)) {
							List<EObject> list = new ArrayList<EObject>();
							list.addAll(link.getComponent());
							connections.add(new Connection(element, list, link));
						} else if (link.getComponent().contains(element)) {
							List<EObject> list = new ArrayList<EObject>();
							list.addAll(link.getSpec());
							connections.add(new Connection(element, list, link));
						}
					}
				}

				else if (trace instanceof Vacomo2Yakindu) {
					Vacomo2Yakindu link = (Vacomo2Yakindu) trace;
					if (link.getComponent() != null && link.getStatechart() != null) {
						if (link.getComponent() == element) {
							connections.add(new Connection(element, Arrays.asList(link.getStatechart()), link));
						} else if (link.getStatechart() == element) {
							connections.add(new Connection(element, Arrays.asList(link.getComponent()), link));
						}
					}
				}

				else if (trace instanceof Statechart2Cimpl) {
					Statechart2Cimpl link = (Statechart2Cimpl) trace;
					if (link.getStatechart() != null && link.getCElements() != null && !link.getCElements().isEmpty()) {
						if (link.getStatechart() == element) {
							List<EObject> list = new ArrayList<EObject>();
							list.addAll(link.getCElements());
							connections.add(new Connection(element, list, link));
						} else if (link.getCElements().contains(element)) {
							connections.add(new Connection(element, Arrays.asList(link.getStatechart()), link));
						}
					}
				}

				else if (trace instanceof Feature2Component) {
					Feature2Component link = (Feature2Component) trace;
					if (link.getFeature() != null && link.getComponents() != null && !link.getComponents().isEmpty()) {
						if (link.getFeature() == element) {
							List<EObject> list = new ArrayList<EObject>();
							list.addAll(link.getComponents());
							connections.add(new Connection(element, list, link));
						} else if (link.getComponents().contains(element)) {
							connections.add(new Connection(element, Arrays.asList(link.getFeature()), link));
						}
					}
				}

				else if (trace instanceof Alternative2VariationPoint) {
					Alternative2VariationPoint link = (Alternative2VariationPoint) trace;
					if (link.getAltGroup() != null && link.getVacomoVP() != null) {
						if (link.getAltGroup() == element) {
							List<EObject> list = new ArrayList<EObject>();
							list.add(link.getVacomoVP());
							connections.add(new Connection(element, list, link));
						} else if (link.getVacomoVP() == element) {
							connections.add(new Connection(element, Arrays.asList(link.getAltGroup()), link));
						}
					}
				}

			}

		}
		return connections;
	}

	private List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<Object> accumulator) {
		List<Connection> directElements = getConnectedElements(element, traceModel);
		List<Connection> allElements = new ArrayList<>();

		directElements.forEach(connection -> {
			if (!accumulator.contains(connection.getTlink())) {
				allElements.add(connection);
				accumulator.add(connection.getTlink());
				connection.getTargets().forEach(e -> {
					allElements.addAll(getTransitivelyConnectedElements(e, traceModel, accumulator));
				});
			}
		});

		return allElements;
	}

	@Override
	public List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel) {
		List<Object> accumulator = new ArrayList<>();
		return getTransitivelyConnectedElements(element, traceModel, accumulator);
	}

	@Override
	public boolean isThereATraceBetween(EObject first, EObject second, EObject traceModel) {
		if (traceModel instanceof SPL_TraceModel) {
			SPL_TraceModel vtm = (SPL_TraceModel) traceModel;
			if (first != second) {
				for (DomainTraceability trace : vtm.getDomainTraces()) {
					if (trace instanceof Feature2ReqIf) {
						return isThereATraceBetweenFeatureReqif((Feature2ReqIf) trace, first, second);
					} else if (trace instanceof Reqif2Vacomo) {
						return isThereATraceBetweenReqifVacomo((Reqif2Vacomo) trace, first, second);
					} else if (trace instanceof Vacomo2Yakindu) {
						return isThereATraceBetweenVacomoYakindu((Vacomo2Yakindu) trace, first, second);
					} else if (trace instanceof Statechart2Cimpl) {
						return isThereATraceBetweenStatechartsC((Statechart2Cimpl) trace, first, second);
					} else if (trace instanceof Feature2Component) {
						return isThereATraceBetweenFeatureComponents((Feature2Component) trace, first, second);
					} else if (trace instanceof Alternative2VariationPoint) {
						return isThereATraceBetweenAlternativeVP((Alternative2VariationPoint) trace, first, second);
					} 
				}
			}
		}
		return false;
	}

	/*
	private boolean isThereATraceBetweenVacomoAmalthea(Vacomo2Amalthea trace, EObject first, EObject second) {
		if ((trace.getVacomoComp() != null && (trace.getVacomoComp() == first || trace.getVacomoComp() == second))
				&& (trace.getAmaltheaComp() != null
						&& (trace.getAmaltheaComp() == first || trace.getAmaltheaComp() == second))) {
			return true;
		}
		return false;
	}*/

	private boolean isThereATraceBetweenAlternativeVP(Alternative2VariationPoint trace, EObject first, EObject second) {
		if ((trace.getAltGroup() != null && (trace.getAltGroup() == first || trace.getAltGroup() == second))
				&& (trace.getVacomoVP() != null && (trace.getVacomoVP() == first || trace.getVacomoVP() == second))) {
			return true;
		}
		return false;
	}

	private boolean isThereATraceBetweenFeatureComponents(Feature2Component trace, EObject first, EObject second) {
		if ((trace.getFeature() != null && (trace.getFeature() == first || trace.getFeature() == second))
				&& (trace.getComponents() != null && !trace.getComponents().isEmpty()
						&& (trace.getComponents().contains(first) || trace.getComponents().contains(second)))) {
			return true;
		}
		return false;
	}

	private boolean isThereATraceBetweenStatechartsC(Statechart2Cimpl trace, EObject first, EObject second) {
		if ((trace.getStatechart() != null && (trace.getStatechart() == first || trace.getStatechart() == second))
				&& (trace.getCElements() != null && !trace.getCElements().isEmpty()
						&& (trace.getCElements().contains(first) || trace.getCElements().contains(second)))) {
			return true;
		}
		return false;
	}

	private boolean isThereATraceBetweenVacomoYakindu(Vacomo2Yakindu trace, EObject first, EObject second) {
		if ((trace.getComponent() != null && (trace.getComponent() == first || trace.getComponent() == second))
				&& (trace.getStatechart() != null
						&& (trace.getStatechart() == first || trace.getStatechart() == second))) {
			return true;
		}
		return false;
	}

	private boolean isThereATraceBetweenReqifVacomo(Reqif2Vacomo trace, EObject first, EObject second) {
		if ((trace.getSpec() != null && !trace.getSpec().isEmpty()
				&& (trace.getSpec().contains(first) || trace.getSpec().contains(second)))
				&& (trace.getComponent() != null && trace.getComponent().isEmpty()
						&& (trace.getComponent().contains(first) || trace.getComponent().contains(second)))) {
			return true;
		}
		return false;
	}

	private boolean isThereATraceBetweenFeatureReqif(Feature2ReqIf trace, EObject first, EObject second) {
		if ((trace.getFeature() != null && (trace.getFeature() == first || trace.getFeature() == second))
				&& (trace.getSpec() != null && trace.getSpec().isEmpty()
						&& (trace.getSpec().contains(first) || trace.getSpec().contains(second)))) {
			return true;
		}
		return false;
	}

}
