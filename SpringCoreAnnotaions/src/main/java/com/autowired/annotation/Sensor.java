package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Sensor {
	
	protected String sensorType;
	
	public Sensor() {
		System.out.println("sensor object is created");
	}
	public void initilization() {
		System.out.println("sensor is initilization"+sensorType+"on");		
	}
	@Autowired
	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}
	
}
