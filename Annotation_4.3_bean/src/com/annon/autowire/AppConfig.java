package com.annon.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.annon.autowire"})
public class AppConfig {
	Chip chip;
	@Bean
	public Chip chip() {
		Chip chip=new Chip();
		this.chip=chip;
		return chip;
	}
	@Bean
	public Robot robot() {
		Robot robot=new Robot();
		robot.setChip(chip);
		System.out.println("robot = "+robot);
		return robot;
	}
}
