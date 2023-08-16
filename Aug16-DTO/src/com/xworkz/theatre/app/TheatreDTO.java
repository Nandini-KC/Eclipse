package com.xworkz.theatre.app;

import java.io.Serializable;

public class TheatreDTO implements Serializable{
	private String theatreName;
	private int ticketCost;
	private String movie;
	private String location;
	private int noOfShows;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Theatre Name="+this.theatreName+" "+"Ticket Cost="+this.ticketCost+" "+"Movie Name="+this.movie+" "+"Location="+this.location+" "+"No of shows="+this.noOfShows;
	}
	public TheatreDTO(String theatreName, int ticketCost, String movie, String location, int noOfShows) {
		super();
		this.theatreName = theatreName;
		this.ticketCost = ticketCost;
		this.movie = movie;
		this.location = location;
		this.noOfShows = noOfShows;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public String getMovie() {
		return movie;
	}
	public String getLocation() {
		return location;
	}
	public int getNoOfShows() {
		return noOfShows;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}
	

}
