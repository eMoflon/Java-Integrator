package org.emoflon.ibex.tgg.run.javaexchange;

import java.io.IOException;
import java.util.Optional;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.CC;
import org.emoflon.ibex.tgg.resources.ResourceContainer;
import org.emoflon.ibex.tgg.run.javaexchange.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.Measurement;
import org.emoflon.ibex.tgg.runtime.RuntimeContainer;

public class CC_App extends CC {

	// eMoflon supports other pattern matching engines. Replace
	// _DefaultRegistrationHelper with one of the other registrationHelpers from the
	// *.config-package to choose between them. Default: Democles
	public static HiPERegistrationHelper registrationHelper = new HiPERegistrationHelper();
	private ResourceContainer resources;

	public CC_App(Resource[] srcAndTrg) throws IOException {
		super(registrationHelper.initializeHiPEEngine("CC",
				registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
					@Override
					public void saveModels() throws IOException {
						// Use the commented code below to implement saveModels individually.
						// source.save(null);
						// target.save(null);
						// corr.save(null);
						// protocol.save(null);

						super.saveModels();
					}

					@Override
					public void loadModels() throws IOException {
						// Use the commented code below to implement loadModels individually.
						// loadResource loads from a file while createResource creates a new resource
						// without content
						source = srcAndTrg[0];
						target = srcAndTrg[1];
						corr = createResource(options.project.path() + "/instances/corr.xmi");
						protocol = createResource(options.project.path() + "/instances/protocol.xmi");

//				super.loadModels();
					}
				}), Optional.empty()));
		this.resources = ResourceContainer.getInstance();
	}

	public boolean checkConsistency() throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting CC");
		long tic = System.currentTimeMillis();
		run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CC in: " + (toc - tic) + " ms");
		RuntimeContainer.getInstance().getRuntimes().put(Measurement.CC, toc - tic);

		saveModels();
		terminate();
		logger.info(generateConsistencyReport());

		if (modelsAreConsistent()) {
			resources.setSource(resourceHandler.getSourceResource());
			resources.setTarget(resourceHandler.getTargetResource());
			resources.setCorr(resourceHandler.getCorrResource());
			resources.setProtocol(resourceHandler.getProtocolResource());
		}

		return modelsAreConsistent();
	}

	public ResourceContainer getResources() {
		return resources;
	}
}