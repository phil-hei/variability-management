package org.itea2.amalthea.variability.util.configuration;

import org.eclipse.jface.viewers.LabelProvider;
import org.itea2.amalthea.variability.ample.Alternative;
import org.itea2.amalthea.variability.ample.AlternativeGroup;
import org.itea2.amalthea.variability.ample.Feature;
import org.itea2.amalthea.variability.ample.FeatureModel;
import org.itea2.amalthea.variability.ample.Mandatory;
import org.itea2.amalthea.variability.ample.Optional;
import org.itea2.amalthea.variability.ample.Or;
import org.itea2.amalthea.variability.ample.OrGroup;
import org.itea2.amalthea.variability.ample.ProductConfiguration;
import org.itea2.amalthea.variability.util.configuration.ProductConfigurationView.FeatureModelConfigurationHelper;

import java.net.URL;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class ProductConfigurationLabelProvider extends LabelProvider {
	final private String altGroupImg = "AlternativeGroup.png";
	final private String orGroupImg = "OrGroup.png";
	final private String optionalUnCheckedImg = "checkbox-optional-unchecked.png";
	final private String optionalCheckedImg = "checkbox-optional-checked.png";
	final private String checkedImg = "checkbox-checked.png";
	final private String unCheckedImg = "checkbox-unchecked.png";
	final private String unCheckedGrayImg = "checkbox-unchecked_gray.png";
	final private String checkedGrayMandatoryImg = "checkbox-checked_gray-Mandatory.png";
	final private String unCheckedGrayMandatoryImg = "checkbox-unchecked_gray-mandatory.png";
	final private String optionalUnCheckedGrayImg = "checkbox-unchecked_gray-optional.png";
	
	private ProductConfiguration pc;
	private FeatureModel fm;

	public ProductConfigurationLabelProvider(ProductConfiguration pc, FeatureModel fm) {
		super();
		this.pc = pc;
		this.fm = fm;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof Feature) {
			Feature feature = (Feature) element;
			if (feature.getName() != null && !feature.getName().isEmpty()) {
				return feature.getName();
			}
		} else if (element instanceof AlternativeGroup) {
			AlternativeGroup alternativeGroup = (AlternativeGroup) element;
			if (alternativeGroup.getName() != null && !alternativeGroup.getName().isEmpty()) {
				return alternativeGroup.getName();
			}
		} else if (element instanceof OrGroup) {
			OrGroup orGroup = (OrGroup) element;
			if (orGroup.getName() != null && !orGroup.getName().isEmpty()) {
				return orGroup.getName();
			}
		}
		return "<Name>";
	}

	@Override
	public Image getImage(final Object object) {
		if (object instanceof Mandatory) {
			return handleMandatoryImage(pc, (Mandatory) object);
		} else if (object instanceof Optional) {
			return handleOptionalImage(pc, (Optional) object);
		} else if (object instanceof Or) {
			return handleOrImage(pc, (Or) object);
		} else if (object instanceof Alternative) {
			return handleAlternativeImage(pc, (Alternative) object);
		} else if (object instanceof OrGroup) {
			return createImage(orGroupImg);
		} else if (object instanceof AlternativeGroup) {
			return createImage(altGroupImg);
		}
		return null;
	}

	private Image handleMandatoryImage(ProductConfiguration pc, Mandatory feature) {
		if (FeatureModelConfigurationHelper.isParentSelected(pc, feature)) {
			return createImage(checkedGrayMandatoryImg);
		} else {
			return createImage(unCheckedGrayMandatoryImg);
		}
	}

	private Image handleOptionalImage(ProductConfiguration pc, Optional feature) {
		if (FeatureModelConfigurationHelper.isParentSelected(pc, feature) && !FeatureModelConfigurationHelper.isExcludedThroughConstraint(pc, fm, feature)) {
			if (FeatureModelConfigurationHelper.isFeatureSelected(pc, feature)) {
				return createImage(optionalCheckedImg);
			} else {
				return createImage(optionalUnCheckedImg);
			}
		}
		return createImage(optionalUnCheckedGrayImg);
	}

	private Image handleOrImage(ProductConfiguration pc, Or feature) {
		if (FeatureModelConfigurationHelper.isParentSelected(pc, feature) && !FeatureModelConfigurationHelper.isExcludedThroughConstraint(pc, fm, feature)) {
			if (FeatureModelConfigurationHelper.isFeatureSelected(pc, feature)) {
				return createImage(checkedImg);
			} else if (FeatureModelConfigurationHelper.isOrFeatureSelectable(pc, feature)) {
				return createImage(unCheckedImg);
			} else {
				return createImage(unCheckedGrayImg);
			}
		}
		return createImage(unCheckedGrayImg);
	}

	private Image handleAlternativeImage(ProductConfiguration pc, Alternative feature) {
		if (FeatureModelConfigurationHelper.isParentSelected(pc, feature) && !FeatureModelConfigurationHelper.isExcludedThroughConstraint(pc, fm, feature)) {
			if (FeatureModelConfigurationHelper.isFeatureSelected(pc, feature)) {
				return createImage(checkedImg);
			} else if (FeatureModelConfigurationHelper.isAlternativeGroupEmpty(pc,
					(AlternativeGroup) feature.eContainer())) {
				return createImage(unCheckedImg);
			} else {
				return createImage(unCheckedGrayImg);
			}
		}
		return createImage(unCheckedGrayImg);
	}

	// Helper Method to load the images
	private Image createImage(String file) {
		Bundle bundle = FrameworkUtil.getBundle(ProductConfigurationLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path("icons/config/" + file), null);
		ImageDescriptor image = ImageDescriptor.createFromURL(url);
		return image.createImage();
	}
	
}
