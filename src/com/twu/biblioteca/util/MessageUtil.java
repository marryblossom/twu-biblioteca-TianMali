package com.twu.biblioteca.util;

/**
 * Created by marry on 7/21/15.
 */
public class MessageUtil {
    public static String welcomeMessage(){
        return "welcome to Biblioteca customer!!!";
    }
    public static String validMessage(){
        return "Select a valid option!";
    }
    public static String readThankfulMessage(){
        return "Thank you! Enjoy the book";
    }
    public static String bookNotAvailableMessage(){
        return "That book is not available";
    }
    public static String returnThankfulMessage(){
        return "Thank you for returning the book";
    }
    public static String returnValidateMessage(){
        return "That is not a valid book to return.";
    }
    public static String returnToPrevious(){
        return "Return to previous menu? Y/N";
    }
    public static String nothingReturnMessage(){
        return "You have nothing to return!";
    }
    public static String chooseBookMessage(){
        return "Please choose the book you want to get!";
    }

    public static String optionMessage(){
        return "------------------\n"+
                "[1]List Books\n"+
                "[2]Quit\n"+
                "[3]return book";
    }
}
