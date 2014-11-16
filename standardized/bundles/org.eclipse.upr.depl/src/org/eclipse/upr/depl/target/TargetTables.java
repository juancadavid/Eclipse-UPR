/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 * Marc-Florian Wendland
 *************************************************************************
 * This code is 100% auto-generated
 * from: target
 * using: org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 */
package org.eclipse.upr.depl.target;

import org.eclipse.ocl.examples.domain.ids.ClassId;
import org.eclipse.ocl.examples.domain.ids.CollectionTypeId;
import org.eclipse.ocl.examples.domain.ids.IdManager;
import org.eclipse.ocl.examples.domain.ids.NsURIPackageId;
import org.eclipse.ocl.examples.domain.ids.TypeId;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.examples.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.examples.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.upr.depl.target.TargetPackage;
import org.eclipse.upr.depl.target.TargetTables;

/**
 * TargetTables provides the dispatch tables for the target for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class TargetTables
{
	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(TargetPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML = IdManager.getNsURIPackageId("http://www.eclipse.org/uml2/4.0.0/UML", UMLPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_target_s_1_0 = IdManager.getNsURIPackageId("http://www.omg.org/spec/DEPL/4.0/profile/target/1.0", TargetPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_AssociationClass = TargetTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("AssociationClass", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Bridge = TargetTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_target_s_1_0.getClassId("Bridge", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Class = TargetTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("Class", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_CommunicationPath = TargetTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("CommunicationPath", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_CommunicationPath_0 = TargetTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_target_s_1_0.getClassId("CommunicationPath", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Domain = TargetTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_target_s_1_0.getClassId("Domain", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Interconnect = TargetTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_target_s_1_0.getClassId("Interconnect", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Node = TargetTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_target_s_1_0.getClassId("Node", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Node_0 = TargetTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("Node", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Resource = TargetTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_target_s_1_0.getClassId("Resource", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_SharedResource = TargetTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_target_s_1_0.getClassId("SharedResource", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_CommunicationPath = TypeId.BAG.getSpecializedId(TargetTables.CLSSid_CommunicationPath_0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Node = TypeId.BAG.getSpecializedId(TargetTables.CLSSid_Node);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Bridge = TypeId.SET.getSpecializedId(TargetTables.CLSSid_Bridge);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_CommunicationPath = TypeId.SET.getSpecializedId(TargetTables.CLSSid_CommunicationPath_0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Domain = TypeId.SET.getSpecializedId(TargetTables.CLSSid_Domain);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Interconnect = TypeId.SET.getSpecializedId(TargetTables.CLSSid_Interconnect);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Node = TypeId.SET.getSpecializedId(TargetTables.CLSSid_Node);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Resource = TypeId.SET.getSpecializedId(TargetTables.CLSSid_Resource);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_SharedResource = TypeId.SET.getSpecializedId(TargetTables.CLSSid_SharedResource);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		public static final /*@NonNull*/ EcoreExecutorType _Bridge = new EcoreExecutorType(TargetPackage.Literals.BRIDGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CommunicationPath = new EcoreExecutorType(TargetPackage.Literals.COMMUNICATION_PATH, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Domain = new EcoreExecutorType(TargetPackage.Literals.DOMAIN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Interconnect = new EcoreExecutorType(TargetPackage.Literals.INTERCONNECT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Node = new EcoreExecutorType(TargetPackage.Literals.NODE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Resource = new EcoreExecutorType(TargetPackage.Literals.RESOURCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SharedResource = new EcoreExecutorType(TargetPackage.Literals.SHARED_RESOURCE, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType[] types = {
			_Bridge,
			_CommunicationPath,
			_Domain,
			_Interconnect,
			_Node,
			_Resource,
			_SharedResource
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			TypeFragments.init();
			FragmentOperations.init();
			FragmentProperties.init();
		}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		public static final /*@NonNull*/ ExecutorFragment _Bridge__Bridge = new ExecutorFragment(Types._Bridge, TargetTables.Types._Bridge);
		public static final /*@NonNull*/ ExecutorFragment _Bridge__OclAny = new ExecutorFragment(Types._Bridge, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Bridge__OclElement = new ExecutorFragment(Types._Bridge, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _CommunicationPath__CommunicationPath = new ExecutorFragment(Types._CommunicationPath, TargetTables.Types._CommunicationPath);
		public static final /*@NonNull*/ ExecutorFragment _CommunicationPath__OclAny = new ExecutorFragment(Types._CommunicationPath, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _CommunicationPath__OclElement = new ExecutorFragment(Types._CommunicationPath, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _Domain__Domain = new ExecutorFragment(Types._Domain, TargetTables.Types._Domain);
		public static final /*@NonNull*/ ExecutorFragment _Domain__OclAny = new ExecutorFragment(Types._Domain, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Domain__OclElement = new ExecutorFragment(Types._Domain, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _Interconnect__Interconnect = new ExecutorFragment(Types._Interconnect, TargetTables.Types._Interconnect);
		public static final /*@NonNull*/ ExecutorFragment _Interconnect__OclAny = new ExecutorFragment(Types._Interconnect, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Interconnect__OclElement = new ExecutorFragment(Types._Interconnect, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _Node__Node = new ExecutorFragment(Types._Node, TargetTables.Types._Node);
		public static final /*@NonNull*/ ExecutorFragment _Node__OclAny = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Node__OclElement = new ExecutorFragment(Types._Node, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _Resource__OclAny = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Resource__OclElement = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclElement);
		public static final /*@NonNull*/ ExecutorFragment _Resource__Resource = new ExecutorFragment(Types._Resource, TargetTables.Types._Resource);

		public static final /*@NonNull*/ ExecutorFragment _SharedResource__OclAny = new ExecutorFragment(Types._SharedResource, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _SharedResource__OclElement = new ExecutorFragment(Types._SharedResource, OCLstdlibTables.Types._OclElement);
		public static final /*@NonNull*/ ExecutorFragment _SharedResource__Resource = new ExecutorFragment(Types._SharedResource, TargetTables.Types._Resource);
		public static final /*@NonNull*/ ExecutorFragment _SharedResource__SharedResource = new ExecutorFragment(Types._SharedResource, TargetTables.Types._SharedResource);
	}

	/**
	 *	The parameter lists shared by operations.
	 */
	public static class Parameters {
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
	}

	/**
	 *	The property descriptors for each property of each type.
	 */
	public static class Properties {

		public static final /*@NonNull*/ ExecutorProperty _Bridge__base_AssociationClass = new EcoreExecutorProperty(TargetPackage.Literals.BRIDGE__BASE_ASSOCIATION_CLASS, Types._Bridge, 0);
		public static final /*@NonNull*/ ExecutorProperty _Bridge__communicationPath = new EcoreExecutorProperty(TargetPackage.Literals.BRIDGE__COMMUNICATION_PATH, Types._Bridge, 1);
		public static final /*@NonNull*/ ExecutorProperty _Bridge__interconnect = new EcoreExecutorProperty(TargetPackage.Literals.BRIDGE__INTERCONNECT, Types._Bridge, 2);
		public static final /*@NonNull*/ ExecutorProperty _Bridge__label = new EcoreExecutorProperty(TargetPackage.Literals.BRIDGE__LABEL, Types._Bridge, 3);
		public static final /*@NonNull*/ ExecutorProperty _Bridge__name = new EcoreExecutorProperty(TargetPackage.Literals.BRIDGE__NAME, Types._Bridge, 4);
		public static final /*@NonNull*/ ExecutorProperty _Bridge__ownedResource = new EcoreExecutorProperty(TargetPackage.Literals.BRIDGE__OWNED_RESOURCE, Types._Bridge, 5);

		public static final /*@NonNull*/ ExecutorProperty _CommunicationPath__Domain = new ExecutorPropertyWithImplementation("Domain", Types._CommunicationPath, 0, new EcoreLibraryOppositeProperty(TargetPackage.Literals.DOMAIN__CONTAINED_COMMUNICATION_PATH));
		public static final /*@NonNull*/ ExecutorProperty _CommunicationPath__base_CommunicationPath = new EcoreExecutorProperty(TargetPackage.Literals.COMMUNICATION_PATH__BASE_COMMUNICATION_PATH, Types._CommunicationPath, 1);
		public static final /*@NonNull*/ ExecutorProperty _CommunicationPath__bridge = new EcoreExecutorProperty(TargetPackage.Literals.COMMUNICATION_PATH__BRIDGE, Types._CommunicationPath, 2);
		public static final /*@NonNull*/ ExecutorProperty _CommunicationPath__connectedNode = new EcoreExecutorProperty(TargetPackage.Literals.COMMUNICATION_PATH__CONNECTED_NODE, Types._CommunicationPath, 3);
		public static final /*@NonNull*/ ExecutorProperty _CommunicationPath__interconnect = new EcoreExecutorProperty(TargetPackage.Literals.COMMUNICATION_PATH__INTERCONNECT, Types._CommunicationPath, 4);

		public static final /*@NonNull*/ ExecutorProperty _Domain__UUID = new EcoreExecutorProperty(TargetPackage.Literals.DOMAIN__UUID, Types._Domain, 0);
		public static final /*@NonNull*/ ExecutorProperty _Domain__base_Class = new EcoreExecutorProperty(TargetPackage.Literals.DOMAIN__BASE_CLASS, Types._Domain, 1);
		public static final /*@NonNull*/ ExecutorProperty _Domain__containedCommunicationPath = new EcoreExecutorProperty(TargetPackage.Literals.DOMAIN__CONTAINED_COMMUNICATION_PATH, Types._Domain, 2);
		public static final /*@NonNull*/ ExecutorProperty _Domain__containedNode = new EcoreExecutorProperty(TargetPackage.Literals.DOMAIN__CONTAINED_NODE, Types._Domain, 3);
		public static final /*@NonNull*/ ExecutorProperty _Domain__domainResource = new EcoreExecutorProperty(TargetPackage.Literals.DOMAIN__DOMAIN_RESOURCE, Types._Domain, 4);
		public static final /*@NonNull*/ ExecutorProperty _Domain__label = new EcoreExecutorProperty(TargetPackage.Literals.DOMAIN__LABEL, Types._Domain, 5);

		public static final /*@NonNull*/ ExecutorProperty _Interconnect__base_AssociationClass = new EcoreExecutorProperty(TargetPackage.Literals.INTERCONNECT__BASE_ASSOCIATION_CLASS, Types._Interconnect, 0);
		public static final /*@NonNull*/ ExecutorProperty _Interconnect__bridge = new EcoreExecutorProperty(TargetPackage.Literals.INTERCONNECT__BRIDGE, Types._Interconnect, 1);
		public static final /*@NonNull*/ ExecutorProperty _Interconnect__communicationPath = new EcoreExecutorProperty(TargetPackage.Literals.INTERCONNECT__COMMUNICATION_PATH, Types._Interconnect, 2);
		public static final /*@NonNull*/ ExecutorProperty _Interconnect__connectedNode = new EcoreExecutorProperty(TargetPackage.Literals.INTERCONNECT__CONNECTED_NODE, Types._Interconnect, 3);
		public static final /*@NonNull*/ ExecutorProperty _Interconnect__label = new EcoreExecutorProperty(TargetPackage.Literals.INTERCONNECT__LABEL, Types._Interconnect, 4);
		public static final /*@NonNull*/ ExecutorProperty _Interconnect__name = new EcoreExecutorProperty(TargetPackage.Literals.INTERCONNECT__NAME, Types._Interconnect, 5);
		public static final /*@NonNull*/ ExecutorProperty _Interconnect__ownedResource = new EcoreExecutorProperty(TargetPackage.Literals.INTERCONNECT__OWNED_RESOURCE, Types._Interconnect, 6);

		public static final /*@NonNull*/ ExecutorProperty _Node__Domain = new ExecutorPropertyWithImplementation("Domain", Types._Node, 0, new EcoreLibraryOppositeProperty(TargetPackage.Literals.DOMAIN__CONTAINED_NODE));
		public static final /*@NonNull*/ ExecutorProperty _Node__availableSharedResource = new EcoreExecutorProperty(TargetPackage.Literals.NODE__AVAILABLE_SHARED_RESOURCE, Types._Node, 1);
		public static final /*@NonNull*/ ExecutorProperty _Node__base_Node = new EcoreExecutorProperty(TargetPackage.Literals.NODE__BASE_NODE, Types._Node, 2);
		public static final /*@NonNull*/ ExecutorProperty _Node__communicationPath = new EcoreExecutorProperty(TargetPackage.Literals.NODE__COMMUNICATION_PATH, Types._Node, 3);
		public static final /*@NonNull*/ ExecutorProperty _Node__label = new EcoreExecutorProperty(TargetPackage.Literals.NODE__LABEL, Types._Node, 4);
		public static final /*@NonNull*/ ExecutorProperty _Node__name = new EcoreExecutorProperty(TargetPackage.Literals.NODE__NAME, Types._Node, 5);
		public static final /*@NonNull*/ ExecutorProperty _Node__nodeConnector = new EcoreExecutorProperty(TargetPackage.Literals.NODE__NODE_CONNECTOR, Types._Node, 6);
		public static final /*@NonNull*/ ExecutorProperty _Node__ownedResource = new EcoreExecutorProperty(TargetPackage.Literals.NODE__OWNED_RESOURCE, Types._Node, 7);

		public static final /*@NonNull*/ ExecutorProperty _Resource__Bridge = new ExecutorPropertyWithImplementation("Bridge", Types._Resource, 0, new EcoreLibraryOppositeProperty(TargetPackage.Literals.BRIDGE__OWNED_RESOURCE));
		public static final /*@NonNull*/ ExecutorProperty _Resource__Interconnect = new ExecutorPropertyWithImplementation("Interconnect", Types._Resource, 1, new EcoreLibraryOppositeProperty(TargetPackage.Literals.INTERCONNECT__OWNED_RESOURCE));
		public static final /*@NonNull*/ ExecutorProperty _Resource__Node = new ExecutorPropertyWithImplementation("Node", Types._Resource, 2, new EcoreLibraryOppositeProperty(TargetPackage.Literals.NODE__OWNED_RESOURCE));
		public static final /*@NonNull*/ ExecutorProperty _Resource__base_Class = new EcoreExecutorProperty(TargetPackage.Literals.RESOURCE__BASE_CLASS, Types._Resource, 3);
		public static final /*@NonNull*/ ExecutorProperty _Resource__name = new EcoreExecutorProperty(TargetPackage.Literals.RESOURCE__NAME, Types._Resource, 4);
		public static final /*@NonNull*/ ExecutorProperty _Resource__resourceType = new EcoreExecutorProperty(TargetPackage.Literals.RESOURCE__RESOURCE_TYPE, Types._Resource, 5);

		public static final /*@NonNull*/ ExecutorProperty _SharedResource__Domain = new ExecutorPropertyWithImplementation("Domain", Types._SharedResource, 0, new EcoreLibraryOppositeProperty(TargetPackage.Literals.DOMAIN__DOMAIN_RESOURCE));
		public static final /*@NonNull*/ ExecutorProperty _SharedResource__resourceUser = new EcoreExecutorProperty(TargetPackage.Literals.SHARED_RESOURCE__RESOURCE_USER, Types._SharedResource, 1);
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		private static final /*@NonNull*/ ExecutorFragment[] _Bridge =
		{
			Fragments._Bridge__OclAny /* 0 */,
			Fragments._Bridge__OclElement /* 1 */,
			Fragments._Bridge__Bridge /* 2 */
		};
		private static final /*@NonNull*/ int[] __Bridge = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _CommunicationPath =
		{
			Fragments._CommunicationPath__OclAny /* 0 */,
			Fragments._CommunicationPath__OclElement /* 1 */,
			Fragments._CommunicationPath__CommunicationPath /* 2 */
		};
		private static final /*@NonNull*/ int[] __CommunicationPath = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Domain =
		{
			Fragments._Domain__OclAny /* 0 */,
			Fragments._Domain__OclElement /* 1 */,
			Fragments._Domain__Domain /* 2 */
		};
		private static final /*@NonNull*/ int[] __Domain = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Interconnect =
		{
			Fragments._Interconnect__OclAny /* 0 */,
			Fragments._Interconnect__OclElement /* 1 */,
			Fragments._Interconnect__Interconnect /* 2 */
		};
		private static final /*@NonNull*/ int[] __Interconnect = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Node =
		{
			Fragments._Node__OclAny /* 0 */,
			Fragments._Node__OclElement /* 1 */,
			Fragments._Node__Node /* 2 */
		};
		private static final /*@NonNull*/ int[] __Node = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Resource =
		{
			Fragments._Resource__OclAny /* 0 */,
			Fragments._Resource__OclElement /* 1 */,
			Fragments._Resource__Resource /* 2 */
		};
		private static final /*@NonNull*/ int[] __Resource = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _SharedResource =
		{
			Fragments._SharedResource__OclAny /* 0 */,
			Fragments._SharedResource__OclElement /* 1 */,
			Fragments._SharedResource__Resource /* 2 */,
			Fragments._SharedResource__SharedResource /* 3 */
		};
		private static final /*@NonNull*/ int[] __SharedResource = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Bridge.initFragments(_Bridge, __Bridge);
			Types._CommunicationPath.initFragments(_CommunicationPath, __CommunicationPath);
			Types._Domain.initFragments(_Domain, __Domain);
			Types._Interconnect.initFragments(_Interconnect, __Interconnect);
			Types._Node.initFragments(_Node, __Node);
			Types._Resource.initFragments(_Resource, __Resource);
			Types._SharedResource.initFragments(_SharedResource, __SharedResource);
		}

		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		private static final /*@NonNull*/ ExecutorOperation[] _Bridge__Bridge = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Bridge__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Bridge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _CommunicationPath__CommunicationPath = {};
		private static final /*@NonNull*/ ExecutorOperation[] _CommunicationPath__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _CommunicationPath__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Domain__Domain = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Domain__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Domain__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Interconnect__Interconnect = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Interconnect__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Interconnect__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Node__Node = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Node__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Node__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Resource__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Resource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Resource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _SharedResource__SharedResource = {};
		private static final /*@NonNull*/ ExecutorOperation[] _SharedResource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _SharedResource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _SharedResource__Resource = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Bridge__Bridge.initOperations(_Bridge__Bridge);
			Fragments._Bridge__OclAny.initOperations(_Bridge__OclAny);
			Fragments._Bridge__OclElement.initOperations(_Bridge__OclElement);

			Fragments._CommunicationPath__CommunicationPath.initOperations(_CommunicationPath__CommunicationPath);
			Fragments._CommunicationPath__OclAny.initOperations(_CommunicationPath__OclAny);
			Fragments._CommunicationPath__OclElement.initOperations(_CommunicationPath__OclElement);

			Fragments._Domain__Domain.initOperations(_Domain__Domain);
			Fragments._Domain__OclAny.initOperations(_Domain__OclAny);
			Fragments._Domain__OclElement.initOperations(_Domain__OclElement);

			Fragments._Interconnect__Interconnect.initOperations(_Interconnect__Interconnect);
			Fragments._Interconnect__OclAny.initOperations(_Interconnect__OclAny);
			Fragments._Interconnect__OclElement.initOperations(_Interconnect__OclElement);

			Fragments._Node__Node.initOperations(_Node__Node);
			Fragments._Node__OclAny.initOperations(_Node__OclAny);
			Fragments._Node__OclElement.initOperations(_Node__OclElement);

			Fragments._Resource__OclAny.initOperations(_Resource__OclAny);
			Fragments._Resource__OclElement.initOperations(_Resource__OclElement);
			Fragments._Resource__Resource.initOperations(_Resource__Resource);

			Fragments._SharedResource__OclAny.initOperations(_SharedResource__OclAny);
			Fragments._SharedResource__OclElement.initOperations(_SharedResource__OclElement);
			Fragments._SharedResource__Resource.initOperations(_SharedResource__Resource);
			Fragments._SharedResource__SharedResource.initOperations(_SharedResource__SharedResource);
		}

		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		private static final /*@NonNull*/ ExecutorProperty[] _Bridge = {
			TargetTables.Properties._Bridge__base_AssociationClass,
			TargetTables.Properties._Bridge__communicationPath,
			TargetTables.Properties._Bridge__interconnect,
			TargetTables.Properties._Bridge__label,
			TargetTables.Properties._Bridge__name,
			TargetTables.Properties._Bridge__ownedResource
		};

		private static final /*@NonNull*/ ExecutorProperty[] _CommunicationPath = {
			TargetTables.Properties._CommunicationPath__Domain,
			TargetTables.Properties._CommunicationPath__base_CommunicationPath,
			TargetTables.Properties._CommunicationPath__bridge,
			TargetTables.Properties._CommunicationPath__connectedNode,
			TargetTables.Properties._CommunicationPath__interconnect
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Domain = {
			TargetTables.Properties._Domain__UUID,
			TargetTables.Properties._Domain__base_Class,
			TargetTables.Properties._Domain__containedCommunicationPath,
			TargetTables.Properties._Domain__containedNode,
			TargetTables.Properties._Domain__domainResource,
			TargetTables.Properties._Domain__label
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Interconnect = {
			TargetTables.Properties._Interconnect__base_AssociationClass,
			TargetTables.Properties._Interconnect__bridge,
			TargetTables.Properties._Interconnect__communicationPath,
			TargetTables.Properties._Interconnect__connectedNode,
			TargetTables.Properties._Interconnect__label,
			TargetTables.Properties._Interconnect__name,
			TargetTables.Properties._Interconnect__ownedResource
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Node = {
			TargetTables.Properties._Node__Domain,
			TargetTables.Properties._Node__availableSharedResource,
			TargetTables.Properties._Node__base_Node,
			TargetTables.Properties._Node__communicationPath,
			TargetTables.Properties._Node__label,
			TargetTables.Properties._Node__name,
			TargetTables.Properties._Node__nodeConnector,
			TargetTables.Properties._Node__ownedResource
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Resource = {
			TargetTables.Properties._Resource__Bridge,
			TargetTables.Properties._Resource__Interconnect,
			TargetTables.Properties._Resource__Node,
			TargetTables.Properties._Resource__base_Class,
			TargetTables.Properties._Resource__name,
			TargetTables.Properties._Resource__resourceType
		};

		private static final /*@NonNull*/ ExecutorProperty[] _SharedResource = {
			TargetTables.Properties._Resource__Bridge,
			TargetTables.Properties._SharedResource__Domain,
			TargetTables.Properties._Resource__Interconnect,
			TargetTables.Properties._Resource__Node,
			TargetTables.Properties._Resource__base_Class,
			TargetTables.Properties._Resource__name,
			TargetTables.Properties._Resource__resourceType,
			TargetTables.Properties._SharedResource__resourceUser
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Bridge__Bridge.initProperties(_Bridge);
			Fragments._CommunicationPath__CommunicationPath.initProperties(_CommunicationPath);
			Fragments._Domain__Domain.initProperties(_Domain);
			Fragments._Interconnect__Interconnect.initProperties(_Interconnect);
			Fragments._Node__Node.initProperties(_Node);
			Fragments._Resource__Resource.initProperties(_Resource);
			Fragments._SharedResource__SharedResource.initProperties(_SharedResource);
		}

		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
		}

		public static void init() {}
	}

	static {
		Types.types[0].getClass();
	}
}
