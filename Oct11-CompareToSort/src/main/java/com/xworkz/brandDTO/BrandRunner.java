package com.xworkz.brandDTO;

import java.util.Collection;
import java.util.HashSet;

public class BrandRunner {

	public static void main(String[] args) {
		BrandDTO dto1=new BrandDTO("Apple", "Tim Cook", 818, "USA");
		BrandDTO dto2=new BrandDTO("Titan", "Tata", 50.1, "India");
		BrandDTO dto3=new BrandDTO("Samsung", "Satya Nadella", 50, "South Korea");
		BrandDTO dto4=new BrandDTO("Google", "Sundar Pichai", 279, "USA");
		BrandDTO dto5=new BrandDTO("Nike", "Phil knight", 51.46, "USA");
		BrandDTO dto6=new BrandDTO("KFC", "sabir sami", 31.1, "USA");
		BrandDTO dto7=new BrandDTO("Dominos", "Russell J.Weiner", 13.35, "USA");
		BrandDTO dto8=new BrandDTO("Maruti Suzuki", "Hishahi Takeuchi", 15, "India");
		BrandDTO dto9=new BrandDTO("Puma", "Arne Freundt ", 8.47, "Germany");
		BrandDTO dto10=new BrandDTO("Ikea", "Jesper Brodin", 44.6, "Swedan");
		
		Collection<BrandDTO> collection=new HashSet<BrandDTO>();
		
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		
		System.out.println("---Sort collection by name----");
		collection.stream().sorted().forEach(v->System.out.println(v));
		System.out.println();
		System.out.println("--Revenue in Billion greater than 20 ---");
		collection.stream().filter(v->v.getRevenueInBillion()>20).forEach(v->System.out.println(v));
		System.out.println();
		System.out.println("---Revenue in Billion lesser than 20 ---");
		collection.stream().filter(v->v.getRevenueInBillion()<20).forEach(v->System.out.println(v));
		System.out.println();
		System.out.println("---USA brands---");
		collection.stream().filter(v->v.getCountry().equals("USA")).forEach(v->System.out.println(v.getName()+"="+v.getCountry()));
		System.out.println();
		System.out.println("---Not USA Brands---");
		collection.stream().filter(v->!v.getCountry().equals("USA")).forEach(v->System.out.println(v.getName()+"="+v.getCountry()));
		System.out.println();
		System.out.println("---Brands starts with I---");
		collection.stream().filter(v->v.getName().startsWith("I")).forEach(v->System.out.println(v.getName()));
		System.out.println();
		System.out.println("---owner name length is greater than 5---");
		collection.stream().filter(v->v.getOwner().length()>5).forEach(v->System.out.println(v));
		System.out.println();
		System.out.println("---owner name length is lesser than 5---");
		collection.stream().filter(v->v.getOwner().length()<5).forEach(v->System.out.println(v));
		System.out.println("");
	}

}
