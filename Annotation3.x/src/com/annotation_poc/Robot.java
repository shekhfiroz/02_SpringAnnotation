package com.annotation_poc;



public class Robot {
	private int robot_no;
	
	private String robot_brand;

	public int getRobot_no() {
		return robot_no;
	}

	public void setRobot_no(int robot_no) {
		this.robot_no = robot_no;
	}
	
	public String getRobot_brand() {
		@MyAnnotation
		int x=10;
		
		return robot_brand;
	}

	public void setRobot_brand(String robot_brand) {
		this.robot_brand = robot_brand;
	}

	@Override
	public String toString() {
		return "Robot [robot_no=" + robot_no + ", robot_brand=" + robot_brand + "]";
	}

}
