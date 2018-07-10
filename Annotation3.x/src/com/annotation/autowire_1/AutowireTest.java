package com.annotation.autowire_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/autowire_1/application-autowire1.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}

}