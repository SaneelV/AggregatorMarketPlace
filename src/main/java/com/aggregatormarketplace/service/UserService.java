package com.aggregatormarketplace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggregatormarketplace.model.Users;
import com.aggregatormarketplace.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public String validateUsernamePassowrd(String username, String password) {
		
		Optional<Users> userCredentials = userRepository.findByUsernameAndPassword(username,password);
		
		
		return userCredentials.isEmpty()?null : userCredentials.get().getPage();
	}

	public List<Users> getUsersList() {
		// TODO Auto-generated method stub
		
		return userRepository.findAll();
	}

	public void saveUsers(Users users) {
		userRepository.save(users);
		
	}
	

	public Users editUsersByID(long id) {
		 Users user = userRepository.findById(id).orElseThrow();
			return user;
	}
	
	
	

}
