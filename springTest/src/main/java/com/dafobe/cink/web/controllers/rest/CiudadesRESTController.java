package com.dafobe.cink.web.controllers.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dafobe.cink.model.entities.Ciudad;
import com.dafobe.cink.services.TestServices;


@RestController
@RequestMapping("/ciudades")
public class CiudadesRESTController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CiudadesRESTController.class);
	
	@Autowired
	private TestServices testServices;
	
	@RequestMapping(value="{id}")
	public List<Ciudad> findProvinciaAll(@RequestBody String id) {
		System.out.println("====================>" + id);
		return testServices.getCiudadesDeProvincia(id);
	}
	
	@RequestMapping()
	public List<Ciudad> findAllCities() {
		return testServices.getCiudades();
	}
	
	
}