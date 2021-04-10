package com.stereotypebean.annotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		//new Runtime().addShutdownHook(hook);
		((ConfigurableApplicationContext)context).registerShutdownHook();
		Mechine mechine=context.getBean(Mechine.class);
		mechine.startMechine();
	}

}
