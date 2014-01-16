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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.soaml.CollaborationUse#getBase_CollaborationUse <em>Base Collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.CollaborationUse#isStrict <em>Is Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.soaml.SoaMLPackage#getCollaborationUse()
 * @model
 * @generated
 */
public interface CollaborationUse extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Collaboration Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Collaboration Use</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Collaboration Use</em>' reference.
	 * @see #setBase_CollaborationUse(org.eclipse.uml2.uml.CollaborationUse)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getCollaborationUse_Base_CollaborationUse()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.CollaborationUse getBase_CollaborationUse();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.CollaborationUse#getBase_CollaborationUse <em>Base Collaboration Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Collaboration Use</em>' reference.
	 * @see #getBase_CollaborationUse()
	 * @generated
	 */
	void setBase_CollaborationUse(org.eclipse.uml2.uml.CollaborationUse value);

	/**
	 * Returns the value of the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strict</em>' attribute.
	 * @see #setIsStrict(boolean)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getCollaborationUse_IsStrict()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.CollaborationUse#isStrict <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict</em>' attribute.
	 * @see #isStrict()
	 * @generated
	 */
	void setIsStrict(boolean value);

} // CollaborationUse
