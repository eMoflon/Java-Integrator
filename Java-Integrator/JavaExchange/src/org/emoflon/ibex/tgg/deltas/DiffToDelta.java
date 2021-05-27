package org.emoflon.ibex.tgg.deltas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec;
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.emoflon.ibex.tgg.runtime.Measurement;
import org.emoflon.ibex.tgg.runtime.RuntimeContainer;
import org.xtext.simplejava.simpleJava.SimpleClass;
import org.xtext.simplejava.simpleJava.SimpleField;
import org.xtext.simplejava.simpleJava.SimpleMethod;
import org.xtext.simplejava.simpleJava.SimplePackage;
import org.xtext.simplejava.simpleJava.SimpleParam;

import delta.AttributeDelta;
import delta.Delta;
import delta.DeltaFactory;
import delta.Link;
import delta.StructuralDelta;

/**
 * DiffToDelta offers a method to find the differences between two resources and
 * create a Delta.
 */
public class DiffToDelta {

	Resource oldResource;
	Resource newResource;

	HashMap<ReferenceChangeSpec, JvmParameterizedTypeReference> toProcess = new HashMap<>();
	SimplePackage simplePackage;
	EList<SimpleClass> simpleClasses;
	LinkedList<JvmType> newTypes = new LinkedList<>();
	HashMap<JvmType, EReference> refs = new HashMap<>();

	public DiffToDelta(Resource oldResource, Resource newResource) {
		this.oldResource = oldResource;
		this.newResource = newResource;

		simplePackage = (SimplePackage) oldResource.getContents().get(0);
		simpleClasses = simplePackage.getSimpleClasses();
	}

	/**
	 * This method finds the differences between the two registered resources using
	 * EMFCompare.
	 * 
	 * @return A List containing the differences between the two registered
	 *         resources.
	 * @throws IOException
	 */
	public List<Diff> findDifferences() throws IOException {

		EcoreUtil.resolveAll(newResource);
		EcoreUtil.resolveAll(oldResource);

		long tic = System.currentTimeMillis();

		IComparisonScope scope = new DefaultComparisonScope(newResource, oldResource, null);
		Comparison comp = EMFCompare.builder().build().compare(scope);
		List<Diff> differences = new ArrayList<>();
		differences = comp.getDifferences();

		long toc = System.currentTimeMillis();

		long time = RuntimeContainer.getInstance().getRuntimes().get(Measurement.COMPARE);
		RuntimeContainer.getInstance().getRuntimes().put(Measurement.COMPARE, time + (toc - tic));
		
		return differences;
	}

	/**
	 * This method creates a Delta from the differences between the two registered
	 * resources.
	 * 
	 * @return A Delta object.
	 * @throws IOException
	 */
	public Delta diffToDelta() throws IOException {

		List<Diff> diffs = findDifferences();

		LinkedList<AttributeDelta> attributeDeltas = new LinkedList<>();
		LinkedList<EObject> createdObjects = new LinkedList<>();
		LinkedList<EObject> deletedObjects = new LinkedList<>();
		LinkedList<Link> createdLinks = new LinkedList<>();
		LinkedList<Link> deletedLinks = new LinkedList<>();

		long tic = System.currentTimeMillis();
		
		for (int i = diffs.size() - 1; i >= 0; i--) {
			Diff diff = diffs.get(i);

			if (diff.getKind() == DifferenceKind.CHANGE && diff instanceof AttributeChangeSpec) {

				AttributeChangeSpec attributeDiff = (AttributeChangeSpec) diff;
				AttributeDelta attribute = createAttributeDelta(attributeDiff);
				attributeDeltas.add(attribute);
			}

			if (diff instanceof ReferenceChangeSpec) {
				ReferenceChangeSpec diffRef = (ReferenceChangeSpec) diff;

				if (diffRef.getKind() == DifferenceKind.DELETE) {

					EObject deleted = diffRef.getValue();
					Link link = createLink(deleted, deleted.eContainer(), deleted.eContainmentFeature());

					deletedLinks.add(link);
					deletedObjects.add(deleted);
				}

				if (diffRef.getKind() == DifferenceKind.ADD) {

					EObject created = diffRef.getValue();
					EObject src = diff.getMatch().getLeft();

					if (diff.getMatch().getRight() != null) {
						src = diff.getMatch().getRight();
					}

					Link link = createLink(src, created, created.eContainmentFeature());

					createdLinks.add(link);
					createdObjects.add(created);

					if (created instanceof JvmParameterizedTypeReference) {
						toProcess.put(diffRef, (JvmParameterizedTypeReference) created);
					}
				}

				if (diffRef.getKind() == DifferenceKind.CHANGE) {

					if (diffRef.getValue() instanceof JvmType) {
						refs.put((JvmType) diffRef.getValue(), diffRef.getReference());
					}

				}

				// macht Probleme...
//				if (diffRef.getKind() == DifferenceKind.MOVE) {
//
//					EObject moved = diffRef.getValue();
//					EObject movedTo = diffRef.getMatch().getRight();
//					EObject movedOriginal = findOriginal(moved);
//
//					Link createdLink = createLink(movedTo, movedOriginal, movedOriginal.eContainmentFeature());
//					Link deletedLink = createLink(movedOriginal.eContainer(), movedOriginal,
//							movedOriginal.eContainmentFeature());
//
//					createdLinks.add(createdLink);
//					deletedLinks.add(deletedLink);
//				}
			}

		}

		// Processes the created JvmTypeReferences
		for (ReferenceChangeSpec diffRef : toProcess.keySet()) {
			Link link = handleType(toProcess.get(diffRef));
			createdLinks.add(link);
		}

		createdObjects.addAll(newTypes);
		Delta delta = DeltaFactory.eINSTANCE.createDelta();

		delta.getAttributeDeltas().addAll(attributeDeltas);

		StructuralDelta structural = DeltaFactory.eINSTANCE.createStructuralDelta();
		structural.getCreatedObjects().addAll(createdObjects);
		structural.getDeletedObjects().addAll(deletedObjects);
		structural.getCreatedLinks().addAll(createdLinks);
		structural.getDeletedLinks().addAll(deletedLinks);
		delta.setStructuralDelta(structural);

		long toc = System.currentTimeMillis();
		long time = RuntimeContainer.getInstance().getRuntimes().get(Measurement.CREATEDELTA);
		RuntimeContainer.getInstance().getRuntimes().put(Measurement.CREATEDELTA, time + (toc-tic));
		return delta;
	}

