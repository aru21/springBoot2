package com.app.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.app.controller.Application"})
@ComponentScan(basePackageClasses = {com.app.controller.LoginController.class})
public class Application {

	 public static void main(String[] args) {
	    	System.out.println("run method");
	        SpringApplication.run(Application.class, args);
	        
	    }
	
	 @RequestMapping("/home")
     private String homePage() 
	 {
		 return "home";
	 }
	 
}
