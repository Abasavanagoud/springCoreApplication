package com.dependsOn.javaConfigApprouch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
@Configuration
@ComponentScan(basePackages = "com.dependsOn.javaConfigApprouch")
public class DependsOnJavaConfig {
	@Bean
	@DependsOn("address")
	public Employee employee() {

		return new Employee();
	}
}
