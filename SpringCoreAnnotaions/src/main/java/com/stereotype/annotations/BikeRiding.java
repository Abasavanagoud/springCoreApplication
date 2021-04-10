package com.stereotype.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*@Component
@Primary*/
@Service
@Primary
public class BikeRiding implements Riding {

	@Override
	public void ride() {
		System.out.println("bike Riding starts");
		
	}

}
