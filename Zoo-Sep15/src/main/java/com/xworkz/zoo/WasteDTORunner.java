package com.xworkz.zoo;

public class WasteDTORunner {
	public static void main(String[] args) {
		WasteDTO dto=new WasteDTO("Vegetables", "Wet Waste", 2);
		WasteDTO dto1=new WasteDTO("News Papers", "Dry Waste", 5);
		WasteRepository wasteRepository=new WasteRepositoryImpl();
		WasteService service=new WasteServiceImpl(wasteRepository);
		boolean saved=service.ValidateAndSave(dto);
		if(saved)
		{
			System.out.println("Input is saved "+saved);
		}
		else
		{
			System.out.println("Input is not saved "+saved);
		}
		boolean anotherSaved=service.ValidateAndSave(dto1);
		if(anotherSaved)
		{
			System.out.println("Input is saved "+anotherSaved);
		}
		else
		{
			System.out.println("Input is not saved "+anotherSaved);
		}
		
	}
}
