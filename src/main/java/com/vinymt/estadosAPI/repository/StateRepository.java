package com.vinymt.estadosAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinymt.estadosAPI.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

	@Query(value = "SELECT * FROM state WHERE region_id = :regionId", nativeQuery = true)
	List<State> findByRegion(Long regionId);
	
	@Query(value = "SELECT * FROM state WHERE name = :name", nativeQuery = true)
	State findByName(String name);
	
	@Query(value = "SELECT * FROM state WHERE abbreviation = :abbreviation", nativeQuery = true)
	State findByAbbreviation(String abbreviation);
}
