package com.dafobe.cink.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dafobe.cink.model.entities.City;

@Repository
public interface CitiesRepository extends JpaRepository<City, Integer> {
	
	List<City> findByCodprov(String provinciaId);
	List<City> findByCodpostal(String codigoPostal);
}