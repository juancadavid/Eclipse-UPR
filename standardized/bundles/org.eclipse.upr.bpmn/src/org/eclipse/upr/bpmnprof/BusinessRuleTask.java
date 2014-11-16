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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.OpaqueAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Rule Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::Process::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.BusinessRuleTask#getBase_OpaqueAction <em>Base Opaque Action</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BusinessRuleTask#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBusinessRuleTask()
 * @model
 * @generated
 */
public interface BusinessRuleTask extends Task {
	/**
	 * Returns the value of the '<em><b>Base Opaque Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Opaque Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Opaque Action</em>' reference.
	 * @see #setBase_OpaqueAction(OpaqueAction)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBusinessRuleTask_Base_OpaqueAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OpaqueAction getBase_OpaqueAction();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BusinessRuleTask#getBase_OpaqueAction <em>Base Opaque Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Opaque Action</em>' reference.
	 * @see #getBase_OpaqueAction()
	 * @generated
	 */
	void setBase_OpaqueAction(OpaqueAction value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * The default value is <code>"##unspecified"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBusinessRuleTask_Implementation()
	 * @model default="##unspecified" unique="false" dataType="org.eclipse.uml2.types.String" required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BusinessRuleTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.implementation = self.base_OpaqueAction.body.first
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BusinessRuleTask.implementation'"
	 * @generated
	 */
	boolean BusinessRuleTaskimplementation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BusinessRuleTask
