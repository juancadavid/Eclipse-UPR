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
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ParameterSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
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
 *   <li>{@link org.eclipse.upr.bpmnprof.InputSet#getBase_ParameterSet <em>Base Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.InputSet#getOptionalInputRefs <em>Optional Input Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.InputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.InputSet#getDataInputRefs <em>Data Input Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getInputSet()
 * @model
 * @generated
 */
public interface InputSet extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Base Parameter Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Parameter Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Parameter Set</em>' reference.
	 * @see #setBase_ParameterSet(ParameterSet)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getInputSet_Base_ParameterSet()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterSet getBase_ParameterSet();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.InputSet#getBase_ParameterSet <em>Base Parameter Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Parameter Set</em>' reference.
	 * @see #getBase_ParameterSet()
	 * @generated
	 */
	void setBase_ParameterSet(ParameterSet value);

	/**
	 * Returns the value of the '<em><b>Optional Input Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.DataInput}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.DataInput#getInputSetWithOptional <em>Input Set With Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Input Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Input Refs</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getInputSet_OptionalInputRefs()
	 * @see org.eclipse.upr.bpmnprof.DataInput#getInputSetWithOptional
	 * @model opposite="inputSetWithOptional" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataInput> getOptionalInputRefs();

	/**
	 * Returns the value of the '<em><b>While Executing Input Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.DataInput}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.DataInput#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Executing Input Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Executing Input Refs</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getInputSet_WhileExecutingInputRefs()
	 * @see org.eclipse.upr.bpmnprof.DataInput#getInputSetWithWhileExecuting
	 * @model opposite="inputSetWithWhileExecuting" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataInput> getWhileExecutingInputRefs();

	/**
	 * Returns the value of the '<em><b>Data Input Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.DataInput}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.DataInput#getInputSetRefs <em>Input Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Input Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input Refs</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getInputSet_DataInputRefs()
	 * @see org.eclipse.upr.bpmnprof.DataInput#getInputSetRefs
	 * @model opposite="inputSetRefs" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataInput> getDataInputRefs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InputSet::/dataInputRefs : DataIntput [*] = ParameterSet.parameter
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='InputSet.dataInputRefs'"
	 * @generated
	 */
	boolean InputSetdataInputRefs(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InputSet::/optionalInputRefs : DataInput [*] = ParameterSet.parameters with multiplicity lower = 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='InputSet.optionalInputRefs'"
	 * @generated
	 */
	boolean InputSetoptionalInputRefs(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InputSet::/whileExecutingInputRefs : DataInput [*] = ParameterSet.parameters with isStreaming = true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='InputSet.whileExecutingInputRefs'"
	 * @generated
	 */
	boolean InputSetwhileExecutingInputRefs(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InputSet
