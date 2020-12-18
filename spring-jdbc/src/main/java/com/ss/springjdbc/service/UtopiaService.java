package com.ss.springjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ss.springjdbc.dao.UtopiaDao;
import com.ss.springjdbc.entity.Flight;

@Component
public class UtopiaService {
	
	@Autowired
	UtopiaDao utopiaDao;
	public Flight getFlightById(int flightId) {
		return utopiaDao.getFlightById(flightId);
	}
}
