package com.ss.springjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Component;

import com.ss.springjdbc.entity.Flight;

@Component
public class UtopiaDao {

	public Flight getFlightById(int flightId) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://database-1.cvavxozyf3ax.us-east-2.rds.amazonaws.com", "admin", "mypassword");
//			Statement stmnt = conn.createStatement();
//			ResultSet rs = stmnt.executeQuery("select * from tbl_flights where authorId=" + flightId);
//			if(rs.next()) {
//				Flight flight = new Flight("test", rs.getInt("authorId"));
//				return flight;
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		return new Flight("test", 1);
	}
}
