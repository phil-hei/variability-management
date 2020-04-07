/**
 */
package org.itea2.amalthea.variability.vacomo.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.itea2.amalthea.variability.vacomo.Port;
import org.itea2.amalthea.variability.vacomo.PortInstance;
import org.itea2.amalthea.variability.vacomo.ProvidedPort;
import org.itea2.amalthea.variability.vacomo.RequiredPort;
import org.itea2.amalthea.variability.vacomo.VacomoPackage;

/**
 * This is the item provider adapter for a {@link org.itea2.amalthea.variability.vacomo.PortInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortInstanceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addIsOptionalPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstance_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstance_name_feature", "_UI_PortInstance_type"),
				 VacomoPackage.Literals.PORT_INSTANCE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortInstance_isOptional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortInstance_isOptional_feature", "_UI_PortInstance_type"),
				 VacomoPackage.Literals.PORT_INSTANCE__IS_OPTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_PortInstance_type_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PortInstance_type_feature",
						"_UI_PortInstance_type"),
				VacomoPackage.Literals.PORT_INSTANCE__TYPE, true, false, true, null, null, null) {
			// only show Ports which exists on the referenced Component
			// Type
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				List<Object> choiceOfValues = new ArrayList<Object>();
				PortInstance portInstance = (PortInstance) object;
				System.out.println("guuuu" + portInstance.eCrossReferences());
//				if (portInstance.getComponentInstance() != null
//						&& portInstance.getComponentInstance().getType() != null) {
//					Component component = portInstance.getComponentInstance().getType();
//					if (!component.getPorts().isEmpty()) {
//						for (Port port : component.getPorts()) {
//							choiceOfValues.add(port);
//						}
//					}
//				}
				return choiceOfValues;
			}
		});
	}

	/**
	 * This returns PortInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public Object getImage(Object object) {
		PortInstance portInstance = (PortInstance) object;

		if (portInstance.getType() != null) {
			if (portInstance.getType() instanceof RequiredPort) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/RequiredPort"));
			} else if (portInstance.getType() instanceof ProvidedPort) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/ProvidedPort"));
			}
		}

		return overlayImage(object, getResourceLocator().getImage("full/obj16/PortInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		PortInstance portInstance = (PortInstance) object;
		StringBuilder str = new StringBuilder();

		if (portInstance.getName() != null && !portInstance.getName().isEmpty()) {
			str.append(portInstance.getName());
		} else {
			str.append("<Port Instance>");
		}
		if (portInstance.getType() != null) {
			Port port = portInstance.getType();
			if (!port.getName().isEmpty()) {
				str.append(" [type: ");
				str.append(port.getName());
			}
			if (port instanceof RequiredPort) {
				str.append(" (RequiredPort)");
			} else if (port instanceof ProvidedPort) {
				str.append(" (ProvidedPort)");
			}
		} else {
			str.append(" [type: ?");
		}
		if (portInstance.getIsOptional()) {
			str.append(" (Optional)]");
		} else {
			str.append("]");
		}

		return str.toString();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PortInstance.class)) {
			case VacomoPackage.PORT_INSTANCE__NAME:
			case VacomoPackage.PORT_INSTANCE__IS_OPTIONAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VacomoEditPlugin.INSTANCE;
	}

}
