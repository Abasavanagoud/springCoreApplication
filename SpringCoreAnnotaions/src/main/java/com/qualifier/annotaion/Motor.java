package com.qualifier.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Motor {
	private Sensor sensor;
	private MicroServices microServices;
	public void boot() {
		System.out.println("Robot is booting");
	}
	/*
	 * @Autowired
	 * 
	 * @Qualifier("sensor2") public void setSensor(Sensor sensor) { this.sensor =
	 * sensor; System.out.println("setSensor \t"+sensor); sensor.initilazation(); }
	 */
	@Autowired(required = false)
	public Motor(Sensor sensor) {
		this.sensor=sensor;
		sensor.initilazation();
	}
	@Autowired(required = false)
	public Motor(MicroServices microServices) {
		
	}
	@Autowired
	public Motor(Sensor sensor, MicroServices microServices) {
		super();
		this.sensor = sensor;
		this.microServices = microServices;
	}
	public Motor() {
		super();
	}
	
	
}
