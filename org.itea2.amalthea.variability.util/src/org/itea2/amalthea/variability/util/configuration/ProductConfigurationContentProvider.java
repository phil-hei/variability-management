package org.itea2.amalthea.variability.util.configuration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.itea2.amalthea.variability.ample.AlternativeGroup;
import org.itea2.amalthea.variability.ample.Feature;
import org.itea2.amalthea.variability.ample.FeatureGroup;
import org.itea2.amalthea.variability.ample.FeatureModel;
import org.itea2.amalthea.variability.ample.OrGroup;

public class ProductConfigurationContentProvider implements ITreeContentProvider{
	@Override
	public Object[] getElements(final Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(final Object parentElement) {
		if (parentElement instanceof FeatureModel) {
			FeatureModel fm = (FeatureModel) parentElement;
			if (fm.getRoot() != null) {
				return new Object[] { fm.getRoot() };
			}
		} else if (parentElement instanceof Feature) {
			Feature feature = (Feature) parentElement;
			List<EObject> temp = new ArrayList<EObject>();
			if (feature.getSolitaryFeatures() != null && !feature.getSolitaryFeatures().isEmpty()) {
				temp.addAll(feature.getSolitaryFeatures());
			}
			if (feature.getFeatureGroups() != null && !feature.getFeatureGroups().isEmpty()) {
				temp.addAll(feature.getFeatureGroups());
			}
			return temp.toArray();
		} else if (parentElement instanceof AlternativeGroup) {
			AlternativeGroup alternativeGroup = (AlternativeGroup) parentElement;
			if (alternativeGroup.getAlternativeFeatures() != null
					&& !alternativeGroup.getAlternativeFeatures().isEmpty()) {
				return alternativeGroup.getAlternativeFeatures().toArray();
			}
		} else if (parentElement instanceof OrGroup) {
			OrGroup orGroup = (OrGroup) parentElement;
			if (orGroup.getOrFeatures() != null && !orGroup.getOrFeatures().isEmpty()) {
				return orGroup.getOrFeatures().toArray();
			}
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof Feature) {
			Feature feature = (Feature) element;
			if (feature.eContainer() != null) {
				return feature.eContainer();
			}
		} else if (element instanceof FeatureGroup) {
			FeatureGroup featureGroup = (FeatureGroup) element;
			if (featureGroup.eContainer() != null) {
				return featureGroup.eContainer();
			}
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof FeatureModel) {
			FeatureModel featureModel = (FeatureModel) element;
			if (featureModel.getRoot() != null) {
				return true;
			}
		}
		if (element instanceof Feature) {
			Feature feature = (Feature) element;
			if (!feature.getFeatureGroups().isEmpty() || !feature.getSolitaryFeatures().isEmpty()) {
				return true;
			}
		} else if (element instanceof AlternativeGroup) {
			AlternativeGroup altGroup = (AlternativeGroup) element;
			if (!altGroup.getAlternativeFeatures().isEmpty()) {
				return true;
			}
		} else if (element instanceof OrGroup) {
			OrGroup orGroup = (OrGroup) element;
			if (!orGroup.getOrFeatures().isEmpty()) {
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
