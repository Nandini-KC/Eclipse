package com.xworkz.mechanic.dto;

public class MechanicRunner {

	public static void main(String[] args) {
		MechanicDTO dto=new MechanicDTO("Beyond garage", 123, "Bike repair", 1234);
		MechanicService service=new MechanicServiceImpl();
		service.saveAndValidate(dto);

	}

}
