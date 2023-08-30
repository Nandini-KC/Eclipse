package com.xworkz.minister.dto;

public class MinisterDTORunner {

	public static void main(String[] args) {
		MinisterDTO minister=new MinisterDTO("Chandra Babu Naidu", 15, "Chief minister", "Telugu desam party");
		MinisterService service=new MinisterServiceImpl();
		service.saveAndValidate(minister);
	}

}
