package com.annotation.importresource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotaion.javaconfig.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("com/annotation/importresource/importresource-application.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Test.main()");
		// we have to pass AppConfig.class because we do not have anypackage or
		//Robot robot1 = context.getBean("robot", Robot.class);
	//	System.out.println(robot1);
		Chip chip=context.getBean("myChip",Chip.class);
		//System.out.println("done " +chip);

	}

}
