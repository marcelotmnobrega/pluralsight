package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//if declared here, there is no need to declare on AppConfig
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUserName}")
    private String dbUsername;

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
