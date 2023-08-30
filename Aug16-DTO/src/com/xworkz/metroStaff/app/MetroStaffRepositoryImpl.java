package com.xworkz.metroStaff.app;

public class MetroStaffRepositoryImpl implements MetroStaffRepository {
	private MetroStaffDTO[] metro = new MetroStaffDTO[TOTAL_STAFF];
	private int index = 0;

	@Override
	public void save(MetroStaffDTO metroStaff) {
		if (index < TOTAL_STAFF) {
			this.metro[index] = metroStaff;
			index++;
		} else {
			System.err.println("Index not found error");
		}

	}

	@Override
	public MetroStaffDTO findByName(String name) {
		for (int pos = 0; pos < index; pos++) {
			if (metro[pos].getName() == name) {
				System.out.println("Metro satff name found");
				return metro[pos];
			}
			System.out.println("Index not matching,moving to next");
		}
		System.out.println("Staff name not found");
		return null;
	}

	@Override
	public MetroStaffDTO findByAge(int age) {
		for (int i = 0; i < index; i++) {
			if (metro[i].getAge() == age) {
				System.out.println("Metro satff age found");
				return metro[i];
			}
			System.out.println("Index not matching,moving to next");
		}
		System.out.println("Staff age not found");
		return null;
	}

	@Override
	public MetroStaffDTO findBySalary(int salary) {
		for (int i = 0; i < index; i++) {
			if (metro[i].getSalary() == salary) {
				System.out.println("Metro satff salary found");
				return metro[i];
			}
			System.out.println("Index not matching,moving to next");
		}
		System.out.println("Staff salary not found");
		return null;
	}

	@Override
	public MetroStaffDTO[] saveAll() {
		return metro;
	}

}
