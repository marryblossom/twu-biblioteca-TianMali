package com.twu.biblioteca.entityDao;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.util.MessageUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marry on 7/21/15.
 */
public class BookDao {
    private List<Book> books = new ArrayList<Book>();
    Book book;
    public List<Book> getAllBooks(){
        book = new Book("1","Three Days to See","Helen Keller","2000-1-1","active");
        books.add(book);
        book = new Book("2","Stray Birds","Tagore","2013-9-1","active");
        books.add(book);
        book = new Book("3","My loneliness is a garden","Adonis","2009-3-1","active");
        books.add(book);
        book = new Book("4","Sadness and reason","Joseph Brodsky","2015-5-1","active");
        books.add(book);
        book = new Book("5","Walden","Thoreau","2009-1-1","active");
        books.add(book);
        return books;
    }
    public Book getBookById(List<Book> books ,String id){
        for (Book book:books){
            if (id.equals(book.getId())){
                return book;
            }
        }
        return null;
    }
    public List<Book> getBookActive(List<Book> allBooks){
        List<Book> bookList = new ArrayList<Book>();
        for (Book book:allBooks){
            if (book.getState().equals("active")){
                bookList.add(book);
            }
        }
        return bookList;
    }
    public Book setBookLocked(List<Book> activeBooks, String choosenBook){
        for(Book book : activeBooks){
            if (book.getId().equals(choosenBook)){
                book.setState("locked");
                return book;
            }
        }
        return null;
    }
    public List<Book> getBookLocked(List<Book> allBooks){
        List<Book> bookList = new ArrayList<Book>();
        for (Book book:allBooks){
            if (book.getState().equals("locked")){
                bookList.add(book);
            }
        }
        return bookList;
    }
    public Book setBookActive(List<Book> lockedBooks, String choosenBook){
        for (int i = 0; i < lockedBooks.size(); i++) {
            if (lockedBooks.get(i).getId().equals(choosenBook)){
                lockedBooks.get(i).setState("active");
                return lockedBooks.get(i);
            }
        }
        return null;
    }
}
