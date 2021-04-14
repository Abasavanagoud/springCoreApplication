package com.javaconfigsupport.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.javaconfigsupport.annotation"})
public class JavaConfig {
	
	@Bean
	public Motor motor1() {
		Motor motor=new Motor();
		motor.setMotorType("deselMotor");
		return motor;		
	}
	@Bean
	public Motor motor2() {
		Motor motor=new Motor();
		motor.setMotorType("petrolMotor");
		return motor;
	}

}
