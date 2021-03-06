package com.movieDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class movieDow {
	
	public static boolean insertIntoDB(MovieClass mc) {
		boolean flag=false;
		
	try {
		
		// jdbc code...
		Connection con= ConnectionProvider.createC();
		
		String qur= "insert into movie_tab(movieName,actorName,length,releaseDate) value(?,?,?,?)";
		// prepared statement
		PreparedStatement pstmt= con.prepareStatement(qur);
		 // set the values in query
		pstmt.setString(1,mc.getMovieName());
		pstmt.setString(2,mc.getActorName());
		pstmt.setString(3,mc.getLength());
		pstmt.setString(4,mc.getReleaseDate());
		
		//execute
		
		pstmt.executeUpdate();
		flag=true;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return flag;
			
	}

	public static void deleteMovie(int id) {
		
		
		
		try {
			
			// jdbc code...
			Connection con= ConnectionProvider.createC();
			
			String qur= "delete from movie_tab where id=?";
			// prepared statement
			PreparedStatement pstmt= con.prepareStatement(qur);
			 // set the values in query
			pstmt.setInt(1,id);
			
			
			//execute
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	public static void showAllMovie() {
		
		
		try {
			
			// jdbc code...
			Connection con= ConnectionProvider.createC();
			
			String qur= "select * from movie_tab";
			// prepared statement
			PreparedStatement pstmt= con.prepareStatement(qur);
			 // set the values in query

			
			//execute
			
			ResultSet res=pstmt.executeQuery(qur);
			
			while(res.next()) {
				int id=res.getInt(1); // 1 is column no indexing from 1
				String movieName=res.getString(2);
				String actorName=res.getString(3);
				String length=res.getString(4);
				String releaseDate=res.getString(5);
				
				System.out.println("ID :"+id);
				System.out.println("movieName :"+movieName);
				System.out.println("actorName :"+actorName);
				System.out.println("length :"+length);
				System.out.println("releaseDate :"+releaseDate);
				System.out.println("++++++++++++++++++++++++++++++++++++");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
