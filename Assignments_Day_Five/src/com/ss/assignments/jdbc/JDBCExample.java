/**
 * 
 */
package com.ss.assignments.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Samnj
 *
 */
public class JDBCExample {

	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String userName = "admin";
	public static String password = "mypassword";
	public static String url = "jdbc:mysql://database-1.cvavxozyf3ax.us-east-2.rds.amazonaws.com";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(url, userName, password);
			
			Statement statement = connection.createStatement();
			
//			String query = "select * from tbl_author";
			
			ResultSet result = statement.executeQuery("select * from tbl_author");
			
			while(result.next()) {
				System.out.println("Author ID: " + result.getInt("authorId"));
				System.out.println("Author Name: " + result.getString("authorName"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			
		}
	}

}
