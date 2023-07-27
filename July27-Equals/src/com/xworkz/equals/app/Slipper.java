package com.xworkz.equals.app;

public class Slipper {
	private String brandName;
	private int price;
	private int size;
	private String gender;
	private String color;
	private String material;
	private String quality;

	public Slipper(String brandName, int price, int size, String gender, String color, String material,
			String quality) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.size = size;
		this.gender = gender;
		this.color = color;
		this.material = material;
		this.quality = quality;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Obj is not null");
			if (obj instanceof Slipper) {
				System.out.println(this);
				System.out.println(obj);
				Slipper ref = (Slipper) obj;
				if (this.brandName == ref.brandName && this.price == ref.price && this.size == ref.size
						&& this.gender == ref.gender && this.color == ref.color && this.material == ref.material
						&& this.quality == ref.quality) {
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
