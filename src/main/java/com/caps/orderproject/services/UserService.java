package com.caps.orderproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caps.orderproject.entities.User;
import com.caps.orderproject.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
	  Optional<User> optionalUser =	userRepository.findById(id);
	  return optionalUser.get();                  
	}

}
