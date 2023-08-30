package com.xworkz.cook.dto;

public class CookDTORunner {

	public static void main(String[] args) {
		CookDTO dto=new CookDTO("Pizza", "Meghana foods", "Male", 30000);
		CookService service=new CookServiceImpl();
		service.saveAndValidate(dto);

	}

}
