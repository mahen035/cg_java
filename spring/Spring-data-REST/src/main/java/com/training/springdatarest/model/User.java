package com.training.springdatarest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS4")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private long userId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="e_mail")
	private String eMail;
	
	public User() {}

	public User(String firstName, String lastName, String eMail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
	}

	// Getters and Setters
	public long getUserId() {return userId;}
	public void setUserId(long userId) {this.userId = userId;}
	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public String geteMail() {return eMail;}
	public void seteMail(String eMail) {this.eMail = eMail;}
	
	
	
}
