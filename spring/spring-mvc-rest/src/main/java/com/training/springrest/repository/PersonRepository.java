package com.training.springrest.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springrest.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
