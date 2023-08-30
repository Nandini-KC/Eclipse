package com.xworkz.util.movie;

public class MovieServiceImpl implements MovieService {
	MovieRepository movieRepository = new MovieRepositoryImpl();

	@Override
	public boolean validate(MovieDTO dto) {
		if (dto != null) {
			System.out.println("Value is not null can save");
			String name = dto.getMovieName();
			String actor = dto.getActorName();
			String actress = dto.getActressName();
			int heros = dto.getNoOfHeros();
			if (ValidateUtil.validateString(name)) {
				System.out.println("Movie name " + name + "is valid ");
			} else {
				System.out.println("Movie name is " + name + "is not valid");
				return false;
			}
			if (ValidateUtil.validateNumber(heros)) {
				System.out.println("No of heors " + heros + "is valid");
			} else {
				System.out.println("No of heors " + heros + " is not valid");
				return false;
			}
			if (ValidateUtil.validateString(actor)) {
				System.out.println("Actor name " + actor + "is valid ");
			} else {
				System.out.println("Actor name is " + actor + "is not valid");
				return false;
			}
			if (ValidateUtil.validateString(actress)) {
				System.out.println("actress name " + actress + "is valid ");
			} else {
				System.out.println("actress name is " + actress + "is not valid");
				return false;
			}
			movieRepository.save(dto);
			return true;
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public MovieDTO findByMovieName(String name) {
		boolean isExist = ValidateUtil.validateString(name);
		if (isExist) {
			System.out.println("Movie name is valid input");
			MovieDTO isFound = movieRepository.findByMovieName(name);
			return isFound;

		}
		System.err.println("Movie Name is invalid input ");
		return null;
	}

	@Override
	public MovieDTO findByNameAndNoOfHeros(String name, int noOfHeros) {
		boolean isExist = ValidateUtil.validateString(name);
		boolean isExist1 = ValidateUtil.validateNumber(noOfHeros);
		if (isExist && isExist1) {
			System.out.println("Movie name and no of heros is valid input");
			MovieDTO isFound = movieRepository.findByNameAndNoOfHeros(name, noOfHeros);
			return isFound;

		}
		System.err.println("Movie Name and no of heros  is invalid input ");
		return null;
	}

}
