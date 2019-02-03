package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public interface CustomerService {

    CustomerRepository getCustomerRepository();

    void setCustomerRepository(CustomerRepository customerRepository);

    List<Customer> findAll();

}