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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.upr.utptypes.Arbiter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.TestContext#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestContext#getBase_StructuredClassifier <em>Base Structured Classifier</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestContext#getTestLevel <em>Test Level</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestContext#getArbiter <em>Arbiter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getTestContext()
 * @model
 * @generated
 */
public interface TestContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Behaviored Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behaviored Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behaviored Classifier</em>' reference.
	 * @see #setBase_BehavioredClassifier(BehavioredClassifier)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestContext_Base_BehavioredClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioredClassifier getBase_BehavioredClassifier();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestContext#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behaviored Classifier</em>' reference.
	 * @see #getBase_BehavioredClassifier()
	 * @generated
	 */
	void setBase_BehavioredClassifier(BehavioredClassifier value);

	/**
	 * Returns the value of the '<em><b>Base Structured Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Structured Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Structured Classifier</em>' reference.
	 * @see #setBase_StructuredClassifier(StructuredClassifier)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestContext_Base_StructuredClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuredClassifier getBase_StructuredClassifier();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestContext#getBase_StructuredClassifier <em>Base Structured Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Structured Classifier</em>' reference.
	 * @see #getBase_StructuredClassifier()
	 * @generated
	 */
	void setBase_StructuredClassifier(StructuredClassifier value);

	/**
	 * Returns the value of the '<em><b>Test Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Level</em>' reference.
	 * @see #setTestLevel(ValueSpecification)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestContext_TestLevel()
	 * @model ordered="false"
	 * @generated
	 */
	ValueSpecification getTestLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestContext#getTestLevel <em>Test Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Level</em>' reference.
	 * @see #getTestLevel()
	 * @generated
	 */
	void setTestLevel(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Arbiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arbiter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arbiter</em>' reference.
	 * @see #setArbiter(Arbiter)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestContext_Arbiter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Arbiter getArbiter();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestContext#getArbiter <em>Arbiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arbiter</em>' reference.
	 * @see #getArbiter()
	 * @generated
	 */
	void setArbiter(Arbiter value);

} // TestContext
