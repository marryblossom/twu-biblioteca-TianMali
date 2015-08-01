package com.twu.biblioteca.entity;

/**
 * Created by marry on 7/21/15.
 */
public class Customer {
    private String customerId;
    private String libraryNumber;
    private String password;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(String customerId, String libraryNumber, String password) {

        this.customerId = customerId;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }
}
