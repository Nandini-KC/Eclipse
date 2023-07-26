package com.xworkz.encapsulation.runner;
import com.xworkz.encapsulation.app.*;
public class SatelliteRunner {

	public static void main(String[] args) {
		Satellite satellite=new Satellite();
		System.out.println(satellite);
		
		satellite.setMovesAround("Sun");
		satellite.setNoOfSatellites(8261);
		satellite.setTypesOfSatellite(4);
		satellite.setUseful(true);
		satellite.setFirstSatelliteOfIndia("Aryabatta");
		System.out.println(satellite);

	}

}
