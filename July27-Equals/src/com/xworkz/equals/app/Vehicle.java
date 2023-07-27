package com.xworkz.equals.app;

public class Vehicle {
	private String typeOfVehicle;
	private int cost;
	private String location;
	private String companyName;
	private int noOfVehicles;

	public Vehicle(String typeOfVehicle, int cost, String location, String companyName, int noOfVehicles) {
		super();
		this.typeOfVehicle = typeOfVehicle;
		this.cost = cost;
		this.location = location;
		this.companyName = companyName;
		this.noOfVehicles = noOfVehicles;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Vehicle) {
				System.out.println(this);
				System.out.println(obj);
				Vehicle vehicle = (Vehicle) obj;
				if (this.cost == vehicle.cost && this.typeOfVehicle == vehicle.typeOfVehicle
						&& this.location == vehicle.location && this.companyName == vehicle.companyName
						&& this.noOfVehicles == vehicle.noOfVehicles) {
					System.out.println("Both are equal");
					return true;
				} else {
					System.err.println("Both are not equal");
				}
			} else {
				System.err.println("Object is not instance of Gold");
			}
		} else {
			System.err.println("Object is null");
		}
		return false;
	}
}
