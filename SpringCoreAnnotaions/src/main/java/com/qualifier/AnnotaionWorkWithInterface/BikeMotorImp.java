package com.qualifier.AnnotaionWorkWithInterface;

import org.springframework.beans.factory.annotation.Autowired;

public class BikeMotorImp implements Motor {
	@Override
	@Autowired
	public void boot(Sensor sensor) {
		System.out.println("Motor start sensor instalization for bike");
		sensor.initilazation();
		System.out.println("motor starting boot for bike");
		
	}

}
