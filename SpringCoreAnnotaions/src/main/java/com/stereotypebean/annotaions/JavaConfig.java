package com.stereotypebean.annotaions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	@Bean(name = {"mechine1","mechine2"},initMethod = "init",destroyMethod = "destroy")
	//@Scope("prototype")
	//@Lazy
	public Mechine mechine() {
		 Mechine mechine = new Mechine();		 
		return mechine;
	}

}
