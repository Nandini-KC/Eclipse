package com.xworkz.mechanic.dto;
import com.xworkz.mechanic.*;
public class MechanicServiceImpl implements MechanicService{

	@Override
	public void saveAndValidate(MechanicDTO mechanic) {
		if(mechanic !=null)
		{
			System.out.println("Mechanic data is valid"+mechanic);
			String garageName=mechanic.getGaragename();
			int gst=mechanic.getGstNo();
			String specialization=mechanic.getSpecialization();
			int serviceCost=mechanic.getBikeServiceCost();
			if(garageName!=null && !garageName.isEmpty() && garageName.length()>3 && garageName.length()<30)
			{
				System.out.println("Garage name is valid");
			}
			else
			{
				System.err.println("Garage name is not valid");
			}
			if(gst>0 && gst<10000000)
			{
				System.out.println("Gst is valid");
			}
			else
			{
				System.err.println("Gst is not valid");
			}
			if(specialization!=null && !specialization.isEmpty() && specialization.length()>3 && specialization.length()<30)
			{
				System.out.println("specialization is valid");
			}
			else
			{
				System.err.println("specialization is not valid");
			}
			if(serviceCost>0 && serviceCost<10000000)
			{
				 System.out.println("serviceCost is valid");
			}
			else
			{
				System.err.println("serviceCost is not valid");
			}
		}
		
	}
	

}
