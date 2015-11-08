package com.dafobe.cink.web.controllers.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dafobe.cink.model.entities.Provincia;
import com.dafobe.cink.services.TestServices;


@RestController
@RequestMapping("/provincias")
public class ProvinciasRESTController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProvinciasRESTController.class);
	
	@Autowired
	private TestServices testServices;
	
	public List<Provincia> findAll() {
		return testServices.getProvincias();
	}
}