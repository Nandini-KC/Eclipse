package com.xworkz.Task;

public class TempleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temple temple=new Temple(TempleName.Thirumala);
		temple.godName="Venkateswara swamy";
		temple.time(5);
		temple.display();
		
		Temple temple1=new Temple(TempleName.Kanipakam);
		temple1.godName="Vinayaka Swamy";
		temple1.time(4);
		temple1.display();
		
	}

}
