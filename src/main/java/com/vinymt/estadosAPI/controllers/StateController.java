package com.vinymt.estadosAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinymt.estadosAPI.model.State;
import com.vinymt.estadosAPI.services.StateService;

@RestController
@RequestMapping("/states")
public class StateController {
	
	@Autowired
	private StateService service;
	
	@GetMapping
	public ResponseEntity<List<State>> findAll() {
		List<State> states = service.findAll();
		
		return ResponseEntity.ok().body(states);
	}
}
