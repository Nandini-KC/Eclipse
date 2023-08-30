package com.xworkz.util.hospital;

public interface HospitalService {
	public boolean validate(HospitalDTO dto);
	
	public HospitalDTO findByHospitalName(String name);
	
	public HospitalDTO findByNameAndNoOfDoctors(String name, int numOfDoc);
}
