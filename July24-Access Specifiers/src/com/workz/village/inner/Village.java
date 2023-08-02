package com.workz.village.inner;

public class Village {
	public void enter()
	{
		System.out.println("Invoking enter method in Village");
	}
	protected void exit()
	{
		System.out.println("Invoking exit method in Village");
		
	}
	private void inner()
	{
		System.out.println("hi");
	}
}
