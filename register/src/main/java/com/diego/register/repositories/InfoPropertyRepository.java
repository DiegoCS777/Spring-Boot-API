package com.diego.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.register.entities.InfoProperty;

@Repository
public interface InfoPropertyRepository extends JpaRepository<InfoProperty, Long>{
	
}
