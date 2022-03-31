package com.movieDB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidAlgorithmParameterException;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Option 1 --> ADD detail");
			System.out.println("Option 2 --> DELETE detail");
			System.out.println("Option 3 --> Show detail");
			System.out.println("Option 4 --> EXIT");
			
			System.out.println("\n Insert Option number ");
			int option=Integer.parseInt(br.readLine());
			
			if (option==1) {
				System.out.println("Enter Movie Name :");
				String movieName=br.readLine();
				System.out.println("Enter Actor Name :");
				String actorName=br.readLine();
				System.out.println("Enter Length :");
				String length=br.readLine();
				System.out.println("Enter Release Date :");
				String releaseDate=br.readLine();
				
				MovieClass mc= new MovieClass(movieName,actorName,length,releaseDate);
				
				boolean ans= movieDow.insertIntoDB(mc);
				
				if(ans) {
					System.out.println("Added Succesfull");
				}
				else{
					System.out.println("Detail Addition process Failed");
				}
				
				}
			else if (option==2) {
				System.out.println("Enter id Number to delete");
				int id=Integer.parseInt(br.readLine());
				
				movieDow.deleteMovie(id);
				
				
			}
			else if (option==3) {
				System.out.println("Show Details inside table");
				
				movieDow.showAllMovie();
			}
			else if (option==4) {
				System.out.println("EXIT BYE BYE......");
				break;
			}
			else{
				System.out.println("Invalid Option Try to");
			}
			
			
		}

	}

}
