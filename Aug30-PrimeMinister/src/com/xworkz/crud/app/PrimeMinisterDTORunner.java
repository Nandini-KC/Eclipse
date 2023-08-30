package com.xworkz.crud.app;

public class PrimeMinisterDTORunner {
	public static void main(String[] args) {
		PrimeMinisterDTO dto=new PrimeMinisterDTO(1, "Narendra modi", "India", "BJP");
		PrimeMinisterDTO dto1=new PrimeMinisterDTO(2, " Joe Biden", "USA", "Congress");
		PrimeMinisterService service=new PrimeMinisterServiceImpl();
		boolean saved=service.validateAndSave(dto);
		if(saved)
		{
			System.out.println("Input is saved "+saved);
		}
		else
		{
			System.err.println("Input is not saved "+saved);
		}
		boolean saved1=service.validateAndSave(dto1);
		if(saved1)
		{
			System.out.println("Input is saved "+saved1);
		}
		else
		{
			System.err.println("Input is not saved "+saved1);
		}
		System.out.println(".............");
		service.findByName("Narendra modi");
		System.out.println("...................");
		
	}
}
