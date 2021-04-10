package com.pviStereotype.annotaion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/pviStereotype/annotaion/truck.properties")
@PropertySource("classpath:com\\pviStereotype\\annotaion\\Engine.properties")
public class Truck {
	/*
	 * if we write directly inside @value() it become hardcoding to avoid this
	 * ..take the help of property file and read property file by
	 * using @PropertySource("classpath:propertyfile.properties") and create the
	 * propertySource objct and dumps into the Environment object by IOC container .
	 * Environment object available inside the IOC container
	 */
	@Value("${truck.model}") /*
								 * here $ indicates to IOC container search the value by using this key in
								 * environment obj of IOC container
								 **/
	private String model;
	@Value("${truck.manufactuer}")
	private String manufactuer;
	@Value("${truck.fualType}")
	private String fualType;
	@Value("${truck.wheels}")
	private int wheels;
	@Value("${egine.egineCapacity}")
	private int egineCapacity;
	@Value("${egine.egineLifetime}")
	private String egineLifetime;

	@Override
	public String toString() {
		return "Truck [model=" + model + ", manufactuer=" + manufactuer + ", fualType=" + fualType + ", wheels="
				+ wheels + ", egineCapacity=" + egineCapacity + ", egineLifetime=" + egineLifetime + "]";
	}

}
