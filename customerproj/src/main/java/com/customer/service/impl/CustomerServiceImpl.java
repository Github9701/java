package com.customer.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.exception.CustomerAlreadyExistsException;
import com.customer.exception.NoSuchCustomerExistsException;
import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;

	@Override
	public Customer getcustomer(int id) {

		return customerRepo.findById(id).orElseThrow(() -> new NoSuchCustomerExistsException("No customer present with Id = " + id));
	}

	@Override
	public String addCustomer(Customer customer) {
		Customer existingCustomer = customerRepo.findById(customer.getId()).orElse(null);
		if (existingCustomer == null) {
			customerRepo.save(customer);
			return "customer added successfully";
		} else
			throw new CustomerAlreadyExistsException("Customer already exists");

	}

	@Override
	public String updateCustomer(Customer customer) {
		Customer existingCustomer = customerRepo.findById(customer.getId()).orElse(null);
		if (existingCustomer == null)
			throw new NoSuchCustomerExistsException("No Such Customer exists!!");
		else {
			existingCustomer.setName(customer.getName());
			existingCustomer.setAddress(customer.getAddress());
			customerRepo.save(existingCustomer);
			return "Record updated Successfully";
		}
	}

}
