package org.emoflon.ibex.tgg.runtime;

import java.util.HashMap;

public class RuntimeContainer {

	private static RuntimeContainer instance = null;
	private HashMap<Measurement, Long> runtimes;
	
	private RuntimeContainer() {
		runtimes = new HashMap<>();
		runtimes.put(Measurement.COMPARE, (long) 0);
		runtimes.put(Measurement.CREATEDELTA, (long) 0);
	}
	
	public static RuntimeContainer getInstance() {
		if(instance == null) {
			instance = new RuntimeContainer();
		}
		return instance;
	}
	
	public HashMap<Measurement, Long> getRuntimes(){
		return runtimes;
	}
}