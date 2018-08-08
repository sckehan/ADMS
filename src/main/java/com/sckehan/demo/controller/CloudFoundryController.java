package com.sckehan.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudFoundryController {

	
	@RequestMapping("/test")
	String home() {
		return "this is in cloudFoundryController test!";
	}
}
