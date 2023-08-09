package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.implementation.SamsungWashingMachine;
import com.xworkz.abstraction.user.AyushmannWashingMachine;
import com.xworkz.anstraction.rule.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		WashingMachine machine=new SamsungWashingMachine();
		machine.dry();
		machine.wash(5);
		
		AyushmannWashingMachine ayush=new AyushmannWashingMachine(machine);
		ayush.removeDirt();

	}

}
