package com.xworkz.Task;

public class TheatreRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre=new Theatre("Gopalan theatre");
		theatre.movieName="Baby";
		theatre.typeOfTheatre(TheatreType.NON_AC);
		theatre.display();
		Theatre theatre1=new Theatre("Inox theatre");
		theatre1.movieName="RRR";
		theatre1.typeOfTheatre(TheatreType.AC);
		theatre1.display();
	}

}
