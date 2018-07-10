package com.annotation.dependson;

import org.springframework.stereotype.Component;

@Component
public class CacheManager {

	public CacheManager() {
		System.out.println("Cache Data is Loading..");
	}
}
