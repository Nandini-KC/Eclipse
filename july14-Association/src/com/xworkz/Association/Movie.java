package com.xworkz.Association;

public class Movie {
		String movieName;
		int ticketPrice=500;
		String theatreName;
		String heroName;
		Director ref=new Director("Sekhar kammula",50,2099000);
		Director ref1=new Director("S.S.Rajamouli",55,7859000);
		Movie(String movieName)
		{
			System.out.println("Running parameter const");
			this.movieName=movieName;
		}
		void setTheatre(String theatreName)
		{
			System.out.println("Running instance method");
			this.theatreName=theatreName;
		}
		void printInfo()
		{
			System.out.println("print all the variables");
			System.out.println("Movie Name="+this.movieName);
			System.out.println("Ticket price="+this.ticketPrice);
			System.out.println("Theatre Name="+this.theatreName);
			System.out.println("Hero Name="+this.heroName);
			this.ref.printDirectorInfo();
			this.ref1.printDirectorInfo();
		}
}
