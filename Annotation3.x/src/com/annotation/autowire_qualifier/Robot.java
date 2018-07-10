package com.annotation.autowire_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Robot {
	private Chip chip;

	public Chip getChip() {
		return chip;
	}

	@Autowired 
	@Qualifier(value="chip1")
	//to qualify which beans is to injected 
	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
