package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //Member injection
    //@Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("we're using constructor injection");
        this.customerRepository = customerRepository;
    }

    //Method setter injection
    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("we're using setter injection");
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
