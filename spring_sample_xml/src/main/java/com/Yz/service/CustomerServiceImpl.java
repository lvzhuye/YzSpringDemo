package com.Yz.service;

import java.util.List;

import com.Yz.model.Customer;
import com.Yz.repository.CustomerRepository;
import com.Yz.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Yz.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
