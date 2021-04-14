package com.lookupMethod.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookUpMethodJavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(LmiJavaConfig.class);
		PaintApplication application=applicationContext.getBean(PaintApplication.class);
		application.animate();
	}
}
