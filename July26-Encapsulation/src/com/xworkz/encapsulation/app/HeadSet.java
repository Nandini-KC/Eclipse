package com.xworkz.encapsulation.app;

public class HeadSet {
	private String brandName;
	private int cost;
	private String color;
	private int length;
	private String type;
	@Override
	public String toString() {
		System.out.println("Running toString in headset method");
		return "cost= "+this.cost +" "+"Type of headset= "+this.type +" "+"Color of headset= "+this.color +" "+"Brand name= "+this.brandName +" "+"length= "+this.length;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
