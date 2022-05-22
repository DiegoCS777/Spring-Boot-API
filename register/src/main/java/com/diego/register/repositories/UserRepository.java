package com.diego.register.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.diego.register.entities.User;

@Component
public class UserRepository {
	
	private Map<Long, User> map = new HashMap<> ();
	
	public void save(User obj) {
		map.put(obj.getId(), obj);
	}
	
	public User findById(Long id) {
		return map.get(id);
	}
	
	public List<User> findAll() {
		return new ArrayList<User>(map.values());
	}
	
}
