package com.pviStereotype.annotaion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.pviStereotype.annotaion");
		Truck truck = applicationContext.getBean(Truck.class);
		System.out.println(truck);
	}
}
