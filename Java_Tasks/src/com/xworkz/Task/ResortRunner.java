package com.xworkz.Task;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resort resort=new Resort("kovalam resort");
		resort.food("Idly-Chicken");
		resort.roomType=TypeOfResort.Adventure_Resorts;
		resort.display();
		Resort resort1=new Resort("Green woods resort");
		resort1.food("Dosa-Mutton");
		resort1.roomType=TypeOfResort.Beach_Resorts;
		resort1.display();
	}

}
