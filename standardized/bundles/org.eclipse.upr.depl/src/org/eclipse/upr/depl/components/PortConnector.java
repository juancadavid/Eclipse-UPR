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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PortConnector stereotype is an extension of the UML 2.0 Connector metaclass (from
 * UML2.0::Components::BasicComponents). A PortConnector connects a set of compatible ports.
 * 
 * Constraints:
 * • A PortConnector connects two or more ConnectableElements, which are either of type Port or ExternalReference.
 * • Also, at least one of the ConnectableElements must be of type Port.
 * 
 * Note: Definition. Connector (from UML2.0::Components::BasicComponents): The connector concept is extended in the
 * Components package to include interface based constraints and notation. A delegation connector is a connector that links
 * the external contract of a component (as specified by its ports) to the internal realization of that behavior by the
 * component’s parts. It represents the forwarding of signals (operation requests and events) : a signal that arrives at a port
 * that has a delegation connector to a part or to another port will be passed on to that target for handling. An assembly
 * connector is a connector between two components that defines that one component provides the services that another
 * component requires. An assembly connector is a connector that is defined from a required interface or port to a provided
 * interface or port.
 * 
 * Note: One of the issues in the D&C is that a single connector can at the same time connect ports of peer components in
 * an assembly and ports of internal components to external ports, i.e., delegation ports. So according to the UML 2.0 spec,
 * we have connectors that have both a delegation connector capability and an assembly connector capability. The D&C
 * concept of PortConnector is based on the ECAD (circuit design, netlist) model. It fully expresses the idea that a set of
 * ports can be connected together just like a "signal" (say "the reset signal") can be connected to many "pins" of the
 * components (chips) of a circuit. This allows the expression of connections that are point to point (one provider and one
 * user) as well as those with multiple users (like many clients for one server, many event producers for one consumer),
 * multiple providers (like a multicast channel), or multiple of both (like a multicast event channel with multiple listeners).
 * Also, in network systems, you want to talk about a flow that represents the traffic between a set of users and providers so
 * you can plan, manage, and configure it as a whole. If the only means of expression is point to point connections, there is
 * no way to talk about the aggregate "connection." This "richness" has been used in network, circuit, and chip design
 * systems for decades.
 * A PortConnector connects two or more ConnectableElements, which are either of type Port or ExternalReference.
 * Also, at least one of the ConnectableElements must be of type Port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.PortConnector#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.PortConnector#getConnectedPort <em>Connected Port</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.PortConnector#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.PortConnector#getExternalReference <em>External Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPortConnector()
 * @model
 * @generated
 */
public interface PortConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector</em>' reference.
	 * @see #setBase_Connector(Connector)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPortConnector_Base_Connector()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!PortConnector!base_Connector'"
	 * @generated
	 */
	Connector getBase_Connector();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.PortConnector#getBase_Connector <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector</em>' reference.
	 * @see #getBase_Connector()
	 * @generated
	 */
	void setBase_Connector(Connector value);

	/**
	 * Returns the value of the '<em><b>Connected Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Ports connected by the PortConnector. This association is a subset of the “end” association owned by
	 * UML2.0::CompositeStructures::InternalStructures::Connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Port</em>' reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPortConnector_ConnectedPort()
	 * @model lower="2" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!PortConnector!connectedPort'"
	 * @generated
	 */
	EList<Port> getConnectedPort();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optionally identifies this connection within its assembly. May be used or generated by visual design tools.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPortConnector_Label()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!PortConnector!label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.PortConnector#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.ExternalReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExternalReferences connected by the PortConnector. This association is a subset of the “end” association
	 * owned by UML2.0::CompositeStructures::InternalStructures::Connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Reference</em>' reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPortConnector_ExternalReference()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!PortConnector!externalReference'"
	 * @generated
	 */
	EList<ExternalReference> getExternalReference();

} // PortConnector
