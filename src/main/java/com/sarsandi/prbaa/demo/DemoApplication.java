package com.sarsandi.prbaa.demo;

import com.sarsandi.prbaa.demo.controller.EmployeeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {


	public static Logger logger= LoggerFactory.getLogger(DemoApplication.class);
   @PostConstruct
	public void init(){
		logger.info("Application started");
                logger.info("Application second started");
	}

	public static void main(String[] args) {
	   logger.info("Application executed");
		SpringApplication.run(DemoApplication.class, args);
	}

}
