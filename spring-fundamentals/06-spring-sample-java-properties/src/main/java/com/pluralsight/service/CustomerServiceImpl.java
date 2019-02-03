package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {}

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using constructor injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    @Override
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter injection");
        this.customerRepository = customerRepository;
    }

    /* (non-Javadoc)
     * @see com.pluralsight.service.CustomerService#findAll()
     */
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
