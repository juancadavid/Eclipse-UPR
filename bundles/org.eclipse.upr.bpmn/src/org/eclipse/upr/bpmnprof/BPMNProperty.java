/**
 */
package org.eclipse.upr.bpmnprof;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Property</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProperty#getBase_DataStoreNode <em>Base Data Store Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProperty#getUmlProperty <em>Uml Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProperty()
 * @model
 * @generated
 */
public interface BPMNProperty extends ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Base Data Store Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Store Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Store Node</em>' reference.
	 * @see #setBase_DataStoreNode(DataStoreNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProperty_Base_DataStoreNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataStoreNode getBase_DataStoreNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProperty#getBase_DataStoreNode <em>Base Data Store Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Store Node</em>' reference.
	 * @see #getBase_DataStoreNode()
	 * @generated
	 */
	void setBase_DataStoreNode(DataStoreNode value);

	/**
	 * Returns the value of the '<em><b>Uml Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Property</em>' reference.
	 * @see #setUmlProperty(Property)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProperty_UmlProperty()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getUmlProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProperty#getUmlProperty <em>Uml Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Property</em>' reference.
	 * @see #getUmlProperty()
	 * @generated
	 */
	void setUmlProperty(Property value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property elements are NOT
	 * visible in a Process diagram.
	 * Figure
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Property.notation'"
	 * @generated
	 */
	boolean Propertynotation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * may be applied only for:
	 * pin owned by CallActivity or Task
	 * Parameter owned by BPMNProcess 
	 * Variable owned by SubProcess
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPMNProperty.apply'"
	 * @generated
	 */
	boolean BPMNPropertyapply(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BPMNProperty
