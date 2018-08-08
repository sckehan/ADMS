package com.sckehan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sckehan.demo.entity.User;
import com.sckehan.demo.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
public class TestController {

	@Autowired
    UserService service;
	
	@Autowired
	private Environment env;
	
	@ApiOperation(value="test2的测试", notes="获取图书列表")
	@RequestMapping(value= {"/test2"},method=RequestMethod.GET)
	public User test() {
		User user =service.getUser(1);
		System.out.println("userName="+user.getUserName()+";password="+user.getPassword());
		System.out.println(env.getProperty("spring.jpa.show-sql"));
	   return user;
	 }
}
