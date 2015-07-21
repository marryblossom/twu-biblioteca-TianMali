package com.twu.biblioteca.entity;

/**
 * Created by marry on 7/21/15.
 */
public class Book {
    private String Id;
    private String name;
    private String publisher;
    private String publishedTime;
    private String state;

    public Book(String id, String name, String publisher,String publishedTime,String state) {
        Id = id;
        this.name = name;
        this.publishedTime = publishedTime;
        this.publisher = publisher;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {

        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String toString(Book book){
        String bookString = "book id : "+book.getId()+
                            "   name : "+book.getName()+
                            "   author : "+book.getPublisher()+
                            "   publish time : "+book.getPublishedTime();
        return bookString;

    }
}
