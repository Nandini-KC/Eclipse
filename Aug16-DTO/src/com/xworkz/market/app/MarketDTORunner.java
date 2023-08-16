package com.xworkz.market.app;

public class MarketDTORunner {

	public static void main(String[] args) {
		MarketDTO market=new MarketDTO("Reliance Fresh", "BTM", 2, "Roshan kumar", false);
		System.out.println(market);
		MarketRepository repo=new MarketRepositoryImpl();
		repo.save(market);
		
		MarketDTO market1=new MarketDTO("More", "Marthalli", 3, "Rajasekhar", true);
		System.out.println(market1);
		MarketRepository repo1=new MarketRepositoryImpl();
		repo1.save(market1);
		
		MarketDTO market2=new MarketDTO("Ashirwad", "Jaynagar", 4, "Sunil", true);
		System.out.println(market2);
		MarketRepository repo2=new MarketRepositoryImpl();
		repo2.save(market2);
		
		MarketDTO market3=new MarketDTO("Family Super market", "BTM 1st satge", 1, "Senthil raj", false);
		System.out.println(market3);
		MarketRepository repo3=new MarketRepositoryImpl();
		repo3.save(market3);
		
		MarketDTO market4=new MarketDTO("Food palace", "Majestic", 2, "Thalai kumar", true);
		System.out.println(market4);
		MarketRepository repo4=new MarketRepositoryImpl();
		repo4.save(market4);
		
	}

}
