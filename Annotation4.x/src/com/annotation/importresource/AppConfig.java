package com.annotation.importresource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ComponentScan(basePackages= {"com.annotation.importresource"})
//@ImportResource({"com/annotation/importresource/importresource-application.xml"})
public class AppConfig {

	@Bean(name="myChip")
	public Chip chip() { // method name chip will be takes as bean id
		
		Chip chip=new Chip();
		chip.setRobot_no(101);
		chip.setRobot_name("chitti");
		
		System.out.println("AppConfig.chip()");
		return chip;
	}
}

//com.annotation.importresource/