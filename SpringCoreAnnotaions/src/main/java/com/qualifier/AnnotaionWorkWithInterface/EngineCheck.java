package com.qualifier.AnnotaionWorkWithInterface;

import org.springframework.beans.factory.annotation.Autowired;

public class EngineCheck {
	private Motor motor;
	private Sensor sensor;	

	public EngineCheck(Sensor sensor) {
		super();
		this.sensor = sensor;
	}

	@Autowired
	public void setMotor(Motor motor) {
		this.motor = motor;
		motor.boot(sensor);
	}
	
}
