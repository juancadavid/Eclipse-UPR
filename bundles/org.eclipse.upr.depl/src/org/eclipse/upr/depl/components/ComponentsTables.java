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
 * from: components
 * using: org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 */
package org.eclipse.upr.depl.components;

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
import org.eclipse.upr.depl.components.ComponentsPackage;
import org.eclipse.upr.depl.components.ComponentsTables;

/**
 * ComponentsTables provides the dispatch tables for the components for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class ComponentsTables
{
	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ComponentsPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML = IdManager.getNsURIPackageId("http://www.eclipse.org/uml2/4.0.0/UML", UMLPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0 = IdManager.getNsURIPackageId("http://www.omg.org/spec/DEPL/4.0/profile/components/1.0", ComponentsPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Capability = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("Capability", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Class = ComponentsTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("Class", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Component = ComponentsTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("Component", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ComponentAssembly = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("ComponentAssembly", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ComponentImplementation = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("ComponentImplementation", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Component_0 = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("Component", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ConnectableElement = ComponentsTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("ConnectableElement", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Connector = ComponentsTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("Connector", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ExternalReference = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("ExternalReference", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Port = ComponentsTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("Port", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_PortConnector = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("PortConnector", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Port_0 = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("Port", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Property = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("Property", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_PropertyConnector = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("PropertyConnector", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Property_0 = ComponentsTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_4_0_0_s_UML.getClassId("Property", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Requirement = ComponentsTables.PACKid_http_c_s_s_www_omg_org_s_spec_s_DEPL_s_4_0_s_profile_s_components_s_1_0.getClassId("Requirement", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Port = TypeId.BAG.getSpecializedId(ComponentsTables.CLSSid_Port_0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Property = TypeId.BAG.getSpecializedId(ComponentsTables.CLSSid_Property);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Capability = TypeId.ORDERED_SET.getSpecializedId(ComponentsTables.CLSSid_Capability);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Component = TypeId.SET.getSpecializedId(ComponentsTables.CLSSid_Component_0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ComponentAssembly = TypeId.SET.getSpecializedId(ComponentsTables.CLSSid_ComponentAssembly);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ComponentImplementation = TypeId.SET.getSpecializedId(ComponentsTables.CLSSid_ComponentImplementation);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ExternalReference = TypeId.SET.getSpecializedId(ComponentsTables.CLSSid_ExternalReference);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Port = TypeId.SET.getSpecializedId(ComponentsTables.CLSSid_Port_0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_PortConnector = TypeId.SET.getSpecializedId(ComponentsTables.CLSSid_PortConnector);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Property = TypeId.SET.getSpecializedId(ComponentsTables.CLSSid_Property);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_PropertyConnector = TypeId.SET.getSpecializedId(ComponentsTables.CLSSid_PropertyConnector);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Requirement = TypeId.SET.getSpecializedId(ComponentsTables.CLSSid_Requirement);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		public static final /*@NonNull*/ EcoreExecutorType _Capability = new EcoreExecutorType(ComponentsPackage.Literals.CAPABILITY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Component = new EcoreExecutorType(ComponentsPackage.Literals.COMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ComponentAssembly = new EcoreExecutorType(ComponentsPackage.Literals.COMPONENT_ASSEMBLY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ComponentImplementation = new EcoreExecutorType(ComponentsPackage.Literals.COMPONENT_IMPLEMENTATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ExternalReference = new EcoreExecutorType(ComponentsPackage.Literals.EXTERNAL_REFERENCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MonolithicImplementation = new EcoreExecutorType(ComponentsPackage.Literals.MONOLITHIC_IMPLEMENTATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Port = new EcoreExecutorType(ComponentsPackage.Literals.PORT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PortConnector = new EcoreExecutorType(ComponentsPackage.Literals.PORT_CONNECTOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Property = new EcoreExecutorType(ComponentsPackage.Literals.PROPERTY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PropertyConnector = new EcoreExecutorType(ComponentsPackage.Literals.PROPERTY_CONNECTOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Requirement = new EcoreExecutorType(ComponentsPackage.Literals.REQUIREMENT, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType[] types = {
			_Capability,
			_Component,
			_ComponentAssembly,
			_ComponentImplementation,
			_ExternalReference,
			_MonolithicImplementation,
			_Port,
			_PortConnector,
			_Property,
			_PropertyConnector,
			_Requirement
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
		public static final /*@NonNull*/ ExecutorFragment _Capability__Capability = new ExecutorFragment(Types._Capability, ComponentsTables.Types._Capability);
		public static final /*@NonNull*/ ExecutorFragment _Capability__OclAny = new ExecutorFragment(Types._Capability, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Capability__OclElement = new ExecutorFragment(Types._Capability, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, ComponentsTables.Types._Component);
		public static final /*@NonNull*/ ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _ComponentAssembly__ComponentAssembly = new ExecutorFragment(Types._ComponentAssembly, ComponentsTables.Types._ComponentAssembly);
		public static final /*@NonNull*/ ExecutorFragment _ComponentAssembly__ComponentImplementation = new ExecutorFragment(Types._ComponentAssembly, ComponentsTables.Types._ComponentImplementation);
		public static final /*@NonNull*/ ExecutorFragment _ComponentAssembly__OclAny = new ExecutorFragment(Types._ComponentAssembly, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _ComponentAssembly__OclElement = new ExecutorFragment(Types._ComponentAssembly, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _ComponentImplementation__ComponentImplementation = new ExecutorFragment(Types._ComponentImplementation, ComponentsTables.Types._ComponentImplementation);
		public static final /*@NonNull*/ ExecutorFragment _ComponentImplementation__OclAny = new ExecutorFragment(Types._ComponentImplementation, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _ComponentImplementation__OclElement = new ExecutorFragment(Types._ComponentImplementation, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _ExternalReference__ExternalReference = new ExecutorFragment(Types._ExternalReference, ComponentsTables.Types._ExternalReference);
		public static final /*@NonNull*/ ExecutorFragment _ExternalReference__OclAny = new ExecutorFragment(Types._ExternalReference, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _ExternalReference__OclElement = new ExecutorFragment(Types._ExternalReference, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _MonolithicImplementation__ComponentImplementation = new ExecutorFragment(Types._MonolithicImplementation, ComponentsTables.Types._ComponentImplementation);
		public static final /*@NonNull*/ ExecutorFragment _MonolithicImplementation__MonolithicImplementation = new ExecutorFragment(Types._MonolithicImplementation, ComponentsTables.Types._MonolithicImplementation);
		public static final /*@NonNull*/ ExecutorFragment _MonolithicImplementation__OclAny = new ExecutorFragment(Types._MonolithicImplementation, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _MonolithicImplementation__OclElement = new ExecutorFragment(Types._MonolithicImplementation, OCLstdlibTables.Types._OclElement);

		public static final /*@NonNull*/ ExecutorFragment _Port__OclAny = new ExecutorFragment(Types._Port, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Port__OclElement = new ExecutorFragment(Types._Port, OCLstdlibTables.Types._OclElement);
		public static final /*@NonNull*/ ExecutorFragment _Port__Port = new ExecutorFragment(Types._Port, ComponentsTables.Types._Port);

		public static final /*@NonNull*/ ExecutorFragment _PortConnector__OclAny = new ExecutorFragment(Types._PortConnector, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _PortConnector__OclElement = new ExecutorFragment(Types._PortConnector, OCLstdlibTables.Types._OclElement);
		public static final /*@NonNull*/ ExecutorFragment _PortConnector__PortConnector = new ExecutorFragment(Types._PortConnector, ComponentsTables.Types._PortConnector);

		public static final /*@NonNull*/ ExecutorFragment _Property__OclAny = new ExecutorFragment(Types._Property, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Property__OclElement = new ExecutorFragment(Types._Property, OCLstdlibTables.Types._OclElement);
		public static final /*@NonNull*/ ExecutorFragment _Property__Property = new ExecutorFragment(Types._Property, ComponentsTables.Types._Property);

		public static final /*@NonNull*/ ExecutorFragment _PropertyConnector__OclAny = new ExecutorFragment(Types._PropertyConnector, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _PropertyConnector__OclElement = new ExecutorFragment(Types._PropertyConnector, OCLstdlibTables.Types._OclElement);
		public static final /*@NonNull*/ ExecutorFragment _PropertyConnector__PropertyConnector = new ExecutorFragment(Types._PropertyConnector, ComponentsTables.Types._PropertyConnector);

		public static final /*@NonNull*/ ExecutorFragment _Requirement__OclAny = new ExecutorFragment(Types._Requirement, OCLstdlibTables.Types._OclAny);
		public static final /*@NonNull*/ ExecutorFragment _Requirement__OclElement = new ExecutorFragment(Types._Requirement, OCLstdlibTables.Types._OclElement);
		public static final /*@NonNull*/ ExecutorFragment _Requirement__Requirement = new ExecutorFragment(Types._Requirement, ComponentsTables.Types._Requirement);
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

		public static final /*@NonNull*/ ExecutorProperty _Capability__ComponentImplementation = new ExecutorPropertyWithImplementation("ComponentImplementation", Types._Capability, 0, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT_IMPLEMENTATION__CAPABILITY));
		public static final /*@NonNull*/ ExecutorProperty _Capability__name = new EcoreExecutorProperty(ComponentsPackage.Literals.CAPABILITY__NAME, Types._Capability, 1);
		public static final /*@NonNull*/ ExecutorProperty _Capability__resourceType = new EcoreExecutorProperty(ComponentsPackage.Literals.CAPABILITY__RESOURCE_TYPE, Types._Capability, 2);

		public static final /*@NonNull*/ ExecutorProperty _Component__ComponentAssembly = new ExecutorPropertyWithImplementation("ComponentAssembly", Types._Component, 0, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__CONTAINED_COMPONENT));
		public static final /*@NonNull*/ ExecutorProperty _Component__UUID = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT__UUID, Types._Component, 1);
		public static final /*@NonNull*/ ExecutorProperty _Component__base_Component = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT__BASE_COMPONENT, Types._Component, 2);
		public static final /*@NonNull*/ ExecutorProperty _Component__configProperty = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT__CONFIG_PROPERTY, Types._Component, 3);
		public static final /*@NonNull*/ ExecutorProperty _Component__implementation = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT__IMPLEMENTATION, Types._Component, 4);
		public static final /*@NonNull*/ ExecutorProperty _Component__label = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT__LABEL, Types._Component, 5);
		public static final /*@NonNull*/ ExecutorProperty _Component__ownedPort = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT__OWNED_PORT, Types._Component, 6);

		public static final /*@NonNull*/ ExecutorProperty _ComponentAssembly__assemblyProperty = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__ASSEMBLY_PROPERTY, Types._ComponentAssembly, 0);
		public static final /*@NonNull*/ ExecutorProperty _ComponentAssembly__containedComponent = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__CONTAINED_COMPONENT, Types._ComponentAssembly, 1);
		public static final /*@NonNull*/ ExecutorProperty _ComponentAssembly__externalPort = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__EXTERNAL_PORT, Types._ComponentAssembly, 2);
		public static final /*@NonNull*/ ExecutorProperty _ComponentAssembly__ownedPortConnector = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR, Types._ComponentAssembly, 3);
		public static final /*@NonNull*/ ExecutorProperty _ComponentAssembly__ownedPropertyConnector = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR, Types._ComponentAssembly, 4);

		public static final /*@NonNull*/ ExecutorProperty _ComponentImplementation__Component = new ExecutorPropertyWithImplementation("Component", Types._ComponentImplementation, 0, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT__IMPLEMENTATION));
		public static final /*@NonNull*/ ExecutorProperty _ComponentImplementation__base_Class = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT_IMPLEMENTATION__BASE_CLASS, Types._ComponentImplementation, 1);
		public static final /*@NonNull*/ ExecutorProperty _ComponentImplementation__capability = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT_IMPLEMENTATION__CAPABILITY, Types._ComponentImplementation, 2);
		public static final /*@NonNull*/ ExecutorProperty _ComponentImplementation__deployRequirement = new EcoreExecutorProperty(ComponentsPackage.Literals.COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT, Types._ComponentImplementation, 3);

		public static final /*@NonNull*/ ExecutorProperty _ExternalReference__PortConnector = new ExecutorPropertyWithImplementation("PortConnector", Types._ExternalReference, 0, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.PORT_CONNECTOR__EXTERNAL_REFERENCE));
		public static final /*@NonNull*/ ExecutorProperty _ExternalReference__base_ConnectableElement = new EcoreExecutorProperty(ComponentsPackage.Literals.EXTERNAL_REFERENCE__BASE_CONNECTABLE_ELEMENT, Types._ExternalReference, 1);
		public static final /*@NonNull*/ ExecutorProperty _ExternalReference__location = new EcoreExecutorProperty(ComponentsPackage.Literals.EXTERNAL_REFERENCE__LOCATION, Types._ExternalReference, 2);

		public static final /*@NonNull*/ ExecutorProperty _Port__Component = new ExecutorPropertyWithImplementation("Component", Types._Port, 0, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT__OWNED_PORT));
		public static final /*@NonNull*/ ExecutorProperty _Port__ComponentAssembly = new ExecutorPropertyWithImplementation("ComponentAssembly", Types._Port, 1, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__EXTERNAL_PORT));
		public static final /*@NonNull*/ ExecutorProperty _Port__PortConnector = new ExecutorPropertyWithImplementation("PortConnector", Types._Port, 2, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.PORT_CONNECTOR__CONNECTED_PORT));
		public static final /*@NonNull*/ ExecutorProperty _Port__UUID = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT__UUID, Types._Port, 3);
		public static final /*@NonNull*/ ExecutorProperty _Port__base_Port = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT__BASE_PORT, Types._Port, 4);
		public static final /*@NonNull*/ ExecutorProperty _Port__exclusiveProvider = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT__EXCLUSIVE_PROVIDER, Types._Port, 5);
		public static final /*@NonNull*/ ExecutorProperty _Port__exclusiveUser = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT__EXCLUSIVE_USER, Types._Port, 6);
		public static final /*@NonNull*/ ExecutorProperty _Port__name = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT__NAME, Types._Port, 7);
		public static final /*@NonNull*/ ExecutorProperty _Port__optional = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT__OPTIONAL, Types._Port, 8);
		public static final /*@NonNull*/ ExecutorProperty _Port__provider = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT__PROVIDER, Types._Port, 9);
		public static final /*@NonNull*/ ExecutorProperty _Port__supportedType = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT__SUPPORTED_TYPE, Types._Port, 10);

		public static final /*@NonNull*/ ExecutorProperty _PortConnector__ComponentAssembly = new ExecutorPropertyWithImplementation("ComponentAssembly", Types._PortConnector, 0, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR));
		public static final /*@NonNull*/ ExecutorProperty _PortConnector__base_Connector = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT_CONNECTOR__BASE_CONNECTOR, Types._PortConnector, 1);
		public static final /*@NonNull*/ ExecutorProperty _PortConnector__connectedPort = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT_CONNECTOR__CONNECTED_PORT, Types._PortConnector, 2);
		public static final /*@NonNull*/ ExecutorProperty _PortConnector__externalReference = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT_CONNECTOR__EXTERNAL_REFERENCE, Types._PortConnector, 3);
		public static final /*@NonNull*/ ExecutorProperty _PortConnector__label = new EcoreExecutorProperty(ComponentsPackage.Literals.PORT_CONNECTOR__LABEL, Types._PortConnector, 4);

		public static final /*@NonNull*/ ExecutorProperty _Property__Component = new ExecutorPropertyWithImplementation("Component", Types._Property, 0, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT__CONFIG_PROPERTY));
		public static final /*@NonNull*/ ExecutorProperty _Property__ComponentAssembly = new ExecutorPropertyWithImplementation("ComponentAssembly", Types._Property, 1, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__ASSEMBLY_PROPERTY));
		public static final /*@NonNull*/ ExecutorProperty _Property__PropertyConnector = new ExecutorPropertyWithImplementation("PropertyConnector", Types._Property, 2, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.PROPERTY_CONNECTOR__CONNECTED_PROPERTY));
		public static final /*@NonNull*/ ExecutorProperty _Property__Requirement = new ExecutorPropertyWithImplementation("Requirement", Types._Property, 3, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.REQUIREMENT__PROPERTIES));
		public static final /*@NonNull*/ ExecutorProperty _Property__base_Property = new EcoreExecutorProperty(ComponentsPackage.Literals.PROPERTY__BASE_PROPERTY, Types._Property, 4);

		public static final /*@NonNull*/ ExecutorProperty _PropertyConnector__ComponentAssembly = new ExecutorPropertyWithImplementation("ComponentAssembly", Types._PropertyConnector, 0, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR));
		public static final /*@NonNull*/ ExecutorProperty _PropertyConnector__base_Connector = new EcoreExecutorProperty(ComponentsPackage.Literals.PROPERTY_CONNECTOR__BASE_CONNECTOR, Types._PropertyConnector, 1);
		public static final /*@NonNull*/ ExecutorProperty _PropertyConnector__connectedProperty = new EcoreExecutorProperty(ComponentsPackage.Literals.PROPERTY_CONNECTOR__CONNECTED_PROPERTY, Types._PropertyConnector, 2);
		public static final /*@NonNull*/ ExecutorProperty _PropertyConnector__label = new EcoreExecutorProperty(ComponentsPackage.Literals.PROPERTY_CONNECTOR__LABEL, Types._PropertyConnector, 3);

		public static final /*@NonNull*/ ExecutorProperty _Requirement__ComponentImplementation = new ExecutorPropertyWithImplementation("ComponentImplementation", Types._Requirement, 0, new EcoreLibraryOppositeProperty(ComponentsPackage.Literals.COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT));
		public static final /*@NonNull*/ ExecutorProperty _Requirement__properties = new EcoreExecutorProperty(ComponentsPackage.Literals.REQUIREMENT__PROPERTIES, Types._Requirement, 1);
		public static final /*@NonNull*/ ExecutorProperty _Requirement__resourceType = new EcoreExecutorProperty(ComponentsPackage.Literals.REQUIREMENT__RESOURCE_TYPE, Types._Requirement, 2);
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		private static final /*@NonNull*/ ExecutorFragment[] _Capability =
		{
			Fragments._Capability__OclAny /* 0 */,
			Fragments._Capability__OclElement /* 1 */,
			Fragments._Capability__Capability /* 2 */
		};
		private static final /*@NonNull*/ int[] __Capability = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Component =
		{
			Fragments._Component__OclAny /* 0 */,
			Fragments._Component__OclElement /* 1 */,
			Fragments._Component__Component /* 2 */
		};
		private static final /*@NonNull*/ int[] __Component = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _ComponentAssembly =
		{
			Fragments._ComponentAssembly__OclAny /* 0 */,
			Fragments._ComponentAssembly__OclElement /* 1 */,
			Fragments._ComponentAssembly__ComponentImplementation /* 2 */,
			Fragments._ComponentAssembly__ComponentAssembly /* 3 */
		};
		private static final /*@NonNull*/ int[] __ComponentAssembly = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _ComponentImplementation =
		{
			Fragments._ComponentImplementation__OclAny /* 0 */,
			Fragments._ComponentImplementation__OclElement /* 1 */,
			Fragments._ComponentImplementation__ComponentImplementation /* 2 */
		};
		private static final /*@NonNull*/ int[] __ComponentImplementation = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _ExternalReference =
		{
			Fragments._ExternalReference__OclAny /* 0 */,
			Fragments._ExternalReference__OclElement /* 1 */,
			Fragments._ExternalReference__ExternalReference /* 2 */
		};
		private static final /*@NonNull*/ int[] __ExternalReference = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _MonolithicImplementation =
		{
			Fragments._MonolithicImplementation__OclAny /* 0 */,
			Fragments._MonolithicImplementation__OclElement /* 1 */,
			Fragments._MonolithicImplementation__ComponentImplementation /* 2 */,
			Fragments._MonolithicImplementation__MonolithicImplementation /* 3 */
		};
		private static final /*@NonNull*/ int[] __MonolithicImplementation = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Port =
		{
			Fragments._Port__OclAny /* 0 */,
			Fragments._Port__OclElement /* 1 */,
			Fragments._Port__Port /* 2 */
		};
		private static final /*@NonNull*/ int[] __Port = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _PortConnector =
		{
			Fragments._PortConnector__OclAny /* 0 */,
			Fragments._PortConnector__OclElement /* 1 */,
			Fragments._PortConnector__PortConnector /* 2 */
		};
		private static final /*@NonNull*/ int[] __PortConnector = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Property =
		{
			Fragments._Property__OclAny /* 0 */,
			Fragments._Property__OclElement /* 1 */,
			Fragments._Property__Property /* 2 */
		};
		private static final /*@NonNull*/ int[] __Property = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _PropertyConnector =
		{
			Fragments._PropertyConnector__OclAny /* 0 */,
			Fragments._PropertyConnector__OclElement /* 1 */,
			Fragments._PropertyConnector__PropertyConnector /* 2 */
		};
		private static final /*@NonNull*/ int[] __PropertyConnector = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Requirement =
		{
			Fragments._Requirement__OclAny /* 0 */,
			Fragments._Requirement__OclElement /* 1 */,
			Fragments._Requirement__Requirement /* 2 */
		};
		private static final /*@NonNull*/ int[] __Requirement = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Capability.initFragments(_Capability, __Capability);
			Types._Component.initFragments(_Component, __Component);
			Types._ComponentAssembly.initFragments(_ComponentAssembly, __ComponentAssembly);
			Types._ComponentImplementation.initFragments(_ComponentImplementation, __ComponentImplementation);
			Types._ExternalReference.initFragments(_ExternalReference, __ExternalReference);
			Types._MonolithicImplementation.initFragments(_MonolithicImplementation, __MonolithicImplementation);
			Types._Port.initFragments(_Port, __Port);
			Types._PortConnector.initFragments(_PortConnector, __PortConnector);
			Types._Property.initFragments(_Property, __Property);
			Types._PropertyConnector.initFragments(_PropertyConnector, __PropertyConnector);
			Types._Requirement.initFragments(_Requirement, __Requirement);
		}

		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		private static final /*@NonNull*/ ExecutorOperation[] _Capability__Capability = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Capability__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Capability__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Component__Component = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Component__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Component__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _ComponentAssembly__ComponentAssembly = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComponentAssembly__ComponentImplementation = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComponentAssembly__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _ComponentAssembly__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _ComponentImplementation__ComponentImplementation = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComponentImplementation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _ComponentImplementation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _ExternalReference__ExternalReference = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ExternalReference__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _ExternalReference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _MonolithicImplementation__MonolithicImplementation = {};
		private static final /*@NonNull*/ ExecutorOperation[] _MonolithicImplementation__ComponentImplementation = {};
		private static final /*@NonNull*/ ExecutorOperation[] _MonolithicImplementation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _MonolithicImplementation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Port__Port = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Port__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Port__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _PortConnector__PortConnector = {};
		private static final /*@NonNull*/ ExecutorOperation[] _PortConnector__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _PortConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Property__Property = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Property__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Property__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _PropertyConnector__PropertyConnector = {};
		private static final /*@NonNull*/ ExecutorOperation[] _PropertyConnector__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _PropertyConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Requirement__Requirement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Requirement__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Requirement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Capability__Capability.initOperations(_Capability__Capability);
			Fragments._Capability__OclAny.initOperations(_Capability__OclAny);
			Fragments._Capability__OclElement.initOperations(_Capability__OclElement);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);

			Fragments._ComponentAssembly__ComponentAssembly.initOperations(_ComponentAssembly__ComponentAssembly);
			Fragments._ComponentAssembly__ComponentImplementation.initOperations(_ComponentAssembly__ComponentImplementation);
			Fragments._ComponentAssembly__OclAny.initOperations(_ComponentAssembly__OclAny);
			Fragments._ComponentAssembly__OclElement.initOperations(_ComponentAssembly__OclElement);

			Fragments._ComponentImplementation__ComponentImplementation.initOperations(_ComponentImplementation__ComponentImplementation);
			Fragments._ComponentImplementation__OclAny.initOperations(_ComponentImplementation__OclAny);
			Fragments._ComponentImplementation__OclElement.initOperations(_ComponentImplementation__OclElement);

			Fragments._ExternalReference__ExternalReference.initOperations(_ExternalReference__ExternalReference);
			Fragments._ExternalReference__OclAny.initOperations(_ExternalReference__OclAny);
			Fragments._ExternalReference__OclElement.initOperations(_ExternalReference__OclElement);

			Fragments._MonolithicImplementation__ComponentImplementation.initOperations(_MonolithicImplementation__ComponentImplementation);
			Fragments._MonolithicImplementation__MonolithicImplementation.initOperations(_MonolithicImplementation__MonolithicImplementation);
			Fragments._MonolithicImplementation__OclAny.initOperations(_MonolithicImplementation__OclAny);
			Fragments._MonolithicImplementation__OclElement.initOperations(_MonolithicImplementation__OclElement);

			Fragments._Port__OclAny.initOperations(_Port__OclAny);
			Fragments._Port__OclElement.initOperations(_Port__OclElement);
			Fragments._Port__Port.initOperations(_Port__Port);

			Fragments._PortConnector__OclAny.initOperations(_PortConnector__OclAny);
			Fragments._PortConnector__OclElement.initOperations(_PortConnector__OclElement);
			Fragments._PortConnector__PortConnector.initOperations(_PortConnector__PortConnector);

			Fragments._Property__OclAny.initOperations(_Property__OclAny);
			Fragments._Property__OclElement.initOperations(_Property__OclElement);
			Fragments._Property__Property.initOperations(_Property__Property);

			Fragments._PropertyConnector__OclAny.initOperations(_PropertyConnector__OclAny);
			Fragments._PropertyConnector__OclElement.initOperations(_PropertyConnector__OclElement);
			Fragments._PropertyConnector__PropertyConnector.initOperations(_PropertyConnector__PropertyConnector);

			Fragments._Requirement__OclAny.initOperations(_Requirement__OclAny);
			Fragments._Requirement__OclElement.initOperations(_Requirement__OclElement);
			Fragments._Requirement__Requirement.initOperations(_Requirement__Requirement);
		}

		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		private static final /*@NonNull*/ ExecutorProperty[] _Capability = {
			ComponentsTables.Properties._Capability__ComponentImplementation,
			ComponentsTables.Properties._Capability__name,
			ComponentsTables.Properties._Capability__resourceType
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Component = {
			ComponentsTables.Properties._Component__ComponentAssembly,
			ComponentsTables.Properties._Component__UUID,
			ComponentsTables.Properties._Component__base_Component,
			ComponentsTables.Properties._Component__configProperty,
			ComponentsTables.Properties._Component__implementation,
			ComponentsTables.Properties._Component__label,
			ComponentsTables.Properties._Component__ownedPort
		};

		private static final /*@NonNull*/ ExecutorProperty[] _ComponentAssembly = {
			ComponentsTables.Properties._ComponentImplementation__Component,
			ComponentsTables.Properties._ComponentAssembly__assemblyProperty,
			ComponentsTables.Properties._ComponentImplementation__base_Class,
			ComponentsTables.Properties._ComponentImplementation__capability,
			ComponentsTables.Properties._ComponentAssembly__containedComponent,
			ComponentsTables.Properties._ComponentImplementation__deployRequirement,
			ComponentsTables.Properties._ComponentAssembly__externalPort,
			ComponentsTables.Properties._ComponentAssembly__ownedPortConnector,
			ComponentsTables.Properties._ComponentAssembly__ownedPropertyConnector
		};

		private static final /*@NonNull*/ ExecutorProperty[] _ComponentImplementation = {
			ComponentsTables.Properties._ComponentImplementation__Component,
			ComponentsTables.Properties._ComponentImplementation__base_Class,
			ComponentsTables.Properties._ComponentImplementation__capability,
			ComponentsTables.Properties._ComponentImplementation__deployRequirement
		};

		private static final /*@NonNull*/ ExecutorProperty[] _ExternalReference = {
			ComponentsTables.Properties._ExternalReference__PortConnector,
			ComponentsTables.Properties._ExternalReference__base_ConnectableElement,
			ComponentsTables.Properties._ExternalReference__location
		};

		private static final /*@NonNull*/ ExecutorProperty[] _MonolithicImplementation = {
			ComponentsTables.Properties._ComponentImplementation__Component,
			ComponentsTables.Properties._ComponentImplementation__base_Class,
			ComponentsTables.Properties._ComponentImplementation__capability,
			ComponentsTables.Properties._ComponentImplementation__deployRequirement
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Port = {
			ComponentsTables.Properties._Port__Component,
			ComponentsTables.Properties._Port__ComponentAssembly,
			ComponentsTables.Properties._Port__PortConnector,
			ComponentsTables.Properties._Port__UUID,
			ComponentsTables.Properties._Port__base_Port,
			ComponentsTables.Properties._Port__exclusiveProvider,
			ComponentsTables.Properties._Port__exclusiveUser,
			ComponentsTables.Properties._Port__name,
			ComponentsTables.Properties._Port__optional,
			ComponentsTables.Properties._Port__provider,
			ComponentsTables.Properties._Port__supportedType
		};

		private static final /*@NonNull*/ ExecutorProperty[] _PortConnector = {
			ComponentsTables.Properties._PortConnector__ComponentAssembly,
			ComponentsTables.Properties._PortConnector__base_Connector,
			ComponentsTables.Properties._PortConnector__connectedPort,
			ComponentsTables.Properties._PortConnector__externalReference,
			ComponentsTables.Properties._PortConnector__label
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Property = {
			ComponentsTables.Properties._Property__Component,
			ComponentsTables.Properties._Property__ComponentAssembly,
			ComponentsTables.Properties._Property__PropertyConnector,
			ComponentsTables.Properties._Property__Requirement,
			ComponentsTables.Properties._Property__base_Property
		};

		private static final /*@NonNull*/ ExecutorProperty[] _PropertyConnector = {
			ComponentsTables.Properties._PropertyConnector__ComponentAssembly,
			ComponentsTables.Properties._PropertyConnector__base_Connector,
			ComponentsTables.Properties._PropertyConnector__connectedProperty,
			ComponentsTables.Properties._PropertyConnector__label
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Requirement = {
			ComponentsTables.Properties._Requirement__ComponentImplementation,
			ComponentsTables.Properties._Requirement__properties,
			ComponentsTables.Properties._Requirement__resourceType
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Capability__Capability.initProperties(_Capability);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._ComponentAssembly__ComponentAssembly.initProperties(_ComponentAssembly);
			Fragments._ComponentImplementation__ComponentImplementation.initProperties(_ComponentImplementation);
			Fragments._ExternalReference__ExternalReference.initProperties(_ExternalReference);
			Fragments._MonolithicImplementation__MonolithicImplementation.initProperties(_MonolithicImplementation);
			Fragments._Port__Port.initProperties(_Port);
			Fragments._PortConnector__PortConnector.initProperties(_PortConnector);
			Fragments._Property__Property.initProperties(_Property);
			Fragments._PropertyConnector__PropertyConnector.initProperties(_PropertyConnector);
			Fragments._Requirement__Requirement.initProperties(_Requirement);
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
