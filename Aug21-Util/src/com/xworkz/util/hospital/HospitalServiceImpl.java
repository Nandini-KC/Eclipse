package com.xworkz.util.hospital;

public class HospitalServiceImpl implements HospitalService{
	HospitalRepository hospitalRepository  = new  HospitalRepositoryImpl();


	@Override
	public boolean validate(HospitalDTO dto) {
		if(dto!=null) {
			System.out.println("Value is not null can save");
			String name = dto.getHospitalName();
			String address = dto.getHospitalAddress();
			int noOfWards = dto.getNoOfWards();
			int noOFDoctors = dto.getNoOfDoctors();
				
			if(ValidateUtil.validateString(name)) {
				System.out.println("Hospital name '" + name + "'is a valid input");
			}
			else {
				System.err.println("Hospital name '" + name + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateString(address)) {
				System.out.println("Hospital address '" + address + "'is a valid input");
			}
			else {
				System.err.println("Hospital address'" + address + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateNumber(noOfWards)) {
				System.out.println("Hospital noOfWards '" + noOfWards + "'is a valid input");
			}
			else {
				System.err.println("Hospital noOfWards '" + noOfWards + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateNumber(noOFDoctors)) {
				System.out.println("Hospital noOFDoctors '" + noOFDoctors+ "'is a valid input");
			}
			else {
				System.err.println("Hospital noOFDoctors'" + noOFDoctors+ "'is a invalid input");
				return false;
			}
			hospitalRepository.save(dto);
			return true;
		}
		else {
			System.err.println("value is null cannot save");
		}
		return false;
	}

	@Override
	public HospitalDTO findByHospitalName(String name) {
		if(ValidateUtil.validateString(name)) {
			System.out.println("Hospital Name is valid input");
			HospitalDTO isFound = hospitalRepository.findByHospitalName(name);
			return isFound;
		}
		System.err.println("Hospital Name is invalid input");
		return null;
	}

	@Override
	public HospitalDTO findByNameAndNoOfDoctors(String name, int numOfDoc) {
		if(ValidateUtil.validateString(name) && ValidateUtil.validateNumber(numOfDoc)) {
			System.out.println("Data is valid");
		HospitalDTO isFound = hospitalRepository.findByNameAndNoOfDoctors(name, numOfDoc);
			return isFound;
		}
		System.err.println("Data is invalid");
		return null;
	}
}
