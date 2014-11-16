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
package org.eclipse.upr.depl.target;

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
 * @see org.eclipse.upr.depl.target.TargetFactory
 * @model kind="package"
 * @generated
 */
public interface TargetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "target";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/DEPL/4.0/profile/target/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UMLProfileForDC.Target";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetPackage eINSTANCE = org.eclipse.upr.depl.target.impl.TargetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.target.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.target.impl.DomainImpl
	 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Contained Communication Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CONTAINED_COMMUNICATION_PATH = 1;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CONTAINED_NODE = 2;

	/**
	 * The feature id for the '<em><b>Domain Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LABEL = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__UUID = 5;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.target.impl.CommunicationPathImpl <em>Communication Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.target.impl.CommunicationPathImpl
	 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getCommunicationPath()
	 * @generated
	 */
	int COMMUNICATION_PATH = 1;

	/**
	 * The feature id for the '<em><b>Base Communication Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__BASE_COMMUNICATION_PATH = 0;

	/**
	 * The feature id for the '<em><b>Interconnect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__INTERCONNECT = 1;

	/**
	 * The feature id for the '<em><b>Bridge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__BRIDGE = 2;

	/**
	 * The feature id for the '<em><b>Connected Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__CONNECTED_NODE = 3;

	/**
	 * The number of structural features of the '<em>Communication Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.target.impl.InterconnectImpl <em>Interconnect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.target.impl.InterconnectImpl
	 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getInterconnect()
	 * @generated
	 */
	int INTERCONNECT = 2;

	/**
	 * The feature id for the '<em><b>Base Association Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT__BASE_ASSOCIATION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Bridge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT__BRIDGE = 1;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT__OWNED_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Connected Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT__CONNECTED_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT__LABEL = 5;

	/**
	 * The feature id for the '<em><b>Communication Path</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT__COMMUNICATION_PATH = 6;

	/**
	 * The number of structural features of the '<em>Interconnect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.target.impl.BridgeImpl <em>Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.target.impl.BridgeImpl
	 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getBridge()
	 * @generated
	 */
	int BRIDGE = 3;

	/**
	 * The feature id for the '<em><b>Base Association Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__BASE_ASSOCIATION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__OWNED_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Communication Path</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__COMMUNICATION_PATH = 4;

	/**
	 * The feature id for the '<em><b>Interconnect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__INTERCONNECT = 5;

	/**
	 * The number of structural features of the '<em>Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.target.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.target.impl.ResourceImpl
	 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.target.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.target.impl.NodeImpl
	 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BASE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Available Shared Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AVAILABLE_SHARED_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Communication Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMMUNICATION_PATH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Owned Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNED_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Node Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_CONNECTOR = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.depl.target.impl.SharedResourceImpl <em>Shared Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.depl.target.impl.SharedResourceImpl
	 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getSharedResource()
	 * @generated
	 */
	int SHARED_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE__BASE_CLASS = RESOURCE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE__RESOURCE_TYPE = RESOURCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Resource User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE__RESOURCE_USER = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shared Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.target.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.eclipse.upr.depl.target.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.target.Domain#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.depl.target.Domain#getBase_Class()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.Domain#getContainedCommunicationPath <em>Contained Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Communication Path</em>'.
	 * @see org.eclipse.upr.depl.target.Domain#getContainedCommunicationPath()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ContainedCommunicationPath();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.Domain#getContainedNode <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Node</em>'.
	 * @see org.eclipse.upr.depl.target.Domain#getContainedNode()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ContainedNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.Domain#getDomainResource <em>Domain Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Resource</em>'.
	 * @see org.eclipse.upr.depl.target.Domain#getDomainResource()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Domain#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.upr.depl.target.Domain#getLabel()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Domain#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see org.eclipse.upr.depl.target.Domain#getUUID()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_UUID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.target.CommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Path</em>'.
	 * @see org.eclipse.upr.depl.target.CommunicationPath
	 * @generated
	 */
	EClass getCommunicationPath();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.target.CommunicationPath#getBase_CommunicationPath <em>Base Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Communication Path</em>'.
	 * @see org.eclipse.upr.depl.target.CommunicationPath#getBase_CommunicationPath()
	 * @see #getCommunicationPath()
	 * @generated
	 */
	EReference getCommunicationPath_Base_CommunicationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.target.CommunicationPath#getInterconnect <em>Interconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interconnect</em>'.
	 * @see org.eclipse.upr.depl.target.CommunicationPath#getInterconnect()
	 * @see #getCommunicationPath()
	 * @generated
	 */
	EReference getCommunicationPath_Interconnect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.target.CommunicationPath#getBridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bridge</em>'.
	 * @see org.eclipse.upr.depl.target.CommunicationPath#getBridge()
	 * @see #getCommunicationPath()
	 * @generated
	 */
	EReference getCommunicationPath_Bridge();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.CommunicationPath#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Node</em>'.
	 * @see org.eclipse.upr.depl.target.CommunicationPath#getConnectedNode()
	 * @see #getCommunicationPath()
	 * @generated
	 */
	EReference getCommunicationPath_ConnectedNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.target.Interconnect <em>Interconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interconnect</em>'.
	 * @see org.eclipse.upr.depl.target.Interconnect
	 * @generated
	 */
	EClass getInterconnect();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.target.Interconnect#getBase_AssociationClass <em>Base Association Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association Class</em>'.
	 * @see org.eclipse.upr.depl.target.Interconnect#getBase_AssociationClass()
	 * @see #getInterconnect()
	 * @generated
	 */
	EReference getInterconnect_Base_AssociationClass();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.Interconnect#getBridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bridge</em>'.
	 * @see org.eclipse.upr.depl.target.Interconnect#getBridge()
	 * @see #getInterconnect()
	 * @generated
	 */
	EReference getInterconnect_Bridge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.target.Interconnect#getOwnedResource <em>Owned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Resource</em>'.
	 * @see org.eclipse.upr.depl.target.Interconnect#getOwnedResource()
	 * @see #getInterconnect()
	 * @generated
	 */
	EReference getInterconnect_OwnedResource();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.Interconnect#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Node</em>'.
	 * @see org.eclipse.upr.depl.target.Interconnect#getConnectedNode()
	 * @see #getInterconnect()
	 * @generated
	 */
	EReference getInterconnect_ConnectedNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Interconnect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.upr.depl.target.Interconnect#getName()
	 * @see #getInterconnect()
	 * @generated
	 */
	EAttribute getInterconnect_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Interconnect#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.upr.depl.target.Interconnect#getLabel()
	 * @see #getInterconnect()
	 * @generated
	 */
	EAttribute getInterconnect_Label();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.upr.depl.target.Interconnect#getCommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Communication Path</em>'.
	 * @see org.eclipse.upr.depl.target.Interconnect#getCommunicationPath()
	 * @see #getInterconnect()
	 * @generated
	 */
	EReference getInterconnect_CommunicationPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.target.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge</em>'.
	 * @see org.eclipse.upr.depl.target.Bridge
	 * @generated
	 */
	EClass getBridge();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.target.Bridge#getBase_AssociationClass <em>Base Association Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association Class</em>'.
	 * @see org.eclipse.upr.depl.target.Bridge#getBase_AssociationClass()
	 * @see #getBridge()
	 * @generated
	 */
	EReference getBridge_Base_AssociationClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.target.Bridge#getOwnedResource <em>Owned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Resource</em>'.
	 * @see org.eclipse.upr.depl.target.Bridge#getOwnedResource()
	 * @see #getBridge()
	 * @generated
	 */
	EReference getBridge_OwnedResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Bridge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.upr.depl.target.Bridge#getName()
	 * @see #getBridge()
	 * @generated
	 */
	EAttribute getBridge_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Bridge#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.upr.depl.target.Bridge#getLabel()
	 * @see #getBridge()
	 * @generated
	 */
	EAttribute getBridge_Label();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.upr.depl.target.Bridge#getCommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Communication Path</em>'.
	 * @see org.eclipse.upr.depl.target.Bridge#getCommunicationPath()
	 * @see #getBridge()
	 * @generated
	 */
	EReference getBridge_CommunicationPath();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.Bridge#getInterconnect <em>Interconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interconnect</em>'.
	 * @see org.eclipse.upr.depl.target.Bridge#getInterconnect()
	 * @see #getBridge()
	 * @generated
	 */
	EReference getBridge_Interconnect();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.target.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.eclipse.upr.depl.target.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.target.Resource#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.depl.target.Resource#getBase_Class()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.upr.depl.target.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Resource#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.eclipse.upr.depl.target.Resource#getResourceType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ResourceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.target.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.upr.depl.target.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.depl.target.Node#getBase_Node <em>Base Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Node</em>'.
	 * @see org.eclipse.upr.depl.target.Node#getBase_Node()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Base_Node();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.Node#getAvailableSharedResource <em>Available Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Shared Resource</em>'.
	 * @see org.eclipse.upr.depl.target.Node#getAvailableSharedResource()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_AvailableSharedResource();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.Node#getCommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Path</em>'.
	 * @see org.eclipse.upr.depl.target.Node#getCommunicationPath()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_CommunicationPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.upr.depl.target.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.depl.target.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.upr.depl.target.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.upr.depl.target.Node#getOwnedResource <em>Owned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Resource</em>'.
	 * @see org.eclipse.upr.depl.target.Node#getOwnedResource()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OwnedResource();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.Node#getNodeConnector <em>Node Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Connector</em>'.
	 * @see org.eclipse.upr.depl.target.Node#getNodeConnector()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_NodeConnector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.depl.target.SharedResource <em>Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Resource</em>'.
	 * @see org.eclipse.upr.depl.target.SharedResource
	 * @generated
	 */
	EClass getSharedResource();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.depl.target.SharedResource#getResourceUser <em>Resource User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource User</em>'.
	 * @see org.eclipse.upr.depl.target.SharedResource#getResourceUser()
	 * @see #getSharedResource()
	 * @generated
	 */
	EReference getSharedResource_ResourceUser();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TargetFactory getTargetFactory();

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
		 * The meta object literal for the '{@link org.eclipse.upr.depl.target.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.target.impl.DomainImpl
		 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__BASE_CLASS = eINSTANCE.getDomain_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Contained Communication Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__CONTAINED_COMMUNICATION_PATH = eINSTANCE.getDomain_ContainedCommunicationPath();

		/**
		 * The meta object literal for the '<em><b>Contained Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__CONTAINED_NODE = eINSTANCE.getDomain_ContainedNode();

		/**
		 * The meta object literal for the '<em><b>Domain Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DOMAIN_RESOURCE = eINSTANCE.getDomain_DomainResource();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__LABEL = eINSTANCE.getDomain_Label();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__UUID = eINSTANCE.getDomain_UUID();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.target.impl.CommunicationPathImpl <em>Communication Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.target.impl.CommunicationPathImpl
		 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getCommunicationPath()
		 * @generated
		 */
		EClass COMMUNICATION_PATH = eINSTANCE.getCommunicationPath();

		/**
		 * The meta object literal for the '<em><b>Base Communication Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PATH__BASE_COMMUNICATION_PATH = eINSTANCE.getCommunicationPath_Base_CommunicationPath();

		/**
		 * The meta object literal for the '<em><b>Interconnect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PATH__INTERCONNECT = eINSTANCE.getCommunicationPath_Interconnect();

		/**
		 * The meta object literal for the '<em><b>Bridge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PATH__BRIDGE = eINSTANCE.getCommunicationPath_Bridge();

		/**
		 * The meta object literal for the '<em><b>Connected Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PATH__CONNECTED_NODE = eINSTANCE.getCommunicationPath_ConnectedNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.target.impl.InterconnectImpl <em>Interconnect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.target.impl.InterconnectImpl
		 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getInterconnect()
		 * @generated
		 */
		EClass INTERCONNECT = eINSTANCE.getInterconnect();

		/**
		 * The meta object literal for the '<em><b>Base Association Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT__BASE_ASSOCIATION_CLASS = eINSTANCE.getInterconnect_Base_AssociationClass();

		/**
		 * The meta object literal for the '<em><b>Bridge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT__BRIDGE = eINSTANCE.getInterconnect_Bridge();

		/**
		 * The meta object literal for the '<em><b>Owned Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT__OWNED_RESOURCE = eINSTANCE.getInterconnect_OwnedResource();

		/**
		 * The meta object literal for the '<em><b>Connected Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT__CONNECTED_NODE = eINSTANCE.getInterconnect_ConnectedNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCONNECT__NAME = eINSTANCE.getInterconnect_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCONNECT__LABEL = eINSTANCE.getInterconnect_Label();

		/**
		 * The meta object literal for the '<em><b>Communication Path</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT__COMMUNICATION_PATH = eINSTANCE.getInterconnect_CommunicationPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.target.impl.BridgeImpl <em>Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.target.impl.BridgeImpl
		 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getBridge()
		 * @generated
		 */
		EClass BRIDGE = eINSTANCE.getBridge();

		/**
		 * The meta object literal for the '<em><b>Base Association Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE__BASE_ASSOCIATION_CLASS = eINSTANCE.getBridge_Base_AssociationClass();

		/**
		 * The meta object literal for the '<em><b>Owned Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE__OWNED_RESOURCE = eINSTANCE.getBridge_OwnedResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIDGE__NAME = eINSTANCE.getBridge_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIDGE__LABEL = eINSTANCE.getBridge_Label();

		/**
		 * The meta object literal for the '<em><b>Communication Path</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE__COMMUNICATION_PATH = eINSTANCE.getBridge_CommunicationPath();

		/**
		 * The meta object literal for the '<em><b>Interconnect</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE__INTERCONNECT = eINSTANCE.getBridge_Interconnect();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.target.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.target.impl.ResourceImpl
		 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__BASE_CLASS = eINSTANCE.getResource_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RESOURCE_TYPE = eINSTANCE.getResource_ResourceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.target.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.target.impl.NodeImpl
		 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__BASE_NODE = eINSTANCE.getNode_Base_Node();

		/**
		 * The meta object literal for the '<em><b>Available Shared Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__AVAILABLE_SHARED_RESOURCE = eINSTANCE.getNode_AvailableSharedResource();

		/**
		 * The meta object literal for the '<em><b>Communication Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COMMUNICATION_PATH = eINSTANCE.getNode_CommunicationPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Owned Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OWNED_RESOURCE = eINSTANCE.getNode_OwnedResource();

		/**
		 * The meta object literal for the '<em><b>Node Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE_CONNECTOR = eINSTANCE.getNode_NodeConnector();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.depl.target.impl.SharedResourceImpl <em>Shared Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.depl.target.impl.SharedResourceImpl
		 * @see org.eclipse.upr.depl.target.impl.TargetPackageImpl#getSharedResource()
		 * @generated
		 */
		EClass SHARED_RESOURCE = eINSTANCE.getSharedResource();

		/**
		 * The meta object literal for the '<em><b>Resource User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_RESOURCE__RESOURCE_USER = eINSTANCE.getSharedResource_ResourceUser();

	}

} //TargetPackage
