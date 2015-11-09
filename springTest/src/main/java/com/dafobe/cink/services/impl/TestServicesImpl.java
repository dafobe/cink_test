package com.dafobe.cink.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafobe.cink.model.entities.City;
import com.dafobe.cink.model.entities.Province;
import com.dafobe.cink.model.repositories.CitiesRepository;
import com.dafobe.cink.model.repositories.ProvincesRepository;
import com.dafobe.cink.services.TestServices;

@Service("testService")
public class TestServicesImpl implements TestServices {
	private static Logger LOGGER = LoggerFactory.getLogger(TestServices.class);

	@Autowired
	ProvincesRepository provincesRepository;
	
	@Autowired
	CitiesRepository citiesRepository; 

	@Override
	public List<Province> getProvinces(){
		LOGGER.info("getProvinces({})");
		return provincesRepository.findAll();
	}
	
	@Override
	public List<City> getCities(){
		LOGGER.info("getCities({})");
		return citiesRepository.findAll();
	}
	
	@Override
	public List<City> getProvinceCities(String id){
		LOGGER.info("getCiudadesDeProvincia({})", id);
		return citiesRepository.findByCodprov(id);
	}
	
	@Override
	public List<City> getCitiesByPostalCode(String id){
		LOGGER.info("getCitiesByPostalCode({})", id);
		return citiesRepository.findByCodpostal(id);
	}
}
