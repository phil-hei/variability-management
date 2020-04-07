/**
 * generated by Xtext 2.12.0
 */
package org.itea2.amalthea.variability.dependency.dependency;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.itea2.amalthea.variability.dependency.dependency.DependencyFactory
 * @model kind="package"
 * @generated
 */
public interface DependencyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dependency";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.itea2.org/amalthea/variability/dependency/Dependency";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dependency";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DependencyPackage eINSTANCE = org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl.init();

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyImpl
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 0;

  /**
   * The feature id for the '<em><b>Flat Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__FLAT_DEPENDENCY = 0;

  /**
   * The feature id for the '<em><b>Hierarchical Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__HIERARCHICAL_DEPENDENCIES = 1;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.FlatDependencyImpl <em>Flat Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.FlatDependencyImpl
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getFlatDependency()
   * @generated
   */
  int FLAT_DEPENDENCY = 1;

  /**
   * The feature id for the '<em><b>System Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAT_DEPENDENCY__SYSTEM_PART = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAT_DEPENDENCY__TYPE = 1;

  /**
   * The number of structural features of the '<em>Flat Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAT_DEPENDENCY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.HierarchicalDependencyImpl <em>Hierarchical Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.HierarchicalDependencyImpl
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getHierarchicalDependency()
   * @generated
   */
  int HIERARCHICAL_DEPENDENCY = 2;

  /**
   * The feature id for the '<em><b>System Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHICAL_DEPENDENCY__SYSTEM_PART = 0;

  /**
   * The feature id for the '<em><b>Structure Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHICAL_DEPENDENCY__STRUCTURE_ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHICAL_DEPENDENCY__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Hierarchical Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHICAL_DEPENDENCY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.SystemPartImpl <em>System Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.SystemPartImpl
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getSystemPart()
   * @generated
   */
  int SYSTEM_PART = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_PART__NAME = 0;

  /**
   * The number of structural features of the '<em>System Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.TypeImpl
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.StructureElementImpl <em>Structure Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.StructureElementImpl
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getStructureElement()
   * @generated
   */
  int STRUCTURE_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Structure Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.PropertyImpl
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Comparism Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__COMPARISM_OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DESCRIPTION = 3;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DescriptionImpl
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.PropertyValueImpl <em>Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.PropertyValueImpl
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getPropertyValue()
   * @generated
   */
  int PROPERTY_VALUE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.itea2.amalthea.variability.dependency.dependency.ComparismOperator <em>Comparism Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.itea2.amalthea.variability.dependency.dependency.ComparismOperator
   * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getComparismOperator()
   * @generated
   */
  int COMPARISM_OPERATOR = 9;


  /**
   * Returns the meta object for class '{@link org.itea2.amalthea.variability.dependency.dependency.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the containment reference '{@link org.itea2.amalthea.variability.dependency.dependency.Dependency#getFlatDependency <em>Flat Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Flat Dependency</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Dependency#getFlatDependency()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_FlatDependency();

  /**
   * Returns the meta object for the containment reference list '{@link org.itea2.amalthea.variability.dependency.dependency.Dependency#getHierarchicalDependencies <em>Hierarchical Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hierarchical Dependencies</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Dependency#getHierarchicalDependencies()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_HierarchicalDependencies();

  /**
   * Returns the meta object for class '{@link org.itea2.amalthea.variability.dependency.dependency.FlatDependency <em>Flat Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flat Dependency</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.FlatDependency
   * @generated
   */
  EClass getFlatDependency();

  /**
   * Returns the meta object for the containment reference '{@link org.itea2.amalthea.variability.dependency.dependency.FlatDependency#getSystemPart <em>System Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System Part</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.FlatDependency#getSystemPart()
   * @see #getFlatDependency()
   * @generated
   */
  EReference getFlatDependency_SystemPart();

  /**
   * Returns the meta object for the containment reference '{@link org.itea2.amalthea.variability.dependency.dependency.FlatDependency#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.FlatDependency#getType()
   * @see #getFlatDependency()
   * @generated
   */
  EReference getFlatDependency_Type();

  /**
   * Returns the meta object for class '{@link org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency <em>Hierarchical Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hierarchical Dependency</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency
   * @generated
   */
  EClass getHierarchicalDependency();

  /**
   * Returns the meta object for the containment reference '{@link org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getSystemPart <em>System Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System Part</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getSystemPart()
   * @see #getHierarchicalDependency()
   * @generated
   */
  EReference getHierarchicalDependency_SystemPart();

  /**
   * Returns the meta object for the containment reference list '{@link org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getStructureElements <em>Structure Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Structure Elements</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getStructureElements()
   * @see #getHierarchicalDependency()
   * @generated
   */
  EReference getHierarchicalDependency_StructureElements();

  /**
   * Returns the meta object for the containment reference list '{@link org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.HierarchicalDependency#getProperties()
   * @see #getHierarchicalDependency()
   * @generated
   */
  EReference getHierarchicalDependency_Properties();

  /**
   * Returns the meta object for class '{@link org.itea2.amalthea.variability.dependency.dependency.SystemPart <em>System Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Part</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.SystemPart
   * @generated
   */
  EClass getSystemPart();

  /**
   * Returns the meta object for the attribute '{@link org.itea2.amalthea.variability.dependency.dependency.SystemPart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.SystemPart#getName()
   * @see #getSystemPart()
   * @generated
   */
  EAttribute getSystemPart_Name();

  /**
   * Returns the meta object for class '{@link org.itea2.amalthea.variability.dependency.dependency.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.itea2.amalthea.variability.dependency.dependency.Type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Type#getType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Type();

  /**
   * Returns the meta object for class '{@link org.itea2.amalthea.variability.dependency.dependency.StructureElement <em>Structure Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Element</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.StructureElement
   * @generated
   */
  EClass getStructureElement();

  /**
   * Returns the meta object for the attribute '{@link org.itea2.amalthea.variability.dependency.dependency.StructureElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.StructureElement#getName()
   * @see #getStructureElement()
   * @generated
   */
  EAttribute getStructureElement_Name();

  /**
   * Returns the meta object for class '{@link org.itea2.amalthea.variability.dependency.dependency.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.itea2.amalthea.variability.dependency.dependency.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link org.itea2.amalthea.variability.dependency.dependency.Property#getComparismOperator <em>Comparism Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comparism Operator</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Property#getComparismOperator()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_ComparismOperator();

  /**
   * Returns the meta object for the containment reference '{@link org.itea2.amalthea.variability.dependency.dependency.Property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Property#getValue()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.itea2.amalthea.variability.dependency.dependency.Property#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Property#getDescription()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Description();

  /**
   * Returns the meta object for class '{@link org.itea2.amalthea.variability.dependency.dependency.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the attribute '{@link org.itea2.amalthea.variability.dependency.dependency.Description#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.Description#getName()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Name();

  /**
   * Returns the meta object for class '{@link org.itea2.amalthea.variability.dependency.dependency.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Value</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.PropertyValue
   * @generated
   */
  EClass getPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link org.itea2.amalthea.variability.dependency.dependency.PropertyValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.PropertyValue#getName()
   * @see #getPropertyValue()
   * @generated
   */
  EAttribute getPropertyValue_Name();

  /**
   * Returns the meta object for enum '{@link org.itea2.amalthea.variability.dependency.dependency.ComparismOperator <em>Comparism Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comparism Operator</em>'.
   * @see org.itea2.amalthea.variability.dependency.dependency.ComparismOperator
   * @generated
   */
  EEnum getComparismOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DependencyFactory getDependencyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyImpl
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Flat Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__FLAT_DEPENDENCY = eINSTANCE.getDependency_FlatDependency();

    /**
     * The meta object literal for the '<em><b>Hierarchical Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__HIERARCHICAL_DEPENDENCIES = eINSTANCE.getDependency_HierarchicalDependencies();

    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.FlatDependencyImpl <em>Flat Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.FlatDependencyImpl
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getFlatDependency()
     * @generated
     */
    EClass FLAT_DEPENDENCY = eINSTANCE.getFlatDependency();

    /**
     * The meta object literal for the '<em><b>System Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLAT_DEPENDENCY__SYSTEM_PART = eINSTANCE.getFlatDependency_SystemPart();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLAT_DEPENDENCY__TYPE = eINSTANCE.getFlatDependency_Type();

    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.HierarchicalDependencyImpl <em>Hierarchical Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.HierarchicalDependencyImpl
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getHierarchicalDependency()
     * @generated
     */
    EClass HIERARCHICAL_DEPENDENCY = eINSTANCE.getHierarchicalDependency();

    /**
     * The meta object literal for the '<em><b>System Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HIERARCHICAL_DEPENDENCY__SYSTEM_PART = eINSTANCE.getHierarchicalDependency_SystemPart();

    /**
     * The meta object literal for the '<em><b>Structure Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HIERARCHICAL_DEPENDENCY__STRUCTURE_ELEMENTS = eINSTANCE.getHierarchicalDependency_StructureElements();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HIERARCHICAL_DEPENDENCY__PROPERTIES = eINSTANCE.getHierarchicalDependency_Properties();

    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.SystemPartImpl <em>System Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.SystemPartImpl
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getSystemPart()
     * @generated
     */
    EClass SYSTEM_PART = eINSTANCE.getSystemPart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_PART__NAME = eINSTANCE.getSystemPart_Name();

    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.TypeImpl
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.StructureElementImpl <em>Structure Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.StructureElementImpl
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getStructureElement()
     * @generated
     */
    EClass STRUCTURE_ELEMENT = eINSTANCE.getStructureElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_ELEMENT__NAME = eINSTANCE.getStructureElement_Name();

    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.PropertyImpl
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Comparism Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__COMPARISM_OPERATOR = eINSTANCE.getProperty_ComparismOperator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DescriptionImpl
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__NAME = eINSTANCE.getDescription_Name();

    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.impl.PropertyValueImpl <em>Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.PropertyValueImpl
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getPropertyValue()
     * @generated
     */
    EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_VALUE__NAME = eINSTANCE.getPropertyValue_Name();

    /**
     * The meta object literal for the '{@link org.itea2.amalthea.variability.dependency.dependency.ComparismOperator <em>Comparism Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.itea2.amalthea.variability.dependency.dependency.ComparismOperator
     * @see org.itea2.amalthea.variability.dependency.dependency.impl.DependencyPackageImpl#getComparismOperator()
     * @generated
     */
    EEnum COMPARISM_OPERATOR = eINSTANCE.getComparismOperator();

  }

} //DependencyPackage
