package com.importResource.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportResourceTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaConfig.class);
		Remoto remoto=applicationContext.getBean(Remoto.class);
		remoto.onChannel();
	}
}
