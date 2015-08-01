package com.twu.biblioteca.entityDao;

import com.twu.biblioteca.entity.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by marry on 7/21/15.
 */
public class BookDaoTest {
    List<Book> books;
    BookDao bookDao;
    @Before
    public void setUp() throws Exception {
        bookDao = new BookDao();
        books = bookDao.getAllBooks();
    }

    @Test
    public void getBookById() throws Exception {
        Book book = new Book("2","Stray Birds","Tagore","2013-9-1","active");
        assertEquals("Stray Birds",bookDao.getBookById(books,"2").getName());
    }

    @Test
    public void testGetAllBooks() throws Exception {
        assertEquals(5,books.size());
    }
    @Test
    public void testGetBookActive()throws Exception {
        assertEquals(5,bookDao.getBookActive(books).size());
    }
    @Test
    public void testSetBookLocked()throws Exception {
        assertNotNull(bookDao.setBookLocked(books, "1"));
    }
    @Test
    public void testGetBookLocked()throws Exception {
        books.get(0).setState("locked");
        assertEquals(1, bookDao.getBookLocked(books).size());
    }
    @Test
    public void testSetBookActive()throws Exception {
        books.get(0).setState("locked");
        books.get(1).setState("locked");
        assertNotNull(bookDao.setBookActive(books, "1"));

    }
}