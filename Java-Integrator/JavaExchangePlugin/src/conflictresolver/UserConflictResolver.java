package conflictresolver;

import java.util.Set;

import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.AttributeConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.Conflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.ConflictContainer;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DelPreserveAttrConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DelPreserveEdgeConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.ConflictResolver;

public class UserConflictResolver implements ConflictResolver {

	Set<Conflict> conflicts;

	@Override
	public void resolveConflict(ConflictContainer conflict) {

		conflicts = conflict.getConflicts();

		for (Conflict c : conflicts) {

			ResolveDecision rd = new ResolveDecision(c);
			Decision d = rd.getDecision();

			if (c instanceof AttributeConflict) {
				AttributeConflict ac = (AttributeConflict) c;

				switch (d) {
				case PREFER_SRC:
					ac.crs_preferSource();
					break;
				case PREFER_TRG:
					ac.crs_preferTarget();
					break;
				default:
					ac.crs_preferSource();

				}
			}

			if (c instanceof DelPreserveAttrConflict) {
				DelPreserveAttrConflict dpac = (DelPreserveAttrConflict) c;

				switch (d) {
				case PREFER_SRC:
					dpac.crs_preferSource();
					break;
				case PREFER_TRG:
					dpac.crs_preferTarget();
					break;
				case PRESERVE:
					dpac.crs_mergeAndPreserve();
					break;
				default:
					dpac.crs_preferSource();
				}
			}

			if (c instanceof DelPreserveEdgeConflict) {
				DelPreserveEdgeConflict dpec = (DelPreserveEdgeConflict) c;

				switch (d) {
				case PREFER_SRC:
					dpec.crs_preferSource();
					break;
				case PREFER_TRG:
					dpec.crs_preferTarget();
					break;
				case PRESERVE:
					dpec.crs_mergeAndPreserve();
					break;
				default:
					dpec.crs_preferSource();
				}
			}
		}
	}
}