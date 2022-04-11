package com.training.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	@Autowired
	private Car car;
	
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
	public int getAge() {
		return age;
	}
	
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getdetails() {
		return car.getCarDetails();
	}

}
