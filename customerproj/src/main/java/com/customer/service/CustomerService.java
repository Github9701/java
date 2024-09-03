package com.customer.service;

import com.customer.entity.Customer;

public interface CustomerService {
	Customer getcustomer(int id);
	String addCustomer(Customer customer);
	String updateCustomer(Customer customer);

}
