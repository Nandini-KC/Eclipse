package com.xworkz.util.movie;

public class MovieDTORunner {

	public static void main(String[] args) {
		MovieDTO dto1 = new MovieDTO("Baby", "Anand", 2, "Vaishu");
		MovieDTO dto2 = new MovieDTO("Jailer", "Rajani", 3, "Ramya");
		MovieService service = new MovieServiceImpl();
		boolean result = service.validate(dto1);
		if (result) {
			System.out.println("Input saved " + result);
		} else {
			System.err.println("Input not saved " + result);
		}
		System.out.println("...........");

		boolean result1 = service.validate(dto2);
		if (result1) {
			System.out.println("Input saved " + result1);
		} else {
			System.err.println("Input not saved " + result1);
		}
		System.out.println("...........");
		service.findByMovieName("jailer");
		System.out.println("...........");
		service.findByNameAndNoOfHeros("baby", 2);
	}

}
