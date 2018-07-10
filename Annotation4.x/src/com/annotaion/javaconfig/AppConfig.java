package com.annotaion.javaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Engine engine() { // method name engine will be takes as bean id
		return new Engine();
	}
    
	@Bean(autowire=Autowire.BY_TYPE ,name= {"truck1"})
	public Truck truck() {
		return new Truck();
	}

	
}
