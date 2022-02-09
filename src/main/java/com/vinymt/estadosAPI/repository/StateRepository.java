package com.vinymt.estadosAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinymt.estadosAPI.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
