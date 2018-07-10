package com.annon.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	private Chip Chip;
	private String RobotName;

	public Chip getChip() {
		return Chip;
	}
	@Autowired
	public void setChip(Chip chip) {
		Chip = chip;
	}

	public String getRobotName() {
		return RobotName;
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
