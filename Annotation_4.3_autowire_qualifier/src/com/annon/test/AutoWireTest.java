package com.annon.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annon.autowire.AppConfig;
import com.annon.autowire.Samsung;

public class AutoWireTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung samsung = context.getBean("samsung1", Samsung.class);
		samsung.config();

	}

}
/* with interface having two implementation
 * Error creating bean with name 'samsung1': Unsatisfied dependency expressed
 * through method 'setProcessor' parameter 0; nested exception is
 * org.springframework.beans.factory.NoUniqueBeanDefinitionException: No
 * qualifying bean of type 'com.annon.autowire.Processor' available: expected
 * single matching bean but found 2: mediaTek,snapdragon
 */