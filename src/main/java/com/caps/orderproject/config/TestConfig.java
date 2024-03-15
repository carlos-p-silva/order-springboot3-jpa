package com.caps.orderproject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.caps.orderproject.entities.User;
import com.caps.orderproject.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "João das Couves", "joao@gmail.com", "99999999", "123456");
		User user2 = new User(null, "Floriano Peixoto", "floriano@gmail.com", "88888888", "654321");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		
	}

}
