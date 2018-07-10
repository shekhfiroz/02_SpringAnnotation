package com.annotation.stereotype;

import org.springframework.stereotype.Component;

@Component
public class ByCycle {

	private String ride;

	public String getRide() {
		return ride;
	}

	public void setRide(String ride) {
		this.ride = ride;
	}

	@Override
	public String toString() {
		return "ByCycle [ride=" + ride + "]";
	}

}
