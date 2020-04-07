/**
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
import org.itea2.amalthea.variability.ample.FeatureModel;

/**
 * This is the item provider adapter for a {@link org.itea2.amalthea.variability.ample.FeatureModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelItemProvider(AdapterFactory adapterFactory) {
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
			addScopePropertyDescriptor(object);
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
				 getString("_UI_FeatureModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureModel_name_feature", "_UI_FeatureModel_type"),
				 AmplePackage.Literals.FEATURE_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureModel_scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureModel_scope_feature", "_UI_FeatureModel_type"),
				 AmplePackage.Literals.FEATURE_MODEL__SCOPE,
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
			childrenFeatures.add(AmplePackage.Literals.FEATURE_MODEL__ROOT);
			childrenFeatures.add(AmplePackage.Literals.FEATURE_MODEL__CONSTRAINTS);
			childrenFeatures.add(AmplePackage.Literals.FEATURE_MODEL__PRODUCT_CONFIGURATIONS);
			childrenFeatures.add(AmplePackage.Literals.FEATURE_MODEL__FEATURE_TYPES);
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
	 * This returns FeatureModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureModel"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		FeatureModel fm = (FeatureModel) object;
		StringBuilder stb = new StringBuilder();

		if (fm.getName() != null && !fm.getName().isEmpty()) {
			stb.append(fm.getName());
		} else {
			stb.append("<Feature Model>");
		}

		return stb.toString();
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

		switch (notification.getFeatureID(FeatureModel.class)) {
			case AmplePackage.FEATURE_MODEL__NAME:
			case AmplePackage.FEATURE_MODEL__SCOPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmplePackage.FEATURE_MODEL__ROOT:
			case AmplePackage.FEATURE_MODEL__CONSTRAINTS:
			case AmplePackage.FEATURE_MODEL__PRODUCT_CONFIGURATIONS:
			case AmplePackage.FEATURE_MODEL__FEATURE_TYPES:
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
				(AmplePackage.Literals.FEATURE_MODEL__ROOT,
				 AmpleFactory.eINSTANCE.createMandatory()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.FEATURE_MODEL__CONSTRAINTS,
				 AmpleFactory.eINSTANCE.createFeatureConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.FEATURE_MODEL__PRODUCT_CONFIGURATIONS,
				 AmpleFactory.eINSTANCE.createProductConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(AmplePackage.Literals.FEATURE_MODEL__FEATURE_TYPES,
				 AmpleFactory.eINSTANCE.createFeatureType()));
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
