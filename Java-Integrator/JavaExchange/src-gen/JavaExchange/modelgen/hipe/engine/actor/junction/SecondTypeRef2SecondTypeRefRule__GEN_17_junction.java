package JavaExchange.modelgen.hipe.engine.actor.junction;

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

public class SecondTypeRef2SecondTypeRefRule__GEN_17_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_8);
		
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("SecondTypeRef2SecondTypeRefRule__GEN_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_8(HMatch match, int index) {
		JavaExchange.TypeRef2TypeRef TR2TR = (JavaExchange.TypeRef2TypeRef) match.getNodes()[8];
		JavaExchange.TypeRef2TypeRef TR2TR2 = (JavaExchange.TypeRef2TypeRef) match.getNodes()[0];
		org.eclipse.xtext.common.types.JvmParameterizedTypeReference trgRef2 = (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) match.getNodes()[2];
		org.eclipse.xtext.common.types.JvmParameterizedTypeReference srcRef = (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) match.getNodes()[3];
		org.eclipse.xtext.common.types.JvmParameterizedTypeReference srcRef2 = (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) match.getNodes()[1];
		org.eclipse.xtext.common.types.JvmParameterizedTypeReference trgRef = (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) match.getNodes()[7];
		boolean predicate = !srcRef.equals(srcRef2) && !srcRef.equals(trgRef2) && !srcRef2.equals(trgRef) && !trgRef.equals(trgRef2) && !TR2TR.equals(TR2TR2);
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

