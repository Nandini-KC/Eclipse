package com.xworkz.market.app;

public interface MarketRepository {
	int TOATL_MARKETS=5;
	void save(MarketDTO marketDto);
	MarketDTO findByType(String type);
	MarketDTO findByLocation(String location);
	MarketDTO findByFloors(int floors);
	MarketDTO[] saveAll();
}
