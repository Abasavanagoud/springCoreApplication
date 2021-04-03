package com.qualifier.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\qualifier\\annotaion\\Qualifier-bean.xml");
		Motor motor=applicationContext.getBean(Motor.class);
		motor.boot();
	}
}
