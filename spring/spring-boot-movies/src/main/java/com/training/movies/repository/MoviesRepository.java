package com.training.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.movies.model.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies,Integer> {

}
