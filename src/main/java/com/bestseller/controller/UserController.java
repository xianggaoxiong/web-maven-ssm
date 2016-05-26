package com.bestseller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bestseller.entity.User;
import com.bestseller.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam(value="username") String username,
			@RequestParam(value="password") String password){
		User user=userService.getByUserName(username);
		if(user.getPassword().equals(password)){
			return "success";
		}else{
			return "faile";
		}
		
	}
}
