package com.vinymt.estadosAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "region")
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Region() {
		
	}
	
	public Region(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	public void setId(Long id) {
		if(id < 0) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		this.id = id;
	}

	public void setName(String name) {
		if(name.isEmpty() || name == null) {
			throw new IllegalArgumentException("Invalid name");
		}
		
		this.name = name;
	}

	
}
