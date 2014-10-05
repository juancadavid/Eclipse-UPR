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

import org.eclipse.uml2.uml.ParameterSet;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.DataOutput;
import org.eclipse.upr.bpmnprof.OutputSet;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.OutputSetImpl#getBase_ParameterSet <em>Base Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.OutputSetImpl#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.OutputSetImpl#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.OutputSetImpl#getDataOutputRefs <em>Data Output Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputSetImpl extends BaseElementImpl implements OutputSet {
	/**
	 * The cached value of the '{@link #getBase_ParameterSet() <em>Base Parameter Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ParameterSet()
	 * @generated
	 * @ordered
	 */
	protected ParameterSet base_ParameterSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getOutputSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getBase_ParameterSet() {
		if (base_ParameterSet != null && base_ParameterSet.eIsProxy()) {
			InternalEObject oldBase_ParameterSet = (InternalEObject)base_ParameterSet;
			base_ParameterSet = (ParameterSet)eResolveProxy(oldBase_ParameterSet);
			if (base_ParameterSet != oldBase_ParameterSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.OUTPUT_SET__BASE_PARAMETER_SET, oldBase_ParameterSet, base_ParameterSet));
			}
		}
		return base_ParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet basicGetBase_ParameterSet() {
		return base_ParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ParameterSet(ParameterSet newBase_ParameterSet) {
		ParameterSet oldBase_ParameterSet = base_ParameterSet;
		base_ParameterSet = newBase_ParameterSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.OUTPUT_SET__BASE_PARAMETER_SET, oldBase_ParameterSet, base_ParameterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutput> getOptionalOutputRefs() {
		// TODO: implement this method to return the 'Optional Output Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutput> getWhileExecutingOutputRefs() {
		// TODO: implement this method to return the 'While Executing Output Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutput> getDataOutputRefs() {
		// TODO: implement this method to return the 'Data Output Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OutputSetdataOutputRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.OUTPUT_SET__OUTPUT_SETDATA_OUTPUT_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OutputSetdataOutputRefs", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean OutputSetoptionalOutputRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.OUTPUT_SET__OUTPUT_SETOPTIONAL_OUTPUT_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OutputSetoptionalOutputRefs", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean OutputSetwhileExecutingOutputRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.OUTPUT_SET__OUTPUT_SETWHILE_EXECUTING_OUTPUT_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OutputSetwhileExecutingOutputRefs", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.OUTPUT_SET__BASE_PARAMETER_SET:
				if (resolve) return getBase_ParameterSet();
				return basicGetBase_ParameterSet();
			case BpmnprofPackage.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
				return getOptionalOutputRefs();
			case BpmnprofPackage.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
				return getWhileExecutingOutputRefs();
			case BpmnprofPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
				return getDataOutputRefs();
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
			case BpmnprofPackage.OUTPUT_SET__BASE_PARAMETER_SET:
				setBase_ParameterSet((ParameterSet)newValue);
				return;
			case BpmnprofPackage.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
				getOptionalOutputRefs().clear();
				getOptionalOutputRefs().addAll((Collection<? extends DataOutput>)newValue);
				return;
			case BpmnprofPackage.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
				getWhileExecutingOutputRefs().clear();
				getWhileExecutingOutputRefs().addAll((Collection<? extends DataOutput>)newValue);
				return;
			case BpmnprofPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
				getDataOutputRefs().clear();
				getDataOutputRefs().addAll((Collection<? extends DataOutput>)newValue);
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
			case BpmnprofPackage.OUTPUT_SET__BASE_PARAMETER_SET:
				setBase_ParameterSet((ParameterSet)null);
				return;
			case BpmnprofPackage.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
				getOptionalOutputRefs().clear();
				return;
			case BpmnprofPackage.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
				getWhileExecutingOutputRefs().clear();
				return;
			case BpmnprofPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
				getDataOutputRefs().clear();
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
			case BpmnprofPackage.OUTPUT_SET__BASE_PARAMETER_SET:
				return base_ParameterSet != null;
			case BpmnprofPackage.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
				return !getOptionalOutputRefs().isEmpty();
			case BpmnprofPackage.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
				return !getWhileExecutingOutputRefs().isEmpty();
			case BpmnprofPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
				return !getDataOutputRefs().isEmpty();
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
			case BpmnprofPackage.OUTPUT_SET___OUTPUT_SETDATA_OUTPUT_REFS__DIAGNOSTICCHAIN_MAP:
				return OutputSetdataOutputRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.OUTPUT_SET___OUTPUT_SETOPTIONAL_OUTPUT_REFS__DIAGNOSTICCHAIN_MAP:
				return OutputSetoptionalOutputRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.OUTPUT_SET___OUTPUT_SETWHILE_EXECUTING_OUTPUT_REFS__DIAGNOSTICCHAIN_MAP:
				return OutputSetwhileExecutingOutputRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OutputSetImpl
