package com.sckehan.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="测试类")
@RestController
@RequestMapping(value = "/hello")
public class SampleController {

	@ApiOperation(value="获取图书列表", notes="获取图书列表")
	@RequestMapping(value= {""},method=RequestMethod.GET)
	String home() {
		return "hello world";
	}
}
