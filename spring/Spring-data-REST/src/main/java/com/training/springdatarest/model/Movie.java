package com.training.springdatarest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOVIES1")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "movie_name")
	private String movieName;
	@Column(name = "year")
	private int year;
	@Column(name = "rating")
	private int rating;
	@Column(name = "genre")
	private String genre;
	
	public Movie() {}

	public Movie(String movieName, int year, int rating, String genre) {
		super();
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
