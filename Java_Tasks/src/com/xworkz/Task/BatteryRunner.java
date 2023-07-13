package com.xworkz.Task;

public class BatteryRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery ref=new Battery("Genus");
		ref.batteryType(BatteryType.Carbon_Zinc);
		ref.price=20000;
		ref.display();
		
		Battery ref1=new Battery("Microtek");
		ref1.batteryType(BatteryType.Silver_Oxide);
		ref1.price=30000;
		ref1.display();
	}

}
