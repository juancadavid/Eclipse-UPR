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

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Property Binding</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.CorrelationPropertyBinding#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCorrelationPropertyBinding()
 * @model
 * @generated
 */
public interface CorrelationPropertyBinding extends BaseElement {
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
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCorrelationPropertyBinding_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CorrelationPropertyBinding#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' reference.
	 * @see #setDataPath(FormalExpression)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCorrelationPropertyBinding_DataPath()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FormalExpression getDataPath();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' reference.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(FormalExpression value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Ref</em>' reference.
	 * @see #setCorrelationPropertyRef(CorrelationProperty)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCorrelationPropertyBinding_CorrelationPropertyRef()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	CorrelationProperty getCorrelationPropertyRef();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Property Ref</em>' reference.
	 * @see #getCorrelationPropertyRef()
	 * @generated
	 */
	void setCorrelationPropertyRef(CorrelationProperty value);

} // CorrelationPropertyBinding
