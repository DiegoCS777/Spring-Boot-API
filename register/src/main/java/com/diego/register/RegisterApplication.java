package com.diego.register;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diego.register.entities.InfoProperty;
import com.diego.register.entities.User;
import com.diego.register.repositories.InfoPropertyRepository;
import com.diego.register.repositories.UserRepository;

@SpringBootApplication
public class RegisterApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private InfoPropertyRepository infoPropertyRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Igor", Instant.parse("2022-01-05T10:35:21Z"), Instant.parse("2022-07-05T10:41:21Z"), "65.256.658/0001-57", "oi");
		User u2 = new User(null, "José", Instant.parse("2022-03-05T11:35:21Z"), Instant.parse("2022-06-05T12:41:21Z"), "45.257.895/0001-32", "dae");
		
		InfoProperty info1 = new InfoProperty(null, "Fazenda Mazurana", u1);
		InfoProperty info2 = new InfoProperty(null, "Fazenda Castanha", u2);
		
		u1.getInfoproperties().addAll(Arrays.asList(info1));
		u2.getInfoproperties().addAll(Arrays.asList(info2));
		
		userRepository.save(u1);
		userRepository.save(u2);
		
		infoPropertyRepository.save(info1);
		infoPropertyRepository.save(info2);
	}

}
