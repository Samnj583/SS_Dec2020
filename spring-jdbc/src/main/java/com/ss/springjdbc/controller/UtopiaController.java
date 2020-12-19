package com.ss.springjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ss.springjdbc.entity.Flight;
import com.ss.springjdbc.service.UtopiaService;

@RestController
public class UtopiaController {
	
	@Autowired
	UtopiaService utopiaService;
	@RequestMapping(path = "flights/{flightId}", method = RequestMethod.GET)
	public Flight getFlightById(@PathVariable int flightId) {
		return utopiaService.getFlightById(flightId);
	}
	
	
	//Test to see if spring boot is running partially
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
