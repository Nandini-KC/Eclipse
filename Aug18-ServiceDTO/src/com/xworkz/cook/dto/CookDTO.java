package com.xworkz.cook.dto;

import java.io.Serializable;

public class CookDTO implements Serializable{
	private String specialization;
	private String hotelName;
	private String gender;
	private int salary;
	public CookDTO(String specialization, String hotelName, String gender, int salary) {
		super();
		this.specialization = specialization;
		this.hotelName = hotelName;
		this.gender = gender;
		this.salary = salary;
	}
	public String getSpecialization() {
		return specialization;
	}
	public String getHotelName() {
		return hotelName;
	}
	public String getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
