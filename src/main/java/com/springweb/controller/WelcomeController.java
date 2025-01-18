package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String greet() {
		System.out.println("WelcomeController.greet()");
		return "welcome";
	}
	
	@RequestMapping("/ss")
	public String meed(@RequestParam(name="name",defaultValue="no value....")String name) {
		System.out.println("WelcomeController.meed()"+name);
     return"index";
	}
	
	
	

}