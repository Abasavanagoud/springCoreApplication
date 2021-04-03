package com.required.annotaion;

import org.springframework.beans.factory.annotation.Required;

public class Motor {
	private FualType fualType;
	@Required
	public void setFualType(FualType fualType) {
		this.fualType = fualType;
	}

	@Override
	public String toString() {
		return "Motor [fualType=" + fualType + "]";
	}
	
}
