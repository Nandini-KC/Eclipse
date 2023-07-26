package com.xworkz.encapsulation.app;

public class Dosa {
	private int price;
	private String type;
	private int noOfDosa;
	private String shopName;
	private String combination;
	
	@Override
	public String toString() {
		System.out.println("Running toString in Dosa method");
		return "price= "+this.price +" "+"Type of Dosa= "+this.type +" "+"No of dosa= "+this.noOfDosa +" "+"Shop name= "+this.shopName +" "+"Combination for Dosa= "+this.combination;
		
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfDosa() {
		return noOfDosa;
	}
	public void setNoOfDosa(int noOfDosa) {
		this.noOfDosa = noOfDosa;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCombination() {
		return combination;
	}
	public void setCombination(String combination) {
		this.combination = combination;
	}
	
}
