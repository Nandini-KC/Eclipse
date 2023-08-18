package com.xworkz.theatre.app;

public interface TheatreRepository {
	int TOTAL_THEATRES=5;
	void save(TheatreDTO theatreDto);
	TheatreDTO findByMovie(String movie);
	TheatreDTO findByTicketCost(int ticketCost);
	TheatreDTO findByShows(int noOfShows);
	TheatreDTO[] saveAll();
}
