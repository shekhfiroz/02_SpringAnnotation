package com.annotaion.javaconfig;

import org.springframework.beans.factory.annotation.Value;

//imagine truck source code is not available
public class Truck {
	private Engine engine;
	

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		System.out.println("driving..");
	}

	@Override
	public String toString() {
		return "Truck [engine=" + engine + "]";
	}

}
