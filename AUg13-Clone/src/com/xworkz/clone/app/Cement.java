package com.xworkz.clone.app;

public class Cement {
	private int price;
	private String brand;
	private double weight;
	private String brandAmbassador;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getBrandAmbassador() {
		return brandAmbassador;
	}
	public void setBrandAmbassador(String brandAmbassador) {
		this.brandAmbassador = brandAmbassador;
	}
	@Override
	public String toString() {
		
		return "price="+this.price+"Brand="+this.brand+"Weight="+this.weight+"Brand Ambassador="+this.brandAmbassador;
	}
	
}
