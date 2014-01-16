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
 * A representation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Bridge stereotype extends the UML 2.0 AssociationClass metaclass (from UML2.0::AssociationClasses). A Bridge is
 * a special type of association that connects two or more interconnects.
 * A Bridge exists between Interconnects to describe an indirect communication path between nodes. If a connection is to be
 * deployed between components that are instantiated on nodes that are not directly connected, therefore requiring bridging,
 * the connection's requirements must be satisfied by the resources of each interconnect and bridge in between.
 * 
 * Constraints:
 * The name must be unique within the domain.
 * All ends of a Bridge are typed by Interconnects
 * The name must be unique within the domain
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.Bridge#getBase_AssociationClass <em>Base Association Class</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Bridge#getOwnedResource <em>Owned Resource</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Bridge#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Bridge#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Bridge#getCommunicationPath <em>Communication Path</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Bridge#getInterconnect <em>Interconnect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.target.TargetPackage#getBridge()
 * @model
 * @generated
 */
public interface Bridge extends EObject {
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
	 * @see org.eclipse.upr.depl.target.TargetPackage#getBridge_Base_AssociationClass()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Bridge!base_AssociationClass'"
	 * @generated
	 */
	AssociationClass getBase_AssociationClass();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Bridge#getBase_AssociationClass <em>Base Association Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association Class</em>' reference.
	 * @see #getBase_AssociationClass()
	 * @generated
	 */
	void setBase_AssociationClass(AssociationClass value);

	/**
	 * Returns the value of the '<em><b>Owned Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of Resources owned by the Bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Resource</em>' containment reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getBridge_OwnedResource()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Bridge!ownedResource'"
	 * @generated
	 */
	EList<Resource> getOwnedResource();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bridge’s name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getBridge_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Bridge!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Bridge#getName <em>Name</em>}' attribute.
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
	 * An optional human-readable label for this bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getBridge_Label()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Bridge!label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Bridge#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Communication Path</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.CommunicationPath#getBridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference the CommunicationPath the Interconnect belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Path</em>' container reference.
	 * @see #setCommunicationPath(CommunicationPath)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getBridge_CommunicationPath()
	 * @see org.eclipse.upr.depl.target.CommunicationPath#getBridge
	 * @model opposite="bridge" required="true" transient="false" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Bridge!communicationPath'"
	 * @generated
	 */
	CommunicationPath getCommunicationPath();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Bridge#getCommunicationPath <em>Communication Path</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Path</em>' container reference.
	 * @see #getCommunicationPath()
	 * @generated
	 */
	void setCommunicationPath(CommunicationPath value);

	/**
	 * Returns the value of the '<em><b>Interconnect</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Interconnect}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.Interconnect#getBridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interconnects that this Bridge provides connectivity to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnect</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getBridge_Interconnect()
	 * @see org.eclipse.upr.depl.target.Interconnect#getBridge
	 * @model opposite="bridge" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Bridge!interconnect'"
	 * @generated
	 */
	EList<Interconnect> getInterconnect();

} // Bridge
