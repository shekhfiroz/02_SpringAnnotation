package com.annotation.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/required/application-required.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}

}
