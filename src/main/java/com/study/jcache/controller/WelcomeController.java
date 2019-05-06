package com.study.jcache.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.jcache.service.WelcomeService;

@RestController
public class WelcomeController {
	@Autowired
	WelcomeService welcomeService;
	Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	@RequestMapping(value ="/hello/{id}",method= RequestMethod.GET,produces = "application/json")
	public String helloWorld(@PathVariable Integer id) {
		logger.info("Inside the controller");
		return welcomeService.welcomeService(id);
	}
}
