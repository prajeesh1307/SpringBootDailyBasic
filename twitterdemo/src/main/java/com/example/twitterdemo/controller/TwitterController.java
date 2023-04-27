package com.example.twitterdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterController {
	@GetMapping("/login")
	public String login()
	{
		return "login successfully";
	}

}
