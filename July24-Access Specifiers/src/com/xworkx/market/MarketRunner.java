package com.xworkx.market;

import com.xworkx.market.base.*;
import com.xworkx.market.online.*;

public class MarketRunner {

	public static void main(String[] args) {
			SuperMarket sup=new SuperMarket();
			sup.buy();
			
			OnlineMarket online=new OnlineMarket();
			online.buy();
		
			
			
	}

}
