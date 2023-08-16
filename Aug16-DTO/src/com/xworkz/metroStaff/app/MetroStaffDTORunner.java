package com.xworkz.metroStaff.app;

public class MetroStaffDTORunner {

	public static void main(String[] args) {
		MetroStaffDTO metro=new MetroStaffDTO("Sita", 26, "Btech", 20000);
		System.out.println(metro);
		MetroStaffRepository repo=new MetroStaffRepositoryImpl();
		repo.save(metro);
		
		MetroStaffDTO metro1=new MetroStaffDTO("Ram", 28, "Btech", 30000);
		System.out.println(metro1);
		MetroStaffRepository repo1=new MetroStaffRepositoryImpl();
		repo.save(metro1);
		
		MetroStaffDTO metro2=new MetroStaffDTO("Ashwin", 23, "Bsc", 25000);
		System.out.println(metro2);
		MetroStaffRepository repo2=new MetroStaffRepositoryImpl();
		repo.save(metro2);
		
		MetroStaffDTO metro3=new MetroStaffDTO("Amrutha", 27, "MBA", 23800);
		System.out.println(metro3);
		MetroStaffRepository repo3=new MetroStaffRepositoryImpl();
		repo.save(metro3);
		
		MetroStaffDTO metro4=new MetroStaffDTO("Veda", 30, "Bcom", 34000);
		System.out.println(metro4);
		MetroStaffRepository repo4=new MetroStaffRepositoryImpl();
		repo.save(metro4);
		
		

	}

}
