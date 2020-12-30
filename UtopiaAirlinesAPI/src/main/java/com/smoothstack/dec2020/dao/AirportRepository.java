package com.smoothstack.dec2020.dao;

import org.springframework.data.jpa.repository.JpaRepository;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.smoothstack.dec2020.model.Airport;

@Repository
@Component
public interface AirportRepository extends JpaRepository<Airport, Integer> {

//	public Flight getFlightById(int id) {
//		return null;
//	}
}
