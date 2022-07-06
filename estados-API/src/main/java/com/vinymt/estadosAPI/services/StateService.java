package com.vinymt.estadosAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinymt.estadosAPI.model.Region;
import com.vinymt.estadosAPI.model.State;
import com.vinymt.estadosAPI.repository.RegionRepository;
import com.vinymt.estadosAPI.repository.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository repo;
	@Autowired
	private RegionRepository repoRegion;
	
	public List<State> findAll() {
		return repo.findAll();
	}
	
	public State findById(Long id) {
		return repo.findById(id).get();
	}
	
	public State findByName(String name) {
		return repo.findByName(name);
	}
	
	public State findByAbbreviation(String abbreviation) {
		return repo.findByAbbreviation(abbreviation);
	}
	
	public List<State> findByRegion(String name) {
		Region region = repoRegion.findByName(name);
		return repo.findByRegion(region.getId());
	}
}
