/**
 * *******************************************************************************
 *  Copyright (c) 2017 Dortmund University of Applied Sciences and Arts, Paderborn University and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.itea2.amalthea.variability.ample.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.itea2.amalthea.variability.ample.AmpleFactory;
import org.itea2.amalthea.variability.ample.AmplePackage;
import org.itea2.amalthea.variability.ample.HardwareElement;

/**
 * This is the item provider adapter for a {@link org.itea2.amalthea.variability.ample.HardwareElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareElementItemProvider 
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
	public HardwareElementItemProvider(AdapterFactory adapterFactory) {
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

			addIdentifierPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareElement_identifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareElement_identifier_feature", "_UI_HardwareElement_type"),
				 AmplePackage.Literals.HARDWARE_ELEMENT__IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareElement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareElement_description_feature", "_UI_HardwareElement_type"),
				 AmplePackage.Literals.HARDWARE_ELEMENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AmplePackage.Literals.HARDWARE_ELEMENT__CUSTOM_PROPERTY);
			childrenFeatures.add(AmplePackage.Literals.HARDWARE_ELEMENT__GENERIC_COMPONENTS);
			childrenFeatures.add(AmplePackage.Literals.HARDWARE_ELEMENT__PINS);
			childrenFeatures.add(AmplePackage.Literals.HARDWARE_ELEMENT__PORTS);
			childrenFeatures.add(AmplePackage.Literals.HARDWARE_ELEMENT__DEPENDENCIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HardwareElement)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_HardwareElement_type") :
			getString("_UI_HardwareElement_type") + " " + label;
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

		switch (notification.getFeatureID(HardwareElement.class)) {
			case AmplePackage.HARDWARE_ELEMENT__IDENTIFIER:
			case AmplePackage.HARDWARE_ELEMENT__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmplePackage.HARDWARE_ELEMENT__CUSTOM_PROPERTY:
			case AmplePackage.HARDWARE_ELEMENT__GENERIC_COMPONENTS:
			case AmplePackage.HARDWARE_ELEMENT__PINS:
			case AmplePackage.HARDWARE_ELEMENT__PORTS:
			case AmplePackage.HARDWARE_ELEMENT__DEPENDENCIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.HARDWARE_ELEMENT__CUSTOM_PROPERTY,
				 AmpleFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.HARDWARE_ELEMENT__GENERIC_COMPONENTS,
				 AmpleFactory.eINSTANCE.createGenericComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.HARDWARE_ELEMENT__PINS,
				 AmpleFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.HARDWARE_ELEMENT__PORTS,
				 AmpleFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.HARDWARE_ELEMENT__DEPENDENCIES,
				 AmpleFactory.eINSTANCE.createDependency()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AmpleEditPlugin.INSTANCE;
	}

}
