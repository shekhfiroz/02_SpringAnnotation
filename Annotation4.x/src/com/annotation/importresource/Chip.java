package com.annotation.importresource;

import org.springframework.beans.factory.annotation.Value;

public class Chip {

	private int robot_no;

	private String robot_name;

	public Chip() {
		System.out.println("Chip.Chip()");
	}

	@Override
	public String toString() {
		return "Chip [robot_no=" + robot_no + ", robot_name=" + robot_name + "]";
	}

	public int getRobot_no() {
		return robot_no;
	}

	
	public void setRobot_no(int robot_no) {
		this.robot_no = robot_no;
	}

	public String getRobot_name() {
		return robot_name;
	}

	
	public void setRobot_name(String robot_name) {
		this.robot_name = robot_name;
	}

}
