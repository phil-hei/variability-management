/**
 */
package org.itea2.amalthea.variability.vacomo.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.itea2.amalthea.variability.util.component.PortScopingPredicate;
import org.itea2.amalthea.variability.vacomo.CommonConnector;
import org.itea2.amalthea.variability.vacomo.Port;
import org.itea2.amalthea.variability.vacomo.PortInstance;
import org.itea2.amalthea.variability.vacomo.VacomoPackage;

/**
 * This is the item provider adapter for a
 * {@link org.itea2.amalthea.variability.vacomo.CommonConnector} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CommonConnectorItemProvider extends ConnectorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CommonConnectorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommonConnector_source_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommonConnector_source_feature",
								"_UI_CommonConnector_type"),
						VacomoPackage.Literals.COMMON_CONNECTOR__SOURCE, true, false, true, null, null, null) {
					// restrict to connections of matching ports
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						List<Object> availablePortInstances = new ArrayList<Object>(super.getChoiceOfValues(object));
						CommonConnector con = (CommonConnector) object;
						if (con.getTarget() != null && con.getTarget().getType() != null) {
							PortInstance portInstance = con.getTarget();
							Port targetPort = con.getTarget().getType();
							return availablePortInstances.parallelStream()
									.filter(PortScopingPredicate.getCommonConnectorPredicate(targetPort, portInstance))
									.collect(Collectors.toList());
						} else {
							return availablePortInstances.parallelStream()
									.filter(PortScopingPredicate.getDuplicatePortPredicate())
									.collect(Collectors.toList());
						}
					}
				});
	}

	/**
	 * This adds a property descriptor for the Target feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommonConnector_target_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommonConnector_target_feature",
								"_UI_CommonConnector_type"),
						VacomoPackage.Literals.COMMON_CONNECTOR__TARGET, true, false, true, null, null, null) {
					// restrict to connections of matching ports
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						List<Object> availablePortInstances = new ArrayList<Object>(super.getChoiceOfValues(object));
						CommonConnector con = (CommonConnector) object;
						if (con.getSource() != null && con.getSource().getType() != null) {
							PortInstance portInstance = con.getSource();
							Port sourcePort = con.getSource().getType();
							return availablePortInstances.parallelStream()
									.filter(PortScopingPredicate.getCommonConnectorPredicate(sourcePort, portInstance))
									.collect(Collectors.toList());
						} else {
							return availablePortInstances.parallelStream()
									.filter(PortScopingPredicate.getDuplicatePortPredicate())
									.collect(Collectors.toList());
						}
					}
				});
	}

	/**
	 * This returns CommonConnector.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommonConnector"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		CommonConnector con = (CommonConnector) object;
		StringBuilder stb = new StringBuilder();

		if (con.getSource() != null && !con.getSource().getName().isEmpty()) {
			stb.append(con.getSource().getName());
		} else {
			stb.append("<Source>");
		}

		if (con.getTarget() != null && !con.getTarget().getName().isEmpty()) {
			stb.append(con.getTarget().getName());
		} else {
			stb.append("<Target>");
		}

		return stb.toString();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
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

}
