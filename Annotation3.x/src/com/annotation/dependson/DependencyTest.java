package com.annotation.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.annotation.dependson");
		LoanCalculator loanCalculator=context.getBean("loancalculator",LoanCalculator.class);
		//float f1=(float) loanCalculator.calculate(1000, 12, "hyderbad");
		System.out.println(loanCalculator.calculate(1000, 12, "hyderbad"));

	}

}
