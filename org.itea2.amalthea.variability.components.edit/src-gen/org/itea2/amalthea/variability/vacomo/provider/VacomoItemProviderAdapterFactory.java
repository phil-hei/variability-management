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
package org.itea2.amalthea.variability.vacomo.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.itea2.amalthea.variability.vacomo.util.VacomoAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VacomoItemProviderAdapterFactory extends VacomoAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VacomoItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.VariableComponentModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableComponentModelItemProvider variableComponentModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.VariableComponentModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableComponentModelAdapter() {
		if (variableComponentModelItemProvider == null) {
			variableComponentModelItemProvider = new VariableComponentModelItemProvider(this);
		}

		return variableComponentModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.RequiredPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredPortItemProvider requiredPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.RequiredPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequiredPortAdapter() {
		if (requiredPortItemProvider == null) {
			requiredPortItemProvider = new RequiredPortItemProvider(this);
		}

		return requiredPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.ProvidedPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedPortItemProvider providedPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.ProvidedPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidedPortAdapter() {
		if (providedPortItemProvider == null) {
			providedPortItemProvider = new ProvidedPortItemProvider(this);
		}

		return providedPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.ComponentInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceItemProvider componentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInstanceAdapter() {
		if (componentInstanceItemProvider == null) {
			componentInstanceItemProvider = new ComponentInstanceItemProvider(this);
		}

		return componentInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.PortInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortInstanceItemProvider portInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortInstanceAdapter() {
		if (portInstanceItemProvider == null) {
			portInstanceItemProvider = new PortInstanceItemProvider(this);
		}

		return portInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.CommonConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonConnectorItemProvider commonConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.CommonConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommonConnectorAdapter() {
		if (commonConnectorItemProvider == null) {
			commonConnectorItemProvider = new CommonConnectorItemProvider(this);
		}

		return commonConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.VariableConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableConnectorItemProvider variableConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.VariableConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableConnectorAdapter() {
		if (variableConnectorItemProvider == null) {
			variableConnectorItemProvider = new VariableConnectorItemProvider(this);
		}

		return variableConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.VariationPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariationPointItemProvider variationPointItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.VariationPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariationPointAdapter() {
		if (variationPointItemProvider == null) {
			variationPointItemProvider = new VariationPointItemProvider(this);
		}

		return variationPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.itea2.amalthea.variability.vacomo.Variant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantItemProvider variantItemProvider;

	/**
	 * This creates an adapter for a {@link org.itea2.amalthea.variability.vacomo.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariantAdapter() {
		if (variantItemProvider == null) {
			variantItemProvider = new VariantItemProvider(this);
		}

		return variantItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (variableComponentModelItemProvider != null) variableComponentModelItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (requiredPortItemProvider != null) requiredPortItemProvider.dispose();
		if (providedPortItemProvider != null) providedPortItemProvider.dispose();
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (componentInstanceItemProvider != null) componentInstanceItemProvider.dispose();
		if (portInstanceItemProvider != null) portInstanceItemProvider.dispose();
		if (commonConnectorItemProvider != null) commonConnectorItemProvider.dispose();
		if (variableConnectorItemProvider != null) variableConnectorItemProvider.dispose();
		if (variationPointItemProvider != null) variationPointItemProvider.dispose();
		if (variantItemProvider != null) variantItemProvider.dispose();
	}

}