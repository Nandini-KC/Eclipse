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

}
