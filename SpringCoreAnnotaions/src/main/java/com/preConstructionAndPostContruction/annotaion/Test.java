package com.preConstructionAndPostContruction.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext("com.preConstructionAndPostContruction.annotaion");
		Thread thread = Thread.currentThread();
		thread.sleep(5000);
		((ConfigurableApplicationContext)applicationContext).registerShutdownHook();
	
	}
}
