package com.training.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.movies.model.Movies;
import com.training.movies.repository.MoviesRepository;

@Service
public class MoviesService {
	
	@Autowired
	private MoviesRepository moviesrepository;
	
	public List<Movies> findAll(){
		return moviesrepository.findAll();
	}
	
	public void saveMovie(Movies movies) {
		moviesrepository.save(movies);
	}
	
	/*
	 * public void addMovie(String movieName, int year, double rating, String
	 * category) { moviesrepository.save(new
	 * Movies(movieName,year,rating,category)); }
	 */
	/*public Movies updateMovie(int id,String name,int year,double rating,String category) {
		Movies upMovie = moviesrepository.findById(id);
	}*/
	
	public void deleteById(int id) {
		moviesrepository.deleteById(id);
	}
	
}
