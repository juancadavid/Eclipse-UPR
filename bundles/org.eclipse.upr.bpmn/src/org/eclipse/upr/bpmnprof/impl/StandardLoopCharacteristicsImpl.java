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

import org.eclipse.uml2.uml.LoopNode;

import org.eclipse.upr.bpmnprof.BPMNExpression;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.StandardLoopCharacteristics;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.StandardLoopCharacteristicsImpl#getLoopMaximum <em>Loop Maximum</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.StandardLoopCharacteristicsImpl#getBase_LoopNode <em>Base Loop Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.StandardLoopCharacteristicsImpl#isTestBefore <em>Test Before</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.StandardLoopCharacteristicsImpl#getLoopCondition <em>Loop Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardLoopCharacteristicsImpl extends LoopCharacteristicsImpl implements StandardLoopCharacteristics {
	/**
	 * The default value of the '{@link #getLoopMaximum() <em>Loop Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final int LOOP_MAXIMUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoopMaximum() <em>Loop Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopMaximum()
	 * @generated
	 * @ordered
	 */
	protected int loopMaximum = LOOP_MAXIMUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_LoopNode() <em>Base Loop Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_LoopNode()
	 * @generated
	 * @ordered
	 */
	protected LoopNode base_LoopNode;

	/**
	 * The default value of the '{@link #isTestBefore() <em>Test Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBefore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BEFORE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardLoopCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getStandardLoopCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoopMaximum() {
		return loopMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopMaximum(int newLoopMaximum) {
		int oldLoopMaximum = loopMaximum;
		loopMaximum = newLoopMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM, oldLoopMaximum, loopMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNode getBase_LoopNode() {
		if (base_LoopNode != null && base_LoopNode.eIsProxy()) {
			InternalEObject oldBase_LoopNode = (InternalEObject)base_LoopNode;
			base_LoopNode = (LoopNode)eResolveProxy(oldBase_LoopNode);
			if (base_LoopNode != oldBase_LoopNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__BASE_LOOP_NODE, oldBase_LoopNode, base_LoopNode));
			}
		}
		return base_LoopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNode basicGetBase_LoopNode() {
		return base_LoopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_LoopNode(LoopNode newBase_LoopNode) {
		LoopNode oldBase_LoopNode = base_LoopNode;
		base_LoopNode = newBase_LoopNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__BASE_LOOP_NODE, oldBase_LoopNode, base_LoopNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTestBefore() {
		// TODO: implement this method to return the 'Test Before' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestBefore(boolean newTestBefore) {
		// TODO: implement this method to set the 'Test Before' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getLoopCondition() {
		BPMNExpression loopCondition = basicGetLoopCondition();
		return loopCondition != null && loopCondition.eIsProxy() ? (BPMNExpression)eResolveProxy((InternalEObject)loopCondition) : loopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetLoopCondition() {
		// TODO: implement this method to return the 'Loop Condition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCondition(BPMNExpression newLoopCondition) {
		// TODO: implement this method to set the 'Loop Condition' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StandardLoopCharacteristicstestBefore(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.STANDARD_LOOP_CHARACTERISTICS__STANDARD_LOOP_CHARACTERISTICSTEST_BEFORE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StandardLoopCharacteristicstestBefore", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean StandardLoopCharacteristicsloopCondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.STANDARD_LOOP_CHARACTERISTICS__STANDARD_LOOP_CHARACTERISTICSLOOP_CONDITION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StandardLoopCharacteristicsloopCondition", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
				return getLoopMaximum();
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__BASE_LOOP_NODE:
				if (resolve) return getBase_LoopNode();
				return basicGetBase_LoopNode();
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
				return isTestBefore();
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
				if (resolve) return getLoopCondition();
				return basicGetLoopCondition();
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
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
				setLoopMaximum((Integer)newValue);
				return;
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__BASE_LOOP_NODE:
				setBase_LoopNode((LoopNode)newValue);
				return;
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
				setTestBefore((Boolean)newValue);
				return;
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
				setLoopCondition((BPMNExpression)newValue);
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
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
				setLoopMaximum(LOOP_MAXIMUM_EDEFAULT);
				return;
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__BASE_LOOP_NODE:
				setBase_LoopNode((LoopNode)null);
				return;
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
				setTestBefore(TEST_BEFORE_EDEFAULT);
				return;
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
				setLoopCondition((BPMNExpression)null);
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
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
				return loopMaximum != LOOP_MAXIMUM_EDEFAULT;
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__BASE_LOOP_NODE:
				return base_LoopNode != null;
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
				return isTestBefore() != TEST_BEFORE_EDEFAULT;
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
				return basicGetLoopCondition() != null;
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
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS___STANDARD_LOOP_CHARACTERISTICSTEST_BEFORE__DIAGNOSTICCHAIN_MAP:
				return StandardLoopCharacteristicstestBefore((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS___STANDARD_LOOP_CHARACTERISTICSLOOP_CONDITION__DIAGNOSTICCHAIN_MAP:
				return StandardLoopCharacteristicsloopCondition((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (loopMaximum: ");
		result.append(loopMaximum);
		result.append(')');
		return result.toString();
	}

} //StandardLoopCharacteristicsImpl
