package com.xworkz.customer.app;

public class CustomerRepositoryImpl implements CustomerRepository{
	private CustomerDTO[] customer=new CustomerDTO[TOTAL_ITEMS];
	private int index=0;
	@Override
	public void save(CustomerDTO customers) {
		if(index<TOTAL_ITEMS)
		{
			this.customer[index]=customers;
			index++;
		}
		else
		{
			System.err.println("Not able to save ");
		}
		
	}
	@Override
	public CustomerDTO findByName(String name) {
		for(int i=0;i<index;i++)
		{
			if(customer[i].getName()==name)
			{
				System.out.println("Customer name is matching");
				return customer[i];
			}
			System.out.println("Index not matching,moving to next index");
		}
		System.out.println("Customer name not found");
		return null;
	}
	@Override
	public CustomerDTO findByEmail(String email) {
		for(int j=0;j<index;j++)
		{
			if(customer[j].getEmail()==email)
			{
				System.out.println("Customer email is matching");
				return customer[j];
			}
			System.out.println("Index not matching,moving to next index");
		}
		System.out.println("Customer email not found");
		return null;
	}
	@Override
	public CustomerDTO findByLocation(String location) {
		for(int k=0;k<index;k++)
		{
			if(customer[k].getLocation()==location)
			{
				System.out.println("Customer location is matching");
				return customer[k];
				
			}
			System.out.println("Index not matching,moving to next index");
		}
		System.out.println("Customer location not found");
		return null;
	}
	@Override
	public CustomerDTO[] saveAll() {
		
		return customer;
	}

}
