package com.annon.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annon.autowire.AppConfig;
import com.annon.autowire.Chip;
import com.annon.autowire.Robot;

public class AutoWireTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Robot robot=context.getBean("robot", Robot.class);
		System.out.println(robot);
	}

}


/* if We will not pass AppConfig.class the we will get below exception
 * Exception in thread "main" java.lang.IllegalStateException:
 * org.springframework.context.annotation.AnnotationConfigApplicationContext@
 * 2328c243 has not been refreshed yet
 */