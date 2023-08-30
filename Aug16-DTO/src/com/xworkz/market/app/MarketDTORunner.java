package com.xworkz.market.app;

public class MarketDTORunner {

	public static void main(String[] args) {
		MarketDTO market = new MarketDTO("Reliance Fresh", "BTM", 2, "Roshan kumar", false);
		System.out.println(market);
		MarketRepository repo = new MarketRepositoryImpl();
		repo.save(market);

		MarketDTO market1 = new MarketDTO("More", "Marthalli", 3, "Rajasekhar", true);
		System.out.println(market1);
		repo.save(market1);

		MarketDTO market2 = new MarketDTO("Ashirwad", "Jaynagar", 4, "Sunil", true);
		System.out.println(market2);
		repo.save(market2);

		MarketDTO market3 = new MarketDTO("Family Super market", "BTM 1st satge", 1, "Senthil raj", false);
		System.out.println(market3);
		repo.save(market3);

		MarketDTO market4 = new MarketDTO("Food palace", "Majestic", 2, "Thalai kumar", true);
		System.out.println(market4);
		repo.save(market4);
		System.out.println("\n");
		MarketDTO type = repo.findByFloors(2);
		System.out.println(type);
		System.out.println("\n");
		MarketDTO type1 = repo.findByLocation("BTM");
		System.out.println(type1);
		System.out.println("\n");
		MarketDTO type2 = repo.findByType("Big bazar");
		System.out.println(type2);
		System.out.println("\n");
		MarketDTO[] all = repo.saveAll();
		for (int i = 0; i < all.length; i++) {
			if (all[i] != null) {
				System.out.println(all[i]);
			}
		}

	}

}
