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
package org.eclipse.upr.utptypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utptypes.Timer#isRunning <em>Is Running</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utptypes.UTPLibPackage#getTimer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Timer extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Running</em>' attribute.
	 * @see org.eclipse.upr.utptypes.UTPLibPackage#getTimer_IsRunning()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expireDataType="org.eclipse.upr.utptypes.Timepoint" expireRequired="true" expireOrdered="false"
	 * @generated
	 */
	void start(String expire);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expireDataType="org.eclipse.upr.utptypes.Duration" expireRequired="true" expireOrdered="false"
	 * @generated
	 */
	void start2(String expire);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.upr.utptypes.Duration" required="true" ordered="false"
	 * @generated
	 */
	String read();

} // Timer
