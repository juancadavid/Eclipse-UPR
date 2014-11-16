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

import org.eclipse.uml2.uml.WriteStructuralFeatureAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Timezone Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.SetTimezoneAction#getBase_WriteStructuralFeatureAction <em>Base Write Structural Feature Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getSetTimezoneAction()
 * @model
 * @generated
 */
public interface SetTimezoneAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Write Structural Feature Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Write Structural Feature Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Write Structural Feature Action</em>' reference.
	 * @see #setBase_WriteStructuralFeatureAction(WriteStructuralFeatureAction)
	 * @see org.eclipse.upr.utp.UTPPackage#getSetTimezoneAction_Base_WriteStructuralFeatureAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WriteStructuralFeatureAction getBase_WriteStructuralFeatureAction();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.SetTimezoneAction#getBase_WriteStructuralFeatureAction <em>Base Write Structural Feature Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Write Structural Feature Action</em>' reference.
	 * @see #getBase_WriteStructuralFeatureAction()
	 * @generated
	 */
	void setBase_WriteStructuralFeatureAction(WriteStructuralFeatureAction value);

} // SetTimezoneAction
