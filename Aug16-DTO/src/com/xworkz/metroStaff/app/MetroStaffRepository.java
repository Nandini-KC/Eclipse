package com.xworkz.metroStaff.app;

public interface MetroStaffRepository {
	int TOTAL_STAFF = 5;

	void save(MetroStaffDTO metroStaff);

	MetroStaffDTO findByName(String name);

	MetroStaffDTO findByAge(int age);

	MetroStaffDTO findBySalary(int salary);

	MetroStaffDTO[] saveAll();
}
