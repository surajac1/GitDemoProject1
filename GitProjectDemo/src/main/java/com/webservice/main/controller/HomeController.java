package com.webservice.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/getData")
	public String get()
	{
		return " Hello Git Project...";
	}

}
