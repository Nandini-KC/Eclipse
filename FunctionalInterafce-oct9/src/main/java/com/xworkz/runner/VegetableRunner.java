package com.xworkz.runner;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.xworkz.vegetableDto.VegetableDTO;

public class VegetableRunner {

	public static void main(String[] args) {
		VegetableDTO dto1=new VegetableDTO(1, "LadiesFinger", 50, 1);
		VegetableDTO dto2=new VegetableDTO(2, "Tomato", 100, 6);
		VegetableDTO dto3=new VegetableDTO(3, "Beans", 90,2);
		VegetableDTO dto4=new VegetableDTO(4, "Carrot", 60, 3);
		VegetableDTO dto5=new VegetableDTO(5, "Beet root", 150,4);
		
		Collection<VegetableDTO> collection=new HashSet<VegetableDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		
		collection.forEach((v)->{
			if(v.getPrice()>=100)
			{
				System.out.println("Vegetable has High price :"+v.getName());
			}
			
		});
		
		
		
		Collection<VegetableDTO> collection2=new HashSet<VegetableDTO>();
		collection.forEach((h)->{
			if(h.getPrice()<100)
			{
				System.out.println("Price is ok for :"+h.getName());
				collection2.add(h);
			}
		});
		collection2.forEach((y)->{
			System.out.println("Vegetables price less than 100 :"+y.getName());
		});
		
		
		
		
		
	}

}
