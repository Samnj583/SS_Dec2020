/**
 * 
 */
package com.ss.assignments.weekend;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	public static  SampleSingleton getInstance() {
		return instance;
	}
	
	public static void databaseQuery(BigDecimal input) throws SQLException {
		conn = DriverManager.getConnection("url of database");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from table");
		BigDecimal x = new BigDecimal(0);
		while(rs.next()) {
			x = input.multiply(new BigDecimal(rs.getInt(1)));
		}
	}
}
