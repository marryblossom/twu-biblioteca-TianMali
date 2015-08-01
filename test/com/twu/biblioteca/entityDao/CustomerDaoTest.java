package com.twu.biblioteca.entityDao;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by marry on 8/1/15.
 */
public class CustomerDaoTest {
private CustomerDao customerDao;
    @Before
    public void setUp() throws Exception {
        customerDao = new CustomerDao();
    }

    @Test
    public void testGetCustomers() throws Exception {
        assertEquals(1,customerDao.getCustomers().size());
    }
}