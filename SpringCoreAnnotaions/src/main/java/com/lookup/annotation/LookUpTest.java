package com.lookup.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookUpTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.lookup.annotation");
		MathLearning mathLearning=context.getBean(MathLearning.class);
		mathLearning.add(12,25);
	}
}
