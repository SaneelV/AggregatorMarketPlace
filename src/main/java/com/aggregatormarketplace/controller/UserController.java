package com.aggregatormarketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aggregatormarketplace.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
    
    @GetMapping(value ={"/"})
    public String showLoginPage() {
    	
        return "login";
    }
    
    
    @PostMapping("/login")
    public String loginUser(@RequestParam("username") String userName, @RequestParam("password") String userPassword) {
    	
    	
		return userService.validateUsernamePassowrd(userName,userPassword);
    	
    	
    }
}