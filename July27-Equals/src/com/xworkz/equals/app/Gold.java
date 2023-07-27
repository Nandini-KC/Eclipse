package com.xworkz.equals.app;

public class Gold {
	private int cost;
	private String design;
	private String shop;
	private String location;

	public Gold(int cost, String design, String shop, String location) {
		super();
		this.cost = cost;
		this.design = design;
		this.shop = shop;
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Gold) {
				System.out.println(this);
				System.out.println(obj);
				Gold gold = (Gold) obj;
				if (this.cost == gold.cost && this.design == gold.design && this.shop == gold.shop
						&& this.location == gold.location) {
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
