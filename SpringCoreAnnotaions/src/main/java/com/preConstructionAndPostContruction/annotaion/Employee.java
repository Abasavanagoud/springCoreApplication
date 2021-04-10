package com.preConstructionAndPostContruction.annotaion;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	private String empName;
	@Value("Basavanagoud")
	public void setEmpName(String empName) {
		this.empName = empName;
		System.out.println("empName\t"+empName);
	}
	public Employee() {
		System.out.println("Employee() object is created");
	}
	@PostConstruct
	public void init() {
		System.out.println("empl postContrct processing logic");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("empl preDestroy processing logic");
	}
	
}
