package com.smoothstack.dec2020.controller;

import java.time.LocalDateTime;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.dec2020.model.Airport;
import com.smoothstack.dec2020.model.Booking;
import com.smoothstack.dec2020.model.Flight;
import com.smoothstack.dec2020.service.TravelAgentService;

@RestController
public class TravelAgentController {
	
	@Autowired
	TravelAgentService travelAgentService;
	
//	@RequestMapping(path = "/flights", method = RequestMethod.GET)
//	public Flight getFilteredFlight(@PathVariable int departingCity, int arriveCity, LocalDateTime departTime) {
//		return travelAgentService.getFilteredFlight(departingCity, arriveCity, departTime);
//	}
	
	@RequestMapping(path = "/flights/{flightId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ResponseEntity<Flight> getFlightById(@PathVariable int flightId) {
		return travelAgentService.getFlightById(flightId);
	}
	
	@RequestMapping(path = "/flight/{flightId}/booking", method = RequestMethod.POST)
	public ResponseEntity<Booking> makeBookingByFlightId(@PathVariable int flightId, @RequestBody Booking booking) {
		return travelAgentService.makeBookingByFlightId(flightId, booking);
	}
	
	@RequestMapping(path = "/flights/{flightId}/bookings", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ResponseEntity<java.util.List<Booking>> getAllBookingsForFlight(@PathVariable int flightId) {
		return travelAgentService.getAllBookingsForFlight(flightId);
	}
	
	@RequestMapping(path = "/booking/{bookingId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ResponseEntity<Booking> findBookingByBookingId(@PathVariable int bookingId) {
		return travelAgentService.findBookingByBookingId(bookingId);
	}
	
	@RequestMapping(path = "/booking/{bookingId}", method = RequestMethod.DELETE)
	public ResponseEntity<Booking> cancelBooking(@PathVariable int bookingId) {
		return travelAgentService.cancelBooking(bookingId);
	}
	
	@RequestMapping(path = "/airports", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ResponseEntity<java.util.List<Airport>> getAirports() {
		return travelAgentService.getAirports();
	}
	
	@RequestMapping(path = "/airports/{airportId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ResponseEntity<Airport> getAirportById(@PathVariable int airportId) {
		return travelAgentService.getAirportById(airportId);
	}
	
//	@RequestMapping(path = "flight/{flightId}/booking", method = RequestMethod.POST)
//	public Booking makeBookingByFlightId(@PathVariable int flightId) {
//		return travelAgentService.makeBookingByFlightId(flightId);
//	}
}