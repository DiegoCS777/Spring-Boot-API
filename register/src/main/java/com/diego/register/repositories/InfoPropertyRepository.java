package com.diego.register.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.diego.register.entities.InfoProperty;

@Component
public class InfoPropertyRepository {
	
	private Map<Long, InfoProperty> map = new HashMap<> ();
	
	public void save(InfoProperty obj) {
		map.put(obj.getId(), obj);
	}
	
	public InfoProperty findById(Long id) {
		return map.get(id);
	}
	
	public List<InfoProperty> findAll() {
		return new ArrayList<InfoProperty>(map.values());
	}
	
}
