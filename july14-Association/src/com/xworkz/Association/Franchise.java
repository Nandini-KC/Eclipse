package com.xworkz.Association;

public class Franchise {
	String sponser;
	String hostCompany;
	String highestPaidPlayer;
	Franchise(String sponser,String hostCompany,String highestPaidPlayer)
	{
		this.sponser=sponser;
		this.hostCompany=hostCompany;
		this.highestPaidPlayer=highestPaidPlayer;
	}
	void printFranchiseInfo()
	{
		System.out.println("Sponser="+this.sponser);
		System.out.println("Host company="+this.hostCompany);
		System.out.println("Highest paid player="+this.highestPaidPlayer);
	}
}
