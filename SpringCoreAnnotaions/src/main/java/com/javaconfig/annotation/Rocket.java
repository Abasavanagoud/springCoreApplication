package com.javaconfig.annotation;
/*
 * Assume Rocket class has no source code or want to multiple bean defination with specific configurations
 * */
public class Rocket {
	public String fualType;

	public String getFualType() {
		return fualType;
	}

	public void setFualType(String fualType) {
		System.out.println("rocket()");
		this.fualType = fualType;
	}

	@Override
	public String toString() {
		return "Rocket [fualType=" + fualType + "]";
	}
	

}
