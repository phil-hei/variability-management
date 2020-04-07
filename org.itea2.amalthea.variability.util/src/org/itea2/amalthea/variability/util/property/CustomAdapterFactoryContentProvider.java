package org.itea2.amalthea.variability.util.property;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;

public class CustomAdapterFactoryContentProvider extends org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider{
	
	public CustomAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}

	protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
		return new CustomPropertySource(adapterFactory, object, itemPropertySource);	
	}
}
