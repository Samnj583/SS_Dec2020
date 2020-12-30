package com.smoothstack.dec2020.dao;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.smoothstack.dec2020.model.Booking;

@Repository
@Component
public interface BookingRepository extends JpaRepository<Booking, Integer>{

//	default public Flight getFilteredFlight(int departCity, int arriveCity, LocalDateTime departTime) {
//		return null;
//	}
//	
//	default public Flight getFlightById(int id) {
//		return null;
//	}
//	
//	default public Booking makeBookingByFlightId(int flightId) {
//		return null;
//	}
//	
//	default public Booking getAllBookingsForFlight(int flightId) {
//		return null;
//	}
//	
//	default public Booking findBookingByBookingId(@PathVariable int bookingId) {
//		return null;
//	}
//	
//	default public Booking cancelBooking(@PathVariable int bookingId) {
//		return null;
//	}
//	
//	default public Airport getAirports() {
//		return null;
//	}
//	
//	default public Flight getAirportById(@PathVariable int airportId) {
//		return null;
//	}
}
