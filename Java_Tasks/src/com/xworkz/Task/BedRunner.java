package com.xworkz.Task;

public class BedRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bed ref=new Bed("Century");
		ref.bedCost(25000);
		ref.type=BedType.Spring_Bed;
		ref.display();
		
		Bed ref1=new Bed("wakefit");
		ref1.bedCost(30000);
		ref1.type=BedType.Air_mattress;
		ref1.display();
	}

}
