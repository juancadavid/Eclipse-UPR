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

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::CoreStructure::Common.</p>
 * <p>From package BPMNProfile::Process::Data.</p>
 * <p>From package BPMNProfile::Process::HumanInteraction.</p>
 * <p>From package BPMNProfile::Collaboration.</p>
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
 *   <li>{@link org.eclipse.upr.bpmnprof.CorrelationProperty#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.CorrelationProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.CorrelationProperty#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCorrelationProperty()
 * @model
 * @generated
 */
public interface CorrelationProperty extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCorrelationProperty_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CorrelationProperty#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ItemDefinition)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCorrelationProperty_Type()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ItemDefinition getType();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CorrelationProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Retrieval Expression</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.CorrelationPropertyRetrievalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Retrieval Expression</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Retrieval Expression</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCorrelationProperty_CorrelationPropertyRetrievalExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationPropertyRetrievalExpression> getCorrelationPropertyRetrievalExpression();

} // CorrelationProperty
