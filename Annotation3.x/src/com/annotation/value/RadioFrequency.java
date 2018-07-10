package com.annotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RadioFrequency {
	@Value("#{appfrequency.frequency}")
	//@Value("10")
	private int frequenncy;

	@Override
	public String toString() {
		return "RadioFrequency [frequenncy=" + frequenncy + "]";
	}
	
}
