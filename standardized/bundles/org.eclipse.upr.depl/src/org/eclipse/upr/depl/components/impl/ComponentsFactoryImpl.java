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
package org.eclipse.upr.depl.components.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.upr.depl.components.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsFactoryImpl extends EFactoryImpl implements ComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentsFactory init() {
		try {
			ComponentsFactory theComponentsFactory = (ComponentsFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentsPackage.eNS_URI);
			if (theComponentsFactory != null) {
				return theComponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsFactoryImpl() {
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
			case ComponentsPackage.COMPONENT: return createComponent();
			case ComponentsPackage.PORT: return createPort();
			case ComponentsPackage.CAPABILITY: return createCapability();
			case ComponentsPackage.REQUIREMENT: return createRequirement();
			case ComponentsPackage.PROPERTY: return createProperty();
			case ComponentsPackage.COMPONENT_ASSEMBLY: return createComponentAssembly();
			case ComponentsPackage.PROPERTY_CONNECTOR: return createPropertyConnector();
			case ComponentsPackage.PORT_CONNECTOR: return createPortConnector();
			case ComponentsPackage.EXTERNAL_REFERENCE: return createExternalReference();
			case ComponentsPackage.MONOLITHIC_IMPLEMENTATION: return createMonolithicImplementation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
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
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
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
	public ComponentAssembly createComponentAssembly() {
		ComponentAssemblyImpl componentAssembly = new ComponentAssemblyImpl();
		return componentAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConnector createPropertyConnector() {
		PropertyConnectorImpl propertyConnector = new PropertyConnectorImpl();
		return propertyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConnector createPortConnector() {
		PortConnectorImpl portConnector = new PortConnectorImpl();
		return portConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonolithicImplementation createMonolithicImplementation() {
		MonolithicImplementationImpl monolithicImplementation = new MonolithicImplementationImpl();
		return monolithicImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsPackage getComponentsPackage() {
		return (ComponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentsPackage getPackage() {
		return ComponentsPackage.eINSTANCE;
	}

} //ComponentsFactoryImpl
