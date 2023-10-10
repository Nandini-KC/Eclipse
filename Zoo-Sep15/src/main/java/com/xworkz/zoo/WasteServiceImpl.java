package com.xworkz.zoo;

public class WasteServiceImpl implements WasteService{
	WasteRepository wasteRepository=new WasteRepositoryImpl();
	public WasteServiceImpl(WasteRepository wasteRepository2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean ValidateAndSave(WasteDTO dto) {
		if(dto!=null)
		{
			System.out.println("Data is not null");
			String name=dto.getName();
			String type=dto.getType();
			Double weight=dto.getWeight();
			if(ValidateUtil.validateString(name))
			{
				System.out.println("input is valid "+name);
			}
			else
			{
				System.out.println("Input is not valid "+name);
			}
			if(ValidateUtil.validateString(type))
			{
				System.out.println("input is valid "+type);
			}
			else
			{
				System.out.println("Input is not valid "+type);
			}
			if(ValidateUtil.validateNumber(weight))
			{
				System.out.println("input is valid "+weight);
			}
			else
			{
				System.out.println("Input is not valid "+weight);
			}
			wasteRepository.save(dto);
			return true;
			
		}
		else
		{
			System.err.println("value is null cannot save");
		}
		return false;
	}
	

}
