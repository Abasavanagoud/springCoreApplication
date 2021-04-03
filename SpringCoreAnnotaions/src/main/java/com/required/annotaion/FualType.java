package com.required.annotaion;

import org.springframework.beans.factory.annotation.Required;

public class FualType {
	private int capacity;
	private int mileage;
	@Required
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "FualType [capacity=" + capacity + ", mileage=" + mileage + "]";
	}
	
	
}
