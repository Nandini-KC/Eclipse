package com.xworkz.market.app;

import java.io.Serializable;

public class MarketDTO implements Serializable {
	private String type;
	private String location;
	private int floors;
	private String owner;
	private boolean highPrices;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Type of market=" + this.type + " " + " Location= " + this.location + " " + "Floors=" + this.floors + " "
				+ "Owner of market=" + this.owner + " " + "High prices=" + this.highPrices;
	}

	public MarketDTO(String type, String location, int floors, String owner, boolean highPrices) {
		super();
		this.type = type;
		this.location = location;
		this.floors = floors;
		this.owner = owner;
		this.highPrices = highPrices;
	}

	public String getType() {
		return type;
	}

	public String getLocation() {
		return location;
	}

	public int getFloors() {
		return floors;
	}

	public String getOwner() {
		return owner;
	}

	public boolean isHighPrices() {
		return highPrices;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setHighPrices(boolean highPrices) {
		this.highPrices = highPrices;
	}

}
