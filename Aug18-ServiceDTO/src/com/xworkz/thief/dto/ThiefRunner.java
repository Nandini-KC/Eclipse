package com.xworkz.thief.dto;

public class ThiefRunner {

	public static void main(String[] args) {
		ThiefDTO dto=new ThiefDTO("Chain thief", 5, 26, "Sega gang", 7);
		ThiefService service=new ThiefServiceImpl();
		service.saveAndValidate(dto);

	}

}
