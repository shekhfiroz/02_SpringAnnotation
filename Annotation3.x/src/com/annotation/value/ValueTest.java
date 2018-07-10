package com.annotation.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/value/value-application.xml");
		RadioFrequency radioFrequency = context.getBean("radioFrequency", RadioFrequency.class);
		System.out.println(radioFrequency);
	}

}
