package org.itea2.amalthea.variability.util.configuration;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.itea2.amalthea.variability.ample.FeatureModel;
import org.itea2.amalthea.variability.ample.HardwareConfiguration;
import org.itea2.amalthea.variability.ample.HardwareVariabilityModel;
import org.itea2.amalthea.variability.ample.ProductConfiguration;

public class ConfigurationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (HandlerUtil.getCurrentSelection(event) instanceof TreeSelection) {
			TreeSelection selection = (TreeSelection) HandlerUtil.getCurrentSelection(event);

			Display display = Display.getDefault();
			Shell shell = new Shell(display);

			if (selection.getFirstElement() instanceof ProductConfiguration) {
				ProductConfiguration pc = (ProductConfiguration) selection.getFirstElement();
				if (pc.eContainer() != null) {
					ProductConfigurationView view = new ProductConfigurationView(shell, pc,
							(FeatureModel) pc.eContainer());
					view.open();
				}
			} else if (selection.getFirstElement() instanceof HardwareConfiguration) {
				HardwareConfiguration hc = (HardwareConfiguration) selection.getFirstElement();
				if (hc.eContainer() != null) {
					HardwareConfigurationView view = new HardwareConfigurationView(shell, hc,
							(HardwareVariabilityModel) hc.eContainer());
					view.open();
				}
			}
		}
		return null;
	}
}
