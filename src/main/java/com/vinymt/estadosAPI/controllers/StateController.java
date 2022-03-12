package com.vinymt.estadosAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinymt.estadosAPI.model.State;
import com.vinymt.estadosAPI.services.StateService;

@RestController
@RequestMapping("/states")
public class StateController {
	
	@Autowired
	private StateService service;
	
	@GetMapping(produces = {"application/json", "application/xml"})
	public ResponseEntity<List<State>> findAll() {
		List<State> states = service.findAll();
		
		return ResponseEntity.ok().body(states);
	}
	
	@GetMapping(value="/getById/{id}", produces = {"application/json", "application/xml"})
	public ResponseEntity<State> findById(@PathVariable Long id) {
		State state = service.findById(id);
		
		return ResponseEntity.ok().body(state);
	}
	
	@GetMapping(value="/getByName/{name}", produces = {"application/json", "application/xml"})
	public ResponseEntity<State> findByName(@PathVariable String name) {
		State state = service.findByName(name);
		
		return ResponseEntity.ok().body(state);
	}
	
	@GetMapping(value="/getByAbbreviation/{abbreviation}", produces = {"application/json", "application/xml"})
	public ResponseEntity<State> findByAbbreviation(@PathVariable String abbreviation) {
		State state = service.findByAbbreviation(abbreviation);
		
		return ResponseEntity.ok().body(state);
	}
}
