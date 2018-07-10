package com.annotaion.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// we have to pass AppConfig.class because we do not have anypackage or
		Truck truck = context.getBean("truck1", Truck.class);
		truck.drive();
		System.out.println(truck);

	}

}
