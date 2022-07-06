package com.vinymt.estadosAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinymt.estadosAPI.model.Region;
import com.vinymt.estadosAPI.repository.RegionRepository;

@Service
public class RegionService {
	
	@Autowired
	private RegionRepository repo;
	
	public List<Region> findAll() {
		return repo.findAll();
	}
	
	public Region findById(Long id) {
		return repo.findById(id).get();
	}
	
	public Region findByName(String name) {
		return repo.findByName(name);
	}
}
