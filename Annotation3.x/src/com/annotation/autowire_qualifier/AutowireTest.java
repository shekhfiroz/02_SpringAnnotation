package com.annotation.autowire_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/autowire_p2/application-autowire2.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}

}
//com/annotation/autowire_p2/application-autowire2.xml