package com.xwrokz.equals.runner;

import com.xworkz.equals.app.*;

public class AssetRunner {

	public static void main(String[] args) {
		System.out.println("Running main in AssetRunner");
		Assets ref = new Assets(1, "Land", 10000);
		Assets ref1 = new Assets(2, "Land", 220000);
		System.out.println(ref.equals(ref1));
	}

}
