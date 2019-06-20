package com.cdzg.demo_01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("demo")
public class SpringBootDemoController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello world";
	}
	
}
