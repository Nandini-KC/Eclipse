package com.xwrokz.equals.runner;

import com.xworkz.equals.app.*;

public class GoldRunner {

	public static void main(String[] args) {
		System.out.println("Running main in GoldRunner");
		Gold ref = new Gold(5500, "Latest", "Joyalukas", "Thirupathi");
		Gold ref1 = new Gold(5500, "Latest", "Joyalukas", "Thirupathi");
		System.out.println(ref.equals(ref1));
	}

}
