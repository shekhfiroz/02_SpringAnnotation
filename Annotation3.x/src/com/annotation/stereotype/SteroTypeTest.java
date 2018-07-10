package com.annotation.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SteroTypeTest {

	public static void main(String[] args) {
		// third implementation of ApplicationContext is
		// AnnotationConfigApplicationContext
		ApplicationContext context = new AnnotationConfigApplicationContext("com/annotation/stereotype");
		System.out.println(context);
	}
}
