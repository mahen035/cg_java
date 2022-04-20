package com.training.movieapp.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.training.movieapp.model.Movie;

@RestController
public class MovieController {

	RestTemplate template = new RestTemplate();

	@GetMapping("/")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/show")
	public ModelAndView showMovies() {
		ModelAndView mav = new ModelAndView("movieList");

		ArrayList<Movie> moviesList = new ArrayList<>();

		Object entity = template.getForObject("http://localhost:9192/cinema", Object.class);

		Map<String, Map<String, Object>> movieMap = (Map<String, Map<String, Object>>) entity;

		Map<String, Object> movieList = movieMap.get("_embedded");

		ArrayList<Map<String, Object>> movies = (ArrayList<Map<String, Object>>) movieList.get("movies");

		Iterator<Map<String, Object>> iterator = movies.iterator();

		while (iterator.hasNext()) {

			Map<String, Object> myMovies = iterator.next();
			
			Movie m = new Movie();
			String name = (String) myMovies.get("movieName");
			String genre = (String) myMovies.get("genre");
			int year = (Integer) myMovies.get("year");
			int rating = (Integer) myMovies.get("rating");
			m.setMovieName(name);
			m.setRating(rating);
			m.setYear(year);
			m.setGenre(genre);
			moviesList.add(m);
		}

		mav.addObject("movies", moviesList);

		return mav;
	}

	@GetMapping("/addMovie")
	public ModelAndView addMovie() {
		ModelAndView mav = new ModelAndView("addMovie");
		return mav;
	}

	@PostMapping("/save")
	public void saveMovie(@ModelAttribute("movie") Movie movie) {
		template.postForLocation("http://localhost:8080/cinema", movie);
	}

}
