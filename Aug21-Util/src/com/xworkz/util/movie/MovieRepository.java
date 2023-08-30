package com.xworkz.util.movie;

public interface MovieRepository {
	int TOATL_COUNT = 5;

	public void save(MovieDTO dto);

	public MovieDTO findByMovieName(String name);

	public MovieDTO findByNameAndNoOfHeros(String name, int noOfHeros);
}
