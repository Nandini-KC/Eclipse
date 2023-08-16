package com.xworkz.theatre.app;

public class TheatreDTORunner {

	public static void main(String[] args) {
		TheatreDTO theatre=new TheatreDTO("Sandhya", 250, "BRO", "BTM", 4);
		System.out.println(theatre.toString());
		TheatreRepository repo=new TheatreRepositoryImpl();
		repo.save(theatre);
		
		TheatreDTO theatre1=new TheatreDTO("Gopalan", 450, "Kushi", "Banergatta", 4);
		System.out.println(theatre1.toString());
		TheatreRepository repo1=new TheatreRepositoryImpl();
		repo1.save(theatre1);
		
		TheatreDTO theatre2=new TheatreDTO("Imax", 550, "Baby", "Jaynagar", 2);
		System.out.println(theatre2.toString());
		TheatreRepository repo2=new TheatreRepositoryImpl();
		repo2.save(theatre2);
		
		TheatreDTO theatre3=new TheatreDTO("Balaji", 250, "Jailer", "Majestic", 3);
		System.out.println(theatre3.toString());
		TheatreRepository repo3=new TheatreRepositoryImpl();
		repo3.save(theatre3);
		
		TheatreDTO theatre4=new TheatreDTO("Vega city Mall", 600, "Bola Shankar", "JPnagar", 2);
		System.out.println(theatre4.toString());
		TheatreRepository repo4=new TheatreRepositoryImpl();
		repo4.save(theatre4);

	}

}
