package com.xworkz.Association;

public class Director {
	String directorName;
	int directorAge;
	int movieBudget;
	Director(String directorName,int directorAge,int movieBudget)
	{
		this.directorName=directorName;
		this.directorAge=directorAge;
		this.movieBudget=movieBudget;
	}
	void printDirectorInfo()
	{
		System.out.println("Director Name="+this.directorName);
		System.out.println("Director Age="+this.directorAge);
		System.out.println("Movie budget="+this.movieBudget);
	}
}
