package com.dafobe.cink.web.controllers.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dafobe.cink.model.entities.City;
import com.dafobe.cink.model.entities.Province;
import com.dafobe.cink.services.TestServices;


@RestController
@RequestMapping("/provinces")
public class ProvincesRESTController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProvincesRESTController.class);
	
	@Autowired
	private TestServices testServices;
	
	public List<Province> findAll() {
		return testServices.getProvinces();
	}
	
	@RequestMapping(value="/{id}")
	public List<City> findPostalCode(@PathVariable String id) {
		return testServices.getCitiesByPostalCode(id);
	}
}