package com.xworkz.util.hospital;

public interface HospitalRepository {
	int TOTAL_COUNT=5;
	
	public void save(HospitalDTO dto);
	
	public HospitalDTO findByHospitalName(String name);
	
	public HospitalDTO findByNameAndNoOfDoctors(String name, int numOfDoc);
}
