package com.xworkz.util.movie;

public interface MovieService {
	public boolean validate(MovieDTO dto);

	public MovieDTO findByMovieName(String name);

	public MovieDTO findByNameAndNoOfHeros(String name, int noOfHeros);
}
