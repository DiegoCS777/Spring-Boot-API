package com.diego.register.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.register.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = new ArrayList<>();
		list.
		add(new User(1L, "Igor", Instant.parse("2022-05-01T12:05:20Z"), Instant.parse("2022-05-01T12:05:20Z"), "025.625.894/0001-25", "oi" ));
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User u = new User(1L, "Igor", Instant.parse("2022-05-01T12:05:20Z"),Instant.parse("2022-05-01T12:05:20Z"),"025.625.894/0001-25", "oi");
		return ResponseEntity.ok().body(u);
	} 
}
