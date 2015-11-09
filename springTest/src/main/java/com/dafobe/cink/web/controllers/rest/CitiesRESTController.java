package com.dafobe.cink.web.controllers.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dafobe.cink.model.entities.City;
import com.dafobe.cink.services.TestServices;


@RestController
@RequestMapping("/cities")
public class CitiesRESTController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CitiesRESTController.class);
	
	@Autowired
	private TestServices testServices;
	
	@RequestMapping(value="/{id}")
	public List<City> findBy(@PathVariable String id) {
		return testServices.getProvinceCities(id);
	}
	
	@RequestMapping(value="/pc/{postalCode}")
	public List<City> findPostalCode(@PathVariable String postalCode) {
		return testServices.getCitiesByPostalCode(postalCode);
	}
	
	@RequestMapping()
	public List<City> findAllCities() {
		return testServices.getCities();
	}
	
	
}