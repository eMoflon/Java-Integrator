package org.emoflon.ibex.tgg.resources;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * This singleton saves the source, target, new (modified) source, (modified)
 * newTarget, protocol and corr Resource objects.
 */
public class ResourceContainer {

	private static ResourceContainer instance = null;
	private HashMap<ResourceType, Resource> resources;

	private ResourceContainer() {
		resources = new HashMap<>();
	}

	/**
	 * Returns the singleton instance containing the Resources objects.
	 * 
	 * @return The ResourceContainer instance.
	 */
	public static ResourceContainer getInstance() {
		if (instance == null) {
			instance = new ResourceContainer();
		}
		return instance;
	}

	public Resource getSource() {
		return resources.get(ResourceType.SOURCE);
	}

	public Resource getTarget() {
		return resources.get(ResourceType.TARGET);
	}

	public Resource getNewSource() {
		return resources.get(ResourceType.NEW_SOURCE);
	}

	public Resource getNewTarget() {
		return resources.get(ResourceType.NEW_TARGET);
	}

	public Resource getCorr() {
		return resources.get(ResourceType.CORR);
	}

	public Resource getProtocol() {
		return resources.get(ResourceType.PROTOCOL);
	}

	public void setSource(Resource source) {
		resources.put(ResourceType.SOURCE, source);
	}

	public void setTarget(Resource target) {
		resources.put(ResourceType.TARGET, target);
	}

	public void setNewSource(Resource newSource) {
		resources.put(ResourceType.NEW_SOURCE, newSource);
	}

	public void setNewTarget(Resource newTarget) {
		resources.put(ResourceType.NEW_TARGET, newTarget);
	}

	public void setCorr(Resource corr) {
		resources.put(ResourceType.CORR, corr);
	}

	public void setProtocol(Resource protocol) {
		resources.put(ResourceType.PROTOCOL, protocol);
	}
}
