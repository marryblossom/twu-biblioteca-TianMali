package com.twu.biblioteca.entityDao;

import com.twu.biblioteca.entity.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marry on 8/1/15.
 */
public class CustomerDao {
    List<Customer> customers = new ArrayList<Customer>();
    Customer customer;
    public List<Customer> getCustomers(){
        customer = new Customer("1","123-1234","123");
        customers.add(customer);
        return customers;
    }
}
