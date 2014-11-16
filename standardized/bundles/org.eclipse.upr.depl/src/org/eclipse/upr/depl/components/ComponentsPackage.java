/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 * Marc-Florian Wendland
 */
package org.eclipse.upr.depl.components;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.upr.depl.components.ComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/DEPL/4.0/profile/components/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UMLProfileForDC.Components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsPackage eINSTANCE = org.eclipse.upr.depl.components.impl.ComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.ComponentImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_PORT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LABEL = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UUID = 3;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONFIG_PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.PortImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__UUID = 2;

	/**
	 * The feature id for the '<em><b>Supported Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SUPPORTED_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Exclusive Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EXCLUSIVE_PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>Exclusive User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EXCLUSIVE_USER = 6;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OPTIONAL = 7;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.ComponentImplementationImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getComponentImplementation()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__CAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Deploy Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT = 2;

	/**
	 * The number of structural features of the '<em>Component Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.CapabilityImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__RESOURCE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.RequirementImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RESOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.PropertyImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.ComponentAssemblyImpl <em>Component Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.ComponentAssemblyImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getComponentAssembly()
	 * @generated
	 */
	int COMPONENT_ASSEMBLY = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSEMBLY__BASE_CLASS = COMPONENT_IMPLEMENTATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSEMBLY__CAPABILITY = COMPONENT_IMPLEMENTATION__CAPABILITY;

	/**
	 * The feature id for the '<em><b>Deploy Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSEMBLY__DEPLOY_REQUIREMENT = COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Contained Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSEMBLY__CONTAINED_COMPONENT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Property Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSEMBLY__ASSEMBLY_PROPERTY = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSEMBLY__EXTERNAL_PORT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Port Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSEMBLY_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.PropertyConnectorImpl <em>Property Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.PropertyConnectorImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getPropertyConnector()
	 * @generated
	 */
	int PROPERTY_CONNECTOR = 7;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONNECTOR__BASE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Connected Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONNECTOR__CONNECTED_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONNECTOR__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Property Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.PortConnectorImpl <em>Port Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.PortConnectorImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getPortConnector()
	 * @generated
	 */
	int PORT_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__BASE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Connected Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__CONNECTED_PORT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__LABEL = 2;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__EXTERNAL_REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.ExternalReferenceImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__BASE_CONNECTABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.components.impl.MonolithicImplementationImpl <em>Monolithic Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.components.impl.MonolithicImplementationImpl
	 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getMonolithicImplementation()
	 * @generated
	 */
	int MONOLITHIC_IMPLEMENTATION = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOLITHIC_IMPLEMENTATION__BASE_CLASS = COMPONENT_IMPLEMENTATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOLITHIC_IMPLEMENTATION__CAPABILITY = COMPONENT_IMPLEMENTATION__CAPABILITY;

	/**
	 * The feature id for the '<em><b>Deploy Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOLITHIC_IMPLEMENTATION__DEPLOY_REQUIREMENT = COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT;

	/**
	 * The number of structural features of the '<em>Monolithic Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOLITHIC_IMPLEMENTATION_FEATURE_COUNT = COMPONENT_IMPLEMENTATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.upr.depl.components.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.components.Component#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.upr.depl.components.Component#getBase_Component()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Base_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.components.Component#getOwnedPort <em>Owned Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Port</em>'.
	 * @see org.eclipse.upr.depl.components.Component#getOwnedPort()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OwnedPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Component#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.upr.depl.components.Component#getLabel()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Component#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see org.eclipse.upr.depl.components.Component#getUUID()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_UUID();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.components.Component#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementation</em>'.
	 * @see org.eclipse.upr.depl.components.Component#getImplementation()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.components.Component#getConfigProperty <em>Config Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Property</em>'.
	 * @see org.eclipse.upr.depl.components.Component#getConfigProperty()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ConfigProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.upr.depl.components.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.components.Port#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.upr.depl.components.Port#getBase_Port()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.upr.depl.components.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Port#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see org.eclipse.upr.depl.components.Port#getUUID()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_UUID();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.upr.depl.components.Port#getSupportedType <em>Supported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Type</em>'.
	 * @see org.eclipse.upr.depl.components.Port#getSupportedType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_SupportedType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Port#isProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.eclipse.upr.depl.components.Port#isProvider()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Port#isExclusiveProvider <em>Exclusive Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Provider</em>'.
	 * @see org.eclipse.upr.depl.components.Port#isExclusiveProvider()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_ExclusiveProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Port#isExclusiveUser <em>Exclusive User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive User</em>'.
	 * @see org.eclipse.upr.depl.components.Port#isExclusiveUser()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_ExclusiveUser();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Port#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.upr.depl.components.Port#isOptional()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Optional();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.ComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implementation</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentImplementation
	 * @generated
	 */
	EClass getComponentImplementation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.components.ComponentImplementation#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentImplementation#getBase_Class()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Base_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.components.ComponentImplementation#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentImplementation#getCapability()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_Capability();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.components.ComponentImplementation#getDeployRequirement <em>Deploy Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deploy Requirement</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentImplementation#getDeployRequirement()
	 * @see #getComponentImplementation()
	 * @generated
	 */
	EReference getComponentImplementation_DeployRequirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.eclipse.upr.depl.components.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Capability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.upr.depl.components.Capability#getName()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.upr.depl.components.Capability#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Type</em>'.
	 * @see org.eclipse.upr.depl.components.Capability#getResourceType()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_ResourceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.upr.depl.components.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.Requirement#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.eclipse.upr.depl.components.Requirement#getResourceType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ResourceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.upr.depl.components.Requirement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.eclipse.upr.depl.components.Requirement#getProperties()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.upr.depl.components.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.components.Property#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.upr.depl.components.Property#getBase_Property()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.ComponentAssembly <em>Component Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Assembly</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentAssembly
	 * @generated
	 */
	EClass getComponentAssembly();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.components.ComponentAssembly#getContainedComponent <em>Contained Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Component</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentAssembly#getContainedComponent()
	 * @see #getComponentAssembly()
	 * @generated
	 */
	EReference getComponentAssembly_ContainedComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.components.ComponentAssembly#getOwnedPropertyConnector <em>Owned Property Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property Connector</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentAssembly#getOwnedPropertyConnector()
	 * @see #getComponentAssembly()
	 * @generated
	 */
	EReference getComponentAssembly_OwnedPropertyConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.components.ComponentAssembly#getAssemblyProperty <em>Assembly Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Property</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentAssembly#getAssemblyProperty()
	 * @see #getComponentAssembly()
	 * @generated
	 */
	EReference getComponentAssembly_AssemblyProperty();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.components.ComponentAssembly#getExternalPort <em>External Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Port</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentAssembly#getExternalPort()
	 * @see #getComponentAssembly()
	 * @generated
	 */
	EReference getComponentAssembly_ExternalPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.components.ComponentAssembly#getOwnedPortConnector <em>Owned Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Port Connector</em>'.
	 * @see org.eclipse.upr.depl.components.ComponentAssembly#getOwnedPortConnector()
	 * @see #getComponentAssembly()
	 * @generated
	 */
	EReference getComponentAssembly_OwnedPortConnector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.PropertyConnector <em>Property Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Connector</em>'.
	 * @see org.eclipse.upr.depl.components.PropertyConnector
	 * @generated
	 */
	EClass getPropertyConnector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.components.PropertyConnector#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.eclipse.upr.depl.components.PropertyConnector#getBase_Connector()
	 * @see #getPropertyConnector()
	 * @generated
	 */
	EReference getPropertyConnector_Base_Connector();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.components.PropertyConnector#getConnectedProperty <em>Connected Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Property</em>'.
	 * @see org.eclipse.upr.depl.components.PropertyConnector#getConnectedProperty()
	 * @see #getPropertyConnector()
	 * @generated
	 */
	EReference getPropertyConnector_ConnectedProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.PropertyConnector#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.upr.depl.components.PropertyConnector#getLabel()
	 * @see #getPropertyConnector()
	 * @generated
	 */
	EAttribute getPropertyConnector_Label();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.PortConnector <em>Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connector</em>'.
	 * @see org.eclipse.upr.depl.components.PortConnector
	 * @generated
	 */
	EClass getPortConnector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.components.PortConnector#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.eclipse.upr.depl.components.PortConnector#getBase_Connector()
	 * @see #getPortConnector()
	 * @generated
	 */
	EReference getPortConnector_Base_Connector();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.components.PortConnector#getConnectedPort <em>Connected Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Port</em>'.
	 * @see org.eclipse.upr.depl.components.PortConnector#getConnectedPort()
	 * @see #getPortConnector()
	 * @generated
	 */
	EReference getPortConnector_ConnectedPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.PortConnector#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.upr.depl.components.PortConnector#getLabel()
	 * @see #getPortConnector()
	 * @generated
	 */
	EAttribute getPortConnector_Label();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.components.PortConnector#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Reference</em>'.
	 * @see org.eclipse.upr.depl.components.PortConnector#getExternalReference()
	 * @see #getPortConnector()
	 * @generated
	 */
	EReference getPortConnector_ExternalReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see org.eclipse.upr.depl.components.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.components.ExternalReference#getBase_ConnectableElement <em>Base Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connectable Element</em>'.
	 * @see org.eclipse.upr.depl.components.ExternalReference#getBase_ConnectableElement()
	 * @see #getExternalReference()
	 * @generated
	 */
	EReference getExternalReference_Base_ConnectableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.components.ExternalReference#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.upr.depl.components.ExternalReference#getLocation()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Location();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.components.MonolithicImplementation <em>Monolithic Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monolithic Implementation</em>'.
	 * @see org.eclipse.upr.depl.components.MonolithicImplementation
	 * @generated
	 */
	EClass getMonolithicImplementation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentsFactory getComponentsFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.ComponentImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BASE_COMPONENT = eINSTANCE.getComponent_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Owned Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OWNED_PORT = eINSTANCE.getComponent_OwnedPort();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__LABEL = eINSTANCE.getComponent_Label();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__UUID = eINSTANCE.getComponent_UUID();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPLEMENTATION = eINSTANCE.getComponent_Implementation();

		/**
		 * The meta object literal for the '<em><b>Config Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONFIG_PROPERTY = eINSTANCE.getComponent_ConfigProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.PortImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BASE_PORT = eINSTANCE.getPort_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__UUID = eINSTANCE.getPort_UUID();

		/**
		 * The meta object literal for the '<em><b>Supported Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__SUPPORTED_TYPE = eINSTANCE.getPort_SupportedType();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PROVIDER = eINSTANCE.getPort_Provider();

		/**
		 * The meta object literal for the '<em><b>Exclusive Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__EXCLUSIVE_PROVIDER = eINSTANCE.getPort_ExclusiveProvider();

		/**
		 * The meta object literal for the '<em><b>Exclusive User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__EXCLUSIVE_USER = eINSTANCE.getPort_ExclusiveUser();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__OPTIONAL = eINSTANCE.getPort_Optional();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.ComponentImplementationImpl <em>Component Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.ComponentImplementationImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getComponentImplementation()
		 * @generated
		 */
		EClass COMPONENT_IMPLEMENTATION = eINSTANCE.getComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__BASE_CLASS = eINSTANCE.getComponentImplementation_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__CAPABILITY = eINSTANCE.getComponentImplementation_Capability();

		/**
		 * The meta object literal for the '<em><b>Deploy Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT = eINSTANCE.getComponentImplementation_DeployRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.CapabilityImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__RESOURCE_TYPE = eINSTANCE.getCapability_ResourceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.RequirementImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__RESOURCE_TYPE = eINSTANCE.getRequirement_ResourceType();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PROPERTIES = eINSTANCE.getRequirement_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.PropertyImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__BASE_PROPERTY = eINSTANCE.getProperty_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.ComponentAssemblyImpl <em>Component Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.ComponentAssemblyImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getComponentAssembly()
		 * @generated
		 */
		EClass COMPONENT_ASSEMBLY = eINSTANCE.getComponentAssembly();

		/**
		 * The meta object literal for the '<em><b>Contained Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ASSEMBLY__CONTAINED_COMPONENT = eINSTANCE.getComponentAssembly_ContainedComponent();

		/**
		 * The meta object literal for the '<em><b>Owned Property Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR = eINSTANCE.getComponentAssembly_OwnedPropertyConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ASSEMBLY__ASSEMBLY_PROPERTY = eINSTANCE.getComponentAssembly_AssemblyProperty();

		/**
		 * The meta object literal for the '<em><b>External Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ASSEMBLY__EXTERNAL_PORT = eINSTANCE.getComponentAssembly_ExternalPort();

		/**
		 * The meta object literal for the '<em><b>Owned Port Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR = eINSTANCE.getComponentAssembly_OwnedPortConnector();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.PropertyConnectorImpl <em>Property Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.PropertyConnectorImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getPropertyConnector()
		 * @generated
		 */
		EClass PROPERTY_CONNECTOR = eINSTANCE.getPropertyConnector();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONNECTOR__BASE_CONNECTOR = eINSTANCE.getPropertyConnector_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Connected Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONNECTOR__CONNECTED_PROPERTY = eINSTANCE.getPropertyConnector_ConnectedProperty();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CONNECTOR__LABEL = eINSTANCE.getPropertyConnector_Label();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.PortConnectorImpl <em>Port Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.PortConnectorImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getPortConnector()
		 * @generated
		 */
		EClass PORT_CONNECTOR = eINSTANCE.getPortConnector();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR__BASE_CONNECTOR = eINSTANCE.getPortConnector_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Connected Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR__CONNECTED_PORT = eINSTANCE.getPortConnector_ConnectedPort();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_CONNECTOR__LABEL = eINSTANCE.getPortConnector_Label();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR__EXTERNAL_REFERENCE = eINSTANCE.getPortConnector_ExternalReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.ExternalReferenceImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em><b>Base Connectable Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_REFERENCE__BASE_CONNECTABLE_ELEMENT = eINSTANCE.getExternalReference_Base_ConnectableElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__LOCATION = eINSTANCE.getExternalReference_Location();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.components.impl.MonolithicImplementationImpl <em>Monolithic Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.components.impl.MonolithicImplementationImpl
		 * @see org.eclipse.upr.depl.components.impl.ComponentsPackageImpl#getMonolithicImplementation()
		 * @generated
		 */
		EClass MONOLITHIC_IMPLEMENTATION = eINSTANCE.getMonolithicImplementation();

	}

} //ComponentsPackage
