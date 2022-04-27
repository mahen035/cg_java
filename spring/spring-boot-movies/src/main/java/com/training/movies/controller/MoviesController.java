package com.training.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.movies.model.Movies;
import com.training.movies.repository.MoviesRepository;
import com.training.movies.service.MoviesService;


//mkumar: Adding comment
//mkumar5:commenting to demonstrate git merge
@Controller
public class MoviesController {

	@Autowired
	JdbcTemplate jdbctemplate;
	
	@Autowired
	MoviesRepository repository;
	
	@Autowired
	MoviesService moviesservice;
		 
	@RequestMapping("/view-movies")
	public String showMovieList(ModelMap model) {
		model.addAttribute("movies",moviesservice.findAll());
		return "viewmovies";
	}
	
	@RequestMapping("/add-movie")
	public String addMoviesPage(ModelMap model) {
		model.addAttribute("command", new Movies());
		return "addmovie";
	}
	
		
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String addMovies(@ModelAttribute("movies") Movies movies) {
		moviesservice.saveMovie(movies);
		return "redirect:/view-movies";
	}
	
	@RequestMapping(value = "/delete/{id}")
	public String deleteMovie(@PathVariable int id) {
		moviesservice.deleteById(id);
		return "redirect:/view-movies";
	}
			  
}
