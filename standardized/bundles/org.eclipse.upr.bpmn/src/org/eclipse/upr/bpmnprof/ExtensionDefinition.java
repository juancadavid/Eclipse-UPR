/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 */
package org.eclipse.upr.bpmnprof;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Stereotype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::CoreStructure::Foundation.</p>
 * <p>From package BPMNProfile::CoreStructure::Service.</p>
 * <p>From package BPMNProfile::Collaboration::Conversation.</p>
 * <p>From package BPMNProfile::CoreStructure.</p>
 * <p>From package BPMNProfile::Process::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.ExtensionDefinition#getBase_Stereotype <em>Base Stereotype</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ExtensionDefinition#getExtensionAttributeDefinitions <em>Extension Attribute Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExtensionDefinition()
 * @model
 * @generated
 */
public interface ExtensionDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Stereotype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Stereotype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Stereotype</em>' reference.
	 * @see #setBase_Stereotype(Stereotype)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExtensionDefinition_Base_Stereotype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Stereotype getBase_Stereotype();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ExtensionDefinition#getBase_Stereotype <em>Base Stereotype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Stereotype</em>' reference.
	 * @see #getBase_Stereotype()
	 * @generated
	 */
	void setBase_Stereotype(Stereotype value);

	/**
	 * Returns the value of the '<em><b>Extension Attribute Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.ExtensionAttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Attribute Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Attribute Definitions</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExtensionDefinition_ExtensionAttributeDefinitions()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionAttributeDefinition> getExtensionAttributeDefinitions();

} // ExtensionDefinition
