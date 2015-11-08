package com.dafobe.cink.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	private static final String VIEW_HOME = "home";
	
	@RequestMapping(value = { "/", "/home"}, method = { RequestMethod.GET, RequestMethod.POST })
	public String defaultRender() {
		return VIEW_HOME;
	}
}