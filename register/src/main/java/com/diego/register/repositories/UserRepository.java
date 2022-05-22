package com.diego.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.register.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
