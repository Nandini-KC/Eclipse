package com.xworkz.encapsulation.app;

public class Calculator {
	private String companyName;
	private int cost;
	private String type;
	private boolean calculatorApp;
	private boolean onlineCalculator;
	
	@Override
	public String toString() {
		System.out.println("Running toString method in Calculator");
		return "Company Name="+this.companyName+" "+"Cost ="+this.cost+" "+"Type of calculator="+this.type+" "
				+"Calculator app available="+this.calculatorApp+" "+"Online calculator is there="+this.onlineCalculator;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getCalculatorApp() {
		return calculatorApp;
	}
	public void setCalculatorApp(boolean calculatorApp) {
		this.calculatorApp = calculatorApp;
	}
	public boolean getOnlineCalculator() {
		return onlineCalculator;
	}
	public void setOnlineCalculator(boolean onlineCalculator) {
		this.onlineCalculator = onlineCalculator;
	}
	
}
