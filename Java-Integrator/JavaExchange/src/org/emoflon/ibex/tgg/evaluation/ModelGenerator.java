package org.emoflon.ibex.tgg.evaluation;

import java.io.IOException;
import org.xtext.simplejava.simpleJava.SimpleClass;

public class ModelGenerator {

	private ModelGenerator_Util generator;
	private int numOfClasses;
	private int numOfFields;
	private int numOfMethods;

	public ModelGenerator(String path) throws IOException {
		generator = new ModelGenerator_Util(path);
		numOfClasses = 0;
		numOfFields = 0;
		numOfMethods = 0;
	}

	public void createModel(int numOfClasses, int numOfFields, int numOfMethods) {

		this.numOfClasses = numOfClasses;
		this.numOfFields = numOfFields;
		this.numOfMethods = numOfMethods;

		for (int i = 0; i < numOfClasses; i++) {
			SimpleClass sc = generator.addSimpleClass(i);
			for (int j = 0; j < numOfFields; j++) {
				generator.addSimpleField(sc, "private", "int", j);
			}
			for (int k = 0; k < numOfMethods; k++) {
				generator.addSimpleMethod(sc, "public", k);
				generator.addSimpleParam(i, k, "double", 0);
			}
		}

	}

	public void modifySrc(double percentage) {
		int changeDistance = 0;
		if (percentage != 0)
			changeDistance = (int) (1 / percentage);

		for (int i = 0; i < numOfClasses; i += 1) {
			for (int j = 0; j < numOfFields; j += changeDistance) {
				generator.renameSimpleField(i, j, "mod");
			}
		}
	}

	public void modifyTrg(double percentage) {
		int changeDistance = 0;
		if (percentage != 0)
			changeDistance = (int) (1 / percentage);

		for (int i = 0; i < numOfClasses; i += 1) {
			for (int j = 0; j < numOfMethods; j += changeDistance) {
				generator.addSimpleParam(i, j, "double", 1);
			}
		}
	}

	public int getNumOfElements() {
		return generator.getNumOfElements();
	}

	public void saveModel() {
		generator.saveModel();
	}

}