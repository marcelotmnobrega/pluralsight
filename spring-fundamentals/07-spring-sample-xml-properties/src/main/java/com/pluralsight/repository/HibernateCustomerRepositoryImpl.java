package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    private String dbUsername;

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    /* (non-Javadoc)
     * @see com.pluralsight.repository.CustomerRepository#findAll()
     */
    @Override
    public List<Customer> findAll() {

        System.out.println(this.dbUsername);

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Marcelo");
        customer.setLastname("Nobrega");

        customers.add(customer);

        return customers;
    }
}
