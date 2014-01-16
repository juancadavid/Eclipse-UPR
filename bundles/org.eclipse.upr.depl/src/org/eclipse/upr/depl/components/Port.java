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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Port stereotype is an extension of the UML 2.0 Port metaclass (from UML2.0::CompositeStructure::Ports).
 * The Port stereotype is defined as “required,” which means that every instance of the Port metaclass must be associated
 * with an instance of the Port stereotype.
 * 
 * Note: Restriction. In UML 2.0, a Port can be associated with both required and provided interfaces. In this specification,
 * a Port is restricted to be associated with either required interfaces (user Port) or provided interfaces (provider Port). An
 * OCL constraint could be added to formally express this restriction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.Port#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Port#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Port#getUUID <em>UUID</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Port#getSupportedType <em>Supported Type</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Port#isProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Port#isExclusiveProvider <em>Exclusive Provider</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Port#isExclusiveUser <em>Exclusive User</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Port#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(org.eclipse.uml2.uml.Port)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPort_Base_Port()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Port!base_Port'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Port getBase_Port();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Port#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(org.eclipse.uml2.uml.Port value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPort_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Port!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primary type of the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPort_UUID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Port!UUID'"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Port#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

	/**
	 * Returns the value of the '<em><b>Supported Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All types supported by this port, including the primary and inherited types. All of the types listed in this attribute are
	 * acceptable for a connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Type</em>' attribute list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPort_SupportedType()
	 * @model dataType="org.eclipse.uml2.types.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Port!supportedType'"
	 * @generated
	 */
	EList<String> getSupportedType();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether the port acts in the role of provider or user, for any connection attached to it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(boolean)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPort_Provider()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Port!provider'"
	 * @generated
	 */
	boolean isProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Port#isProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #isProvider()
	 * @generated
	 */
	void setProvider(boolean value);

	/**
	 * Returns the value of the '<em><b>Exclusive Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true, then this port expects that there is at most one provider on the connection that it is an endpoint to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclusive Provider</em>' attribute.
	 * @see #setExclusiveProvider(boolean)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPort_ExclusiveProvider()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Port!exclusiveProvider'"
	 * @generated
	 */
	boolean isExclusiveProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Port#isExclusiveProvider <em>Exclusive Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Provider</em>' attribute.
	 * @see #isExclusiveProvider()
	 * @generated
	 */
	void setExclusiveProvider(boolean value);

	/**
	 * Returns the value of the '<em><b>Exclusive User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true, then this port expects that there is at most one user on the connection that it is an endpoint to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclusive User</em>' attribute.
	 * @see #setExclusiveUser(boolean)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPort_ExclusiveUser()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Port!exclusiveUser'"
	 * @generated
	 */
	boolean isExclusiveUser();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Port#isExclusiveUser <em>Exclusive User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive User</em>' attribute.
	 * @see #isExclusiveUser()
	 * @generated
	 */
	void setExclusiveUser(boolean value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether connecting this port is optional or mandatory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getPort_Optional()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Port!optional'"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Port#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // Port
