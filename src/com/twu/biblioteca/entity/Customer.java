package com.twu.biblioteca.entity;

/**
 * Created by marry on 7/21/15.
 */
public class Customer {
    private String customerId;
    private String libraryNumber;
    private String password;
    private String userName;
    private String phone;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public Customer(String customerId, String libraryNumber, String password,String userName,String phone,String email) {

        this.customerId = customerId;
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return  "Hi "+userName+",   Welcome, This is your information~~~~~~\n"+'\''+
                "libraryNumber : '" + libraryNumber + '\'' +
                ", userName : '" + userName + '\'' +
                ", phone : '" + phone + '\'' +
                ", email : '" + email + '\'' +
                '}';
    }
}
