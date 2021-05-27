package org.emoflon.ibex.tgg.evaluation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.access.impl.PrimitiveTypeFactory;
import org.emoflon.ibex.tgg.resources.XtextResourceParser;
import org.xtext.simplejava.simpleJava.SimpleClass;
import org.xtext.simplejava.simpleJava.SimpleField;
import org.xtext.simplejava.simpleJava.SimpleJavaFactory;
import org.xtext.simplejava.simpleJava.SimpleMethod;
import org.xtext.simplejava.simpleJava.SimplePackage;
import org.xtext.simplejava.simpleJava.SimpleParam;

public class ModelGenerator_Util {

	private SimpleJavaFactory sjFactory = SimpleJavaFactory.eINSTANCE;
	private TypesFactory typeFactory = TypesFactory.eINSTANCE;
	private HashMap<String, JvmType> types;

	private Resource model;
	private SimplePackage simplePackage;
	private String path;

	private int numOfElements;

	public ModelGenerator_Util(String path) throws IOException {
		createResource(path);
		initializeTypes();
	}

	private void initializeTypes() {

		JvmType intType = new PrimitiveTypeFactory().createType(Integer.class);
		JvmType doubleType = new PrimitiveTypeFactory().createType(Double.class);

		types = new HashMap<>();
		types.put("int", intType);
		types.put("double", doubleType);

		numOfElements += 2;
	}

	/**
	 * Creates a SimpleJava Resource with a SimplePackage and saves it as a file to
	 * the given path.
	 * 
	 * @param path Path to save the file to.
	 * @return The created SimpleJava Resource
	 * @throws IOException
	 */
	private Resource createResource(String path) throws IOException {

		File simplejava = new File(path);

		if (!simplejava.createNewFile()) {
			simplejava.delete();
			simplejava.createNewFile();
		}

		FileWriter writer = new FileWriter(path);
		writer.write("package org.kontaktbuch.informationen;");
		writer.close();

		model = XtextResourceParser.toResource(path);
		simplePackage = (SimplePackage) model.getContents().get(0);
		numOfElements = 1;
		this.path = path;
		return model;
	}

	/**
	 * Adds a SimpleClass to the present SimplePackage.
	 * 
	 * @param postfix Postfix for the SimpleClass name.
	 */
	public SimpleClass addSimpleClass(int postfix) {
		SimpleClass simpleClass = sjFactory.createSimpleClass();
		simpleClass.setName("SimpleClass_" + postfix);
		simplePackage.getSimpleClasses().add(simpleClass);

		numOfElements++;
		return simpleClass;
	}

	/**
	 * Adds a SimpleField to a given SimpleClass
	 * 
	 * @param simpleClass The SimpleClass the SimpleField should be added to.
	 * @param accessType  The visibility the SimpleField should have (private,
	 *                    protected or public)
	 * @param postfix     Postfix for the SimpleField name.
	 */
	public SimpleField addSimpleField(SimpleClass simpleClass, String accessType, String type, int postfix) {
		SimpleField simpleField = sjFactory.createSimpleField();
		simpleField.setName("simpleField_" + postfix);
		simpleField.setAccessType(accessType);
		simpleField.setIsFinal(false);
		simpleField.setIsStatic(false);
		simpleField.setFieldType(addTypeReference(type));

		int index = simplePackage.getSimpleClasses().indexOf(simpleClass);
		if (index != -1) {
			simplePackage.getSimpleClasses().get(index).getSimpleFields().add(simpleField);
			numOfElements++;
		}
		return simpleField;
	}

	public void renameSimpleField(int classIndex, int fieldIndex, String postfix) {
		SimpleField toRename = simplePackage.getSimpleClasses().get(classIndex).getSimpleFields().get(fieldIndex);
		String oldName = toRename.getName();
		simplePackage.getSimpleClasses().get(classIndex).getSimpleFields().get(fieldIndex).setName(oldName + postfix);
	}

	public SimpleMethod addSimpleMethod(SimpleClass simpleClass, String accessType, int postfix) {
		SimpleMethod simpleMethod = sjFactory.createSimpleMethod();
		simpleMethod.setName("simpleMethod_" + postfix);
		simpleMethod.setAccessType(accessType);

		int index = simplePackage.getSimpleClasses().indexOf(simpleClass);
		if (index != -1) {
			simplePackage.getSimpleClasses().get(index).getSimpleMethods().add(simpleMethod);
			numOfElements++;
		}
		return simpleMethod;
	}

	public void deleteMethods(int sc, ArrayList<Integer> deleteMethods) {

		ArrayList<SimpleMethod> methods = new ArrayList<>();
		for (int i = 0; i < deleteMethods.size(); i++) {
			methods.add(simplePackage.getSimpleClasses().get(sc).getSimpleMethods().get(deleteMethods.get(i)));
		}
		simplePackage.getSimpleClasses().get(sc).getSimpleMethods().removeAll(methods);
	}

	public SimpleParam addSimpleParam(int classIndex, int methodIndex, String type, int postfix) {
		SimpleParam simpleParam = sjFactory.createSimpleParam();
		simpleParam.setName("simpleParam_" + postfix);
		simpleParam.setParamType(addTypeReference(type));
		simplePackage.getSimpleClasses().get(classIndex).getSimpleMethods().get(methodIndex).getParams()
				.add(simpleParam);

		numOfElements++;
		return simpleParam;
	}

	private JvmParameterizedTypeReference addTypeReference(String type) {
		JvmParameterizedTypeReference typeReference = typeFactory.createJvmParameterizedTypeReference();
		typeReference.setType(getType(type));
		numOfElements++;
		return typeReference;
	}

	private JvmType getType(String type) {
		return types.get(type);
	}

	public void saveModel() {
		XtextResourceParser.toSimpleJ(model, path);
	}

	public int getNumOfElements() {
		return numOfElements;
	}

}