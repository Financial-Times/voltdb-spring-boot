package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	@RequestMapping("/")
	public String index() {
		return helloService.greeting();
	}
}
