package com.whatsapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsappController {
	@GetMapping("/signin")
	public String Signup()
	{
		return "Signup successfully";
	}
	
	@GetMapping("/landin/{username}")
	public String landin(@PathVariable("username") String username)
	{
		return "landin id id "+username;
	}

}
