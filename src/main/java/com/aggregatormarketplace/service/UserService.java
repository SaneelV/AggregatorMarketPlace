package com.aggregatormarketplace.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggregatormarketplace.model.Users;
import com.aggregatormarketplace.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;

	public String validateUsernamePassowrd(String username, String password) {
		
		Optional<Users> userCredentials = userRepo.findByUsernameAndPassword(username,password);
		
		
		return userCredentials.isEmpty()?null : userCredentials.get().getPage();
	}
	
	
	

}
