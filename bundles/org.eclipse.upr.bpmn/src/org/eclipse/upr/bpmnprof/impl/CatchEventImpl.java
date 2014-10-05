/**
 */
package org.eclipse.upr.bpmnprof.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.InitialNode;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.CatchEvent;
import org.eclipse.upr.bpmnprof.DataOutputAssociation;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CatchEventImpl#isParallelMultiple <em>Parallel Multiple</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CatchEventImpl#getBase_AcceptEventAction <em>Base Accept Event Action</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CatchEventImpl#getBase_InitialNode <em>Base Initial Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CatchEventImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CatchEventImpl extends BPMNEventImpl implements CatchEvent {
	/**
	 * The default value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean parallelMultiple = PARALLEL_MULTIPLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_AcceptEventAction() <em>Base Accept Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_AcceptEventAction()
	 * @generated
	 * @ordered
	 */
	protected AcceptEventAction base_AcceptEventAction;

	/**
	 * The cached value of the '{@link #getBase_InitialNode() <em>Base Initial Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InitialNode()
	 * @generated
	 * @ordered
	 */
	protected InitialNode base_InitialNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getCatchEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParallelMultiple() {
		return parallelMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelMultiple(boolean newParallelMultiple) {
		boolean oldParallelMultiple = parallelMultiple;
		parallelMultiple = newParallelMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CATCH_EVENT__PARALLEL_MULTIPLE, oldParallelMultiple, parallelMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction getBase_AcceptEventAction() {
		if (base_AcceptEventAction != null && base_AcceptEventAction.eIsProxy()) {
			InternalEObject oldBase_AcceptEventAction = (InternalEObject)base_AcceptEventAction;
			base_AcceptEventAction = (AcceptEventAction)eResolveProxy(oldBase_AcceptEventAction);
			if (base_AcceptEventAction != oldBase_AcceptEventAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CATCH_EVENT__BASE_ACCEPT_EVENT_ACTION, oldBase_AcceptEventAction, base_AcceptEventAction));
			}
		}
		return base_AcceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction basicGetBase_AcceptEventAction() {
		return base_AcceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_AcceptEventAction(AcceptEventAction newBase_AcceptEventAction) {
		AcceptEventAction oldBase_AcceptEventAction = base_AcceptEventAction;
		base_AcceptEventAction = newBase_AcceptEventAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CATCH_EVENT__BASE_ACCEPT_EVENT_ACTION, oldBase_AcceptEventAction, base_AcceptEventAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode getBase_InitialNode() {
		if (base_InitialNode != null && base_InitialNode.eIsProxy()) {
			InternalEObject oldBase_InitialNode = (InternalEObject)base_InitialNode;
			base_InitialNode = (InitialNode)eResolveProxy(oldBase_InitialNode);
			if (base_InitialNode != oldBase_InitialNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CATCH_EVENT__BASE_INITIAL_NODE, oldBase_InitialNode, base_InitialNode));
			}
		}
		return base_InitialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode basicGetBase_InitialNode() {
		return base_InitialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InitialNode(InitialNode newBase_InitialNode) {
		InitialNode oldBase_InitialNode = base_InitialNode;
		base_InitialNode = newBase_InitialNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CATCH_EVENT__BASE_INITIAL_NODE, oldBase_InitialNode, base_InitialNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutputAssociation> getDataOutputAssociation() {
		// TODO: implement this method to return the 'Data Output Association' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean catchEventeventDefinitionsRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.CATCH_EVENT__CATCH_EVENTEVENT_DEFINITIONS_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "catchEventeventDefinitionsRefs", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				return isParallelMultiple();
			case BpmnprofPackage.CATCH_EVENT__BASE_ACCEPT_EVENT_ACTION:
				if (resolve) return getBase_AcceptEventAction();
				return basicGetBase_AcceptEventAction();
			case BpmnprofPackage.CATCH_EVENT__BASE_INITIAL_NODE:
				if (resolve) return getBase_InitialNode();
				return basicGetBase_InitialNode();
			case BpmnprofPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
				return getDataOutputAssociation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnprofPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				setParallelMultiple((Boolean)newValue);
				return;
			case BpmnprofPackage.CATCH_EVENT__BASE_ACCEPT_EVENT_ACTION:
				setBase_AcceptEventAction((AcceptEventAction)newValue);
				return;
			case BpmnprofPackage.CATCH_EVENT__BASE_INITIAL_NODE:
				setBase_InitialNode((InitialNode)newValue);
				return;
			case BpmnprofPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				getDataOutputAssociation().addAll((Collection<? extends DataOutputAssociation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpmnprofPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				setParallelMultiple(PARALLEL_MULTIPLE_EDEFAULT);
				return;
			case BpmnprofPackage.CATCH_EVENT__BASE_ACCEPT_EVENT_ACTION:
				setBase_AcceptEventAction((AcceptEventAction)null);
				return;
			case BpmnprofPackage.CATCH_EVENT__BASE_INITIAL_NODE:
				setBase_InitialNode((InitialNode)null);
				return;
			case BpmnprofPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpmnprofPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				return parallelMultiple != PARALLEL_MULTIPLE_EDEFAULT;
			case BpmnprofPackage.CATCH_EVENT__BASE_ACCEPT_EVENT_ACTION:
				return base_AcceptEventAction != null;
			case BpmnprofPackage.CATCH_EVENT__BASE_INITIAL_NODE:
				return base_InitialNode != null;
			case BpmnprofPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
				return !getDataOutputAssociation().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BpmnprofPackage.CATCH_EVENT___CATCH_EVENTEVENT_DEFINITIONS_REFS__DIAGNOSTICCHAIN_MAP:
				return catchEventeventDefinitionsRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (parallelMultiple: ");
		result.append(parallelMultiple);
		result.append(')');
		return result.toString();
	}

} //CatchEventImpl
