package com.qualifier.AnnotaionWorkWithInterface;

public class Sensor {
	private String sensorType;

	public void initilazation() {
		System.out.println("Sensor is initializaion \t" +sensorType);
	}
	
	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}
	
}
