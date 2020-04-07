/**
 * generated by Xtext 2.12.0
 */
package org.itea2.amalthea.variability.dependency.dependency;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchical Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getSystemPart <em>System Part</em>}</li>
 *   <li>{@link org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getStructureElements <em>Structure Elements</em>}</li>
 *   <li>{@link org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.itea2.amalthea.variability.dependency.dependency.DependencyPackage#getHierarchicalDependency()
 * @model
 * @generated
 */
public interface HierarchicalDependency extends EObject
{
  /**
   * Returns the value of the '<em><b>System Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Part</em>' containment reference.
   * @see #setSystemPart(SystemPart)
   * @see org.itea2.amalthea.variability.dependency.dependency.DependencyPackage#getHierarchicalDependency_SystemPart()
   * @model containment="true"
   * @generated
   */
  SystemPart getSystemPart();

  /**
   * Sets the value of the '{@link org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getSystemPart <em>System Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System Part</em>' containment reference.
   * @see #getSystemPart()
   * @generated
   */
  void setSystemPart(SystemPart value);

  /**
   * Returns the value of the '<em><b>Structure Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.itea2.amalthea.variability.dependency.dependency.StructureElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structure Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structure Elements</em>' containment reference list.
   * @see org.itea2.amalthea.variability.dependency.dependency.DependencyPackage#getHierarchicalDependency_StructureElements()
   * @model containment="true"
   * @generated
   */
  EList<StructureElement> getStructureElements();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.itea2.amalthea.variability.dependency.dependency.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.itea2.amalthea.variability.dependency.dependency.DependencyPackage#getHierarchicalDependency_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // HierarchicalDependency
