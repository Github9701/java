package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.exception.CustomerAlreadyExistsException;
import com.customer.exception.ErrorResponse;
import com.customer.exception.NoSuchCustomerExistsException;
import com.customer.service.impl.CustomerServiceImpl;

@RestController
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerservice;

	@GetMapping("/getcustomer/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerservice.getcustomer(id);
	}

	@PostMapping("/addCustomer")
	public String addcustomer(@RequestBody Customer customer) {
		return customerservice.addCustomer(customer);
	}

	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerservice.updateCustomer(customer);
	}

	@ExceptionHandler(value = NoSuchCustomerExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handleNoSuchCustomerExistsException(NoSuchCustomerExistsException ex) {
		return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
	}

}
