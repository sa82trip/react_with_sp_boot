package com.js.reactWithSpBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		System.out.println("index controller");
		return "index";
	}
	
	@RequestMapping("/hello")
	  public @ResponseBody String hello() {
	    return "Hello, Spring Boot!";
	  }
}
