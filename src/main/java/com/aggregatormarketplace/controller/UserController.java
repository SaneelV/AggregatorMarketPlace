package com.aggregatormarketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aggregatormarketplace.model.Users;
import com.aggregatormarketplace.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping(value = { "/" })
	public String showLoginPage() {

		return "login";
	}

	@PostMapping("/login")
	public String loginUser(@RequestParam("username") String userName, @RequestParam("password") String userPassword) {

		return userService.validateUsernamePassowrd(userName, userPassword);

	}

	@GetMapping("/getUserslist")
	public String getUserList(Model model) {
		model.addAttribute("userDetails", userService.getUsersList());

		return "userlist";

	}

	@GetMapping("/addUser")
	public String addUser(Users users) {

		return "adduser";

	}

	@PostMapping("/registerUser")
	public String registerUser(@Valid Users users, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "adduser";
		}
		users.setPage(users.getRole());
		userService.saveUsers(users);
		return "redirect:getUserslist";

	}
	
	 @GetMapping("editUsers/{id}")
	    public String showUpdateForm(@PathVariable("id") long id, Model model) {
		 
	        Users users = userService.editUsersByID(id);
	        model.addAttribute("users", users);
	        return "updateuser.html";
	    }
	 
	 @PostMapping("update/{id}")
	    public String updateUsers(@PathVariable("id") long id, @Valid Users users, BindingResult result,
	        Model model) {
	        if (result.hasErrors()) {
	            users.setUserId(id);
	            return "updateuser.html";
	        }

	        users.setPage(users.getRole());
			userService.saveUsers(users);
			model.addAttribute("userDetails", userService.getUsersList());
	        return "userlist";
	    }

}