package com.study.jcache.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	Logger logger = LoggerFactory.getLogger(WelcomeService.class);
	@Cacheable(value = "hello", key = "#id")
	public String welcomeService(int id) {
		logger.info("Inside the service call");
		String h;
		switch(id) {
		case 1: 
			h="hello";
			break;  
		case 2: 
			h="world";
			break;  
		default: 
			h="Hii";
			break;  
		}
			
		return h; 
	}
}
