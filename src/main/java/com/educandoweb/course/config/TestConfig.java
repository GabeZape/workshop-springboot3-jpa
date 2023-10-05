package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Tonia Black", "tonia@gmail.com", "96666666", "623456"); 
		User u2 = new User(null, "Chris Rock", "chris@gmail.com", "95555555", "523456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
