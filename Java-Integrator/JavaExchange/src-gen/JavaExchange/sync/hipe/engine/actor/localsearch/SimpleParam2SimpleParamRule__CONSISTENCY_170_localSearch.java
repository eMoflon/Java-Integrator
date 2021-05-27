package JavaExchange.sync.hipe.engine.actor.localsearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.match.OverlapMatch;
import hipe.engine.match.LocalSearchMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;
import hipe.engine.message.production.MatchAdded;
import hipe.engine.message.production.MatchDeleted;
import hipe.engine.util.HiPEMultiUtil;

import hipe.network.LocalSearchNode;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;
import hipe.generic.actor.local.GenericLocalSearchActor;
import hipe.generic.actor.local.search.*;
import hipe.generic.actor.local.search.misc.*;

import org.eclipse.emf.ecore.EObject;

public class SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch extends GenericLocalSearchActor{
	ConstraintChecker node_constraint;
	ConstraintChecker node_constraint_0;
	ConstraintChecker constraint_checker;
	CachedEdgeExplorer edge_explorer;
	EdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	EdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	CachedEdgeExplorer edge_explorer_8;
	CachedEdgeExplorer edge_explorer_9;
	CachedEdgeExplorer edge_explorer_10;
	CachedEdgeExplorer edge_explorer_11;
	CachedEdgeExplorer edge_explorer_12;
	CachedEdgeExplorer edge_explorer_13;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_3_2_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_5_1_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration edge_explorer_9_0_orchestration;
	SearchOrchestration edge_explorer_10_0_orchestration;
	SearchOrchestration edge_explorer_11_0_orchestration;
	SearchOrchestration edge_explorer_12_0_orchestration;
	SearchOrchestration edge_explorer_13_0_orchestration;
	
	
	@Override
	protected void initializeSearchComponents() {
		node_constraint = new ConstraintChecker(this, this::node_constraint_method);
		name2explorer.put("node_constraint", node_constraint);
		node_constraint_0 = new ConstraintChecker(this, this::node_constraint_0_method);
		name2explorer.put("node_constraint_0", node_constraint_0);
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> ((JavaExchange.SimpleParam2SimpleParamRule__Marker) o).getCREATE__CORR__SPa2SPa();
						edge_explorer = new CachedEdgeExplorer(this, 6, 5, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.multi_lookup = (o) -> ((org.xtext.simplejava.simpleJava.SimpleMethod) o).getParams();
						edge_explorer_3_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof org.xtext.simplejava.simpleJava.SimpleMethod) return edge_explorer_3_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_3 = new EdgeExplorer(this, 2, 3, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> ((JavaExchange.SimpleParam2SimpleParamRule__Marker) o).getCONTEXT__SRC__srcMethod();
						edge_explorer_4 = new CachedEdgeExplorer(this, 6, 0, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.multi_lookup = (o) -> ((org.xtext.simplejava.simpleJava.SimpleMethod) o).getParams();
						edge_explorer_5_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof org.xtext.simplejava.simpleJava.SimpleMethod) return edge_explorer_5_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_5 = new EdgeExplorer(this, 0, 1, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> ((JavaExchange.SimpleParam2SimpleParamRule__Marker) o).getCREATE__TRG__trgParam();
						edge_explorer_6 = new CachedEdgeExplorer(this, 6, 3, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> ((JavaExchange.SimpleParam2SimpleParamRule__Marker) o).getCONTEXT__CORR__SM2SM();
						edge_explorer_7 = new CachedEdgeExplorer(this, 6, 4, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> ((JavaExchange.SimpleMethod2SimpleMethod) o).getSource();
						edge_explorer_8 = new CachedEdgeExplorer(this, 4, 0, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> ((JavaExchange.SimpleParam2SimpleParam) o).getSource();
						edge_explorer_9 = new CachedEdgeExplorer(this, 5, 1, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> ((JavaExchange.SimpleParam2SimpleParam) o).getTarget();
						edge_explorer_10 = new CachedEdgeExplorer(this, 5, 3, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		EdgeLookupMethods edge_explorer_11_methods = new EdgeLookupMethods();
						edge_explorer_11_methods.unique_lookup = (o) -> ((JavaExchange.SimpleParam2SimpleParamRule__Marker) o).getCONTEXT__TRG__trgMethod();
						edge_explorer_11 = new CachedEdgeExplorer(this, 6, 2, edge_explorer_11_methods);
		name2explorer.put("edge_explorer_11", edge_explorer_11);
		EdgeLookupMethods edge_explorer_12_methods = new EdgeLookupMethods();
						edge_explorer_12_methods.unique_lookup = (o) -> ((JavaExchange.SimpleMethod2SimpleMethod) o).getTarget();
						edge_explorer_12 = new CachedEdgeExplorer(this, 4, 2, edge_explorer_12_methods);
		name2explorer.put("edge_explorer_12", edge_explorer_12);
		EdgeLookupMethods edge_explorer_13_methods = new EdgeLookupMethods();
						edge_explorer_13_methods.unique_lookup = (o) -> ((JavaExchange.SimpleParam2SimpleParamRule__Marker) o).getCREATE__SRC__srcParam();
						edge_explorer_13 = new CachedEdgeExplorer(this, 6, 1, edge_explorer_13_methods);
		name2explorer.put("edge_explorer_13", edge_explorer_13);
	}
	
	@Override
	protected void initializeOrchestration() {
		edge_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
		edge_explorer_1_orchestration = initializeOrchestration(node.getOrchestrations().get(1).getPlan());
		edge_explorer_2_orchestration = initializeOrchestration(node.getOrchestrations().get(2).getPlan());
		edge_explorer_3_0_orchestration = initializeOrchestration(node.getOrchestrations().get(3).getPlan());
		edge_explorer_3_1_orchestration = initializeOrchestration(node.getOrchestrations().get(4).getPlan());
		edge_explorer_3_2_orchestration = initializeOrchestration(node.getOrchestrations().get(5).getPlan());
		edge_explorer_4_0_orchestration = initializeOrchestration(node.getOrchestrations().get(6).getPlan());
		edge_explorer_4_1_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_5_1_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_9_0_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		edge_explorer_10_0_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		edge_explorer_11_0_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
		edge_explorer_12_0_orchestration = initializeOrchestration(node.getOrchestrations().get(17).getPlan());
		edge_explorer_13_0_orchestration = initializeOrchestration(node.getOrchestrations().get(18).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "SimpleMethod_object_SP0": 
				{
					
					// srcMethod
					HMatch match_0 = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_4_1_orchestration, match_0);
					
					// trgMethod
					HMatch match_2 = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
					match_2.getNodes()[2] = objs[0];
					start(edge_explorer_3_1_orchestration, match_2);
				}
				break;
			case "SimpleParam_object_SP0": 
				{
					
					// srcParam
					HMatch match_1 = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
					match_1.getNodes()[1] = objs[0];
					start(edge_explorer_5_1_orchestration, match_1);
					
					// trgParam
					HMatch match_3 = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
					match_3.getNodes()[3] = objs[0];
					start(edge_explorer_3_2_orchestration, match_3);
				}
				break;
			case "SimpleMethod2SimpleMethod_object": 
				{
					edge_explorer_8.registerSourceObject(objs[0]);
					edge_explorer_12.registerSourceObject(objs[0]);
					
					// SM2SM
					HMatch match_4 = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
					match_4.getNodes()[4] = objs[0];
					start(edge_explorer_7_1_orchestration, match_4);
				}
				break;
			case "SimpleParam2SimpleParam_object": 
				{
					edge_explorer_9.registerSourceObject(objs[0]);
					edge_explorer_10.registerSourceObject(objs[0]);
					
					// SPa2SPa
					HMatch match_5 = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
					match_5.getNodes()[5] = objs[0];
					start(edge_explorer_2_orchestration, match_5);
				}
				break;
			case "SimpleParam2SimpleParamRule__Marker_object": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					edge_explorer_7.registerSourceObject(objs[0]);
					edge_explorer_11.registerSourceObject(objs[0]);
					edge_explorer_13.registerSourceObject(objs[0]);
					
					// SimpleParam2SimpleParamRule_eMoflon_ProtocolNode
					HMatch match_6 = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
					match_6.getNodes()[6] = objs[0];
					start(edge_explorer_1_orchestration, match_6);
				}
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removed(MatchDeleted<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		switch(match.creator) {
			case "SimpleMethod_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "SimpleParam_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "SimpleMethod2SimpleMethod_object": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "SimpleParam2SimpleParam_object": 
				removeMatchesUsedBy(match.getNodes()[0], 5);
				break;
			case "SimpleParam2SimpleParamRule__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 6);
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}
	
	@Override
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "SimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa_SimpleParam2SimpleParam": 
			{
				edge_explorer.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleMethod_params_SimpleParam": 
			{
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[0] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_5_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[0] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_5_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod_SimpleMethod": 
			{
				edge_explorer_4.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_4.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam_SimpleParam": 
			{
				edge_explorer_6.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_6_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM_SimpleMethod2SimpleMethod": 
			{
				edge_explorer_7.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_7_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_7.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_7_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleMethod2SimpleMethod_source_SimpleMethod": 
			{
				edge_explorer_8.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[4] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_8_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleParam2SimpleParam_source_SimpleParam": 
			{
				edge_explorer_9.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[5] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_9_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleParam2SimpleParam_target_SimpleParam": 
			{
				edge_explorer_10.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[5] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_10_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod_SimpleMethod": 
			{
				edge_explorer_11.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[2] = msg.target;
				currentDepth++;
				start(edge_explorer_11_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleMethod2SimpleMethod_target_SimpleMethod": 
			{
				edge_explorer_12.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[4] = msg.source;
				objs[2] = msg.target;
				currentDepth++;
				start(edge_explorer_12_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "SimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam_SimpleParam": 
			{
				edge_explorer_13.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_13_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removeReference(ReferenceDeleted msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "SimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa_SimpleParam2SimpleParam": 
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_0.add(m);
					}
					if(!toBeRemoved_0.isEmpty()) {
						sendDeletedMatches(toBeRemoved_0);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_1 = obj2matches.get(msg.source);
				if(matches_1 != null && !matches_1.isEmpty()) {
					Collection<HMatch> toBeRemoved_1 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_1) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_1.add(m);
					}
					if(!toBeRemoved_1.isEmpty()) {
						sendDeletedMatches(toBeRemoved_1);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_2 = obj2matches.get(msg.source);
				if(matches_2 != null && !matches_2.isEmpty()) {
					Collection<HMatch> toBeRemoved_2 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_2) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "SimpleMethod_params_SimpleParam": 
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_3.add(m);
					}
					if(!toBeRemoved_3.isEmpty()) {
						sendDeletedMatches(toBeRemoved_3);
					}
				}
				Collection<HMatch> matches_4 = obj2matches.get(msg.source);
				if(matches_4 != null && !matches_4.isEmpty()) {
					Collection<HMatch> toBeRemoved_4 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_4) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				break;
		case "SimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod_SimpleMethod": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				break;
		case "SimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam_SimpleParam": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "SimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM_SimpleMethod2SimpleMethod": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
					}
				}
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_12 = obj2matches.get(msg.source);
				if(matches_12 != null && !matches_12.isEmpty()) {
					Collection<HMatch> toBeRemoved_12 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_12) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
					}
				}
				break;
		case "SimpleMethod2SimpleMethod_source_SimpleMethod": 
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				break;
		case "SimpleParam2SimpleParam_source_SimpleParam": 
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				break;
		case "SimpleParam2SimpleParam_target_SimpleParam": 
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_15 = obj2matches.get(msg.source);
				if(matches_15 != null && !matches_15.isEmpty()) {
					Collection<HMatch> toBeRemoved_15 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_15) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_15.add(m);
					}
					if(!toBeRemoved_15.isEmpty()) {
						sendDeletedMatches(toBeRemoved_15);
					}
				}
				break;
		case "SimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod_SimpleMethod": 
				edge_explorer_11.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_16 = obj2matches.get(msg.source);
				if(matches_16 != null && !matches_16.isEmpty()) {
					Collection<HMatch> toBeRemoved_16 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_16) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_16.add(m);
					}
					if(!toBeRemoved_16.isEmpty()) {
						sendDeletedMatches(toBeRemoved_16);
					}
				}
				break;
		case "SimpleMethod2SimpleMethod_target_SimpleMethod": 
				edge_explorer_12.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_17 = obj2matches.get(msg.source);
				if(matches_17 != null && !matches_17.isEmpty()) {
					Collection<HMatch> toBeRemoved_17 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_17) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_17.add(m);
					}
					if(!toBeRemoved_17.isEmpty()) {
						sendDeletedMatches(toBeRemoved_17);
					}
				}
				break;
		case "SimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam_SimpleParam": 
				edge_explorer_13.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_18 = obj2matches.get(msg.source);
				if(matches_18 != null && !matches_18.isEmpty()) {
					Collection<HMatch> toBeRemoved_18 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_18) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_18.add(m);
					}
					if(!toBeRemoved_18.isEmpty()) {
						sendDeletedMatches(toBeRemoved_18);
					}
				}
				break;
		}
		
		msg.initialMessage.decrement();
	}
	
	
	@Override
	protected void registerMatch(HMatch match) {
		allMatches.add(match);
		
		Object[] objs = match.getNodes();
		
		// register srcMethod
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register srcParam
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register trgMethod
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register trgParam
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register SM2SM
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register SPa2SPa
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register SimpleParam2SimpleParamRule_eMoflon_ProtocolNode
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister srcMethod
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister srcParam
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister trgMethod
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister trgParam
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister SM2SM
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister SPa2SPa
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister SimpleParam2SimpleParamRule_eMoflon_ProtocolNode
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
		}
		
	}
	
	@Override
	protected void changeAttribute(AttributeChanged message) {
		initialMessage = message.initialMessage;

		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof org.xtext.simplejava.simpleJava.SimpleParam) {
			HMatch match_1 = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
			match_1.getNodes()[1] = obj;
			Collection<HMatch> formerMatches_1 = obj2matches.get(obj);
			if(formerMatches_1 != null) {
				
				formerMatches_1 = formerMatches_1.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_1);
			}
			start(edge_explorer_5_1_orchestration, match_1);
			HMatch match_3 = new LocalSearchMatch("SimpleParam2SimpleParamRule__CONSISTENCY_170_localSearch", 7);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_3_2_orchestration, match_3);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean node_constraint_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[2]);;
		return predicate;
	}
	
	public boolean node_constraint_0_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[3]);;
		return predicate;
	}
	
	public boolean constraint_checker_method(HMatch match) {
		org.xtext.simplejava.simpleJava.SimpleParam srcParam = (org.xtext.simplejava.simpleJava.SimpleParam) match.getNodes()[1];
		org.xtext.simplejava.simpleJava.SimpleParam trgParam = (org.xtext.simplejava.simpleJava.SimpleParam) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_11 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_11.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, srcParam.getName(), "java.lang.String"));
		csp_11.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, trgParam.getName(), "java.lang.String"));
		csp_11.solve();
		
		boolean predicate = csp_11.isSatisfied();
		return predicate;
	}
	
	
}

