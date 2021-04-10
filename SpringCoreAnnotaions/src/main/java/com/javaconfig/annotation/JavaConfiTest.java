package com.javaconfig.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfiTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfi.class);
		Rocket rocket=context.getBean("rocket1",Rocket.class);
		System.out.println(rocket);
		
		Rocket pslv=context.getBean("pslv",Rocket.class);
		System.out.println(pslv);
	}

}
