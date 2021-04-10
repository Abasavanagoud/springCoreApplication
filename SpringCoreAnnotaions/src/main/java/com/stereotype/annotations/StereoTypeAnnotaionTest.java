package com.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeAnnotaionTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/stereotype/annotations/stereoAnnotations-beans.xml");
		/*
		 * Riding ride=context.getBean(BikeRiding.class); ride.ride();
		 */	
		RideChecks rideChecks=context.getBean(RideChecks.class);
	
	}
}
