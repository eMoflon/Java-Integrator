package org.emoflon.ibex.tgg.evaluation;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.impl.TypesPackageImpl;
import org.eclipse.xtext.xbase.annotations.xAnnotations.impl.XAnnotationsPackageImpl;
import org.eclipse.xtext.xtype.impl.XtypePackageImpl;
import org.emoflon.delta.validation.InvalidDeltaException;
import org.emoflon.ibex.tgg.resources.ResourceContainer;
import org.emoflon.ibex.tgg.resources.XtextResourceParser;
import org.emoflon.ibex.tgg.run.javaexchange.CC_App;
import org.emoflon.ibex.tgg.run.javaexchange.INTEGRATE_App;
import org.emoflon.ibex.tgg.runtime.Measurement;
import org.emoflon.ibex.tgg.runtime.RuntimeContainer;

public class SimpleJavaIntegration_W2 {

	public void performIntegration() {
		registerMetamodels();

		try {
			
			String commonPath = new File(".").getCanonicalPath() + "\\resources\\";

			HashMap<Measurement, Long> runtimes = RuntimeContainer.getInstance().getRuntimes();
			
			long tic = System.currentTimeMillis();
			Resource firstSrc = XtextResourceParser.toResource(commonPath + "firstSrc.simplej");
			Resource firstTrg = XtextResourceParser.toResource(commonPath + "firstTrg.simplej");
			long toc = System.currentTimeMillis();
//			runtimes.put(Measurement.T2M_FIRST, toc - tic);
			
			tic = System.currentTimeMillis();
			Resource src = XtextResourceParser.toResource(commonPath + "src.simplej");
			Resource trg = XtextResourceParser.toResource(commonPath + "trg.simplej");
			toc = System.currentTimeMillis();
//			runtimes.put(Measurement.T2M_SECOND, toc - tic);

			tic = System.currentTimeMillis();
			Resource newSrc = XtextResourceParser.toResource(commonPath + "newSrc.simplej");
			Resource newTrg = XtextResourceParser.toResource(commonPath + "newTrg.simplej");
			toc = System.currentTimeMillis();
			runtimes.put(Measurement.T2M_THIRD, toc - tic);
			
			Resource[] srcAndTrg = new Resource[2];
			srcAndTrg[0] = firstSrc;
			srcAndTrg[1] = firstTrg;

			CC_App cc = new CC_App(srcAndTrg);
			boolean consistent = cc.checkConsistency();

			if (consistent) {
				ResourceContainer resources = ResourceContainer.getInstance();
				resources.setNewSource(src);
				resources.setNewTarget(trg);

				INTEGRATE_App integrate = new INTEGRATE_App(resources, Optional.empty());
				integrate.doIntegrate(1);

				resources.setNewSource(newSrc);
				resources.setNewTarget(newTrg);
				
				integrate = new INTEGRATE_App(resources, Optional.empty());
				integrate.doIntegrate(2);
				
				tic = System.currentTimeMillis();
				XtextResourceParser.toSimpleJ(resources.getSource(), commonPath + "firstSrc.simplej");
				XtextResourceParser.toSimpleJ(resources.getTarget(), commonPath + "firstTrg.simplej");
				toc = System.currentTimeMillis();
				runtimes.put(Measurement.M2T, toc - tic);
				
				for(Measurement measurement : runtimes.keySet()) {
					System.out.println(measurement.name() + ": " + runtimes.get(measurement) + " ms");
				}
			}
		} catch (IOException | InvalidDeltaException e) {
			e.printStackTrace();
		}
		deregisterMetamodels();
		
	}

	private static void registerMetamodels() {
		org.eclipse.emf.ecore.EPackage.Registry reg = EPackage.Registry.INSTANCE;

		reg.put("platform:/resource/org.eclipse.xtext.common.types/model/JavaVMTypes.ecore", TypesPackageImpl.init());
		reg.put("platform:/plugin/org.eclipse.xtext.common.types/model/JavaVMTypes.ecore", TypesPackageImpl.init());

		reg.put("platform:/resource/org.eclipse.xtext.xbase/model/Xtype.ecore", XtypePackageImpl.init());
		reg.put("platform:/plugin/org.eclipse.xtext.xbase/model/Xtype.ecore", XtypePackageImpl.init());

		reg.put("platform:/resource/org.eclipse.xtext.xbase/model/XAnnotations.ecore", XAnnotationsPackageImpl.init());
		reg.put("platform:/plugin/org.eclipse.xtext.xbase/model/XAnnotations.ecore", XAnnotationsPackageImpl.init());
	}

	private static void deregisterMetamodels() {
		org.eclipse.emf.ecore.EPackage.Registry reg = EPackage.Registry.INSTANCE;

		reg.remove("platform:/resource/org.eclipse.xtext.common.types/model/JavaVMTypes.ecore");
		reg.remove("platform:/plugin/org.eclipse.xtext.common.types/model/JavaVMTypes.ecore");

		reg.remove("platform:/resource/org.eclipse.xtext.xbase/model/Xtype.ecore");
		reg.remove("platform:/plugin/org.eclipse.xtext.xbase/model/Xtype.ecore");

		reg.remove("platform:/resource/org.eclipse.xtext.xbase/model/XAnnotations.ecore");
		reg.remove("platform:/plugin/org.eclipse.xtext.xbase/model/XAnnotations.ecore");
	}

}