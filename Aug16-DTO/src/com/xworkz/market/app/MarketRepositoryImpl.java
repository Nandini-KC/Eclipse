package com.xworkz.market.app;

public class MarketRepositoryImpl implements MarketRepository{
	private MarketDTO[] markets=new MarketDTO[TOATL_MARKETS];
	private int index=0;
	@Override
	public void save(MarketDTO marketDto) {
		if(index<TOATL_MARKETS)
		{
			this.markets[index]=marketDto;
			index++;
		}
		else
		{
			System.err.println("Index not found");
		}
		
	}

}
