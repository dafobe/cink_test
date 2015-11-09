package com.dafobe.cink.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafobe.cink.model.entities.Ciudad;
import com.dafobe.cink.model.entities.Provincia;
import com.dafobe.cink.model.repositories.CiudadesRepository;
import com.dafobe.cink.model.repositories.ProvinciasRepository;
import com.dafobe.cink.services.TestServices;

@Service("testService")
public class TestServicesImpl implements TestServices {
	private static Logger LOGGER = LoggerFactory.getLogger(TestServices.class);

	@Autowired
	ProvinciasRepository provinciasRepository;
	
	@Autowired
	CiudadesRepository ciudadesRepository; 

	@Override
	public List<Provincia> getProvincias(){
		LOGGER.info("getProvincias({})");
		return provinciasRepository.findAll();
	}
	
	@Override
	public List<Ciudad> getCiudades(){
		LOGGER.info("getMunicipios({})");
		return ciudadesRepository.findAll();
	}
	
	@Override
	public List<Ciudad> getCiudadesDeProvincia(String provinciaId){
		LOGGER.info("getCiudadesDeProvincia({})", provinciaId);
		return ciudadesRepository.findByCodprov(provinciaId);
	}
	
	@Override
	public List<Ciudad> getCiudadesPorCodigoPostal(String codigoPostal){
		LOGGER.info("getCiudadesPorCodigoPostal({})", codigoPostal);
		return ciudadesRepository.findByCodpostal(codigoPostal);
	}
}
