package com.Instagram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstagramDemoController {
	@GetMapping("/getPost")
	public String getPost(@RequestParam String user)
	{
		return "the post is done by "+user;
	}

}
