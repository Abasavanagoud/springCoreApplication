package com.javaconfigsupport.annotation;

public class Motor {
	private String MotorType;
	
	public void setMotorType(String motorType) {
		MotorType = motorType;
	}

	/*
	 * public Motor() { System.out.println("Motor() is created"); }
	 */
	public void onMotor() {
		System.out.println("Motor is on "+MotorType);
	}
}
