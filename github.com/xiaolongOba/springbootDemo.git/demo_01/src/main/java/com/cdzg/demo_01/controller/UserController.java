package com.cdzg.demo_01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdzg.demo_01.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	public User getUser() {

		User user = new User();
		user.setUserName("小明");
		user.setPassword("123456");
		return user;
	}

}
