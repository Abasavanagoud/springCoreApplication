package com.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RideChecks {
private Riding ride;




public Riding getRide() {
	return ride;
}
@Autowired
public void setRide(Riding ride) {
	this.ride = ride;
	ride.ride();
}

}
