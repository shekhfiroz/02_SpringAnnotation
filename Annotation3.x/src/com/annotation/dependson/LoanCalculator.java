package com.annotation.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("loancalculator")
@DependsOn("cacheManager")
public class LoanCalculator {

	public LoanCalculator() {
		System.out.println("Loan Calculator.. Constructor is called");
	}
	public double calculate(long principle, int duration, String city) {
		return 30098.98;
	}
}
