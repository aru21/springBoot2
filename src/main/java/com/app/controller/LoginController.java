package com.app.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojo.Person;

@Controller
public class LoginController {

	
	@RequestMapping("/login")
	public String login()
	{
		return "loginPage";
	}
	
	@RequestMapping(value= "/login" , method = RequestMethod.POST)
	public String login(Person person , @RequestParam("name") String name ,  @RequestParam("age") int age)
	{	
		System.out.println(name);
		System.out.println(age);
		 
		return "loginPage";
	}
	
}
