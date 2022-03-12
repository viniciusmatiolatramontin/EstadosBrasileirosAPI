package com.vinymt.estadosAPI.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "state")
public class State implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String abbreviation;
	private double hdi;
	private double demographicDensity;
	private String capital;
	
	public State() {
		
	}
	
	public State(Long id, String name, String abbreviation, double hdi, double demographicDensity,
			String capital) {
		this.setId(id);
		this.setName(name);
		this.setAbbreviation(abbreviation);
		this.setHdi(hdi);
		this.setDemographicDensity(demographicDensity);
		this.setCapital(capital);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if(id < 0) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.isEmpty() || name == null) {
			throw new IllegalArgumentException("Invalid name");
		}
		
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		if(abbreviation.isEmpty() || abbreviation == null) {
			throw new IllegalArgumentException("Invalid abbreviation");
		}
		
		this.abbreviation = abbreviation;
	}

	public double getHdi() {
		return hdi;
	}

	public void setHdi(double hdi) {
		if(hdi < 0 || hdi > 1) {
			throw new IllegalArgumentException("Invalid human development index");
		}
		
		this.hdi = hdi;
	}

	public double getDemographicDensity() {
		return demographicDensity;
	}

	public void setDemographicDensity(double demographicDensity) {
		if(demographicDensity < 0) {
			throw new IllegalArgumentException("Invalid demographic density");
		}
		
		this.demographicDensity = demographicDensity;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		if(capital.isEmpty() || capital == null) {
			throw new IllegalArgumentException("Invalid capital");
		}
		
		this.capital = capital;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return id == other.id;
	}
	
	
}
