package com.smoothstack.dec2020;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.client.RestTemplate;

import com.smoothstack.dec2020.controller.TravelAgentController;
import com.smoothstack.dec2020.dao.AirportRepository;
import com.smoothstack.dec2020.dao.FlightRepository;
import com.smoothstack.dec2020.model.Airport;
import com.smoothstack.dec2020.model.Flight;
import com.smoothstack.dec2020.service.TravelAgentService;

@RunWith(MockitoJUnitRunner.class)
public class TravelAgentControllerIntegrationTest {
	
	@InjectMocks
	private TravelAgentService travelAgentService;
	
	@Mock
	private AirportRepository airportRepository;
	
	@Test
	public void getAllAirportsTest() {
		List<Airport> airports = new ArrayList<Airport>();
		Airport airportOne = new Airport(1, "LAX");
		Airport airportTwo = new Airport(2, "EPA");
		Airport airportThree = new Airport(3, "ATX");
		
		airports.add(airportOne);
		airports.add(airportTwo);
		airports.add(airportThree);
		
		when(airportRepository.findAll()).thenReturn(airports);
		
		List<Airport> result = travelAgentService.getAirports().getBody();
		
		assertEquals(3, result.size());
		verify(airportRepository, times(1)).findAll();
		
	}
	
}
