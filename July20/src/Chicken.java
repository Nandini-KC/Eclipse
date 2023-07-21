
public class Chicken {
	double price;
	String location;
	Chicken(double price,String location)
	{
		this.price=price;
		this.location=location;
	}
	void printInfo()
	{
		System.out.println("Running method in Chicken");
		System.out.println("Price of chicken="+this.price);
		System.out.println("Location of chicken="+this.location);
	}
}
