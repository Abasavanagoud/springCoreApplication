package com.pviJavaConfig.approuch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PviJavaConfigTest {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(PVIJavaConfig.class);
		Book book=applicationContext.getBean("book1",Book.class);
		System.out.println(book);
	}
}
