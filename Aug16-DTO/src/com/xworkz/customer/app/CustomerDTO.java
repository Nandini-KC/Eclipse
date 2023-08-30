package com.xworkz.customer.app;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private String name;
	private String email;
	private String location;
	private boolean married;

	@Override
	public String toString() {

		return "Name=" + this.name + " " + "Email=" + this.email + " " + "Location=" + this.location + " " + "Married="
				+ this.married;
	}

	public CustomerDTO(String name, String email, String location, boolean married) {
		super();
		this.name = name;
		this.email = email;
		this.location = location;
		this.married = married;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getLocation() {
		return location;
	}

	public boolean isMarried() {
		return married;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

}
