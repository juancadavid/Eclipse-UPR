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
package org.eclipse.upr.utp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Objective Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.TestObjectiveSpecification#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestObjectiveSpecification#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestObjectiveSpecification#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestObjectiveSpecification#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestObjectiveSpecification#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getTestObjectiveSpecification()
 * @model
 * @generated
 */
public interface TestObjectiveSpecification extends EObject {
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
	 * @see org.eclipse.upr.utp.UTPPackage#getTestObjectiveSpecification_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestObjectiveSpecification#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestObjectiveSpecification_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestObjectiveSpecification#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestObjectiveSpecification_Specification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestObjectiveSpecification#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(ValueSpecification)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestObjectiveSpecification_Priority()
	 * @model ordered="false"
	 * @generated
	 */
	ValueSpecification getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestObjectiveSpecification#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute list.
	 * @see org.eclipse.upr.utp.UTPPackage#getTestObjectiveSpecification_References()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getReferences();

} // TestObjectiveSpecification
