package com.stereotypebean.annotaions;

import org.springframework.stereotype.Repository;

public class Mechine {
	public void init() {
		System.out.println("mechine pre construction logic");
	}
	public void startMechine()	{
		System.out.println("mechine Starting");
	}
	public Mechine() {
		// TODO Auto-generated constructor stub
		System.out.println("mechine() is created");
	}
	
	public void destroy() {
		System.out.println("mechine post destroy logic");
	}
}
