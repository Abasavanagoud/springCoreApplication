package com.javaconfig.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfi {
	@Bean("rocket1")	
	public Rocket rocket() {
		Rocket rocket= new Rocket();
		rocket.setFualType("white petrol");
		return rocket;
	}
	@Bean
	public Rocket pslv() {
		System.out.println("pslv()");
		Rocket rocket=new Rocket();
		rocket.setFualType("liquid and white petrol");
		return rocket;
	}
}
