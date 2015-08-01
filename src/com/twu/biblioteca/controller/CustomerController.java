package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.Customer;
import com.twu.biblioteca.entityDao.CustomerDao;

import java.util.List;

/**
 * Created by marry on 8/1/15.
 */
public class CustomerController{
    CustomerDao customerDao = new CustomerDao();

    public Boolean checkLogin(String libNumber,String password){
        List<Customer> customers = customerDao.getCustomers();
        for (Customer customer : customers) {
            if(libNumber.equals(customer.getLibraryNumber()) && password.equals(customer.getPassword())){
                return true;
            }
        }
        return false;
    }
}
