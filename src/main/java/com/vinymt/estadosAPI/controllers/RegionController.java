package com.vinymt.estadosAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinymt.estadosAPI.model.Region;
import com.vinymt.estadosAPI.services.RegionService;

@RestController
@RequestMapping("/regions")
public class RegionController {
	
	@Autowired
	private RegionService service;
	
	@GetMapping(produces = {"application/json", "application/xml"})
	public ResponseEntity<List<Region>> findAll() {
		List<Region> regions = service.findAll();
		
		return ResponseEntity.ok().body(regions);
	}
	
	@GetMapping(value="/getById/{id}", produces = {"application/json", "application/xml"})
	public ResponseEntity<Region> findById(@PathVariable Long id) {
		Region region = service.findById(id);
		
		return ResponseEntity.ok().body(region);
	}
	
	@GetMapping(value="/getByName/{name}", produces = {"application/json", "application/xml"})
	public ResponseEntity<Region> findByName(@PathVariable String name) {
		Region region = service.findByName(name);
		
		return ResponseEntity.ok().body(region);
	}
}
