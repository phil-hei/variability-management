package org.itea2.amalthea.variability.util.configuration;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Shell;
import org.itea2.amalthea.variability.ample.AmplePackage;
import org.itea2.amalthea.variability.ample.ConstraintType;
import org.itea2.amalthea.variability.ample.ECU;
import org.itea2.amalthea.variability.ample.HVM_VariationPoint;
import org.itea2.amalthea.variability.ample.HVM_VariationPointConstraint;
import org.itea2.amalthea.variability.ample.HardwareConfiguration;
import org.itea2.amalthea.variability.ample.HardwareVariabilityModel;
import org.itea2.amalthea.variability.ample.ProductConfiguration;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class HardwareConfigurationView extends Dialog {
	HardwareConfiguration hc;
	HardwareVariabilityModel hwm;
	TreeViewer viewer;

	protected HardwareConfigurationView(Shell parentShell, HardwareConfiguration hc, HardwareVariabilityModel hwm) {
		super(parentShell);
		this.hc = hc;
		this.hwm = hwm;
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));

		viewer = new TreeViewer(composite);
		viewer.setContentProvider(new HardwareConfigurationContentProvider());
		viewer.setLabelProvider(new HardwareConfigurationLabelProvider(hc));
		if (hwm != null) {
			viewer.setInput(hwm);
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

	private void handleSelection(Object object) {
		if (object instanceof HVM_VariationPoint) {
			HVM_VariationPoint vp = (HVM_VariationPoint) object;
			handleVpSelection(vp);
			if (HardwareConfigurationHelper.isElementSelected(hc, vp)) {
				checkTargetConstraint(vp);
			}
		}
		viewer.refresh();
	}

	private void handleVpSelection(HVM_VariationPoint vp) {
		if (HardwareConfigurationHelper.isParentSelected(hc, vp) && !HardwareConfigurationHelper
				.isExcludedThroughConstraint(hc, (HardwareVariabilityModel) vp.eContainer(), vp)) {
			if (!HardwareConfigurationHelper.isElementSelected(hc, vp)) {
				addElementToProductConfiguration(vp);
			} else {
				removeElementFromProductConfiguration(vp);
			}
		} else {
			removeElementFromProductConfiguration(vp);
		}
	}

	private void checkTargetConstraint(HVM_VariationPoint vp) {
		if (vp.eContainer() != null) {
			HardwareVariabilityModel hvm = (HardwareVariabilityModel) vp.eContainer();
			if (hvm.getVpConstraints() != null && !hvm.getVpConstraints().isEmpty()) {
				for (HVM_VariationPointConstraint vpCon : hvm.getVpConstraints()) {
					if (vpCon.getSource() != null && vpCon.getTarget() != null) {
						if (vpCon.getSource() == vp) {
							if (vpCon.getConstraintType() == ConstraintType.EXCLUDE) {
								if (HardwareConfigurationHelper.isElementSelected(hc, vpCon.getTarget())) {
									removeElementFromProductConfiguration(vpCon.getTarget());
								}
							} else if (vpCon.getConstraintType() == ConstraintType.REQUIRE) {
								if (!HardwareConfigurationHelper.isElementSelected(hc, vpCon.getTarget())) {
									addElementToProductConfiguration(vpCon.getTarget());
								}
							}
						}
					}
				}
			}
		}
	}

	/*
	 * -----------------Commands------------------
	 */

	private void addElementToProductConfiguration(EObject eObject) {
		EditingDomain editDomain = org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain.getEditingDomainFor(eObject);

		Command addCmd = null;

		if (eObject instanceof HVM_VariationPoint) {
			addCmd = AddCommand.create(editDomain, hc, AmplePackage.Literals.HARDWARE_CONFIGURATION__SELECTED_VPS,
					eObject);
		}

		if (addCmd != null) {
			editDomain.getCommandStack().execute(addCmd);
		}
	}

	private void removeElementFromProductConfiguration(EObject eObject) {
		EditingDomain editDomain = org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain.getEditingDomainFor(eObject);

		Command removeCmd = null;

		if (eObject instanceof HVM_VariationPoint) {
			removeCmd = RemoveCommand.create(editDomain, hc, AmplePackage.Literals.HARDWARE_CONFIGURATION__SELECTED_VPS,
					eObject);
		}

		if (removeCmd != null) {
			editDomain.getCommandStack().execute(removeCmd);
		}

		if (eObject.eContents() != null && !eObject.eContents().isEmpty()) {
			for (EObject childEObject : eObject.eContents()) {
				removeElementFromProductConfiguration(childEObject);
			}
		}
	}

	protected static class HardwareConfigurationHelper {

		/*
		 * Returns true if a given EObject is selected
		 */
		protected static boolean isElementSelected(HardwareConfiguration hc, EObject object) {
			return hc.getSelectedVPs().contains(object);
		}

		public static boolean isExcludedThroughConstraint(HardwareConfiguration hc, HardwareVariabilityModel hvm,
				HVM_VariationPoint vp) {
			if (hvm.getVpConstraints() != null && !hvm.getVpConstraints().isEmpty()) {
				for (HVM_VariationPointConstraint vpCon : hvm.getVpConstraints()) {
					if (vpCon.getSource() != null && vpCon.getTarget() != null) {
						if (vpCon.getTarget() == vp && vpCon.getConstraintType() == ConstraintType.EXCLUDE
								&& isElementSelected(hc, vpCon.getSource())) {
							return true;
						}
					}
				}
			}
			return false;
		}

		/*
		 * Returns true if the Parent of a given EObject is selected.
		 */
		protected static boolean isParentSelected(HardwareConfiguration hc, EObject eObject) {
			if (eObject.eContainer() != null && isElementSelected(hc, eObject.eContainer())) {
				return true;
			}
			return false;
		}
	}

}
