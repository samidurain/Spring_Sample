package com.myspring.model;

public class Customer {

	private String firstname;
	private String lastname;

	public Customer () {
		
	}
	
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("First Name: ").append(firstname).append("Last Name: ").append(lastname);
		return sb.toString();
	}
}
