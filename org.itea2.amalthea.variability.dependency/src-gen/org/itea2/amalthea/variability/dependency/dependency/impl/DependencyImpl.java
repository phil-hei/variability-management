/**
 * generated by Xtext 2.12.0
 */
package org.itea2.amalthea.variability.dependency.dependency.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.itea2.amalthea.variability.dependency.dependency.Dependency;
import org.itea2.amalthea.variability.dependency.dependency.DependencyPackage;
import org.itea2.amalthea.variability.dependency.dependency.FlatDependency;
import org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.itea2.amalthea.variability.dependency.dependency.impl.DependencyImpl#getFlatDependency <em>Flat Dependency</em>}</li>
 *   <li>{@link org.itea2.amalthea.variability.dependency.dependency.impl.DependencyImpl#getHierarchicalDependencies <em>Hierarchical Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency
{
  /**
   * The cached value of the '{@link #getFlatDependency() <em>Flat Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlatDependency()
   * @generated
   * @ordered
   */
  protected FlatDependency flatDependency;

  /**
   * The cached value of the '{@link #getHierarchicalDependencies() <em>Hierarchical Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchicalDependencies()
   * @generated
   * @ordered
   */
  protected EList<HierarchicalDependency> hierarchicalDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DependencyPackage.Literals.DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlatDependency getFlatDependency()
  {
    return flatDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFlatDependency(FlatDependency newFlatDependency, NotificationChain msgs)
  {
    FlatDependency oldFlatDependency = flatDependency;
    flatDependency = newFlatDependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencyPackage.DEPENDENCY__FLAT_DEPENDENCY, oldFlatDependency, newFlatDependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlatDependency(FlatDependency newFlatDependency)
  {
    if (newFlatDependency != flatDependency)
    {
      NotificationChain msgs = null;
      if (flatDependency != null)
        msgs = ((InternalEObject)flatDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.DEPENDENCY__FLAT_DEPENDENCY, null, msgs);
      if (newFlatDependency != null)
        msgs = ((InternalEObject)newFlatDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.DEPENDENCY__FLAT_DEPENDENCY, null, msgs);
      msgs = basicSetFlatDependency(newFlatDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.DEPENDENCY__FLAT_DEPENDENCY, newFlatDependency, newFlatDependency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HierarchicalDependency> getHierarchicalDependencies()
  {
    if (hierarchicalDependencies == null)
    {
      hierarchicalDependencies = new EObjectContainmentEList<HierarchicalDependency>(HierarchicalDependency.class, this, DependencyPackage.DEPENDENCY__HIERARCHICAL_DEPENDENCIES);
    }
    return hierarchicalDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DependencyPackage.DEPENDENCY__FLAT_DEPENDENCY:
        return basicSetFlatDependency(null, msgs);
      case DependencyPackage.DEPENDENCY__HIERARCHICAL_DEPENDENCIES:
        return ((InternalEList<?>)getHierarchicalDependencies()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DependencyPackage.DEPENDENCY__FLAT_DEPENDENCY:
        return getFlatDependency();
      case DependencyPackage.DEPENDENCY__HIERARCHICAL_DEPENDENCIES:
        return getHierarchicalDependencies();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DependencyPackage.DEPENDENCY__FLAT_DEPENDENCY:
        setFlatDependency((FlatDependency)newValue);
        return;
      case DependencyPackage.DEPENDENCY__HIERARCHICAL_DEPENDENCIES:
        getHierarchicalDependencies().clear();
        getHierarchicalDependencies().addAll((Collection<? extends HierarchicalDependency>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DependencyPackage.DEPENDENCY__FLAT_DEPENDENCY:
        setFlatDependency((FlatDependency)null);
        return;
      case DependencyPackage.DEPENDENCY__HIERARCHICAL_DEPENDENCIES:
        getHierarchicalDependencies().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DependencyPackage.DEPENDENCY__FLAT_DEPENDENCY:
        return flatDependency != null;
      case DependencyPackage.DEPENDENCY__HIERARCHICAL_DEPENDENCIES:
        return hierarchicalDependencies != null && !hierarchicalDependencies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DependencyImpl