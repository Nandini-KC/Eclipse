package com.xworkz.customer.app;

public interface CustomerRepository {
	int TOTAL_ITEMS = 5;

	void save(CustomerDTO customers);

	CustomerDTO findByName(String name);

	CustomerDTO findByEmail(String email);

	CustomerDTO findByLocation(String location);

	CustomerDTO[] saveAll();

}
