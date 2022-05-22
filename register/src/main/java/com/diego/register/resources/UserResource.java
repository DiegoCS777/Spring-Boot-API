package com.diego.register.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.register.entities.User;
import com.diego.register.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = userRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User u = userRepository.findById(id).get();
		return ResponseEntity.ok().body(u);
	} 
}
