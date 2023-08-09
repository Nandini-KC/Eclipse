package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.implementation.JohnsonElevators;
import com.xworkz.abstraction.user.JoshElevator;
import com.xworkz.anstraction.rule.Elevator;

public class ElevatorRunner {

	public static void main(String[] args) {
		Elevator elevator=new JohnsonElevators();
		elevator.capacity();
		
		JoshElevator josh=new JoshElevator(null);
		josh.carryLagguage();

	}

}
