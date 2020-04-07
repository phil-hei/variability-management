package org.itea2.amalthea.variability.util.configuration;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.itea2.amalthea.variability.ample.Alternative;
import org.itea2.amalthea.variability.ample.AlternativeGroup;
import org.itea2.amalthea.variability.ample.AmplePackage;
import org.itea2.amalthea.variability.ample.ConstraintType;
import org.itea2.amalthea.variability.ample.Feature;
import org.itea2.amalthea.variability.ample.FeatureConstraint;
import org.itea2.amalthea.variability.ample.FeatureGroup;
import org.itea2.amalthea.variability.ample.FeatureModel;
import org.itea2.amalthea.variability.ample.Mandatory;
import org.itea2.amalthea.variability.ample.Optional;
import org.itea2.amalthea.variability.ample.Or;
import org.itea2.amalthea.variability.ample.OrGroup;
import org.itea2.amalthea.variability.ample.ProductConfiguration;

public class ProductConfigurationView extends Dialog {
	private ProductConfiguration pc;
	private FeatureModel fm;
	private TreeViewer viewer;

	protected ProductConfigurationView(Shell parentShell, ProductConfiguration pc, FeatureModel fm) {
		super(parentShell);
		this.fm = fm;
		this.pc = pc;
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));

		viewer = new TreeViewer(composite);
		viewer.setContentProvider(new ProductConfigurationContentProvider());
		viewer.setLabelProvider(new ProductConfigurationLabelProvider(pc, fm));
		initProductConfiguration(fm.getRoot());
		if (fm != null) {
			viewer.setInput(fm);
		}
		viewer.expandAll();

		Tree tree = viewer.getTree();
		tree.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(final MouseEvent e) {
			}

			@Override
			public void mouseDown(final MouseEvent e) {
				for (final TreeItem item : tree.getSelection()) {
					if (item.getImage() != null) {
						if ((e.x > item.getImageBounds(0).x)
								&& (e.x < (item.getImageBounds(0).x + item.getImage().getBounds().width))) {
							if ((e.y > item.getImageBounds(0).y)
									&& (e.y < (item.getImageBounds(0).y + item.getImage().getBounds().height))) {
								handleSelection(item.getData());
							}
						}
					}
				}
			}

			@Override
			public void mouseUp(final MouseEvent e) {
			}
		});

		return composite;
	}

	@Override
	protected void createButtonsForButtonBar(final Composite parent) {
		GridLayout layout = (GridLayout) parent.getLayout();
		layout.marginHeight = 0;
	}

	private void initProductConfiguration(Feature rootFeature) {
		addFeatureToProductConfiguration(rootFeature);
		checkChildFeatures(rootFeature);
	}

	private void handleSelection(Object object) {
		if (object instanceof Feature) {
			Feature feature = (Feature) object;
			if (!FeatureModelConfigurationHelper.isExcludedThroughConstraint(pc, fm, feature)) {
				if (feature instanceof Optional) {
					handleOptionalSelection((Optional) feature);
				} else if (feature instanceof Or) {
					handleOrSelection((Or) feature);
				} else if (feature instanceof Alternative) {
					handleAlternativeSelection((Alternative) feature);
				}
				if (FeatureModelConfigurationHelper.isFeatureSelected(pc, feature)) {
					checkTargetConstraint(feature);
				}
			}
			viewer.refresh(fm);
		}
	}

	private void handleOptionalSelection(Optional feature) {
		if (FeatureModelConfigurationHelper.isParentSelected(pc, feature)) {
			if (!FeatureModelConfigurationHelper.isFeatureSelected(pc, feature)) {
				addFeatureToProductConfiguration(feature);
				checkChildFeatures(feature);
			} else {
				removeFeatureFromProductConfiguration(feature);
				unCheckChildFeatures(feature);
			}
		}
	}

	private void handleOrSelection(Or feature) {
		if (FeatureModelConfigurationHelper.isParentSelected(pc, feature)) {
			if (!FeatureModelConfigurationHelper.isFeatureSelected(pc, feature)) {
				if (FeatureModelConfigurationHelper.isOrFeatureSelectable(pc, feature)) {
					addFeatureToProductConfiguration(feature);
				}
			} else {
				removeFeatureFromProductConfiguration(feature);
			}
		}
	}

	private void handleAlternativeSelection(Alternative feature) {
		if (FeatureModelConfigurationHelper.isParentSelected(pc, feature)) {
			if (!FeatureModelConfigurationHelper.isFeatureSelected(pc, feature)) {
				if (FeatureModelConfigurationHelper.isAlternativeGroupEmpty(pc,
						(AlternativeGroup) feature.eContainer())) {
					addFeatureToProductConfiguration(feature);
				}
			} else {
				removeFeatureFromProductConfiguration(feature);
			}
		}
	}

	private void checkChildFeatures(Feature parentFeature) {
		if (parentFeature.getSolitaryFeatures() != null && !parentFeature.getSolitaryFeatures().isEmpty()) {
			for (Feature child : parentFeature.getSolitaryFeatures()) {
				if (child instanceof Mandatory) {
					addFeatureToProductConfiguration(child);
					checkChildFeatures(child);
				}
			}
		}
	}

	private void unCheckChildFeatures(Feature feature) {
		if (feature.getSolitaryFeatures() != null && !feature.getSolitaryFeatures().isEmpty()) {
			for (Feature child : feature.getSolitaryFeatures()) {
				removeFeatureFromProductConfiguration(child);
				unCheckChildFeatures(child);
			}
		}
		if (feature.getFeatureGroups() != null && !feature.getFeatureGroups().isEmpty()) {
			for (FeatureGroup childGroup : feature.getFeatureGroups()) {
				if (childGroup instanceof AlternativeGroup) {
					AlternativeGroup altGroup = (AlternativeGroup) childGroup;
					if (altGroup.getAlternativeFeatures() != null && !altGroup.getAlternativeFeatures().isEmpty()) {
						for (Feature child : altGroup.getAlternativeFeatures()) {
							removeFeatureFromProductConfiguration(child);
							unCheckChildFeatures(child);
						}
					}
				} else if (childGroup instanceof OrGroup) {
					OrGroup orGroup = (OrGroup) childGroup;
					if (orGroup.getOrFeatures() != null && !orGroup.getOrFeatures().isEmpty()) {
						for (Feature child : orGroup.getOrFeatures()) {
							removeFeatureFromProductConfiguration(child);
							unCheckChildFeatures(child);
						}
					}
				}
			}
		}
	}

	private void checkTargetConstraint(Feature feature) {
		if (fm.getConstraints() != null && !fm.getConstraints().isEmpty()) {
			for (FeatureConstraint constraint : fm.getConstraints()) {
				if (constraint.getSource() != null && constraint.getTarget() != null) {
					if (constraint.getSource() == feature) {
						Feature targetFeature = constraint.getTarget();
						if (constraint.getType() == ConstraintType.EXCLUDE) {
							if (FeatureModelConfigurationHelper.isFeatureSelected(pc, targetFeature)) {
								removeFeatureFromProductConfiguration(targetFeature);
							}
						} else if (constraint.getType() == ConstraintType.REQUIRE) {
							if (!FeatureModelConfigurationHelper.isFeatureSelected(pc, targetFeature)) {
								if (targetFeature instanceof Optional) {
									addFeatureToProductConfiguration(targetFeature);
								}
								if (targetFeature instanceof Or) {
									if (FeatureModelConfigurationHelper.isOrFeatureSelectable(pc, (Or) targetFeature)
											&& FeatureModelConfigurationHelper.isParentSelected(pc, targetFeature)) {
										addFeatureToProductConfiguration(targetFeature);
									} else {
										MessageDialog.openError(Display.getDefault().getActiveShell(),
												"Invalid Product Configuration",
												getOrGroupConfigErrorMessage(targetFeature));
									}
								} else if (targetFeature instanceof Alternative) {
									if (FeatureModelConfigurationHelper.isAlternativeGroupEmpty(pc,
											(AlternativeGroup) targetFeature.eContainer())
											&& FeatureModelConfigurationHelper.isParentSelected(pc, targetFeature)) {
										addFeatureToProductConfiguration(targetFeature);
									} else {
										MessageDialog.openError(Display.getDefault().getActiveShell(),
												"Invalid Product Configuration",
												getAlternativeGroupConfigErrorMessage(targetFeature));
									}
								}
							}
						}
						viewer.refresh(targetFeature);
					}
				}
			}
		}
	}

	private String getOrGroupConfigErrorMessage(Feature targetFeature) {
		StringBuilder stb = new StringBuilder();
		stb.append("Unable to add Feature ");
		if (targetFeature.getName() != null && !targetFeature.getName().isEmpty()) {
			stb.append(targetFeature.getName());
		} else {
			stb.append("<Feature>");
		}
		stb.append(" to the Or Group ");
		if (targetFeature.eContainer() != null) {
			FeatureGroup featureGroup = (FeatureGroup) targetFeature.eContainer();
			if (featureGroup.getName() != null && !featureGroup.getName().isEmpty()) {
				stb.append(featureGroup.getName());
			} else {
				stb.append("<Or Group>");
			}
		}
		stb.append(".");
		if (!FeatureModelConfigurationHelper.isOrFeatureSelectable(pc, (Or) targetFeature)
				&& !FeatureModelConfigurationHelper.isParentSelected(pc, targetFeature)) {
			stb.append(
					" Please check cardinalities of the according group and select parent feature to fulfill constraint requirements.");
		} else if (!FeatureModelConfigurationHelper.isOrFeatureSelectable(pc, (Or) targetFeature)) {
			stb.append(" Please check cardinalities of the according group to fulfill constraint requirements.");
		} else if (!FeatureModelConfigurationHelper.isParentSelected(pc, targetFeature)) {
			stb.append(" Please select parent feature to fulfill constraint requirements.");
		}
		return stb.toString();
	}

	private String getAlternativeGroupConfigErrorMessage(Feature targetFeature) {
		StringBuilder stb = new StringBuilder();
		stb.append("Unable to add Feature ");
		if (targetFeature.getName() != null && !targetFeature.getName().isEmpty()) {
			stb.append(targetFeature.getName());
		} else {
			stb.append("<Feature>");
		}
		stb.append(" to the Alternative Group ");
		if (targetFeature.eContainer() != null) {
			FeatureGroup featureGroup = (FeatureGroup) targetFeature.eContainer();
			if (featureGroup.getName() != null && !featureGroup.getName().isEmpty()) {
				stb.append(featureGroup.getName());
			} else {
				stb.append("<Alternative Group>");
			}
		}
		stb.append(".");
		if (!FeatureModelConfigurationHelper.isAlternativeGroupEmpty(pc, (AlternativeGroup) targetFeature.eContainer())
				&& !FeatureModelConfigurationHelper.isParentSelected(pc, targetFeature)) {
			stb.append(
					" Please deselect all elements of the according group and select parent feature to fulfill constraint requirements.");
		} else if (!FeatureModelConfigurationHelper.isAlternativeGroupEmpty(pc,
				(AlternativeGroup) targetFeature.eContainer())) {
			stb.append(" Please deselect all elements of the according group to fulfill constraint requirements.");
		} else if (!FeatureModelConfigurationHelper.isParentSelected(pc, targetFeature)) {
			stb.append(" Please select parent feature to fulfill constraint requirements.");
		}
		return stb.toString();
	}

	/*
	 * -----------------Commands------------------
	 */

	private void addFeatureToProductConfiguration(Feature feature) {
		EditingDomain editDomain = org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain.getEditingDomainFor(feature);

		Command addFeatureCmd = AddCommand.create(editDomain, pc,
				AmplePackage.Literals.PRODUCT_CONFIGURATION__SELECTED_FEATURES, feature);
		editDomain.getCommandStack().execute(addFeatureCmd);
	}

	private void removeFeatureFromProductConfiguration(Feature feature) {
		EditingDomain editDomain = org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain.getEditingDomainFor(feature);

		Command removeFeatureCmd = RemoveCommand.create(editDomain, pc,
				AmplePackage.Literals.PRODUCT_CONFIGURATION__SELECTED_FEATURES, feature);
		editDomain.getCommandStack().execute(removeFeatureCmd);
	}

	protected static class FeatureModelConfigurationHelper {

		/*
		 * Returns true if a given Feature feature is part of a ProductConfiguration pc
		 */
		protected static boolean isFeatureSelected(ProductConfiguration pc, Feature feature) {
			return pc.getSelectedFeatures().contains(feature);
		}

		protected static boolean isOrFeatureSelectable(ProductConfiguration pc, Or orFeature) {
			if (orFeature.eContainer() != null && orFeature.eContainer() instanceof OrGroup) {
				OrGroup orGroup = (OrGroup) orFeature.eContainer();
				if (orGroup.getMax() > 0) {
					final Set<Or> orFeatures = new HashSet<>(orGroup.getOrFeatures());
					final Set<Feature> productConfig = new HashSet<>(pc.getSelectedFeatures());
					productConfig.retainAll(orFeatures);
					if (productConfig.size() >= orGroup.getMax()) {
						return false;
					}
				}
			}
			return true;
		}

		/*
		 * Returns true if none Feature of an AlternativeGroup has been selected yet
		 */
		protected static boolean isAlternativeGroupEmpty(ProductConfiguration pc, AlternativeGroup altGroup) {
			for (Alternative alt : altGroup.getAlternativeFeatures()) {
				if (isFeatureSelected(pc, alt)) {
					return false;
				}
			}
			return true;
		}

		/*
		 * Returns true if the parent Feature of a given Feature feature is part of the
		 * ProductConfiguration pc
		 */
		protected static boolean isParentSelected(ProductConfiguration pc, Feature feature) {
			if (feature.eContainer() != null && feature.eContainer() instanceof Feature) {
				Feature parentFeature = (Feature) feature.eContainer();
				if (isFeatureSelected(pc, parentFeature)) {
					return true;
				}
			} else if (feature.eContainer() != null && feature.eContainer() instanceof FeatureModel) {
				return true;
			} else if (feature.eContainer().eContainer() != null
					&& feature.eContainer().eContainer() instanceof Feature) {
				Feature parentFeature = (Feature) feature.eContainer().eContainer();
				if (isFeatureSelected(pc, parentFeature)) {
					return true;
				}
			}
			return false;
		}

		protected static boolean isExcludedThroughConstraint(ProductConfiguration pc, FeatureModel fm,
				Feature feature) {
			if (fm.getConstraints() != null && !fm.getConstraints().isEmpty()) {
				for (FeatureConstraint constraint : fm.getConstraints()) {
					if (constraint.getSource() != null && constraint.getTarget() != null) {
						if (constraint.getTarget() == feature && constraint.getType() == ConstraintType.EXCLUDE
								&& FeatureModelConfigurationHelper.isFeatureSelected(pc, constraint.getSource())) {
							return true;
						}
					}
				}
			}
			return false;
		}
	}
}
