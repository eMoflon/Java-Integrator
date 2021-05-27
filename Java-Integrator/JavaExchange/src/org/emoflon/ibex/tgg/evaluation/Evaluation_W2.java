package org.emoflon.ibex.tgg.evaluation;

import java.io.File;
import java.io.IOException;

public class Evaluation_W2 {

	public void runEvaluation(int numOfClasses, int numOfFields, int numOfMethods, double changeQuota) {
		try {
			String commonPath = new File(".").getCanonicalPath() + "\\resources\\";
			
			ModelGenerator firstSrcGen = new ModelGenerator(commonPath + "firstSrc.simplej");
			firstSrcGen.createModel(1, 1, 1);
			firstSrcGen.saveModel();
			
			ModelGenerator firstTrgGen = new ModelGenerator(commonPath + "firstTrg.simplej");
			firstTrgGen.createModel(1, 1, 1);
			firstTrgGen.saveModel();
			
			ModelGenerator srcGen = new ModelGenerator(commonPath + "src.simplej");
			srcGen.createModel(numOfClasses, numOfFields, numOfMethods);
			srcGen.saveModel();
		
			ModelGenerator trgGen = new ModelGenerator(commonPath + "trg.simplej");
			trgGen.createModel(1, 1, 1);
			trgGen.saveModel();
			
			ModelGenerator newSrcGen = new ModelGenerator(commonPath + "newSrc.simplej");
			newSrcGen.createModel(numOfClasses, numOfFields, numOfMethods);
			newSrcGen.modifySrc(changeQuota);
			newSrcGen.saveModel();
		
			ModelGenerator newTrgGen = new ModelGenerator(commonPath + "newTrg.simplej");
			newTrgGen.createModel(numOfClasses, numOfFields, numOfMethods);
			newTrgGen.modifyTrg(changeQuota);
			newTrgGen.saveModel();
			
//			System.out.println("Number of Elements: " + srcGen.getNumOfElements());
	
			SimpleJavaIntegration_W2 sji = new SimpleJavaIntegration_W2();
			sji.performIntegration();
		} catch (IOException e) {

		}
	}
	
	public static void main(String[] args) {
		Evaluation_W2 eval = new Evaluation_W2();
		eval.runEvaluation(4, 10, 10, 1);
	}
}