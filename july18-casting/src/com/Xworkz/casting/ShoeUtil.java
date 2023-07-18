package com.Xworkz.casting;

public class ShoeUtil {
	public static void buy(Shoe shoe)
	{
		if(shoe!=null)
		{
			System.out.println("Shoe price="+shoe.price);
			System.out.println("Shoe size="+shoe.size);
			System.out.println("Shoe color="+shoe.color);
			if(shoe instanceof PumaShoe)
			{
				PumaShoe puma=(PumaShoe)shoe;
				System.out.println("Creating casting for pumashoe");
			}
			if(shoe instanceof NikeShoe)
			{
				NikeShoe nike=(NikeShoe)shoe;
				System.out.println("Creating casting for nike shoe");
			}
		}
	}
}
