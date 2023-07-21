
public class ChickenRunner {

	public static void main(String[] args) {
		System.out.println("Running main method in ChickenRunner");
		Chicken chicken=new Chicken(250,"Chittoor");
		chicken.printInfo();
		FarmChicken farm=new FarmChicken(100,"samala",200,"Banglore");
		farm.printInfo();
		BroilerChicken ref=new BroilerChicken(true,4,198,"BTM");
		ref.printInfo();
	}

}
