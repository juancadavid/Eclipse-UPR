/**
 */
package org.eclipse.upr.bpmnprof;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Input</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.DataInput#isCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.DataInput#getBase_InputPin <em>Base Input Pin</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.DataInput#getBase_Parameter <em>Base Parameter</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.DataInput#getBase_ActivityParameterNode <em>Base Activity Parameter Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.DataInput#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.DataInput#getInputSetWithOptional <em>Input Set With Optional</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.DataInput#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getDataInput()
 * @model
 * @generated
 */
public interface DataInput extends ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(boolean)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getDataInput_IsCollection()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCollection();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.DataInput#isCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Input Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Input Pin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Input Pin</em>' reference.
	 * @see #setBase_InputPin(InputPin)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getDataInput_Base_InputPin()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InputPin getBase_InputPin();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.DataInput#getBase_InputPin <em>Base Input Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Input Pin</em>' reference.
	 * @see #getBase_InputPin()
	 * @generated
	 */
	void setBase_InputPin(InputPin value);

	/**
	 * Returns the value of the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Parameter</em>' reference.
	 * @see #setBase_Parameter(Parameter)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getDataInput_Base_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getBase_Parameter();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.DataInput#getBase_Parameter <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Parameter</em>' reference.
	 * @see #getBase_Parameter()
	 * @generated
	 */
	void setBase_Parameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Base Activity Parameter Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity Parameter Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity Parameter Node</em>' reference.
	 * @see #setBase_ActivityParameterNode(ActivityParameterNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getDataInput_Base_ActivityParameterNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActivityParameterNode getBase_ActivityParameterNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.DataInput#getBase_ActivityParameterNode <em>Base Activity Parameter Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity Parameter Node</em>' reference.
	 * @see #getBase_ActivityParameterNode()
	 * @generated
	 */
	void setBase_ActivityParameterNode(ActivityParameterNode value);

	/**
	 * Returns the value of the '<em><b>Input Set Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.InputSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set Refs</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getDataInput_InputSetRefs()
	 * @see org.eclipse.upr.bpmnprof.InputSet#getDataInputRefs
	 * @model opposite="dataInputRefs" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetRefs();

	/**
	 * Returns the value of the '<em><b>Input Set With Optional</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.InputSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.InputSet#getOptionalInputRefs <em>Optional Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set With Optional</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set With Optional</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getDataInput_InputSetWithOptional()
	 * @see org.eclipse.upr.bpmnprof.InputSet#getOptionalInputRefs
	 * @model opposite="optionalInputRefs" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetWithOptional();

	/**
	 * Returns the value of the '<em><b>Input Set With While Executing</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.InputSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.InputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set With While Executing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set With While Executing</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getDataInput_InputSetWithWhileExecuting()
	 * @see org.eclipse.upr.bpmnprof.InputSet#getWhileExecutingInputRefs
	 * @model opposite="whileExecutingInputRefs" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetWithWhileExecuting();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataInput must not have incoming DataAssociations
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DataInput.Association'"
	 * @generated
	 */
	boolean DataInputAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataInput owned by BPMN Process has a notation. 
	 * DataInput owned by BPMN Activity has no notation. 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DataInput.notation'"
	 * @generated
	 */
	boolean DataInputnotation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataInput::/itemSubjectRef :ItemDefinition [0..1] = ObjectNode.type (defined on typed element)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DataInput.itemSubjectRef'"
	 * @generated
	 */
	boolean DataInputitemSubjectRef(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DataInput
