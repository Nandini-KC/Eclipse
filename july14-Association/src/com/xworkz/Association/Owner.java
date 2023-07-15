package com.xworkz.Association;

public class Owner {
	String ownerName;
	int ownerAge;
	String ownerQualification;
	Owner(String ownerName,int ownerAge,String ownerQualification)
	{
		this.ownerName=ownerName;
		this.ownerAge=ownerAge;
		this.ownerQualification=ownerQualification;
	}
	void printOwnerInfo()
	{
		System.out.println("Owner name="+this.ownerName);
		System.out.println("Owner age="+this.ownerAge);
		System.out.println("Owner qualification="+this.ownerQualification);
	}
}
