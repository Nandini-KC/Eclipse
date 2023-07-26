package com.xworkz.encapsulation.app;

public class Satellite {
	private int typesOfSatellite;
	private boolean useful;
	private String movesAround;
	private double noOfSatellites;
	private String firstSatelliteOfIndia;
	@Override
	public String toString() {
		System.out.println("Running toString method in Satellite");
		return "TypesOfSatellite="+this.typesOfSatellite+" "+"Useful="+this.useful+" "+"Moves Around="+this.movesAround+" "+"No of satellites="+this.noOfSatellites+" "+"First SatelliteOfIndia="+this.firstSatelliteOfIndia;
	}
	public int getTypesOfSatellite() {
		return typesOfSatellite;
	}
	public void setTypesOfSatellite(int typesOfSatellite) {
		this.typesOfSatellite = typesOfSatellite;
	}
	public boolean getUseful() {
		return useful;

	}
	public void setUseful(boolean useful) {
		this.useful = useful;
	}
	public String getMovesAround() {
		return movesAround;
	}
	public void setMovesAround(String movesAround) {
		this.movesAround = movesAround;
	}
	public double getNoOfSatellites() {
		return noOfSatellites;
	}
	public void setNoOfSatellites(double noOfSatellites) {
		this.noOfSatellites = noOfSatellites;
	}
	public String getFirstSatelliteOfIndia() {
		return firstSatelliteOfIndia;
	}
	public void setFirstSatelliteOfIndia(String firstSatelliteOfIndia) {
		this.firstSatelliteOfIndia = firstSatelliteOfIndia;
	}
	
}
