package com.xworkz.encapsulation.app;

public class Mixture {
	private String type;
	private String brand;
	private double quantity;
	private String color;
	private boolean fresh;
	@Override
	public String toString() {
		System.out.println("Running toString in mixture method");
		return "Type of mixture= "+this.type +" "+"Brand= "+this.brand +" "+"Quantity of mixture= "+this.quantity +" "+"color = "+this.color +" "+"fresh or not= "+this.fresh;
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
}
