package com.annotation.autowire_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/autowire_constructor/autowire-constructor.xml");
		Robot robot = context.getBean("robot", Robot.class);
		//robot.toString();
		System.out.println(robot);
	}

}