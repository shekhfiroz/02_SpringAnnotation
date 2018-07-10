package com.annotation.autowire_1;

import org.springframework.beans.factory.annotation.Autowired;

public class Robot {
	private Chip chip;

	public Chip getChip() {
		return chip;
	}

	@Autowired
	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
