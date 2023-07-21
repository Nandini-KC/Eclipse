
public class FarmChicken extends Chicken{
	int noOfDays;
	String careTaker;
	FarmChicken(int noOfDays,String careTaker,double price,String location)
	{
		super(price,location);
		this.noOfDays=noOfDays;
		this.careTaker=careTaker;
	}
	void printInfo()
	{
		System.out.println("Running method in FarmChicken");
		super.printInfo();
		System.out.println("No of days of farm chicken="+this.noOfDays);
		System.out.println("Care taker of farm chicken="+this.careTaker);
	}

}
