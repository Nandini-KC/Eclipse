package com.xworkz.topic.app;

public class Himalaya extends Mountain{
		public Himalaya()
		{
			System.out.println("Invoking no-args const in Himalaya");
		}
		public Himalaya(int noOfMountains, String location)
		{
			this.noOfMountains=noOfMountains;
			this.location=location;
		}
}
