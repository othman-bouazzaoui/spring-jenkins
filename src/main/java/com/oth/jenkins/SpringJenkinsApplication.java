package com.oth.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	private static Logger LOG = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void setUp() {
		LOG.info("Hello From Sprig with Jenkins Integration");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
