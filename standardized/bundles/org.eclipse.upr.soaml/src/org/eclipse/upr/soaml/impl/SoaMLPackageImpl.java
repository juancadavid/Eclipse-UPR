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
package org.eclipse.upr.soaml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.upr.soaml.Agent;
import org.eclipse.upr.soaml.Attachment;
import org.eclipse.upr.soaml.Capability;
import org.eclipse.upr.soaml.Catalog;
import org.eclipse.upr.soaml.Categorization;
import org.eclipse.upr.soaml.Category;
import org.eclipse.upr.soaml.CategoryValue;
import org.eclipse.upr.soaml.Collaboration;
import org.eclipse.upr.soaml.CollaborationUse;
import org.eclipse.upr.soaml.Consumer;
import org.eclipse.upr.soaml.Expose;
import org.eclipse.upr.soaml.FreeFormDescriptor;
import org.eclipse.upr.soaml.FreeFormValue;
import org.eclipse.upr.soaml.MessageType;
import org.eclipse.upr.soaml.Milestone;
import org.eclipse.upr.soaml.MotivationRealization;
import org.eclipse.upr.soaml.NodeDescriptor;
import org.eclipse.upr.soaml.Participant;
import org.eclipse.upr.soaml.Port;
import org.eclipse.upr.soaml.Property;
import org.eclipse.upr.soaml.Provider;
import org.eclipse.upr.soaml.Request;
import org.eclipse.upr.soaml.Service;
import org.eclipse.upr.soaml.ServiceArchitecture;
import org.eclipse.upr.soaml.ServiceChannel;
import org.eclipse.upr.soaml.ServiceContract;
import org.eclipse.upr.soaml.ServiceInterface;
import org.eclipse.upr.soaml.SoaMLFactory;
import org.eclipse.upr.soaml.SoaMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoaMLPackageImpl extends EPackageImpl implements SoaMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivationRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass milestoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeFormDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeFormValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.upr.soaml.SoaMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoaMLPackageImpl() {
		super(eNS_URI, SoaMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SoaMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoaMLPackage init() {
		if (isInited) return (SoaMLPackage)EPackage.Registry.INSTANCE.getEPackage(SoaMLPackage.eNS_URI);

		// Obtain or create and register package
		SoaMLPackageImpl theSoaMLPackage = (SoaMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoaMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoaMLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSoaMLPackage.createPackageContents();

		// Initialize created meta-data
		theSoaMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSoaMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoaMLPackage.eNS_URI, theSoaMLPackage);
		return theSoaMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Base_Collaboration() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaboration_IsStrict() {
		return (EAttribute)collaborationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceArchitecture() {
		return serviceArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceContract() {
		return serviceContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationUse() {
		return collaborationUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_Base_CollaborationUse() {
		return (EReference)collaborationUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationUse_IsStrict() {
		return (EAttribute)collaborationUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumer() {
		return consumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumer_Base_Interface() {
		return (EReference)consumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumer_Base_Class() {
		return (EReference)consumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_Base_Interface() {
		return (EReference)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_Base_Class() {
		return (EReference)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotivationRealization() {
		return motivationRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotivationRealization_Base_Realization() {
		return (EReference)motivationRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInterface() {
		return serviceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterface_Base_Interface() {
		return (EReference)serviceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterface_Base_Class() {
		return (EReference)serviceInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Base_Class() {
		return (EReference)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_ConnectorRequired() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Base_Port() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Base_Port() {
		return (EReference)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Base_Port() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceChannel() {
		return serviceChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceChannel_Base_Connector() {
		return (EReference)serviceChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsID() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Base_Property() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_Encoding() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_MimeType() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Base_Property() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageType() {
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_Encoding() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_Base_Class() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_Base_DataType() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_Base_Signal() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMilestone() {
		return milestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilestone_Progress() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_Value() {
		return (EReference)milestoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_Signal() {
		return (EReference)milestoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMilestone_Base_Comment() {
		return (EReference)milestoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Base_Class() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpose() {
		return exposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpose_Base_Dependency() {
		return (EReference)exposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeDescriptor() {
		return nodeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeDescriptor_Base_Artifact() {
		return (EReference)nodeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Base_Package() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeFormDescriptor() {
		return freeFormDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreeFormDescriptor_Base_Property() {
		return (EReference)freeFormDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeFormValue() {
		return freeFormValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreeFormValue_Base_ValueSpecification() {
		return (EReference)freeFormValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryValue() {
		return categoryValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorization() {
		return categorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorization_Base_Dependency() {
		return (EReference)categorizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoaMLFactory getSoaMLFactory() {
		return (SoaMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		collaborationEClass = createEClass(COLLABORATION);
		createEReference(collaborationEClass, COLLABORATION__BASE_COLLABORATION);
		createEAttribute(collaborationEClass, COLLABORATION__IS_STRICT);

		serviceArchitectureEClass = createEClass(SERVICE_ARCHITECTURE);

		serviceContractEClass = createEClass(SERVICE_CONTRACT);

		collaborationUseEClass = createEClass(COLLABORATION_USE);
		createEReference(collaborationUseEClass, COLLABORATION_USE__BASE_COLLABORATION_USE);
		createEAttribute(collaborationUseEClass, COLLABORATION_USE__IS_STRICT);

		consumerEClass = createEClass(CONSUMER);
		createEReference(consumerEClass, CONSUMER__BASE_INTERFACE);
		createEReference(consumerEClass, CONSUMER__BASE_CLASS);

		providerEClass = createEClass(PROVIDER);
		createEReference(providerEClass, PROVIDER__BASE_INTERFACE);
		createEReference(providerEClass, PROVIDER__BASE_CLASS);

		motivationRealizationEClass = createEClass(MOTIVATION_REALIZATION);
		createEReference(motivationRealizationEClass, MOTIVATION_REALIZATION__BASE_REALIZATION);

		serviceInterfaceEClass = createEClass(SERVICE_INTERFACE);
		createEReference(serviceInterfaceEClass, SERVICE_INTERFACE__BASE_INTERFACE);
		createEReference(serviceInterfaceEClass, SERVICE_INTERFACE__BASE_CLASS);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__BASE_CLASS);

		agentEClass = createEClass(AGENT);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__CONNECTOR_REQUIRED);
		createEReference(portEClass, PORT__BASE_PORT);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__BASE_PORT);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__BASE_PORT);

		serviceChannelEClass = createEClass(SERVICE_CHANNEL);
		createEReference(serviceChannelEClass, SERVICE_CHANNEL__BASE_CONNECTOR);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__IS_ID);
		createEReference(propertyEClass, PROPERTY__BASE_PROPERTY);

		attachmentEClass = createEClass(ATTACHMENT);
		createEAttribute(attachmentEClass, ATTACHMENT__ENCODING);
		createEAttribute(attachmentEClass, ATTACHMENT__MIME_TYPE);
		createEReference(attachmentEClass, ATTACHMENT__BASE_PROPERTY);

		messageTypeEClass = createEClass(MESSAGE_TYPE);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__ENCODING);
		createEReference(messageTypeEClass, MESSAGE_TYPE__BASE_CLASS);
		createEReference(messageTypeEClass, MESSAGE_TYPE__BASE_DATA_TYPE);
		createEReference(messageTypeEClass, MESSAGE_TYPE__BASE_SIGNAL);

		milestoneEClass = createEClass(MILESTONE);
		createEAttribute(milestoneEClass, MILESTONE__PROGRESS);
		createEReference(milestoneEClass, MILESTONE__VALUE);
		createEReference(milestoneEClass, MILESTONE__SIGNAL);
		createEReference(milestoneEClass, MILESTONE__BASE_COMMENT);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__BASE_CLASS);

		exposeEClass = createEClass(EXPOSE);
		createEReference(exposeEClass, EXPOSE__BASE_DEPENDENCY);

		nodeDescriptorEClass = createEClass(NODE_DESCRIPTOR);
		createEReference(nodeDescriptorEClass, NODE_DESCRIPTOR__BASE_ARTIFACT);

		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__BASE_PACKAGE);

		categoryEClass = createEClass(CATEGORY);

		freeFormDescriptorEClass = createEClass(FREE_FORM_DESCRIPTOR);
		createEReference(freeFormDescriptorEClass, FREE_FORM_DESCRIPTOR__BASE_PROPERTY);

		freeFormValueEClass = createEClass(FREE_FORM_VALUE);
		createEReference(freeFormValueEClass, FREE_FORM_VALUE__BASE_VALUE_SPECIFICATION);

		categoryValueEClass = createEClass(CATEGORY_VALUE);

		categorizationEClass = createEClass(CATEGORIZATION);
		createEReference(categorizationEClass, CATEGORIZATION__BASE_DEPENDENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceArchitectureEClass.getESuperTypes().add(this.getCollaboration());
		serviceContractEClass.getESuperTypes().add(this.getCollaboration());
		agentEClass.getESuperTypes().add(this.getParticipant());
		catalogEClass.getESuperTypes().add(this.getNodeDescriptor());
		categoryEClass.getESuperTypes().add(this.getNodeDescriptor());
		categoryValueEClass.getESuperTypes().add(this.getFreeFormValue());

		// Initialize classes and features; add operations and parameters
		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaboration_Base_Collaboration(), theUMLPackage.getCollaboration(), null, "base_Collaboration", null, 1, 1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollaboration_IsStrict(), theTypesPackage.getBoolean(), "isStrict", "true", 1, 1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceArchitectureEClass, ServiceArchitecture.class, "ServiceArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceContractEClass, ServiceContract.class, "ServiceContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collaborationUseEClass, CollaborationUse.class, "CollaborationUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationUse_Base_CollaborationUse(), theUMLPackage.getCollaborationUse(), null, "base_CollaborationUse", null, 1, 1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollaborationUse_IsStrict(), theTypesPackage.getBoolean(), "isStrict", null, 1, 1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(consumerEClass, Consumer.class, "Consumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsumer_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 1, 1, Consumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConsumer_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Consumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvider_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProvider_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(motivationRealizationEClass, MotivationRealization.class, "MotivationRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotivationRealization_Base_Realization(), theUMLPackage.getRealization(), null, "base_Realization", null, 1, 1, MotivationRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceInterfaceEClass, ServiceInterface.class, "ServiceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInterface_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 1, 1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceInterface_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_ConnectorRequired(), theTypesPackage.getBoolean(), "connectorRequired", "true", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceChannelEClass, ServiceChannel.class, "ServiceChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceChannel_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, ServiceChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_IsID(), theTypesPackage.getBoolean(), "isID", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachment_Encoding(), theTypesPackage.getString(), "encoding", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttachment_MimeType(), theTypesPackage.getString(), "mimeType", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttachment_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageTypeEClass, MessageType.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageType_Encoding(), theTypesPackage.getString(), "encoding", null, 1, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageType_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageType_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageType_Base_Signal(), theUMLPackage.getSignal(), null, "base_Signal", null, 1, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMilestone_Progress(), theTypesPackage.getInteger(), "progress", null, 1, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMilestone_Value(), theUMLPackage.getValueSpecification(), null, "value", null, 0, -1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMilestone_Signal(), theUMLPackage.getSignal(), null, "signal", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMilestone_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exposeEClass, Expose.class, "Expose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpose_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, Expose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nodeDescriptorEClass, NodeDescriptor.class, "NodeDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeDescriptor_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 1, 1, NodeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(freeFormDescriptorEClass, FreeFormDescriptor.class, "FreeFormDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFreeFormDescriptor_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, FreeFormDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(freeFormValueEClass, FreeFormValue.class, "FreeFormValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFreeFormValue_Base_ValueSpecification(), theUMLPackage.getValueSpecification(), null, "base_ValueSpecification", null, 1, 1, FreeFormValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryValueEClass, CategoryValue.class, "CategoryValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categorizationEClass, Categorization.class, "Categorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorization_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, Categorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SoaMLPackageImpl
