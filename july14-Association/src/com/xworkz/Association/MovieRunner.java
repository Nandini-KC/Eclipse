package com.xworkz.Association;

public class MovieRunner {

	public static void main(String[] args) 
	{
		System.out.println("Running main method in MovieRunner");
		Movie movie=new Movie("Baby");
		movie.setTheatre("MSR theatre");
		movie.heroName="Allu Arjun";
		movie.printInfo();
		
		Movie movie1=new Movie("RRR");
		movie1.setTheatre("Gurunatha theatre");
		movie1.heroName="NTR";
		movie1.printInfo();

	}

}
