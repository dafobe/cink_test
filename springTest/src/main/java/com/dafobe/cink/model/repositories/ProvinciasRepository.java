package com.dafobe.cink.model.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dafobe.cink.model.entities.Provincia;

@Repository
public interface ProvinciasRepository extends JpaRepository<Provincia, String> {

}