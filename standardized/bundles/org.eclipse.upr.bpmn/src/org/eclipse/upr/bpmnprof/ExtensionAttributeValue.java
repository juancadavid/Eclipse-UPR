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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Slot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Attribute Value</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.ExtensionAttributeValue#getBase_Slot <em>Base Slot</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ExtensionAttributeValue#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ExtensionAttributeValue#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExtensionAttributeValue()
 * @model
 * @generated
 */
public interface ExtensionAttributeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Slot</em>' reference.
	 * @see #setBase_Slot(Slot)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExtensionAttributeValue_Base_Slot()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Slot getBase_Slot();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ExtensionAttributeValue#getBase_Slot <em>Base Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Slot</em>' reference.
	 * @see #getBase_Slot()
	 * @generated
	 */
	void setBase_Slot(Slot value);

	/**
	 * Returns the value of the '<em><b>Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ref</em>' reference.
	 * @see #setValueRef(Element)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExtensionAttributeValue_ValueRef()
	 * @model ordered="false"
	 * @generated
	 */
	Element getValueRef();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ExtensionAttributeValue#getValueRef <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ref</em>' reference.
	 * @see #getValueRef()
	 * @generated
	 */
	void setValueRef(Element value);

	/**
	 * Returns the value of the '<em><b>Extension Attribute Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Attribute Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Attribute Definition</em>' reference.
	 * @see #setExtensionAttributeDefinition(ExtensionAttributeDefinition)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExtensionAttributeValue_ExtensionAttributeDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ExtensionAttributeDefinition getExtensionAttributeDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ExtensionAttributeValue#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Attribute Definition</em>' reference.
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	void setExtensionAttributeDefinition(ExtensionAttributeDefinition value);

} // ExtensionAttributeValue
