package com.qualifier.AnnotaionWorkWithInterface;

import org.springframework.beans.factory.annotation.Autowired;

public class CarMotorImpl implements Motor {

	@Override
	@Autowired
	public void boot(Sensor sensor) {
		System.out.println("Motor start sensor instalization");
		sensor.initilazation();
		System.out.println("motor starting boot for Car");
		
	}
	
	

}
