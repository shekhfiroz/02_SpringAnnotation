package com.annon.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements Processor {

	@Override
	public void process() {
		System.out.println("Snapdragon..processor");
	}

}
