package org.itea2.amalthea.variability.util.property;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

public class CustomPropertySource extends PropertySource{
	private AdapterFactory adapterFactory;

	public CustomPropertySource(AdapterFactory adapterFactory, Object object, IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
		this.adapterFactory = adapterFactory;
	}

	protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
		return new CustomPropertyDescriptor(adapterFactory, object, itemPropertyDescriptor);
	}
}
