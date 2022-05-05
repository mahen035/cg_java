package com.training.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springrest.model.Person;
import com.training.springrest.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	//adding comment to demonstrate git merge:mahendra
	public List<Person> getListOfPersons(){
	
		List<Person> persons = (List<Person>)personRepository.findAll();
		return persons;
	}	
	
	public void addPerson(Person person) {
		personRepository.save(person);
	}

}
