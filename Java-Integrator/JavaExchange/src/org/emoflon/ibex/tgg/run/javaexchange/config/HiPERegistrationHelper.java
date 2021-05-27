package org.emoflon.ibex.tgg.run.javaexchange.config;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.common.types.impl.TypesPackageImpl;
import org.eclipse.xtext.xbase.annotations.xAnnotations.impl.XAnnotationsPackageImpl;
import org.eclipse.xtext.xtype.impl.XtypePackageImpl;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.javaexchange.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.ConflictResolver;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.xtext.simplejava.simpleJava.impl.SimpleJavaPackageImpl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.impl.JavaExchangePackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {

	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {

		// Set correct workspace root
		setWorkspaceRootDirectory(rs);

		// Load and register source and target metamodels
		EPackage srcPack = null;
		EPackage trgPack = null;
		EPackage simplejavaexchangePack = null;
		EPackage javaVMTypesPack = null;
		EPackage xTypePack = null;
		EPackage xAnnotationPack = null;

		if (executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler()
					.loadResource("platform:/resource/org.xtext.simplejava/model/generated/SimpleJava.ecore");
			trgPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);

			res = executable.getResourceHandler()
					.loadResource("platform:/resource/JavaExchange/model/JavaExchange.ecore");
			simplejavaexchangePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if (executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler()
					.loadResource("platform:/resource/org.xtext.simplejava/model/generated/SimpleJava.ecore");
			srcPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);

			res = executable.getResourceHandler()
					.loadResource("platform:/resource/JavaExchange/model/JavaExchange.ecore");
			simplejavaexchangePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if (javaVMTypesPack == null) {
			javaVMTypesPack = TypesPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/org.eclipse.xtext.common.types/model/JavaVMTypes.ecore",
					javaVMTypesPack);
			rs.getPackageRegistry().put("platform:/plugin/org.eclipse.xtext.common.types/model/JavaVMTypes.ecore",
					javaVMTypesPack);
		}

		if (xTypePack == null) {
			xTypePack = XtypePackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/org.eclipse.xtext.xbase/model/Xtype.ecore", xTypePack);
			rs.getPackageRegistry().put("platform:/plugin/org.eclipse.xtext.xbase/model/Xtype.ecore", xTypePack);
		}

		if (xAnnotationPack == null) {
			xAnnotationPack = XAnnotationsPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/org.eclipse.xtext.xbase/model/XAnnotations.ecore",
					xAnnotationPack);
			rs.getPackageRegistry().put("platform:/plugin/org.eclipse.xtext.xbase/model/XAnnotations.ecore",
					xAnnotationPack);
		}

		if (srcPack == null)
			srcPack = SimpleJavaPackageImpl.init();

		if (trgPack == null)
			trgPack = SimpleJavaPackageImpl.init();

		if (simplejavaexchangePack == null) {
			simplejavaexchangePack = JavaExchangePackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/JavaExchange/model/JavaExchange.ecore",
					JavaExchangePackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/JavaExchange/model/JavaExchange.ecore",
					JavaExchangePackage.eINSTANCE);
		}

		rs.getPackageRegistry().put("platform:/resource/org.xtext.simplejava/model/generated/SimpleJava.ecore",
				srcPack);
		rs.getPackageRegistry().put("platform:/plugin/org.xtext.simplejava/model/generated/SimpleJava.ecore", srcPack);

		rs.getPackageRegistry().put("platform:/resource/org.xtext.simplejava/model/generated/SimpleJava.ecore",
				trgPack);
		rs.getPackageRegistry().put("platform:/plugin/org.xtext.simplejava/model/generated/SimpleJava.ecore", trgPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.patterns.relaxDomainConformity(true);
		options.project.name("JavaExchange");
		options.project.path("JavaExchange");
		options.project.path("file://" + getProjectLocation());
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);

		return options;
	}

	public IbexOptions initializeHiPEEngine(String executableType, IbexOptions options,
			Optional<ConflictResolver> conflictResolver) {
//		HiPENetwork network = loadNetwork(getProjectLocation(), executableType);
		switch (executableType) {
		case "INTEGRATE":
			options.blackInterpreter(new HiPETGGEngine(new JavaExchange.integrate.hipe.engine.HiPEEngine()));
			if (conflictResolver.isPresent()) {
				options.integration.conflictSolver(conflictResolver.get());
			}
			break;
		case "CC":
			options.blackInterpreter(new HiPETGGEngine(new JavaExchange.cc.hipe.engine.HiPEEngine()));
			break;
		case "INITIAL_FWD":
			options.blackInterpreter(new HiPETGGEngine(new JavaExchange.initfwd.hipe.engine.HiPEEngine()));
			break;
		default:
			throw new RuntimeException("Unrecognized executable");
		}

		return options;
	}

	private String getProjectLocation() {
		String engineLocation = JavaExchange.integrate.hipe.engine.HiPEEngine.class.getProtectionDomain()
				.getCodeSource().getLocation().getPath();
		String projectLocation = engineLocation = engineLocation.substring(0, engineLocation.indexOf("JavaExchange"))
				+ "JavaExchange";
		return projectLocation;
	}

	private ResourceSet createAndPrepareResourceSet_internal(final String workspacePath) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		try {
			rs.getURIConverter().getURIMap().put(URI.createPlatformResourceURI("/", true),
					URI.createFileURI(new File(workspacePath).getCanonicalPath() + File.separator));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return rs;
	}
}
