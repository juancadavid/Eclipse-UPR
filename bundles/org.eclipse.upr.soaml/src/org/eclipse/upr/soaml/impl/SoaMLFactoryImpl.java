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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.upr.soaml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoaMLFactoryImpl extends EFactoryImpl implements SoaMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoaMLFactory init() {
		try {
			SoaMLFactory theSoaMLFactory = (SoaMLFactory)EPackage.Registry.INSTANCE.getEFactory(SoaMLPackage.eNS_URI);
			if (theSoaMLFactory != null) {
				return theSoaMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoaMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoaMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SoaMLPackage.COLLABORATION: return createCollaboration();
			case SoaMLPackage.SERVICE_ARCHITECTURE: return createServiceArchitecture();
			case SoaMLPackage.SERVICE_CONTRACT: return createServiceContract();
			case SoaMLPackage.COLLABORATION_USE: return createCollaborationUse();
			case SoaMLPackage.CONSUMER: return createConsumer();
			case SoaMLPackage.PROVIDER: return createProvider();
			case SoaMLPackage.MOTIVATION_REALIZATION: return createMotivationRealization();
			case SoaMLPackage.SERVICE_INTERFACE: return createServiceInterface();
			case SoaMLPackage.PARTICIPANT: return createParticipant();
			case SoaMLPackage.AGENT: return createAgent();
			case SoaMLPackage.PORT: return createPort();
			case SoaMLPackage.REQUEST: return createRequest();
			case SoaMLPackage.SERVICE: return createService();
			case SoaMLPackage.SERVICE_CHANNEL: return createServiceChannel();
			case SoaMLPackage.PROPERTY: return createProperty();
			case SoaMLPackage.ATTACHMENT: return createAttachment();
			case SoaMLPackage.MESSAGE_TYPE: return createMessageType();
			case SoaMLPackage.MILESTONE: return createMilestone();
			case SoaMLPackage.CAPABILITY: return createCapability();
			case SoaMLPackage.EXPOSE: return createExpose();
			case SoaMLPackage.NODE_DESCRIPTOR: return createNodeDescriptor();
			case SoaMLPackage.CATALOG: return createCatalog();
			case SoaMLPackage.CATEGORY: return createCategory();
			case SoaMLPackage.FREE_FORM_DESCRIPTOR: return createFreeFormDescriptor();
			case SoaMLPackage.FREE_FORM_VALUE: return createFreeFormValue();
			case SoaMLPackage.CATEGORY_VALUE: return createCategoryValue();
			case SoaMLPackage.CATEGORIZATION: return createCategorization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceArchitecture createServiceArchitecture() {
		ServiceArchitectureImpl serviceArchitecture = new ServiceArchitectureImpl();
		return serviceArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceContract createServiceContract() {
		ServiceContractImpl serviceContract = new ServiceContractImpl();
		return serviceContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createCollaborationUse() {
		CollaborationUseImpl collaborationUse = new CollaborationUseImpl();
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumer createConsumer() {
		ConsumerImpl consumer = new ConsumerImpl();
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotivationRealization createMotivationRealization() {
		MotivationRealizationImpl motivationRealization = new MotivationRealizationImpl();
		return motivationRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface createServiceInterface() {
		ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceChannel createServiceChannel() {
		ServiceChannelImpl serviceChannel = new ServiceChannelImpl();
		return serviceChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone createMilestone() {
		MilestoneImpl milestone = new MilestoneImpl();
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expose createExpose() {
		ExposeImpl expose = new ExposeImpl();
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDescriptor createNodeDescriptor() {
		NodeDescriptorImpl nodeDescriptor = new NodeDescriptorImpl();
		return nodeDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeFormDescriptor createFreeFormDescriptor() {
		FreeFormDescriptorImpl freeFormDescriptor = new FreeFormDescriptorImpl();
		return freeFormDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeFormValue createFreeFormValue() {
		FreeFormValueImpl freeFormValue = new FreeFormValueImpl();
		return freeFormValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryValue createCategoryValue() {
		CategoryValueImpl categoryValue = new CategoryValueImpl();
		return categoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorization createCategorization() {
		CategorizationImpl categorization = new CategorizationImpl();
		return categorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoaMLPackage getSoaMLPackage() {
		return (SoaMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoaMLPackage getPackage() {
		return SoaMLPackage.eINSTANCE;
	}

} //SoaMLFactoryImpl
