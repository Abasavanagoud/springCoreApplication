package com.ba.beans;

public class Reciever {
	private int frequencyLevel;
	private String frequencyType;
	public void setFrequencyLevel(int frequencyLevel) {
		this.frequencyLevel = frequencyLevel;
	}
	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}
	@Override
	public String toString() {
		return "Reciever [frequencyLevel=" + frequencyLevel + ", frequencyType=" + frequencyType + "]";
	}
	
}
