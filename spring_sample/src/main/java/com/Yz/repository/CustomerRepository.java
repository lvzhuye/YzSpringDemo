package com.Yz.repository;

import java.util.List;

import com.Yz.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}