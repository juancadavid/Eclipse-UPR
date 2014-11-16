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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.soaml.Milestone#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.Milestone#getValues <em>Value</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.Milestone#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.Milestone#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.soaml.SoaMLPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends EObject {
	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(int)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getMilestone_Progress()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getProgress();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.Milestone#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getMilestone_Value()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ValueSpecification> getValues();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getValues()
	 * @generated
	 */
	ValueSpecification getValue(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getValues()
	 * @generated
	 */
	ValueSpecification getValue(String name, Type type, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getMilestone_Signal()
	 * @model ordered="false"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.Milestone#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Comment</em>' reference.
	 * @see #setBase_Comment(Comment)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getMilestone_Base_Comment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Comment getBase_Comment();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.Milestone#getBase_Comment <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Comment</em>' reference.
	 * @see #getBase_Comment()
	 * @generated
	 */
	void setBase_Comment(Comment value);

} // Milestone
