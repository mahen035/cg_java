package com.training.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.training.springdatarest.model.Movie;

@RepositoryRestResource(path="cinema")
public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
}
