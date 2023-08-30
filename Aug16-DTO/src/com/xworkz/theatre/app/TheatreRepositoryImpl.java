package com.xworkz.theatre.app;

public class TheatreRepositoryImpl implements TheatreRepository {
	private TheatreDTO[] theatres = new TheatreDTO[TOTAL_THEATRES];
	private int index = 0;

	@Override
	public void save(TheatreDTO theatreDto) {
		if (index < TOTAL_THEATRES) {
			this.theatres[index] = theatreDto;
			index++;
		} else {
			System.err.println("Index is not found");
		}

	}

	@Override
	public TheatreDTO findByMovie(String movie) {
		for (int i = 0; i < index; i++) {
			if (theatres[i].getMovie() == movie) {
				System.out.println("Movie name found");
				return theatres[i];
			}
			System.out.println("Index is not matching,moving to next index");
		}
		System.out.println("Movie name not found");
		return null;
	}

	@Override
	public TheatreDTO findByTicketCost(int ticketCost) {
		for (int i = 0; i < index; i++) {
			if (theatres[i].getTicketCost() == ticketCost) {
				System.out.println("Movie ticket cost found");
				return theatres[i];
			}
			System.out.println("Index is not matching,moving to next index");
		}
		System.out.println("Movie ticket cost not found");
		return null;
	}

	@Override
	public TheatreDTO findByShows(int noOfShows) {
		for (int i = 0; i < index; i++) {
			if (theatres[i].getNoOfShows() == noOfShows) {
				System.out.println("No of shows cost found");
				return theatres[i];
			}
			System.out.println("Index is not matching,moving to next index");
		}
		System.out.println("No of shows not found");
		return null;
	}

	@Override
	public TheatreDTO[] saveAll() {
		return theatres;
	}

}
