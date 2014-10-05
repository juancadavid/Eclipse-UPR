/**
 */
package org.eclipse.upr.bpmnprof.impl;

import java.lang.reflect.InvocationTargetException;

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

import org.eclipse.uml2.uml.ChangeEvent;

import org.eclipse.upr.bpmnprof.BPMNExpression;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ConditionalEventDefinition;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ConditionalEventDefinitionImpl#getBase_ChangeEvent <em>Base Change Event</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ConditionalEventDefinitionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalEventDefinitionImpl extends EventDefinitionImpl implements ConditionalEventDefinition {
	/**
	 * The cached value of the '{@link #getBase_ChangeEvent() <em>Base Change Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ChangeEvent()
	 * @generated
	 * @ordered
	 */
	protected ChangeEvent base_ChangeEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getConditionalEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent getBase_ChangeEvent() {
		if (base_ChangeEvent != null && base_ChangeEvent.eIsProxy()) {
			InternalEObject oldBase_ChangeEvent = (InternalEObject)base_ChangeEvent;
			base_ChangeEvent = (ChangeEvent)eResolveProxy(oldBase_ChangeEvent);
			if (base_ChangeEvent != oldBase_ChangeEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
			}
		}
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent basicGetBase_ChangeEvent() {
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ChangeEvent(ChangeEvent newBase_ChangeEvent) {
		ChangeEvent oldBase_ChangeEvent = base_ChangeEvent;
		base_ChangeEvent = newBase_ChangeEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getCondition() {
		BPMNExpression condition = basicGetCondition();
		return condition != null && condition.eIsProxy() ? (BPMNExpression)eResolveProxy((InternalEObject)condition) : condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetCondition() {
		// TODO: implement this method to return the 'Condition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(BPMNExpression newCondition) {
		// TODO: implement this method to set the 'Condition' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conditionalEventDefinitioncondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.CONDITIONAL_EVENT_DEFINITION__CONDITIONAL_EVENT_DEFINITIONCONDITION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "conditionalEventDefinitioncondition", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__BASE_CHANGE_EVENT:
				if (resolve) return getBase_ChangeEvent();
				return basicGetBase_ChangeEvent();
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)newValue);
				return;
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__CONDITION:
				setCondition((BPMNExpression)newValue);
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
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)null);
				return;
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__CONDITION:
				setCondition((BPMNExpression)null);
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
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__BASE_CHANGE_EVENT:
				return base_ChangeEvent != null;
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION__CONDITION:
				return basicGetCondition() != null;
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
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION___CONDITIONAL_EVENT_DEFINITIONCONDITION__DIAGNOSTICCHAIN_MAP:
				return conditionalEventDefinitioncondition((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConditionalEventDefinitionImpl
