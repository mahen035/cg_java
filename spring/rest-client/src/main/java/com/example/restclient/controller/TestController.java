package com.example.restclient.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
	@GetMapping("/getStud")
	public List<String> getStudent() {
		RestTemplate restTemplate = new RestTemplate();
		/*
		 * StudentList response = restTemplate.getForObject(
		 * "http://localhost:8085/students", StudentList.class); List<Student> students
		 * = response.getStudList(); for(Student s:students) {
		 * System.out.println(s.getFirst_name()); }
		 */
		
		ResponseEntity<Student[]> responseEntity = 
			    restTemplate.getForEntity("http://localhost:8085/students", Student[].class); 
				Student[] userArray = responseEntity.getBody();
			  return Arrays.stream(userArray) 
			    .map(Student::getFirst_name) 
			    .collect(Collectors.toList());
	}

}
