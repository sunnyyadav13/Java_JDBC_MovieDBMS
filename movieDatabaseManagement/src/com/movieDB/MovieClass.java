package com.movieDB;

public class MovieClass {
	private int id;
	private String movieName;
	private String actorName;
	private String length;
	private String releaseDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public MovieClass(String movieName, String actorName, String length, String releaseDate) {
		
		this.movieName = movieName;
		this.actorName = actorName;
		this.length = length;
		this.releaseDate = releaseDate;
	}
	
	public MovieClass() {
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "MovieClass [movieName=" + movieName + ", actorName=" + actorName + ", length=" + length
				+ ", releaseDate=" + releaseDate + "]";
	}
	
	
	
	
	
	
	
	

}
