package com.vinymt.estadosAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinymt.estadosAPI.model.State;
import com.vinymt.estadosAPI.repository.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository repo;
	
	public List<State> findAll() {
		return repo.findAll();
	}
}
