package com.xworkz.util.hospital;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HospitalDTO implements Serializable{
	private String hospitalName;
	private String hospitalAddress;
	private int noOfWards;
	private int noOfDoctors;
}
