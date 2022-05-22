package com.diego.register;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diego.register.entities.User;
import com.diego.register.repositories.UserRepository;

@SpringBootApplication
public class RegisterApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(1L, "Igor", Instant.parse("2022-01-05T10:35:21Z"), Instant.parse("2022-07-05T10:41:21Z"), "65.256.658/0001-57", "oi");
		User u2 = new User(2L, "José", Instant.parse("2022-03-05T11:35:21Z"), Instant.parse("2022-06-05T12:41:21Z"), "45.257.895/0001-32", "dae");
		
		userRepository.save(u1);
		userRepository.save(u2);
	}

}
