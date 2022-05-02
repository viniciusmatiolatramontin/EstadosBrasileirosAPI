package com.vinymt.estadosAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vinymt.estadosAPI.model.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long>{
	@Query(value = "SELECT * FROM region WHERE name = :name", nativeQuery = true)
	Region findByName(String name);
}
