package com.twu.biblioteca.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by marry on 8/1/15.
 */
public class CustomerControllerTest {
   CustomerController customerController;
    @Before
    public void setUp() throws Exception {
        customerController = new CustomerController();
    }

    @Test
    public void testCheckLogin() throws Exception {
        assertNull(customerController.checkLogin("123-1234","123"));
    }
}