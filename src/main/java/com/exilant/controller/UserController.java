package com.exilant.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exilant.model.User;
import com.exilant.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET , produces="application/json")
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
	}
	
	@RequestMapping(value="/addUser" , method=RequestMethod.POST)
	public void addUserRecord(@RequestBody List<User> user) {
		userRepository.saveAll(user);
	}
	
	
}
