package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entityDao.BookDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marry on 8/1/15.
 */
public class BookController {
    BookDao bookDao = new BookDao();

    public List<Book> getAllbooks (){
        return bookDao.getAllBooks();
    }

    public List<Book> getActivebooks (List<Book> allBooks){
        return bookDao.getBookActive(allBooks);
    }
    public void setBookLock(List<Book> activeBooks, String choosenBook){
        bookDao.setBookLocked(activeBooks,choosenBook);
    }
    public List<Book> getLockedBooks (List<Book> allBooks){
        return bookDao.getBookLocked(allBooks);
    }
    public Book setBookActive (List<Book> lockedBooks, String choosenBook){
       return bookDao.setBookActive(lockedBooks,choosenBook);
    }

}
