package com.lookupMethod.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.lookupMethod.javaconfig")
public class LmiJavaConfig {
	@Autowired
	ApplicationContext context;
		@Bean
		public PaintApplication paintApplication() {
		 
			return new PaintApplication() {
				public WhiteBoad getwBoad() {
					return context.getBean(WhiteBoad.class);
				}
			};
		}
}
