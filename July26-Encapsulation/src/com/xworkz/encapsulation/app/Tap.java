package com.xworkz.encapsulation.app;

public class Tap {
	private String color;
	private int price;
	private String brand;
	private String type;
	private String material;
	@Override
	public String toString() {
		System.out.println("Running toString in Tap method");
		return "price= "+this.price +" "+"Type of tap= "+this.type +" "+"Color of tap= "+this.color +" "+"Brand name= "+this.brand +" "+"Material= "+this.material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}
