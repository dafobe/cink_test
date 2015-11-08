package com.dafobe.cink.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dafobe.cink.model.entities.Ciudad;


public interface CiudadesRepository extends JpaRepository<Ciudad, Integer> {
	
	List<Ciudad> findByCodprov(String provinciaId);

}