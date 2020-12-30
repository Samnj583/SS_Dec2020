package com.smoothstack.dec2020.service;

import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.smoothstack.dec2020.dao.AirportRepository;
import com.smoothstack.dec2020.dao.BookingRepository;
import com.smoothstack.dec2020.dao.FlightRepository;
import com.smoothstack.dec2020.model.Airport;
import com.smoothstack.dec2020.model.Booking;
import com.smoothstack.dec2020.model.Flight;

@Component
public class TravelAgentService {
	RestTemplate resttemplate = new RestTemplate();

	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	AirportRepository airportRepository;
	@Autowired
	FlightRepository flightRepository;
	
//	public Flight getFilteredFlight(int departCity, int arriveCity, LocalDateTime departTime) {
//		return bookingRepository.getFilteredFlight(departCity, arriveCity, departTime);
//	}
	
	public ResponseEntity<Flight> getFlightById(int flightId) {
		try {
			Flight flight = flightRepository.findById(flightId).get();
			return new ResponseEntity<Flight>(flight, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Flight>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<Booking> makeBookingByFlightId(int flightId, Booking booking) {
//		try {
//			Flight flight = flightRepository.getOne(flightId);
//			java.util.List<Booking> bookings = bookingRepository.findAll();
//			for(Booking b: bookings) {
//				if(b.getFlightId() != flightId) {
//					bookings.remove(b);
//				}
//			}
//			if(flight.getSeatsAvailable() < bookings.size()) {
////				Error, all seats booked
//			}
//			bookingRepository.save(booking);
//			return new ResponseEntity<Booking>(HttpStatus.CREATED);
//		}
//		catch(NoSuchElementException e) {
//			return new ResponseEntity<Booking>(HttpStatus.NOT_FOUND);
//		}
		//not implemented
		return null;
	}

	
	public ResponseEntity<java.util.List<Booking>> getAllBookingsForFlight(int flightId) {
		try {
			java.util.List<Booking> bookings = bookingRepository.findAll();
			for(Booking b: bookings) {
				if(b.getFlightId() != flightId) {
					bookings.remove(b);
				}
			}
			return new ResponseEntity<java.util.List<Booking>>(bookings, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<java.util.List<Booking>>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<Booking> findBookingByBookingId(int bookingId) {
		try {
			Booking booking = bookingRepository.findById(bookingId).get();
			return new ResponseEntity<Booking>(booking, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Booking>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<Booking> cancelBooking(int bookingId) {
		try {
			Booking booking = bookingRepository.getOne(bookingId);
			bookingRepository.delete(booking);
			return new ResponseEntity<Booking>(HttpStatus.ACCEPTED);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Booking>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<java.util.List<Airport>> getAirports() {
		try {
			java.util.List<Airport> airports = airportRepository.findAll();
			return new ResponseEntity<java.util.List<Airport>>(airports, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<java.util.List<Airport>>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<Airport> getAirportById(int airportId) {
		try {
			Airport airport = airportRepository.findById(airportId).get();
			return new ResponseEntity<Airport>(airport, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Airport>(HttpStatus.NOT_FOUND);
		}
	}
}
