package com.dependsOn.annotation;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("cacheManger")/*here we are use @dependsOn annotation to tell IOC container Before instance this
bean def object we need to create object dependson bean def obj */
public class LoanManager {
	public LoanManager() {
		System.out.println("LoanManager() is started ");
	}
}
