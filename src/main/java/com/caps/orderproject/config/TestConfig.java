package com.caps.orderproject.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.caps.orderproject.entities.Order;
import com.caps.orderproject.entities.User;
import com.caps.orderproject.repository.OrderRepository;
import com.caps.orderproject.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "João das Couves", "joao@gmail.com", "99999999", "123456");
		User user2 = new User(null, "Floriano Peixoto", "floriano@gmail.com", "88888888", "654321");
		
		Order o1 = new Order(null, Instant.parse("2024-03-13T19:53:07Z"), user1);
		Order o2 = new Order(null, Instant.parse("2024-03-14T03:42:10Z"), user2);
		Order o3 = new Order(null, Instant.parse("2024-03-15T15:21:22Z"), user1);
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}

}
