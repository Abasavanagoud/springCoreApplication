package com.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com\\autowired\\annotation\\autowired-beans.xml");
		Robort robort=applicationContext.getBean(Robort.class);
		robort.boot();
		/*
		 * sensor object is created sensor is initilizationfinggerprintSenseron Robort
		 * is booting
		 */
		
	}
}

