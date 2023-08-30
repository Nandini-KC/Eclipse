package com.xworkz.util.movie;

public class MovieRepositoryImpl implements MovieRepository {
	private MovieDTO[] movies = new MovieDTO[TOATL_COUNT];
	int index = 0;

	@Override
	public void save(MovieDTO dto) {
		if (index < TOATL_COUNT) {
			this.movies[index] = dto;
			System.out.println(dto + "Data is stored at index : " + index);
			index++;
		} else {
			System.out.println("Index not found ");
		}

	}

	@Override
	public MovieDTO findByMovieName(String name) {
		for (int i = 0; i < index; i++) {
			if (movies[i].getMovieName().equalsIgnoreCase(name)) {
				System.out.println("Movie Name " + name + "at index " + i);
				System.out.println("Movie name found at : " + movies[i]);
				return movies[i];
			}
			System.out.println("Checking for next index ");
		}
		System.out.println("Movie name not found");
		return null;
	}

	@Override
	public MovieDTO findByNameAndNoOfHeros(String name, int noOfHeros) {
		for (int i = 0; i < index; i++) {
			if (movies[i].getMovieName().equalsIgnoreCase(name) && movies[i].getNoOfHeros() == noOfHeros) {
				System.out.println("Movie name and no of heros found at index " + i);
				System.out.println("Movie name found at : " + movies[i]);
				return movies[i];
			}
			System.out.println("Data not found at index " + i + "checking for next index");
		}
		System.out.println("Movie name not found");
		return null;
	}

}
