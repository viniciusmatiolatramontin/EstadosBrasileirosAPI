package com.vinymt.estadosAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinymt.estadosAPI.model.State;

public interface StateRepository extends JpaRepository<State, Integer>{

}
