package com.xworkz.ceo.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString

public class CeoDTO implements Serializable{
	private String name;
	private String companyName;
	private int salary;
	private int experience;
	public CeoDTO(String name, String companyName, int salary, int experience) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.salary = salary;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public int getSalary() {
		return salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	

}
