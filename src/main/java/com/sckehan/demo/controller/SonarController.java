package com.sckehan.demo.controller;

import org.sonar.wsclient.Sonar;
import org.sonar.wsclient.services.Resource;
import org.sonar.wsclient.services.ResourceQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SonarController {
	
	@RequestMapping(value= {"/sonar"},method=RequestMethod.GET)
	String home() {
		
		Sonar sonar =Sonar.create("http://192.168.248.151:9000", "admin", "admin");
		//sonar.create(ResourceQuery.)
		try {
		Resource struts = sonar.find(ResourceQuery.createForMetrics("demo-maven-dev", "coverage", "lines", "violations"));
		System.out.println(struts.getMeasure("coverage"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "hello sonar";
	}

}
