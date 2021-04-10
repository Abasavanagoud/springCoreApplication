package com.dependsOn.annotation;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class CacheManger {
 public CacheManger() {
	 System.out.println("cacheManager() object is created");
 }
}
