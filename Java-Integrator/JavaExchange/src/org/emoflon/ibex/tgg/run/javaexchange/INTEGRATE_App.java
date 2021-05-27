package org.emoflon.ibex.tgg.run.javaexchange;

import java.io.IOException;
import java.util.Optional;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.delta.validation.InvalidDeltaException;
import org.emoflon.ibex.tgg.deltas.DeltaContainerCreator;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.ConflictResolver;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.resources.ResourceContainer;
import org.emoflon.ibex.tgg.run.javaexchange.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.Measurement;
import org.emoflon.ibex.tgg.runtime.RuntimeContainer;

import delta.DeltaContainer;

public class INTEGRATE_App extends INTEGRATE {

	// eMoflon supports other pattern matching engines. Replace
	// _DefaultRegistrationHelper with one of the other registrationHelpers from the
	// *.config-package to choose between them. Default: Democles
	public static HiPERegistrationHelper registrationHelper = new HiPERegistrationHelper();

	private ResourceContainer resources;

	public INTEGRATE_App(ResourceContainer resources, Optional<ConflictResolver> conflictResolver) throws IOException {
		super(registrationHelper.initializeHiPEEngine("INTEGRATE",
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
						source = resources.getSource();
						target = resources.getTarget();
						corr = resources.getCorr();
						protocol = resources.getProtocol();

//				super.loadModels();
					}
				}), conflictResolver));

		this.resources = resources;
	}

	public void doIntegrate(int round) throws IOException, InvalidDeltaException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		Resource oldSrc = resources.getSource();
		Resource newSrc = resources.getNewSource();
		Resource oldTrg = resources.getTarget();
		Resource newTrg = resources.getNewTarget();

		DeltaContainerCreator dcc = new DeltaContainerCreator(oldSrc, newSrc, oldTrg, newTrg);
		DeltaContainer dc = dcc.getDeltaContainer();

		logger.info("Starting INTEGRATE");
		long tic = System.currentTimeMillis();
		applyDelta(dc);
		integrate();

		long toc = System.currentTimeMillis();
		long time = toc - tic;
		if (round == 1) {
			RuntimeContainer.getInstance().getRuntimes().put(Measurement.EXPANSION, time);
		}
		if (round == 2) {
			RuntimeContainer.getInstance().getRuntimes().put(Measurement.INTEGRATE, time);
		}
		logger.info("Completed INTEGRATE in: " + time + " ms");

//		saveModels();
		terminate();

		resources.setSource(this.resourceHandler.getSourceResource());
		resources.setTarget(this.resourceHandler.getTargetResource());
		resources.setCorr(this.resourceHandler.getCorrResource());
		resources.setProtocol(this.resourceHandler.getProtocolResource());
	}

	public ResourceContainer getResources() {
		return resources;
	}
}