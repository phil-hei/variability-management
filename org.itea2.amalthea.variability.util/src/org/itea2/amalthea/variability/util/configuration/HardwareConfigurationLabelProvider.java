package org.itea2.amalthea.variability.util.configuration;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.itea2.amalthea.variability.ample.HVM_VariationPoint;
import org.itea2.amalthea.variability.ample.HardwareConfiguration;
import org.itea2.amalthea.variability.ample.HardwareVariabilityModel;
import org.itea2.amalthea.variability.util.configuration.HardwareConfigurationView.HardwareConfigurationHelper;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import java.net.URL;

public class HardwareConfigurationLabelProvider extends LabelProvider {
	final private String vpChecked = "checkbox-checked-vp.png";
	final private String vpUnChecked = "checkbox-unchecked-vp.png";
	final private String vpUnChekedGray = "checkbox-unchecked_gray-vp.png";

	private HardwareConfiguration hc;

	public HardwareConfigurationLabelProvider(HardwareConfiguration hc) {
		super();
		this.hc = hc;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof HVM_VariationPoint) {
			HVM_VariationPoint vp = (HVM_VariationPoint) element;
			if (vp.getName() != null && !vp.getName().isEmpty()) {
				return vp.getName();
			}
		}
		return "<Name>";
	}

	@Override
	public Image getImage(final Object object) {
		if (object instanceof HVM_VariationPoint) {
			return handleVpImage((HVM_VariationPoint) object);
		}
		return null;
	}

	private Image handleVpImage(HVM_VariationPoint vp) {
		if (HardwareConfigurationHelper.isParentSelected(hc, vp) && !HardwareConfigurationHelper
				.isExcludedThroughConstraint(hc, (HardwareVariabilityModel) vp.eContainer(), vp)) {
			if (HardwareConfigurationHelper.isElementSelected(hc, vp)) {
				return createImage(vpChecked);
			} else {
				return createImage(vpUnChecked);
			}
		} else {
			return createImage(vpUnChekedGray);
		}
	}

	// Helper Method to load the images
	private Image createImage(String file) {
		Bundle bundle = FrameworkUtil.getBundle(HardwareConfigurationLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path("icons/config/" + file), null);
		ImageDescriptor image = ImageDescriptor.createFromURL(url);
		return image.createImage();
	}
}
