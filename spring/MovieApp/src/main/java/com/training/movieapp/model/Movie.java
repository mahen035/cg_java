package com.training.movieapp.model;


public class Movie{

	private int id;
	private String movieName;
	private int year;
	private int rating;
	private String genre;

	public Movie() {
		
	}

	public Movie(int id,String movieName, int year, int rating, String genre) {
		this.id = id;
		this.movieName = movieName;
		this.year = year;
		this.rating = rating;
		this.genre = genre;
	}

	// Getters and Setters
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getMovieName() {return movieName;}
	public void setMovieName(String movieName) {this.movieName = movieName;}
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
	public int getRating() {return rating;}
	public void setRating(int rating) {this.rating = rating;}
	public String getGenre() {return genre;}
	public void setGenre(String genre) {this.genre = genre;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
