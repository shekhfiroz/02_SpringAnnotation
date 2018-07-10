package com.annotation.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/annotation/propertysource/Radio-Frequency.properties")
public class RadioFrequency {
	@Value("${frequency}")
	//@Value("10")
	private int frequenncy;

	@Override
	public String toString() {
		return "RadioFrequency [frequenncy=" + frequenncy + "]";
	}
	
}
