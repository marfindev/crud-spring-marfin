package com.jrp.mfn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrp.mfn.model.Customer;
import com.jrp.mfn.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();		
	}

	@Override
	public void saveCustomer(Customer customer) {
		this.customerRepository.save(customer);
		
	}

	@Override
	public Customer getCustomerById(long id) {
		Optional<Customer> optional = customerRepository.findById(id);
		Customer customer = null;
		if(optional.isPresent()) {
			customer = optional.get();
		}else {
			throw new RuntimeException("Customer not found for id :: " + id);
		}
		return customer;
		
	}

	@Override
	public void deleteCustomerById(long id) {
		this.customerRepository.deleteById(id);		
	}

}
