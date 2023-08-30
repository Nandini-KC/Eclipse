package com.xworkz.minister.dto;

import java.io.Serializable;

public class MinisterDTO implements Serializable{
	private String name;
	private int experience;
	private String designation;
	private String partyName;
	public MinisterDTO(String name, int experience, String designation, String partyName) {
		super();
		this.name = name;
		this.experience = experience;
		this.designation = designation;
		this.partyName = partyName;
	}
	public String getName() {
		return name;
	}
	public int getExperience() {
		return experience;
	}
	public String getDesignation() {
		return designation;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	
}
