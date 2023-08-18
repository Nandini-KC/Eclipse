package com.xworkz.theatre.app;

public class TheatreDTORunner {

	public static void main(String[] args) {
		TheatreDTO theatre=new TheatreDTO("Sandhya", 250, "BRO", "BTM", 4);
		System.out.println(theatre.toString());
		TheatreRepository repo=new TheatreRepositoryImpl();
		repo.save(theatre);
		
		TheatreDTO theatre1=new TheatreDTO("Gopalan", 450, "Kushi", "Banergatta", 4);
		System.out.println(theatre1.toString());
		repo.save(theatre1);
		
		TheatreDTO theatre2=new TheatreDTO("Imax", 550, "Baby", "Jaynagar", 2);
		System.out.println(theatre2.toString());
		repo.save(theatre2);
		
		TheatreDTO theatre3=new TheatreDTO("Balaji", 250, "Jailer", "Majestic", 3);
		System.out.println(theatre3.toString());
		repo.save(theatre3);
		
		TheatreDTO theatre4=new TheatreDTO("Vega city Mall", 600, "Bola Shankar", "JPnagar", 2);
		System.out.println(theatre4.toString());
		repo.save(theatre4);
		System.out.println("\n");
		TheatreDTO ref=repo.findByMovie("Baby");
		System.out.println(ref);
		System.out.println("\n");
		TheatreDTO ref1=repo.findByShows(2);
		System.out.println(ref1);
		System.out.println("\n");
		TheatreDTO ref2=repo.findByTicketCost(250);
		System.out.println(ref2);
		System.out.println("\n");
		TheatreDTO[] movie=repo.saveAll();
		for(int i=0;i<movie.length;i++)
		{
			if(movie[i]!=null)
			{
				System.out.println(movie[i]);
			}
		}
	}

}
