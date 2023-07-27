package com.xworkz.equals.app;

public class Assets {
	private int noOfAssets;
	private String assetName;
	private int cost;

	public Assets(int noOfAssets, String assetName, int cost) {
		super();
		this.noOfAssets = noOfAssets;
		this.assetName = assetName;
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Assets) {
				System.out.println(this);
				System.out.println(obj);
				Assets asset = (Assets) obj;
				if (this.noOfAssets == asset.noOfAssets && this.assetName == asset.assetName
						&& this.cost == asset.cost) {
					System.out.println("Both are equal");
					return true;
				} else {
					System.err.println("Both are not same");
				}

			} else {
				System.err.println("Object is not instance of Asset");
			}
		} else {
			System.err.println("object is null");
		}
		return false;
	}
}
