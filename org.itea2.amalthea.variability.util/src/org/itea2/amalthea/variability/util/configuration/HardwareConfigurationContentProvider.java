package org.itea2.amalthea.variability.util.configuration;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.itea2.amalthea.variability.ample.HVM_VariationPoint;
import org.itea2.amalthea.variability.ample.HardwareVariabilityModel;

public class HardwareConfigurationContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof HardwareVariabilityModel) {
			HardwareVariabilityModel hwm = (HardwareVariabilityModel) parentElement;
			if (hwm.getVariationPoints() != null && !hwm.getVariationPoints().isEmpty()) {
				return hwm.getVariationPoints().toArray();
			}
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof HVM_VariationPoint) {
			HVM_VariationPoint vp = (HVM_VariationPoint) element;
			if (vp.eContainer() != null) {
				return vp.eContainer();
			}
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof HardwareVariabilityModel) {
			HardwareVariabilityModel hwm = (HardwareVariabilityModel) element;
			if (hwm.getVariationPoints() != null && !hwm.getVariationPoints().isEmpty()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

}
