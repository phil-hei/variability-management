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
import org.itea2.amalthea.variability.ample.VariationElement;

/**
 * This is the item provider adapter for a {@link org.itea2.amalthea.variability.ample.VariationElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariationElementItemProvider 
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
	public VariationElementItemProvider(AdapterFactory adapterFactory) {
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
			addAffectedElementPropertyDescriptor(object);
			addRemoveElementsPropertyDescriptor(object);
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
				 getString("_UI_VariationElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariationElement_name_feature", "_UI_VariationElement_type"),
				 AmplePackage.Literals.VARIATION_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Affected Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAffectedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariationElement_affectedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariationElement_affectedElement_feature", "_UI_VariationElement_type"),
				 AmplePackage.Literals.VARIATION_ELEMENT__AFFECTED_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remove Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemoveElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariationElement_removeElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariationElement_removeElements_feature", "_UI_VariationElement_type"),
				 AmplePackage.Literals.VARIATION_ELEMENT__REMOVE_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS);
			childrenFeatures.add(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT);
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
	 * This returns VariationElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariationElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VariationElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VariationElement_type") :
			getString("_UI_VariationElement_type") + " " + label;
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

		switch (notification.getFeatureID(VariationElement.class)) {
			case AmplePackage.VARIATION_ELEMENT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmplePackage.VARIATION_ELEMENT__ADD_ELEMENTS:
			case AmplePackage.VARIATION_ELEMENT__REPLACE_ELEMENT:
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
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createECU()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createMicrocontroller()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createRAM()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createROM()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createWatchdog()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createGenericComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS,
				 AmpleFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createECU()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createMicrocontroller()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createCore()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createRAM()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createROM()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createWatchdog()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createGenericComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT,
				 AmpleFactory.eINSTANCE.createPort()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AmplePackage.Literals.VARIATION_ELEMENT__ADD_ELEMENTS ||
			childFeature == AmplePackage.Literals.VARIATION_ELEMENT__REPLACE_ELEMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
