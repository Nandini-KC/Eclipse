package com.xworkz.abstraction.implementation;


import com.xworkz.anstraction.rule.Elevator;

public class JohnsonElevators implements Elevator{

	@Override
	public int capacity() {
		System.out.println("Invoking capacity in JohnsonElevators");
		return 0;
	}

}
