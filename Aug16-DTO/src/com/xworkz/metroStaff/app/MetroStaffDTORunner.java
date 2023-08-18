package com.xworkz.metroStaff.app;

public class MetroStaffDTORunner {

	public static void main(String[] args) {
		MetroStaffDTO metro=new MetroStaffDTO("Sita", 26, "Btech", 20000);
		System.out.println(metro);
		MetroStaffRepository repo=new MetroStaffRepositoryImpl();
		repo.save(metro);
		
		MetroStaffDTO metro1=new MetroStaffDTO("Ram", 28, "Btech", 30000);
		System.out.println(metro1);
		repo.save(metro1);
		
		MetroStaffDTO metro2=new MetroStaffDTO("Ashwin", 23, "Bsc", 25000);
		System.out.println(metro2);
		repo.save(metro2);
		
		MetroStaffDTO metro3=new MetroStaffDTO("Amrutha", 27, "MBA", 23800);
		System.out.println(metro3);
		repo.save(metro3);
		
		MetroStaffDTO metro4=new MetroStaffDTO("Veda", 30, "Bcom", 34000);
		System.out.println(metro4);
		repo.save(metro4);
		System.out.println("\n");
		MetroStaffDTO ref=repo.findByAge(23);
		System.out.println(ref);
		System.out.println("\n");
		MetroStaffDTO ref1=repo.findByName("Ashwin");
		System.out.println(ref1);
		System.out.println("\n");
		MetroStaffDTO ref2=repo.findBySalary(20000);
		System.out.println(ref2);
		System.out.println("\n");
		MetroStaffDTO[] metroStaff=repo.saveAll();
		for(int i=0;i<metroStaff.length;i++)
		{
			if(metroStaff[i]!=null)
			{
				System.out.println(metroStaff[i]);
			}
		}

	}

}
