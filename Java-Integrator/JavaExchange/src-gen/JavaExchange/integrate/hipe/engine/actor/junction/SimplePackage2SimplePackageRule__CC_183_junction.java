package JavaExchange.integrate.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.util.HiPEMultiUtil;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;

import hipe.network.JunctionNode;

public class SimplePackage2SimplePackageRule__CC_183_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> simplePackage_5_AttrMap = HiPEMultiUtil.createMap();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_35);
		
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("SimplePackage2SimplePackageRule__CC_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> simplePackage_0_Matches = simplePackage_5_AttrMap.get(matchObjects[0]);
		if(simplePackage_0_Matches == null) {
			simplePackage_0_Matches = new LinkedList<>();
			simplePackage_5_AttrMap.put(matchObjects[0], simplePackage_0_Matches);
		}
		
		simplePackage_0_Matches.add(match);
		
		Collection<HMatch> simplePackage_1_Matches = simplePackage_5_AttrMap.get(matchObjects[1]);
		if(simplePackage_1_Matches == null) {
			simplePackage_1_Matches = new LinkedList<>();
			simplePackage_5_AttrMap.put(matchObjects[1], simplePackage_1_Matches);
		}
		
		simplePackage_1_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = simplePackage_5_AttrMap.get(matchObjects[0]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = simplePackage_5_AttrMap.get(matchObjects[1]);
		if(matches_1 != null) {
			matches.remove(match);
		}
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof org.xtext.simplejava.simpleJava.SimplePackage) {
			if(simplePackage_5_AttrMap.containsKey(obj)) {
				for(HMatch attr_match : simplePackage_5_AttrMap.get(obj)) {
					for(int i=0; i<ports.size(); i++) {
						Port<HMatch> port = ports.get(i);
						HMatch match = attr_match;
												
						if(match.isConstraintSatisfied(i)) {
							if(!constraints.get(i).apply(match, i))
								port.sendRemove(message.initialMessage, match);
						}
						else {
							if(constraints.get(i).apply(match, i))
								port.sendAdd(message.initialMessage, match);
						}
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_35(HMatch match, int index) {
		org.xtext.simplejava.simpleJava.SimplePackage trgPackage = (org.xtext.simplejava.simpleJava.SimplePackage) match.getNodes()[0];
		org.xtext.simplejava.simpleJava.SimplePackage srcPackage = (org.xtext.simplejava.simpleJava.SimplePackage) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_20 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_20.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, srcPackage.getName(), "java.lang.String"));
		csp_20.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, trgPackage.getName(), "java.lang.String"));
		csp_20.solve();
		
		boolean predicate = !srcPackage.equals(trgPackage) && csp_20.isSatisfied();
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

