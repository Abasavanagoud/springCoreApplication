package com.stereotype.annotations;

import org.springframework.stereotype.Component;

@Component
/*
 * @Component is a stereoType Annotation ,it is used for class marked as bean def in IOC container
 * */
public class CyclicRiding implements Riding{

	@Override
	public void ride() {
		System.out.println("Cyclic Riding starts");
		
	}
	

}
