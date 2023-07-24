package com.workz.village.outer;
import com.workz.village.inner.Village;
public class NewVillage extends Village{
	@Override
	public void exit()
	{
		System.out.println("Invoking exit method in New Village");
	}

}
