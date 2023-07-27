package com.xworkz.equals.app;

public class Grocery {
	private String itemName;
	private String shopName;

	public Grocery(String itemName, String shopName) {
		super();
		this.itemName = itemName;
		this.shopName = shopName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Obj is not null");
			if (obj instanceof Grocery) {
				System.out.println(this);
				System.out.println(obj);
				Grocery ref = (Grocery) obj;
				if (this.itemName == ref.itemName && this.shopName == ref.shopName) {
					System.out.println("Both are same");
					return true;
				} else {
					System.err.println("Both are  not same");
				}
			} else {
				System.err.println("it is obj not instance of grocery");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}
}
