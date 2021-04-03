package com.required.annotaion;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
 public static void main(String[] args) {
		/*
		 * DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
		 * XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
		 * reader.loadBeanDefinitions(new
		 * ClassPathResource("com/required/annotaion/required-context.xml"));
		 * RequiredAnnotationBeanPostProcessor requiredAnnotationBeanPostProcessor=new
		 * RequiredAnnotationBeanPostProcessor();
		 * beanFactory.addBeanPostProcessor(requiredAnnotationBeanPostProcessor); Motor
		 * motor=beanFactory.getBean(Motor.class); System.out.println(motor);
		 */
	  ApplicationContext context=new ClassPathXmlApplicationContext("com\\required\\annotaion\\required-context.xml");
	  Motor bean = context.getBean(Motor.class);
	  System.out.println(bean);
	
}
}
