package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Robort {

	protected Sensor sensor;
	protected TypeSensers typeSensers;

	/*
	 * @Autowired public void setSensor(Sensor sensor) {
	 * System.out.println("setSensor()"+sensor); this.sensor = sensor;
	 * sensor.initilization(); }
	 */

	public void boot() {
		System.out.println("Robort is booting");
	}

	@Autowired
	public Robort(Sensor sensor) {
		sensor.initilization();
	}

	public Robort(@Autowired Sensor sensor, @Autowired TypeSensers typeSensers) {
		super();
		this.sensor = sensor;
		this.typeSensers = typeSensers;
	}

}
