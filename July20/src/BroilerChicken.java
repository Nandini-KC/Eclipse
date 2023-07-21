
public class BroilerChicken extends Chicken{
	boolean alive;
	double weight;
	BroilerChicken(boolean alive,double weight,double price,String location)
	{
		super(price,location);
		this.alive=alive;
		this.weight=weight;
		
	}
	void printInfo()
	{
		System.out.println("Running method in BroilerChicken");
		super.printInfo();
		System.out.println("Broiler chicken is alive="+this.alive);
		System.out.println("Weight of Broiler chicken="+this.weight);
	}

}
