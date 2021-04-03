package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Robort {

	protected Sensor sensor;
	
	
	public Robort() {
		System.out.println("Robort object is created");
	}



	@Autowired
	public void setSensor(Sensor sensor) {
		System.out.println("setSensor()"+sensor);
		this.sensor = sensor;
		sensor.initilization();
	}



	public void boot() {
		System.out.println("Robort is booting");
	}
	/*
	 * @Autowired public Robort(Sensor sensor) { sensor.initilization(); }
	 */
	
}
