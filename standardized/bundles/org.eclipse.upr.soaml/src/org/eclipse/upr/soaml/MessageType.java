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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.soaml.MessageType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.MessageType#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.MessageType#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.MessageType#getBase_Signal <em>Base Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.soaml.SoaMLPackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getMessageType_Encoding()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.MessageType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getMessageType_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.MessageType#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getMessageType_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.MessageType#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Base Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Signal</em>' reference.
	 * @see #setBase_Signal(Signal)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getMessageType_Base_Signal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signal getBase_Signal();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.MessageType#getBase_Signal <em>Base Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Signal</em>' reference.
	 * @see #getBase_Signal()
	 * @generated
	 */
	void setBase_Signal(Signal value);

} // MessageType
