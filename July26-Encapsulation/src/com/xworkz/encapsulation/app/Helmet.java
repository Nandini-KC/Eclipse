package com.xworkz.encapsulation.app;

public class Helmet {
	private String brand;
	private int cost;
	private String size;
	private String gender;
	private String color;
	@Override
	public String toString() {
		System.out.println("Running toString in Helmet");
		return "Brand of helmet= "+this.brand +" "+"cost of helmet= "+this.cost +" "+"size of helmet= "+this.size +" "+"gender= "+this.gender +" "+"color of helmet"+this.color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
