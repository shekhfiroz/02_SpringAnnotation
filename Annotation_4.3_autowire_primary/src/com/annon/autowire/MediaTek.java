package com.annon.autowire;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements Processor {

	@Override
	public void process() {
		System.out.println("MediaType..Processor");
	}

}
