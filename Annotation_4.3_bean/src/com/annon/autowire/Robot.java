package com.annon.autowire;

import org.springframework.beans.factory.annotation.Value;

public class Robot {

	private Chip Chip;
	private String RobotName;

	public void setChip(Chip chip) {
		Chip = chip;
	}

	@Value("Sofia")
	public void setRobotName(String robotName) {
		RobotName = robotName;
	}

	@Override
	public String toString() {
		return "Robot [Chip=" + Chip + ", RobotName=" + RobotName + "]";
	}

}
