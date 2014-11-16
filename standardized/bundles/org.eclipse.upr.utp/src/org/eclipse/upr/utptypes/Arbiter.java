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
 * A representation of the model object '<em><b>Arbiter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.upr.utptypes.UTPLibPackage#getArbiter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Arbiter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Verdict getVerdict();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vRequired="true" vOrdered="false"
	 * @generated
	 */
	void setVerdict(Verdict v);

} // Arbiter
