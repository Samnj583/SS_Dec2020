package com.smoothstack.dec2020.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

import com.smoothstack.dec2020.model.Author;

@Component
public class AuthorDao {
	private String userName = "admin";
	private String password = "mypassword";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://database-1.cvavxozyf3ax.us-east-2.rds.amazonaws.com";

	public Author getAuthorById(int id) {
		try {
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();

			String query = "INSERT INTO `library`.`tbl_author` (`authorId`, `authorName`) VALUES ('"+ id +"', 'Fitzgerald');";

			statement.executeUpdate(query);
//			ResultSet rs = executeQuery("SELECT * from tbl_author");
//			if(rs.next()){
//				System.out.println(rs.blah)
//			}

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			System.out.println("d");
		}
		return new Author("testAuthor", 1);
	}
}
