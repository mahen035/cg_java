package com.training.movieapp.controller;

public class Student {
	
	private int studId;
	private String firstName;
	private String lastName;
	
	public Student() {}

	public Student(int studId, String firstName, String lastName) {
		super();
		this.studId = studId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
