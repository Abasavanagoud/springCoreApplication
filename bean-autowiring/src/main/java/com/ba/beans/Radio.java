package com.ba.beans;

public class Radio {
	private Reciever reciever;
	private Tunner tunner;
	
	public Radio(Reciever reciever) {
		super();
		this.reciever = reciever;
	}


	public Radio(Tunner tunner) {
		super();
		this.tunner = tunner;
	}
	
	
	@Override
	public String toString() {
		return "Radio [reciever=" + reciever + ", tunner=" + tunner + "]";
	}

	
	

}
