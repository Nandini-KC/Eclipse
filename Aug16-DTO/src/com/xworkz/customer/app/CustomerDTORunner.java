package com.xworkz.customer.app;

public class CustomerDTORunner {

	public static void main(String[] args) {
		CustomerDTO customer=new CustomerDTO("Johnson", "johnsonkin@gmail.com", "Banglore", false);
		System.out.println(customer.toString());
		CustomerRepository customerRepo=new CustomerRepositoryImpl();
		customerRepo.save(customer);
		
		CustomerDTO customer1=new CustomerDTO("YashRaj", "yashraj@gmail.com", "Mysore", true);
		System.out.println(customer1.toString());
		customerRepo.save(customer1);
		
		CustomerDTO customer2=new CustomerDTO("Manikanth", "manikath@gmail.com", "Hassan", true);
		System.out.println(customer2.toString());
		customerRepo.save(customer2);
		
		CustomerDTO customer3=new CustomerDTO("KalyanRam", "kalyanram@gmail.com", "Chittoor", true);
		System.out.println(customer3.toString());
		customerRepo.save(customer3);
		
		CustomerDTO customer4=new CustomerDTO("Guru", "guru12@gmail.com", "Hyderabad", false);
		System.out.println(customer4.toString());
		customerRepo.save(customer4);
		System.out.println("\n");
		
		CustomerDTO name=customerRepo.findByName("Johnson");
		System.out.println(name);
		System.out.println("\n");
		CustomerDTO email=customerRepo.findByEmail("guru123@gmail.com");
		System.out.println(email);
		System.out.println("\n");
		CustomerDTO location=customerRepo.findByLocation("Mysore");
		System.out.println(location);
		System.out.println("\n");
		CustomerDTO[] customerDetails=customerRepo.saveAll();
		for(int index=0;index<customerDetails.length;index++)
		{
			if(customerDetails[index]!=null)
			{
				System.out.println(customerDetails[index]);
			}
		}
		
	}

}
