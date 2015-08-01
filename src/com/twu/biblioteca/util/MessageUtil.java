package com.twu.biblioteca.util;

/**
 * Created by marry on 7/21/15.
 */
public class MessageUtil {
    public static String welcomeMessage(){
        return "welcome to Biblioteca customer!!!";
    }
    public static String loginNumberReminderMessage(){
        return "please login,please enter your library number";
    }
    public static String loginPasswordReminderMessage(){
        return "please enter your password";
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
    public static String chooseReturnBookMessage(){return "please choose which book you need to return!!";}
    public static String returnValidateMessage(){
        return "That is not a valid book to return.";
    }
    public static String nothingReturnMessage(){
        return "You have nothing to return!";
    }
    public static String chooseBookMessage(){
        return "Please choose the book you want to get! or enter R to return previous!!!";
    }
    public static String readMovieThankfulessage(){
        return "Thank you! Enjoy the movie";
    }


    public static String movieChooseMessage(){return "Please chose one movie which you like!!!! or enter R to return previous!!!";}
    public static String chooseReturnMovieMessage(){return "Please choose which movie you need to return!!";}
    public static String returnMovieThankfulMessage(){
        return "Thank you for returning the movie";
    }
    public static String returnValidateMovieMessage(){
        return "That is not a valid movie to return.";
    }
    public static String optionMessage(){
        return "------------------\n"+
                "[1]List Books\n"+
                "[2]Return book\n"+
                "[3]List Movies\n"+
                "[4]Return Movies\n"+
                "[5]Quit";
    }
}
