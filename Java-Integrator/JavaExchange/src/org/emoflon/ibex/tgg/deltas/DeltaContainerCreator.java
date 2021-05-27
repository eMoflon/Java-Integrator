package org.emoflon.ibex.tgg.deltas;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;

import delta.Delta;
import delta.DeltaContainer;
import delta.DeltaFactory;

/**
 * The DeltaContainerCreator creates a DeltaContainer containing a Delta each
 * between the new and the original version of the source as well as target.
 */
public class DeltaContainerCreator {

	private Resource oldSrc;
	private Resource newSrc;
	private Resource oldTrg;
	private Resource newTrg;

	public DeltaContainerCreator(Resource oldSrc, Resource newSrc, Resource oldTrg, Resource newTrg) {
		this.oldSrc = oldSrc;
		this.newSrc = newSrc;
		this.oldTrg = oldTrg;
		this.newTrg = newTrg;
	}

	/**
	 * This method retrieves the differences between old and new source and target
	 * resources and creates the respective Deltas.
	 * 
	 * @return The created DeltaContainer containing two Deltas (Delta between old
	 *         and new source & Delta between old and new target).
	 * @throws IOException
	 */
	public DeltaContainer getDeltaContainer() throws IOException {
		DeltaContainer dc = DeltaFactory.eINSTANCE.createDeltaContainer();

		DiffToDelta srcDD = new DiffToDelta(oldSrc, newSrc);
		Delta srcDelta = srcDD.diffToDelta();

		DiffToDelta trgDD = new DiffToDelta(oldTrg, newTrg);
		Delta trgDelta = trgDD.diffToDelta();

		dc.getDeltas().add(srcDelta);
		dc.getDeltas().add(trgDelta);

		return dc;
	}
}