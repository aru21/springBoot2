package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	PersonDao personDao;
	@RequestMapping("/login")
	public String login()
	{
		Person person = new Person("arpit", 22);
		System.out.println(person);
		personDao.addPerson(person);
		System.out.println("inside login");
		return "loginPage";
	}
	
	@RequestMapping(value= "/login" , method = RequestMethod.POST)
	public String login(Person person , @RequestParam("name") String name ,  @RequestParam("age") int age)
	{	
		System.out.println(name);
		System.out.println(age);
		System.out.println("insidn");
		return "loginPage";
	}
	
}
