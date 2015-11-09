package com.dafobe.cink.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dafobe.cink.model.entities.Province;

@Repository
public interface ProvincesRepository extends JpaRepository<Province, String> {

}