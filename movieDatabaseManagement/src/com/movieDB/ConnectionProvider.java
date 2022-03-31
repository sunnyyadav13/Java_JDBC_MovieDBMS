package com.movieDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con;
	
	public static Connection createC(){
		
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/moviedb";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
		
	}
	
	

}
