package com.xworkz.ceo.dto;
import com.xworkz.ceo.dto.*;
public class CeoDTORunner {

	public static void main(String[] args) {
		CeoDTO ceo=new CeoDTO("Sundar pichai", "Google", 800000, 20);
		CeoService ceo1=new CeoServiceImpl();
		ceo1.saveAndValidate(ceo);
	}

}
