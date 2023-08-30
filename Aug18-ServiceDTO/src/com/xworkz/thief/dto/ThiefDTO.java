package com.xworkz.thief.dto;

import java.io.Serializable;

public class ThiefDTO implements Serializable{
	private String Specialization;
	private int experience;
	private int age;
	private String gangName;
	private int totalCases;
	public ThiefDTO(String specialization, int experience, int age, String gangName, int totalCases) {
		super();
		Specialization = specialization;
		this.experience = experience;
		this.age = age;
		this.gangName = gangName;
		this.totalCases = totalCases;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public int getExperience() {
		return experience;
	}
	public int getAge() {
		return age;
	}
	public String getGangName() {
		return gangName;
	}
	public int getTotalCases() {
		return totalCases;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGangName(String gangName) {
		this.gangName = gangName;
	}
	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}
	

}
