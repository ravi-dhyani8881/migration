package com.migration.tool.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.migration.tool.model.User;
import com.migration.tool.service.UserService;




@Controller
@RequestMapping("/user/**")
public class UserRestController {

	
    @Autowired
	private UserService userService;
	
    @CrossOrigin
    @RequestMapping(value="/getAllUser" , method=RequestMethod.GET) // Map ONLY GET Requests
	public @ResponseBody Iterable<User> getAllUsers(){	
	     return userService.findAll();
	}
	
	
 
	@RequestMapping(value="/add" ,  method=RequestMethod.POST)
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email , @RequestParam String userName , @RequestParam String userPassword  , @RequestParam String lastName) {

		
		User userRegister = new User();
		
		userRegister.setUserName(userName);
		userRegister.setPassword(userPassword);
		userRegister.setName(name);
		userRegister.setLastName(lastName);
		userRegister.setEmail(email);
		userService.save(userRegister);
		return "Saved";
	}
	
	
}
