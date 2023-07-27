package com.xworkz.equals.app;

public class DryFruit {
	private int typesOfDryFruits;
	private String name;
	private int quantity;
	private String shopName;
	private String brandNAme;
	private String expireDate;

	public DryFruit(int typesOfDryFruits, String name, int quantity, String shopName, String brandNAme,
			String expireDate) {
		super();
		this.typesOfDryFruits = typesOfDryFruits;
		this.name = name;
		this.quantity = quantity;
		this.shopName = shopName;
		this.brandNAme = brandNAme;
		this.expireDate = expireDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Obj is not null");
			if (obj instanceof DryFruit) {
				System.out.println(this);
				System.out.println(obj);
				DryFruit ref = (DryFruit) obj;
				if (this.typesOfDryFruits == ref.typesOfDryFruits && this.shopName == ref.shopName
						&& this.name == ref.name && this.quantity == ref.quantity && this.brandNAme == ref.brandNAme
						&& this.expireDate == ref.expireDate) {
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
