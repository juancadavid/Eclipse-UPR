/**
 */
package org.eclipse.upr.bpmnprof;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::Collaboration::Conversation.</p>
 * <p>From package BPMNProfile::CoreStructure.</p>
 * <p>From package BPMNProfile::Process::Activities.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getGlobalConversation()
 * @model
 * @generated
 */
public interface GlobalConversation extends BPMNCollaboration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A GlobalConversation MUST NOT contain any ConversationNodes.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GlobalConversation.contained.elements'"
	 * @generated
	 */
	boolean GlobalConversationcontainedelements(DiagnosticChain diagnostics, Map<Object, Object> context);

} // GlobalConversation
