package com.xworkz.encapsulation.app;

public class NewsPaper {
	private String name;
	private int cost;
	private int pages;
	private String type;
	private String language;
	@Override
	public String toString() {
		System.out.println("Running toString in NewsPaper method");
		return "cost= "+this.cost +" "+"Type of newspaper= "+this.type +" "+"Name of newspaper= "+this.name +" "+"pages = "+this.pages +" "+"Language= "+this.language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
