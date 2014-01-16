/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Marc-Florian Wendland
 */
package org.eclipse.upr.utp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.upr.utp.TestLog;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.TestLogImpl#getTesters <em>Tester</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestLogImpl#getExecutionAt <em>Execution At</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestLogImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestLogImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestLogImpl#getVerdictReasons <em>Verdict Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestLogImpl extends EObjectImpl implements TestLog {
	/**
	 * The cached value of the '{@link #getTesters() <em>Tester</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTesters()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> testers;

	/**
	 * The default value of the '{@link #getExecutionAt() <em>Execution At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionAt()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXECUTION_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionAt() <em>Execution At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionAt()
	 * @generated
	 * @ordered
	 */
	protected Object executionAt = EXECUTION_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Object DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Object duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdict()
	 * @generated
	 * @ordered
	 */
	protected static final Object VERDICT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdict()
	 * @generated
	 * @ordered
	 */
	protected Object verdict = VERDICT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVerdictReasons() <em>Verdict Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdictReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> verdictReasons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.TEST_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getTesters() {
		if (testers == null) {
			testers = new EObjectResolvingEList<ValueSpecification>(ValueSpecification.class, this, UTPPackage.TEST_LOG__TESTER);
		}
		return testers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getTester(String name, Type type) {
		return getTester(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getTester(String name, Type type, boolean ignoreCase, EClass eClass) {
		testerLoop: for (ValueSpecification tester : getTesters()) {
			if (eClass != null && !eClass.isInstance(tester))
				continue testerLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(tester.getName()) : name.equals(tester.getName())))
				continue testerLoop;
			if (type != null && !type.equals(tester.getType()))
				continue testerLoop;
			return tester;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExecutionAt() {
		return executionAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionAt(Object newExecutionAt) {
		Object oldExecutionAt = executionAt;
		executionAt = newExecutionAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_LOG__EXECUTION_AT, oldExecutionAt, executionAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Object newDuration) {
		Object oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_LOG__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVerdict() {
		return verdict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerdict(Object newVerdict) {
		Object oldVerdict = verdict;
		verdict = newVerdict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_LOG__VERDICT, oldVerdict, verdict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getVerdictReasons() {
		if (verdictReasons == null) {
			verdictReasons = new EObjectResolvingEList<ValueSpecification>(ValueSpecification.class, this, UTPPackage.TEST_LOG__VERDICT_REASON);
		}
		return verdictReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getVerdictReason(String name, Type type) {
		return getVerdictReason(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getVerdictReason(String name, Type type, boolean ignoreCase, EClass eClass) {
		verdictReasonLoop: for (ValueSpecification verdictReason : getVerdictReasons()) {
			if (eClass != null && !eClass.isInstance(verdictReason))
				continue verdictReasonLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(verdictReason.getName()) : name.equals(verdictReason.getName())))
				continue verdictReasonLoop;
			if (type != null && !type.equals(verdictReason.getType()))
				continue verdictReasonLoop;
			return verdictReason;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.TEST_LOG__TESTER:
				return getTesters();
			case UTPPackage.TEST_LOG__EXECUTION_AT:
				return getExecutionAt();
			case UTPPackage.TEST_LOG__DURATION:
				return getDuration();
			case UTPPackage.TEST_LOG__VERDICT:
				return getVerdict();
			case UTPPackage.TEST_LOG__VERDICT_REASON:
				return getVerdictReasons();
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
			case UTPPackage.TEST_LOG__TESTER:
				getTesters().clear();
				getTesters().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UTPPackage.TEST_LOG__EXECUTION_AT:
				setExecutionAt(newValue);
				return;
			case UTPPackage.TEST_LOG__DURATION:
				setDuration(newValue);
				return;
			case UTPPackage.TEST_LOG__VERDICT:
				setVerdict(newValue);
				return;
			case UTPPackage.TEST_LOG__VERDICT_REASON:
				getVerdictReasons().clear();
				getVerdictReasons().addAll((Collection<? extends ValueSpecification>)newValue);
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
			case UTPPackage.TEST_LOG__TESTER:
				getTesters().clear();
				return;
			case UTPPackage.TEST_LOG__EXECUTION_AT:
				setExecutionAt(EXECUTION_AT_EDEFAULT);
				return;
			case UTPPackage.TEST_LOG__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case UTPPackage.TEST_LOG__VERDICT:
				setVerdict(VERDICT_EDEFAULT);
				return;
			case UTPPackage.TEST_LOG__VERDICT_REASON:
				getVerdictReasons().clear();
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
			case UTPPackage.TEST_LOG__TESTER:
				return testers != null && !testers.isEmpty();
			case UTPPackage.TEST_LOG__EXECUTION_AT:
				return EXECUTION_AT_EDEFAULT == null ? executionAt != null : !EXECUTION_AT_EDEFAULT.equals(executionAt);
			case UTPPackage.TEST_LOG__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case UTPPackage.TEST_LOG__VERDICT:
				return VERDICT_EDEFAULT == null ? verdict != null : !VERDICT_EDEFAULT.equals(verdict);
			case UTPPackage.TEST_LOG__VERDICT_REASON:
				return verdictReasons != null && !verdictReasons.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (executionAt: ");
		result.append(executionAt);
		result.append(", duration: ");
		result.append(duration);
		result.append(", verdict: ");
		result.append(verdict);
		result.append(')');
		return result.toString();
	}

	/**
	 * Creates a new instance of the specified Ecore class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the instance to create.
	 * @return The new instance.
	 * @generated
	 */
	protected EObject create(EClass eClass) {
		return EcoreUtil.create(eClass);
	}

	/**
	 * Retrieves the cache adapter for this '<em><b>Test Log</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Test Log</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //TestLogImpl
