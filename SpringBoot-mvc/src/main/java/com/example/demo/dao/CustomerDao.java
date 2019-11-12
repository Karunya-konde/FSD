package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerDao {
	public Customer saveCustomer(Customer customer);
	public List<Customer> getCustomer();
}
