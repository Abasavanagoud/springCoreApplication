package com.ba.beans;

public class Tunner {
	private int tunnerNo;
	private String tuneType;
	public void setTunnerNo(int tunnerNo) {
		this.tunnerNo = tunnerNo;
	}
	public void setTuneType(String tuneType) {
		this.tuneType = tuneType;
	}
	@Override
	public String toString() {
		return "Tunner [tunnerNo=" + tunnerNo + ", tuneType=" + tuneType + "]";
	}
	

}