	/**
	 * Creates an AttributeDelta by determining the object affected by the attribute
	 * changed, the changed attribute and its new value from the given
	 * AttributeChange.
	 * 
	 * @param attributeDiff The attribute change given by EMF Compare.
	 * @return An AttributeDelta representing the attribute change.
	 */
	private AttributeDelta createAttributeDelta(AttributeChangeSpec attributeDiff) {

		AttributeDelta attribute = DeltaFactory.eINSTANCE.createAttributeDelta();
		attribute.setObject(attributeDiff.getMatch().getRight());
		attribute.setAttribute(attributeDiff.getAttribute());
		attribute.setNewValue(attributeDiff.getValue());

		return attribute;
	}

	/**
	 * Creates a Link.
	 * 
	 * @param src  Source of the Link.
	 * @param trg  Target of the Link.
	 * @param type Type of the Link.
	 * @return The created Link
	 */
	private Link createLink(EObject src, EObject trg, EReference type) {
		Link link = DeltaFactory.eINSTANCE.createLink();
		link.setSrc(src);
		link.setTrg(trg);
		link.setType(type);

		return link;
	}

	/**
	 * When a new JvmTypeReference has been created the SimpleClasses have to be
	 * searched for the JvmTypeReference's JvmType in the original project in order
	 * to create a Link to it. If the JvmType does not exist yet, it has to be
	 * created.
	 * 
	 * @param diffRef
	 * @param created The created JvmTypeReference
	 * @return A Link between the JvmTypeReference and the JvmType
	 */
	private Link handleType(JvmParameterizedTypeReference created) {

		JvmParameterizedTypeReference typeRef = created;
		JvmType type = typeRef.getType();
		boolean found = false;
		JvmType typeToSet = type;

		Iterator<SimpleClass> it = simpleClasses.iterator();
		while (it.hasNext()) {
			if (found)
				break;
			SimpleClass sc = it.next();

			for (SimpleField sf : sc.getSimpleFields()) {
				JvmType eqType = sf.getFieldType().getType();
				if (eqType.getQualifiedName().equals(type.getQualifiedName())) {
					typeToSet = eqType;
					found = true;
					break;
				}
			}

			for (SimpleMethod sm : sc.getSimpleMethods()) {
				for (SimpleParam sp : sm.getParams()) {
					JvmType eqType = sp.getParamType().getType();
					if (eqType.getQualifiedName().equals(type.getQualifiedName())) {
						typeToSet = eqType;
						found = true;
						break;
					}
				}
			}

		}
		
//		Probleme beim Hinzufügen neuer Typen. Aktuell muss ein JvmType im Original bereits vorhanden sein.
//		if (!found) {
//			newTypes.add(type);
//		}

		Link link = createLink(typeRef, typeToSet, refs.get(type));

		return link;
	}

	/**
	 * Finds the corresponding object in the original resource.
	 * @param movedObj The object in the new resource.
	 * @return The original object in the original resource.
	 */
	private EObject findOriginal(EObject movedObj) {

		EObject movedFrom = null;

		for (SimpleClass sc : simpleClasses) {

			boolean found = false;

			if (movedObj instanceof SimpleField) {
				for (SimpleField sf : sc.getSimpleFields()) {
					if (sf.getName().equals(((SimpleField) movedObj).getName())) {
						movedFrom = sf;
						found = true;
						break;
					}
				}
			}

			if (movedObj instanceof SimpleMethod) {
				for (SimpleMethod sm : sc.getSimpleMethods()) {
					if (sm.getName().equals(((SimpleMethod) movedObj).getName())) {
						movedFrom = sm;
						found = true;
						break;
					}
				}
			}
			if (found)
				break;
		}
		return movedFrom;
	}
}