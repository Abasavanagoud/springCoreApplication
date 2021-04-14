package com.javaconfigsupport.annotation;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named /*
		 * here @Named annotation marked class as bean defination in IOC container it is
		 * same as
		 * 
		 * @component
		 */
public class Toy {
	/*
	 * @Inject here @Inject annotation automatically inject dependent obj into
	 * target class by taking the classtype and matching with bean id then pickup
	 * classtype then it injected depended obj into traget cls it is same
	 * as @autowired annotation but here inject is mandotory incase
	 * of @autowire(require=false) by by using required attribute we can make
	 * injection as optional that feature not available in this
	 * 
	 * @inject * if have multiple bean definations with same class type then
	 * ambiguity problem will came to solve this problem we are
	 * using @name("beanId") *
	 * 
	 * @Named("motor1")
	 */
	@Resource(name = "motor2")
	private Motor motor;

	public void setMotor(Motor motor) {
		this.motor = motor;
		// this.motor.onMotor();
	}

	public void playOnMotor() {
		motor.onMotor();
	}

	public Toy() {
		System.out.println("playing");

	}

}
