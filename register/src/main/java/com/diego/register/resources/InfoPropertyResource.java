package com.diego.register.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.register.entities.InfoProperty;
import com.diego.register.repositories.InfoPropertyRepository;

@RestController
@RequestMapping(value = "/infoproperties")
public class InfoPropertyResource {
	
	@Autowired
	private InfoPropertyRepository  infoPropertyRepository;
	
	@GetMapping
	public ResponseEntity<List<InfoProperty>> findAll(){
		List<InfoProperty> list = infoPropertyRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<InfoProperty> findById(@PathVariable Long id) {
		InfoProperty info =	infoPropertyRepository.findById(id).get();
		return ResponseEntity.ok().body(info);
	} 
}
