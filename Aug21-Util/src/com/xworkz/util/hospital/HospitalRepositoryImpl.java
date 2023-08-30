package com.xworkz.util.hospital;

public class HospitalRepositoryImpl implements HospitalRepository{

	private HospitalDTO[] dtos = new HospitalDTO[TOTAL_COUNT];
	private int index = 0;
	
	@Override
	public void save(HospitalDTO dto) {
		if(index<TOTAL_COUNT) {
			this.dtos[index] = dto;
			System.out.println( dto+"Data is stored at index :" + index);
			this.index++;
		}
		else {
			System.err.println("Index limit exceeded, cannot save more " );
		}
		
	}

	@Override
	public HospitalDTO findByHospitalName(String name) {
		for(int pos=0; pos<index; pos++) {
			if(dtos[pos].getHospitalName().equalsIgnoreCase(name)) {
				System.out.println("Hospital Name '"+ name + "' matched at index " + pos);
				System.out.println("Data found is :" + dtos[pos]);
				return dtos[pos];
			}
			System.out.println("Hospital Name not found at index "+ pos + " Checking the next index");
		}
		System.err.println("Hospital Name not found");
		return null;
	}

	@Override
	public HospitalDTO findByNameAndNoOfDoctors(String name, int numOfDoc) {
		for(int pos=0; pos<index; pos++) {
			if(dtos[pos].getHospitalName().equalsIgnoreCase(name) && dtos[pos].getNoOfDoctors() == numOfDoc) {
			System.out.println("Data  matched at index " + pos);
			System.out.println("Data is " + dtos[pos]);
				return dtos[pos];
			}
			System.out.println("Data not matched at index " + pos + " Checking the next index");
		}
		System.err.println("Data not found");
		return null;
	}

}
