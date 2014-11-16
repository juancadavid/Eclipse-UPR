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
package org.eclipse.upr.utptypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Verdict</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.upr.utptypes.UTPLibPackage#getVerdict()
 * @model
 * @generated
 */
public final class Verdict extends AbstractEnumerator {
	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>Pass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pass</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASS_LITERAL
	 * @model name="pass"
	 * @generated
	 * @ordered
	 */
	public static final int PASS = 1;

	/**
	 * The '<em><b>Inconclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inconclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCONCLUSIVE_LITERAL
	 * @model name="inconclusive"
	 * @generated
	 * @ordered
	 */
	public static final int INCONCLUSIVE = 2;

	/**
	 * The '<em><b>Fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fail</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAIL_LITERAL
	 * @model name="fail"
	 * @generated
	 * @ordered
	 */
	public static final int FAIL = 3;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_LITERAL
	 * @model name="error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR = 4;

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final Verdict NONE_LITERAL = new Verdict(NONE, "none", "none");

	/**
	 * The '<em><b>Pass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASS
	 * @generated
	 * @ordered
	 */
	public static final Verdict PASS_LITERAL = new Verdict(PASS, "pass", "pass");

	/**
	 * The '<em><b>Inconclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONCLUSIVE
	 * @generated
	 * @ordered
	 */
	public static final Verdict INCONCLUSIVE_LITERAL = new Verdict(INCONCLUSIVE, "inconclusive", "inconclusive");

	/**
	 * The '<em><b>Fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIL
	 * @generated
	 * @ordered
	 */
	public static final Verdict FAIL_LITERAL = new Verdict(FAIL, "fail", "fail");

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @generated
	 * @ordered
	 */
	public static final Verdict ERROR_LITERAL = new Verdict(ERROR, "error", "error");

	/**
	 * An array of all the '<em><b>Verdict</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Verdict[] VALUES_ARRAY =
		new Verdict[] {
			NONE_LITERAL,
			PASS_LITERAL,
			INCONCLUSIVE_LITERAL,
			FAIL_LITERAL,
			ERROR_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Verdict</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Verdict</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Verdict get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Verdict result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Verdict</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Verdict getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Verdict result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Verdict</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Verdict get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
			case PASS: return PASS_LITERAL;
			case INCONCLUSIVE: return INCONCLUSIVE_LITERAL;
			case FAIL: return FAIL_LITERAL;
			case ERROR: return ERROR_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Verdict(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Verdict
