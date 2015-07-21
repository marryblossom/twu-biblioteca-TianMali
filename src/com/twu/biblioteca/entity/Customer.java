package com.twu.biblioteca.entity;

/**
 * Created by marry on 7/21/15.
 */
public class Customer {
    private String customerId;
    private String customerName;
    private String password;

    public Customer(String customerId, String customerName, String password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {

        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
