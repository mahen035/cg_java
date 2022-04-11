package com.training.spring.bean;

import org.springframework.beans.factory.annotation.Required;

public class Car {
	
	private String make;
	private String model;
	
	
	private int year;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	
	@Required
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getCarDetails() {
		return this.make +" "+ this.model;
				
	}

}
