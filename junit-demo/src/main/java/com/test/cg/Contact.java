package com.test.cg;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String phone;
	
	public Contact(String firstName, String lastName, String phone) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void validateFirstName() {
		if(this.firstName == null) {
			throw new RuntimeException("First name cannot be empty");
		}
	}
	
	public void validateLastName() {
		if(this.lastName == null || this.lastName.equals("")) {
			throw new RuntimeException("Last name cannot be empty");
		}
	}
	
	public void validatePhone() {
		
		if(this.phone.length() != 10) {
			throw new RuntimeException("Phone Number should be of 10 digits");
		}
		
		if(this.phone.startsWith("0")) {
			throw new RuntimeException("Phone Number should not start with 0");
		}
	}

}
