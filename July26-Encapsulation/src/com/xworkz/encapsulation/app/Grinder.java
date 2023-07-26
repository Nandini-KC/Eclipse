package com.xworkz.encapsulation.app;

public class Grinder {
	private int cost;
	private String companyName;
	private int capacity;
	private  String color;
	private String type;
	@Override
	public String toString() {
		System.out.println("Running toString in Grinder method");
		return "Cost of grinder="+this.cost+" "+"Comapany name= "+this.companyName+" "+"Capacity of grinder="
				+this.capacity+" "+"Color of grinder="+this.color+" "+"Type of grinder="+this.type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
