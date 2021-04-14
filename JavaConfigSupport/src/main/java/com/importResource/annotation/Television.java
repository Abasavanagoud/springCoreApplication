package com.importResource.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Television {
	@Autowired
	private Antino antino;
	public void on() {
		System.out.println("Television is Starts");
		antino.getSingle();
	}
}
