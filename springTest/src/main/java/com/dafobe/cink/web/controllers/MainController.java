package com.dafobe.cink.web.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dafobe.cink.model.entities.Province;
import com.dafobe.cink.services.TestServices;


@Controller
public class MainController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	private static final String VIEW_HOME = "home";
	
	@Autowired
	private TestServices testServices;
	
	@RequestMapping(value = { "/", "/home"}, method = { RequestMethod.GET, RequestMethod.POST })
	public String defaultRender(Model model) {
		//List<Province> province = testServices.getProvinces();
		model.addAttribute("provinces", testServices.getProvinces());
		
		return VIEW_HOME;
	}
}