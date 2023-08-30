package com.xworkz.market.app;

public class MarketRepositoryImpl implements MarketRepository {
	private MarketDTO[] markets = new MarketDTO[TOATL_MARKETS];
	private int index = 0;

	@Override
	public void save(MarketDTO marketDto) {
		if (index < TOATL_MARKETS) {
			this.markets[index] = marketDto;
			index++;
		} else {
			System.err.println("Index not found");
		}

	}

	@Override
	public MarketDTO findByType(String type) {
		for (int i = 0; i < index; i++) {
			if (markets[i].getType() == type) {
				System.out.println("Type of market found");
				return markets[i];
			}
			System.out.println("Index not found,move to next index");
		}
		System.out.println("Market type not found");
		return null;
	}

	@Override
	public MarketDTO findByLocation(String location) {
		for (int j = 0; j < index; j++) {
			if (markets[j].getLocation() == location) {
				System.out.println("Location of market found");
				return markets[j];
			}
			System.out.println("Index not found,move to next index");
		}
		System.out.println("Market location not found");
		return null;
	}

	@Override
	public MarketDTO findByFloors(int floors) {
		for (int k = 0; k < index; k++) {
			if (markets[k].getFloors() == floors) {
				System.out.println("Floors count of market found");
				return markets[k];
			}
			System.out.println("Index not found,move to next index");
		}
		System.out.println("Market floors count not found");
		return null;
	}

	@Override
	public MarketDTO[] saveAll() {
		return markets;
	}

}
