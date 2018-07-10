package com.annotation.autowire_constructor;

public class Robot {
	private Chip chip;
	public Robot() {}

	public Robot(Chip chip) {
		super();
		this.chip = chip;
	}

	

}
