package com.aggregatormarketplace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping(value ={"AM","login"})
    public String showLoginPage() {
    	
        return "login";
    }
    
}