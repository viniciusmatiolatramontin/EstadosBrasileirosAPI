package com.vinymt.estadosAPI.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class State implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String abbreviation;
	private Region region;
	private double hdi;
	private double demographicDensity;
	private String capital;
	
	public State() {
		
	}
	
	public State(int id, String name, String abbreviation, Region region, double hdi, double demographicDensity,
			String capital) {
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
		this.region = region;
		this.hdi = hdi;
		this.demographicDensity = demographicDensity;
		this.capital = capital;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public double getHdi() {
		return hdi;
	}

	public void setHdi(double hdi) {
		this.hdi = hdi;
	}

	public double getDemographicDensity() {
		return demographicDensity;
	}

	public void setDemographicDensity(double demographicDensity) {
		this.demographicDensity = demographicDensity;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
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
