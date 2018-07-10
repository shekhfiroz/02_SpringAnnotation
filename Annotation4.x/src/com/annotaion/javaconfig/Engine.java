package com.annotaion.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Engine {
	
	@Value("SteamEngine")
	private String EngineType;

	public void ignite() {
		System.out.println("ignite....");
	}

	@Override
	public String toString() {
		return "Engine [EngineType=" + EngineType + "]";
	}

}
