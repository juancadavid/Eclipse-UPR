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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.AssociationClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interconnect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Interconnect stereotype extends the UML 2.0 AssociationClass metaclass (from UML2.0::AssociationClasses). It
 * establishes connection between a set of Nodes and Bridges.
 * An Interconnect provides a shared direct connection between one or more nodes. It can have resources, but no shared
 * resources. Resources are matched against a connection's requirements at deployment time.
 * An Interconnect that is attached to only a single node can be used to describe the loopback connection. A loopback
 * connection is implicit; components can always be interconnected locally. Sometimes, it may be useful or necessary to
 * describe the type(s) of available loopback connections (e.g., “shared memory”), or their resources or capabilities (e.g.,
 * latency).
 * 
 * Constraints:
 * • The name must be unique within the domain
 * All ends of an Interconnect are typed by either Node or Bridge
 * The name must be unique within the domain
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.Interconnect#getBase_AssociationClass <em>Base Association Class</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Interconnect#getBridge <em>Bridge</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Interconnect#getOwnedResource <em>Owned Resource</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Interconnect#getConnectedNode <em>Connected Node</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Interconnect#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Interconnect#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Interconnect#getCommunicationPath <em>Communication Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.target.TargetPackage#getInterconnect()
 * @model
 * @generated
 */
public interface Interconnect extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Association Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Association Class</em>' reference.
	 * @see #setBase_AssociationClass(AssociationClass)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getInterconnect_Base_AssociationClass()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Interconnect!base_AssociationClass'"
	 * @generated
	 */
	AssociationClass getBase_AssociationClass();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Interconnect#getBase_AssociationClass <em>Base Association Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association Class</em>' reference.
	 * @see #getBase_AssociationClass()
	 * @generated
	 */
	void setBase_AssociationClass(AssociationClass value);

	/**
	 * Returns the value of the '<em><b>Bridge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Bridge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.Bridge#getInterconnect <em>Interconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bridges that provide connectivity to other interconnects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getInterconnect_Bridge()
	 * @see org.eclipse.upr.depl.target.Bridge#getInterconnect
	 * @model opposite="interconnect" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Interconnect!bridge'"
	 * @generated
	 */
	EList<Bridge> getBridge();

	/**
	 * Returns the value of the '<em><b>Owned Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of Resources owned by the Interconnect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Resource</em>' containment reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getInterconnect_OwnedResource()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Interconnect!ownedResource'"
	 * @generated
	 */
	EList<Resource> getOwnedResource();

	/**
	 * Returns the value of the '<em><b>Connected Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Node}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.Node#getNodeConnector <em>Node Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of nodes that the Interconnect is connected to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Node</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getInterconnect_ConnectedNode()
	 * @see org.eclipse.upr.depl.target.Node#getNodeConnector
	 * @model opposite="nodeConnector" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Interconnect!connectedNode'"
	 * @generated
	 */
	EList<Node> getConnectedNode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interconnect’s name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getInterconnect_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Interconnect!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Interconnect#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional human-readable label for the interconnect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getInterconnect_Label()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Interconnect!label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Interconnect#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Communication Path</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.CommunicationPath#getInterconnect <em>Interconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference the CommunicationPath the Interconnect belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Path</em>' container reference.
	 * @see #setCommunicationPath(CommunicationPath)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getInterconnect_CommunicationPath()
	 * @see org.eclipse.upr.depl.target.CommunicationPath#getInterconnect
	 * @model opposite="interconnect" required="true" transient="false" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Interconnect!communicationPath'"
	 * @generated
	 */
	CommunicationPath getCommunicationPath();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Interconnect#getCommunicationPath <em>Communication Path</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Path</em>' container reference.
	 * @see #getCommunicationPath()
	 * @generated
	 */
	void setCommunicationPath(CommunicationPath value);

} // Interconnect
