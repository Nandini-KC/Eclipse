package com.xworkz.isexist.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class CourtDTO implements Serializable{
	private String courtType;
	private String location;
	private int noOfCases;
	private int noOfLawyers;
	
	 
	
	
	

}
