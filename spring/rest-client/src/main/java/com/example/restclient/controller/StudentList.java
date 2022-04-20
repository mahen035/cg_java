package com.example.restclient.controller;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	
	private List<Student> studList;
	
	public StudentList() {
		studList = new ArrayList<>();
    }

	public StudentList(List<Student> studList) {
		super();
		this.studList = studList;
	}

	public List<Student> getStudList() {
		return studList;
	}

	public void setStudList(List<Student> studList) {
		this.studList = studList;
	}

}
