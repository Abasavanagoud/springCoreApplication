package com.dependsOn.javaConfigApprouch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnJavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(DependsOnJavaConfig.class);
	}
}
