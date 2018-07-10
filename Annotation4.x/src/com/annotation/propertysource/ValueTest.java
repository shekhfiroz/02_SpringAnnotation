package com.annotation.propertysource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.propertysource");
		RadioFrequency radioFrequency = context.getBean("radioFrequency", RadioFrequency.class);
		System.out.println(radioFrequency);
	}

}
