package com.study.jcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootWithJcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJcacheApplication.class, args);
	}

}
