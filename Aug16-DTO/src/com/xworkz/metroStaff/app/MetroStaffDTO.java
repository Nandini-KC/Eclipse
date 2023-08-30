package com.xworkz.metroStaff.app;

import java.io.Serializable;

public class MetroStaffDTO implements Serializable {
	private String name;
	private int age;
	private String qualification;
	private int salary;

	@Override
	public String toString() {

		return "Name =" + this.name + " " + "Age=" + this.age + " " + "Qualification=" + this.qualification + " "
				+ "Salary=" + this.salary;
	}

	public MetroStaffDTO(String name, int age, String qualification, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getQualification() {
		return qualification;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
