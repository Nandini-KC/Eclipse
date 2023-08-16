package com.xworkz.metroStaff.app;

public class MetroStaffRepositoryImpl implements MetroStaffRepository{
	private MetroStaffDTO[] metro=new MetroStaffDTO[TOTAL_STAFF];
	private int index=0;
	@Override
	public void save(MetroStaffDTO metroStaff) {
		if(index<TOTAL_STAFF)
		{
			this.metro[index]=metroStaff;
			index++;
		}
		else
		{
			System.err.println("Index not found error");
		}
		
	}

}
