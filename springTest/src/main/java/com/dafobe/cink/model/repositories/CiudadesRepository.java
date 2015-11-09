package com.dafobe.cink.model.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dafobe.cink.model.entities.Ciudad;

@Repository
public interface CiudadesRepository extends JpaRepository<Ciudad, Integer> {
	
	List<Ciudad> findByCodprov(String provinciaId);
	List<Ciudad> findByCodpostal(String codigoPostal);

}