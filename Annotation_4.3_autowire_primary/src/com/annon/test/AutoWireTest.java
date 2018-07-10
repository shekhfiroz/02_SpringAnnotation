package com.annon.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annon.autowire.AppConfig;
import com.annon.autowire.Samsung;

public class AutoWireTest
{
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung samsung=context.getBean("samsung1",Samsung.class);
		samsung.config();
		
	}

}
