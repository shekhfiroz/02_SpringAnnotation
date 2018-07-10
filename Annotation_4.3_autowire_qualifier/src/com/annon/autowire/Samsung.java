package com.annon.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung1")
public class Samsung {
	
	private Processor processor;

	public Processor getProcessor() {
		return processor;
	}
	@Autowired
	//@Qualifier("mediaTek")
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void config() {

		System.out.println("octa core 12 gb ram....");
		processor.process();
	}

}
