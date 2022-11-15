package com.jrp.mfn.service;

import java.util.List;

import com.jrp.mfn.model.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomer();
	void saveCustomer(Customer customer);
	Customer getCustomerById(long id);
	void deleteCustomerById(long id);

}
