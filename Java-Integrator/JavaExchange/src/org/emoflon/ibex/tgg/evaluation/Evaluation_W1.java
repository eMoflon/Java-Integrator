package org.emoflon.ibex.tgg.evaluation;

import java.io.File;
import java.io.IOException;

public class Evaluation_W1 {

	public void runEvaluation(int numOfClasses, int numOfFields, int numOfMethods, double changeQuota) {
		try {
			String commonPath = new File(".").getCanonicalPath() + "\\resources\\";
			
			ModelGenerator firstSrcGen = new ModelGenerator(commonPath + "firstSrc.simplej");
			firstSrcGen.createModel(numOfClasses, numOfFields, numOfMethods);
			firstSrcGen.saveModel();
			
			ModelGenerator firstTrgGen = new ModelGenerator(commonPath + "firstTrg.simplej");
			firstTrgGen.createModel(numOfClasses, numOfFields, numOfMethods);
			firstTrgGen.saveModel();
			
			ModelGenerator srcGen = new ModelGenerator(commonPath + "src.simplej");
			srcGen.createModel(numOfClasses, numOfFields, numOfMethods);
			srcGen.modifySrc(changeQuota);
			srcGen.saveModel();
		
			ModelGenerator trgGen = new ModelGenerator(commonPath + "trg.simplej");
			trgGen.createModel(numOfClasses, numOfFields, numOfMethods);
			trgGen.modifyTrg(changeQuota);
			trgGen.saveModel();
						
//			System.out.println("Number of Elements: " + srcGen.getNumOfElements());
			
			SimpleJavaIntegration_W1 sji = new SimpleJavaIntegration_W1();
			sji.performIntegration();
		} catch (IOException e) {

		}
	}
	
	public static void main(String[] args) {
		Evaluation_W1 eval = new Evaluation_W1();
		eval.runEvaluation(1, 5, 5, 1);
	}
}