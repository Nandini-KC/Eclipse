package com.xworkz.Task;

public class Resort {
	String name;
	String ownerName="Jack";
	TypeOfResort  roomType;
	 String breakFast;
	 Resort(String name)
	 {
		 System.out.println("Invoking parameter constructor");
		 this.name=name;
	 }
	 void food(String breakFast)
	 {
		 this.breakFast=breakFast;
	 }
	 void display()
	 {
		 System.out.println("Resort name="+this.name);
		 System.out.println("Owner name="+this.ownerName);
		 System.out.println("Type of room="+this.roomType);
		 System.out.println("Breakfast name="+this.breakFast);
	 }
}
