package com.importResource.annotation;

public class Remoto {
	 
	 private Television television; 
	 
	public void setTelevision(Television television) {
		this.television = television;
	}
	public void onChannel() {
		television.on();
	}
}
