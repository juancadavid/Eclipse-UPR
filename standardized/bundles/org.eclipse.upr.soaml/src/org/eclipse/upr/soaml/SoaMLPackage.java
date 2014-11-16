/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Marc-Florian Wendland
 */
package org.eclipse.upr.soaml;

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
 * @see org.eclipse.upr.soaml.SoaMLFactory
 * @model kind="package"
 * @generated
 */
public interface SoaMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "soaml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdt/upr/SoaML/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "soaml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoaMLPackage eINSTANCE = org.eclipse.upr.soaml.impl.SoaMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.CollaborationImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 0;

	/**
	 * The feature id for the '<em><b>Base Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__BASE_COLLABORATION = 0;

	/**
	 * The feature id for the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__IS_STRICT = 1;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.ServiceArchitectureImpl <em>Service Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.ServiceArchitectureImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getServiceArchitecture()
	 * @generated
	 */
	int SERVICE_ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Base Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ARCHITECTURE__BASE_COLLABORATION = COLLABORATION__BASE_COLLABORATION;

	/**
	 * The feature id for the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ARCHITECTURE__IS_STRICT = COLLABORATION__IS_STRICT;

	/**
	 * The number of structural features of the '<em>Service Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ARCHITECTURE_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.ServiceContractImpl <em>Service Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.ServiceContractImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getServiceContract()
	 * @generated
	 */
	int SERVICE_CONTRACT = 2;

	/**
	 * The feature id for the '<em><b>Base Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTRACT__BASE_COLLABORATION = COLLABORATION__BASE_COLLABORATION;

	/**
	 * The feature id for the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTRACT__IS_STRICT = COLLABORATION__IS_STRICT;

	/**
	 * The number of structural features of the '<em>Service Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTRACT_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.CollaborationUseImpl <em>Collaboration Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.CollaborationUseImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCollaborationUse()
	 * @generated
	 */
	int COLLABORATION_USE = 3;

	/**
	 * The feature id for the '<em><b>Base Collaboration Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE__BASE_COLLABORATION_USE = 0;

	/**
	 * The feature id for the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE__IS_STRICT = 1;

	/**
	 * The number of structural features of the '<em>Collaboration Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_USE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.ConsumerImpl <em>Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.ConsumerImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 4;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__BASE_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__BASE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.ProviderImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__BASE_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__BASE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.MotivationRealizationImpl <em>Motivation Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.MotivationRealizationImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getMotivationRealization()
	 * @generated
	 */
	int MOTIVATION_REALIZATION = 6;

	/**
	 * The feature id for the '<em><b>Base Realization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_REALIZATION__BASE_REALIZATION = 0;

	/**
	 * The number of structural features of the '<em>Motivation Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_REALIZATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.ServiceInterfaceImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getServiceInterface()
	 * @generated
	 */
	int SERVICE_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__BASE_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__BASE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.ParticipantImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.AgentImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__BASE_CLASS = PARTICIPANT__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.PortImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 10;

	/**
	 * The feature id for the '<em><b>Connector Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONNECTOR_REQUIRED = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BASE_PORT = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.RequestImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 11;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.ServiceImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.ServiceChannelImpl <em>Service Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.ServiceChannelImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getServiceChannel()
	 * @generated
	 */
	int SERVICE_CHANNEL = 13;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CHANNEL__BASE_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Service Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CHANNEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.PropertyImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ID = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BASE_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.AttachmentImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 15;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ENCODING = 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__MIME_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__BASE_PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.MessageTypeImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__ENCODING = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__BASE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__BASE_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Base Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__BASE_SIGNAL = 3;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.MilestoneImpl <em>Milestone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.MilestoneImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getMilestone()
	 * @generated
	 */
	int MILESTONE = 17;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__PROGRESS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__SIGNAL = 2;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__BASE_COMMENT = 3;

	/**
	 * The number of structural features of the '<em>Milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.CapabilityImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 18;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.ExposeImpl <em>Expose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.ExposeImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getExpose()
	 * @generated
	 */
	int EXPOSE = 19;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Expose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.NodeDescriptorImpl <em>Node Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.NodeDescriptorImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getNodeDescriptor()
	 * @generated
	 */
	int NODE_DESCRIPTOR = 20;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DESCRIPTOR__BASE_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Node Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DESCRIPTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.CatalogImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 21;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__BASE_ARTIFACT = NODE_DESCRIPTOR__BASE_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__BASE_PACKAGE = NODE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = NODE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.CategoryImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 22;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__BASE_ARTIFACT = NODE_DESCRIPTOR__BASE_ARTIFACT;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = NODE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.FreeFormDescriptorImpl <em>Free Form Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.FreeFormDescriptorImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getFreeFormDescriptor()
	 * @generated
	 */
	int FREE_FORM_DESCRIPTOR = 23;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_FORM_DESCRIPTOR__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Free Form Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_FORM_DESCRIPTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.FreeFormValueImpl <em>Free Form Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.FreeFormValueImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getFreeFormValue()
	 * @generated
	 */
	int FREE_FORM_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_FORM_VALUE__BASE_VALUE_SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Free Form Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_FORM_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.CategoryValueImpl <em>Category Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.CategoryValueImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCategoryValue()
	 * @generated
	 */
	int CATEGORY_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__BASE_VALUE_SPECIFICATION = FREE_FORM_VALUE__BASE_VALUE_SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Category Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE_FEATURE_COUNT = FREE_FORM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.soaml.impl.CategorizationImpl <em>Categorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.soaml.impl.CategorizationImpl
	 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCategorization()
	 * @generated
	 */
	int CATEGORIZATION = 26;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Categorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see org.eclipse.upr.soaml.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Collaboration#getBase_Collaboration <em>Base Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Collaboration</em>'.
	 * @see org.eclipse.upr.soaml.Collaboration#getBase_Collaboration()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Base_Collaboration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.soaml.Collaboration#isStrict <em>Is Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict</em>'.
	 * @see org.eclipse.upr.soaml.Collaboration#isStrict()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_IsStrict();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.ServiceArchitecture <em>Service Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Architecture</em>'.
	 * @see org.eclipse.upr.soaml.ServiceArchitecture
	 * @generated
	 */
	EClass getServiceArchitecture();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.ServiceContract <em>Service Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Contract</em>'.
	 * @see org.eclipse.upr.soaml.ServiceContract
	 * @generated
	 */
	EClass getServiceContract();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.CollaborationUse <em>Collaboration Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration Use</em>'.
	 * @see org.eclipse.upr.soaml.CollaborationUse
	 * @generated
	 */
	EClass getCollaborationUse();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.CollaborationUse#getBase_CollaborationUse <em>Base Collaboration Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Collaboration Use</em>'.
	 * @see org.eclipse.upr.soaml.CollaborationUse#getBase_CollaborationUse()
	 * @see #getCollaborationUse()
	 * @generated
	 */
	EReference getCollaborationUse_Base_CollaborationUse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.soaml.CollaborationUse#isStrict <em>Is Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict</em>'.
	 * @see org.eclipse.upr.soaml.CollaborationUse#isStrict()
	 * @see #getCollaborationUse()
	 * @generated
	 */
	EAttribute getCollaborationUse_IsStrict();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer</em>'.
	 * @see org.eclipse.upr.soaml.Consumer
	 * @generated
	 */
	EClass getConsumer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Consumer#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see org.eclipse.upr.soaml.Consumer#getBase_Interface()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_Base_Interface();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Consumer#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.soaml.Consumer#getBase_Class()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.eclipse.upr.soaml.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Provider#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see org.eclipse.upr.soaml.Provider#getBase_Interface()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Base_Interface();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Provider#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.soaml.Provider#getBase_Class()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.MotivationRealization <em>Motivation Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motivation Realization</em>'.
	 * @see org.eclipse.upr.soaml.MotivationRealization
	 * @generated
	 */
	EClass getMotivationRealization();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.MotivationRealization#getBase_Realization <em>Base Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Realization</em>'.
	 * @see org.eclipse.upr.soaml.MotivationRealization#getBase_Realization()
	 * @see #getMotivationRealization()
	 * @generated
	 */
	EReference getMotivationRealization_Base_Realization();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface</em>'.
	 * @see org.eclipse.upr.soaml.ServiceInterface
	 * @generated
	 */
	EClass getServiceInterface();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.ServiceInterface#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see org.eclipse.upr.soaml.ServiceInterface#getBase_Interface()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_Base_Interface();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.ServiceInterface#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.soaml.ServiceInterface#getBase_Class()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.eclipse.upr.soaml.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Participant#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.soaml.Participant#getBase_Class()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see org.eclipse.upr.soaml.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.upr.soaml.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.soaml.Port#isConnectorRequired <em>Connector Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Required</em>'.
	 * @see org.eclipse.upr.soaml.Port#isConnectorRequired()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_ConnectorRequired();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Port#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.upr.soaml.Port#getBase_Port()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see org.eclipse.upr.soaml.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Request#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.upr.soaml.Request#getBase_Port()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.eclipse.upr.soaml.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Service#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.upr.soaml.Service#getBase_Port()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.ServiceChannel <em>Service Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Channel</em>'.
	 * @see org.eclipse.upr.soaml.ServiceChannel
	 * @generated
	 */
	EClass getServiceChannel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.ServiceChannel#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.eclipse.upr.soaml.ServiceChannel#getBase_Connector()
	 * @see #getServiceChannel()
	 * @generated
	 */
	EReference getServiceChannel_Base_Connector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.upr.soaml.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.soaml.Property#isID <em>Is ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is ID</em>'.
	 * @see org.eclipse.upr.soaml.Property#isID()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsID();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Property#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.upr.soaml.Property#getBase_Property()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see org.eclipse.upr.soaml.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.soaml.Attachment#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.eclipse.upr.soaml.Attachment#getEncoding()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.soaml.Attachment#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.eclipse.upr.soaml.Attachment#getMimeType()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_MimeType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Attachment#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.upr.soaml.Attachment#getBase_Property()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see org.eclipse.upr.soaml.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.soaml.MessageType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.eclipse.upr.soaml.MessageType#getEncoding()
	 * @see #getMessageType()
	 * @generated
	 */
	EAttribute getMessageType_Encoding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.MessageType#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.soaml.MessageType#getBase_Class()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.MessageType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.upr.soaml.MessageType#getBase_DataType()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Base_DataType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.MessageType#getBase_Signal <em>Base Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Signal</em>'.
	 * @see org.eclipse.upr.soaml.MessageType#getBase_Signal()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Base_Signal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Milestone</em>'.
	 * @see org.eclipse.upr.soaml.Milestone
	 * @generated
	 */
	EClass getMilestone();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.soaml.Milestone#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see org.eclipse.upr.soaml.Milestone#getProgress()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_Progress();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.soaml.Milestone#getValues <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.eclipse.upr.soaml.Milestone#getValues()
	 * @see #getMilestone()
	 * @generated
	 */
	EReference getMilestone_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Milestone#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see org.eclipse.upr.soaml.Milestone#getSignal()
	 * @see #getMilestone()
	 * @generated
	 */
	EReference getMilestone_Signal();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Milestone#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.upr.soaml.Milestone#getBase_Comment()
	 * @see #getMilestone()
	 * @generated
	 */
	EReference getMilestone_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.eclipse.upr.soaml.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Capability#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.soaml.Capability#getBase_Class()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Expose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expose</em>'.
	 * @see org.eclipse.upr.soaml.Expose
	 * @generated
	 */
	EClass getExpose();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Expose#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.upr.soaml.Expose#getBase_Dependency()
	 * @see #getExpose()
	 * @generated
	 */
	EReference getExpose_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.NodeDescriptor <em>Node Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Descriptor</em>'.
	 * @see org.eclipse.upr.soaml.NodeDescriptor
	 * @generated
	 */
	EClass getNodeDescriptor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.NodeDescriptor#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see org.eclipse.upr.soaml.NodeDescriptor#getBase_Artifact()
	 * @see #getNodeDescriptor()
	 * @generated
	 */
	EReference getNodeDescriptor_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see org.eclipse.upr.soaml.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Catalog#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.upr.soaml.Catalog#getBase_Package()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.eclipse.upr.soaml.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.FreeFormDescriptor <em>Free Form Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Form Descriptor</em>'.
	 * @see org.eclipse.upr.soaml.FreeFormDescriptor
	 * @generated
	 */
	EClass getFreeFormDescriptor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.FreeFormDescriptor#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.upr.soaml.FreeFormDescriptor#getBase_Property()
	 * @see #getFreeFormDescriptor()
	 * @generated
	 */
	EReference getFreeFormDescriptor_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.FreeFormValue <em>Free Form Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Form Value</em>'.
	 * @see org.eclipse.upr.soaml.FreeFormValue
	 * @generated
	 */
	EClass getFreeFormValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.FreeFormValue#getBase_ValueSpecification <em>Base Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Value Specification</em>'.
	 * @see org.eclipse.upr.soaml.FreeFormValue#getBase_ValueSpecification()
	 * @see #getFreeFormValue()
	 * @generated
	 */
	EReference getFreeFormValue_Base_ValueSpecification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.CategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Value</em>'.
	 * @see org.eclipse.upr.soaml.CategoryValue
	 * @generated
	 */
	EClass getCategoryValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.soaml.Categorization <em>Categorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorization</em>'.
	 * @see org.eclipse.upr.soaml.Categorization
	 * @generated
	 */
	EClass getCategorization();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.soaml.Categorization#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.upr.soaml.Categorization#getBase_Dependency()
	 * @see #getCategorization()
	 * @generated
	 */
	EReference getCategorization_Base_Dependency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoaMLFactory getSoaMLFactory();

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
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.CollaborationImpl <em>Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.CollaborationImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCollaboration()
		 * @generated
		 */
		EClass COLLABORATION = eINSTANCE.getCollaboration();

		/**
		 * The meta object literal for the '<em><b>Base Collaboration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__BASE_COLLABORATION = eINSTANCE.getCollaboration_Base_Collaboration();

		/**
		 * The meta object literal for the '<em><b>Is Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION__IS_STRICT = eINSTANCE.getCollaboration_IsStrict();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.ServiceArchitectureImpl <em>Service Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.ServiceArchitectureImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getServiceArchitecture()
		 * @generated
		 */
		EClass SERVICE_ARCHITECTURE = eINSTANCE.getServiceArchitecture();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.ServiceContractImpl <em>Service Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.ServiceContractImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getServiceContract()
		 * @generated
		 */
		EClass SERVICE_CONTRACT = eINSTANCE.getServiceContract();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.CollaborationUseImpl <em>Collaboration Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.CollaborationUseImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCollaborationUse()
		 * @generated
		 */
		EClass COLLABORATION_USE = eINSTANCE.getCollaborationUse();

		/**
		 * The meta object literal for the '<em><b>Base Collaboration Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_USE__BASE_COLLABORATION_USE = eINSTANCE.getCollaborationUse_Base_CollaborationUse();

		/**
		 * The meta object literal for the '<em><b>Is Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_USE__IS_STRICT = eINSTANCE.getCollaborationUse_IsStrict();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.ConsumerImpl <em>Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.ConsumerImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getConsumer()
		 * @generated
		 */
		EClass CONSUMER = eINSTANCE.getConsumer();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__BASE_INTERFACE = eINSTANCE.getConsumer_Base_Interface();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__BASE_CLASS = eINSTANCE.getConsumer_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.ProviderImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__BASE_INTERFACE = eINSTANCE.getProvider_Base_Interface();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__BASE_CLASS = eINSTANCE.getProvider_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.MotivationRealizationImpl <em>Motivation Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.MotivationRealizationImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getMotivationRealization()
		 * @generated
		 */
		EClass MOTIVATION_REALIZATION = eINSTANCE.getMotivationRealization();

		/**
		 * The meta object literal for the '<em><b>Base Realization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTIVATION_REALIZATION__BASE_REALIZATION = eINSTANCE.getMotivationRealization_Base_Realization();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.ServiceInterfaceImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getServiceInterface()
		 * @generated
		 */
		EClass SERVICE_INTERFACE = eINSTANCE.getServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__BASE_INTERFACE = eINSTANCE.getServiceInterface_Base_Interface();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__BASE_CLASS = eINSTANCE.getServiceInterface_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.ParticipantImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__BASE_CLASS = eINSTANCE.getParticipant_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.AgentImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.PortImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Connector Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__CONNECTOR_REQUIRED = eINSTANCE.getPort_ConnectorRequired();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BASE_PORT = eINSTANCE.getPort_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.RequestImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__BASE_PORT = eINSTANCE.getRequest_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.ServiceImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BASE_PORT = eINSTANCE.getService_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.ServiceChannelImpl <em>Service Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.ServiceChannelImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getServiceChannel()
		 * @generated
		 */
		EClass SERVICE_CHANNEL = eINSTANCE.getServiceChannel();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CHANNEL__BASE_CONNECTOR = eINSTANCE.getServiceChannel_Base_Connector();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.PropertyImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Is ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_ID = eINSTANCE.getProperty_IsID();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__BASE_PROPERTY = eINSTANCE.getProperty_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.AttachmentImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__ENCODING = eINSTANCE.getAttachment_Encoding();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__MIME_TYPE = eINSTANCE.getAttachment_MimeType();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__BASE_PROPERTY = eINSTANCE.getAttachment_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.MessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.MessageTypeImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TYPE__ENCODING = eINSTANCE.getMessageType_Encoding();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__BASE_CLASS = eINSTANCE.getMessageType_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__BASE_DATA_TYPE = eINSTANCE.getMessageType_Base_DataType();

		/**
		 * The meta object literal for the '<em><b>Base Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__BASE_SIGNAL = eINSTANCE.getMessageType_Base_Signal();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.MilestoneImpl <em>Milestone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.MilestoneImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getMilestone()
		 * @generated
		 */
		EClass MILESTONE = eINSTANCE.getMilestone();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__PROGRESS = eINSTANCE.getMilestone_Progress();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MILESTONE__VALUE = eINSTANCE.getMilestone_Value();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MILESTONE__SIGNAL = eINSTANCE.getMilestone_Signal();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MILESTONE__BASE_COMMENT = eINSTANCE.getMilestone_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.CapabilityImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__BASE_CLASS = eINSTANCE.getCapability_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.ExposeImpl <em>Expose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.ExposeImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getExpose()
		 * @generated
		 */
		EClass EXPOSE = eINSTANCE.getExpose();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSE__BASE_DEPENDENCY = eINSTANCE.getExpose_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.NodeDescriptorImpl <em>Node Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.NodeDescriptorImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getNodeDescriptor()
		 * @generated
		 */
		EClass NODE_DESCRIPTOR = eINSTANCE.getNodeDescriptor();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DESCRIPTOR__BASE_ARTIFACT = eINSTANCE.getNodeDescriptor_Base_Artifact();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.CatalogImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__BASE_PACKAGE = eINSTANCE.getCatalog_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.CategoryImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.FreeFormDescriptorImpl <em>Free Form Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.FreeFormDescriptorImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getFreeFormDescriptor()
		 * @generated
		 */
		EClass FREE_FORM_DESCRIPTOR = eINSTANCE.getFreeFormDescriptor();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREE_FORM_DESCRIPTOR__BASE_PROPERTY = eINSTANCE.getFreeFormDescriptor_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.FreeFormValueImpl <em>Free Form Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.FreeFormValueImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getFreeFormValue()
		 * @generated
		 */
		EClass FREE_FORM_VALUE = eINSTANCE.getFreeFormValue();

		/**
		 * The meta object literal for the '<em><b>Base Value Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREE_FORM_VALUE__BASE_VALUE_SPECIFICATION = eINSTANCE.getFreeFormValue_Base_ValueSpecification();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.CategoryValueImpl <em>Category Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.CategoryValueImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCategoryValue()
		 * @generated
		 */
		EClass CATEGORY_VALUE = eINSTANCE.getCategoryValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.soaml.impl.CategorizationImpl <em>Categorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.soaml.impl.CategorizationImpl
		 * @see org.eclipse.upr.soaml.impl.SoaMLPackageImpl#getCategorization()
		 * @generated
		 */
		EClass CATEGORIZATION = eINSTANCE.getCategorization();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZATION__BASE_DEPENDENCY = eINSTANCE.getCategorization_Base_Dependency();

	}

} //SoaMLPackage
