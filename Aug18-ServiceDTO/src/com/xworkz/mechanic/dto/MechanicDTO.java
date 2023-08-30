package com.xworkz.mechanic.dto;

import java.io.Serializable;

public class MechanicDTO implements Serializable{
	private String garagename;
	private int gstNo;
	private String specialization;
	private int bikeServiceCost;
	public MechanicDTO(String garagename, int gstNo, String specialization, int bikeServiceCost) {
		super();
		this.garagename = garagename;
		this.gstNo = gstNo;
		this.specialization = specialization;
		this.bikeServiceCost = bikeServiceCost;
	}
	public String getGaragename() {
		return garagename;
	}
	public int getGstNo() {
		return gstNo;
	}
	public String getSpecialization() {
		return specialization;
	}
	public int getBikeServiceCost() {
		return bikeServiceCost;
	}
	public void setGaragename(String garagename) {
		this.garagename = garagename;
	}
	public void setGstNo(int gstNo) {
		this.gstNo = gstNo;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public void setBikeServiceCost(int bikeServiceCost) {
		this.bikeServiceCost = bikeServiceCost;
	}
	

}
