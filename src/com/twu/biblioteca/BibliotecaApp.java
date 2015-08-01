package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.controller.CustomerController;
import com.twu.biblioteca.controller.MovieController;
import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entity.Customer;
import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.util.InputOperatingUtil;
import com.twu.biblioteca.util.MessageUtil;

import java.util.List;

public class BibliotecaApp {
    private static BookController bookController = new BookController();
    private static CustomerController customerController = new CustomerController();
    private static MovieController movieController = new MovieController();

    private static List<Book> books = bookController.getAllbooks();
    private static List<Movie> movies = movieController.getAllMovies();
    private static String returnPreviousOrBookNumber;
    private static String returnPreviousOrMovieNumber;

    private static String inputChoose;
    private static String bookReturnInput;
    private static String movieReturnInput;

    public static void main(String[] args) {
       if(login()){
           System.out.println(MessageUtil.optionMessage());
           inputChoose = InputOperatingUtil.getInput();
           while (true) {
               if (inputChoose.equals("1")) {
                   manageBooks();
               } else if(inputChoose.equals("2")){
                   manageReturnBooks();
               } else if(inputChoose.equals("3")){
                   manageMovies();
               }else if(inputChoose.equals("4")){
                   manageReturnMovies();
               } else if(inputChoose.equals("5")){
                   break;
               }else {
                   manageValid();
               }
           }
       } else {
           login();
       }
    }


    public static boolean login(){
        System.out.println(MessageUtil.welcomeMessage());
        System.out.println(MessageUtil.loginNumberReminderMessage());
        String libNumber = InputOperatingUtil.getInput();
        System.out.println(MessageUtil.loginPasswordReminderMessage());
        String pwd = InputOperatingUtil.getInput();
        Customer customer = customerController.checkLogin(libNumber,pwd);
        if (customer != null){
            System.out.println(customer);
            return true;
        }
        return false;
    }
    public static void manageBooks(){
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString(books.get(i)));
        }
       do{
           System.out.println(MessageUtil.chooseBookMessage());
           returnPreviousOrBookNumber = InputOperatingUtil.getInput();
           if (returnPreviousOrBookNumber.equals("R")){
               System.out.println(MessageUtil.optionMessage());
               inputChoose = InputOperatingUtil.getInput();
           }else if(new Integer(returnPreviousOrBookNumber) <= bookController.getAllbooks().size()){
               bookController.setBookLock(books, returnPreviousOrBookNumber);
               System.out.println(MessageUtil.readThankfulMessage());
           }else {
               System.out.println(MessageUtil.bookNotAvailableMessage());
           }
       }while (inputChoose.equals("1"));


    }
    public static void manageReturnBooks(){
        List<Book> lockedBooks = bookController.getLockedBooks(books);
        int lockedBooksSize = bookController.getLockedBooks(books).size();
        if (lockedBooksSize > 0){
            for (int i = 0; i < lockedBooks.size(); i++) {
                    System.out.println(lockedBooks.get(i).toString(lockedBooks.get(i)));
            }
            do{
                System.out.println(MessageUtil.chooseReturnBookMessage());
                bookReturnInput = InputOperatingUtil.getInput();
                Book book =  bookController.setBookActive(books, bookReturnInput);
                if (book != null){
                    lockedBooksSize = lockedBooksSize-1;
                    System.out.println(lockedBooksSize);
                    System.out.println(MessageUtil.returnThankfulMessage());
                }else {
                    System.out.println(MessageUtil.returnValidateMessage());
                }
            }while(inputChoose.equals("2") && lockedBooksSize > 0);

        }else {
            System.out.println(MessageUtil.nothingReturnMessage());
            System.out.println(MessageUtil.optionMessage());
            inputChoose = InputOperatingUtil.getInput();
        }
    }

    public static void manageMovies(){
        for(Movie movie:movies){
            System.out.println(movie);
        }
        do{
            System.out.println(MessageUtil.movieChooseMessage());
            returnPreviousOrMovieNumber = InputOperatingUtil.getInput();
            if (returnPreviousOrMovieNumber.equals("R")){
                System.out.println(MessageUtil.optionMessage());
                inputChoose = InputOperatingUtil.getInput();
            }else if(new Integer(returnPreviousOrMovieNumber) <= movieController.getAllMovies().size()){
                movieController.setMovieLocked(movies, returnPreviousOrMovieNumber);
                System.out.println(MessageUtil.readMovieThankfulessage());
            }else {
                System.out.println(MessageUtil.validMessage());
            }
        }while (inputChoose.equals("3"));

    }
    public static void manageReturnMovies(){
        List<Movie> lockedMovies = movieController.getLockedMovies(movies);
        int lockedMoviesSize =lockedMovies.size();
        if (lockedMoviesSize > 0){
            for (int i = 0; i < lockedMovies.size(); i++) {
                System.out.println(lockedMovies.get(i).toString());
            }
            do{
                System.out.println(MessageUtil.chooseReturnMovieMessage());
                movieReturnInput = InputOperatingUtil.getInput();
                Movie movie  = movieController.setMovieActive(movies, movieReturnInput);
                if (movie != null){
                    lockedMoviesSize = lockedMoviesSize-1;
                    System.out.println(MessageUtil.returnMovieThankfulMessage());
                }else {
                    System.out.println(MessageUtil.returnValidateMovieMessage());
                }
            }while(inputChoose.equals("2") && lockedMoviesSize > 0);

        }else {
            System.out.println(MessageUtil.nothingReturnMessage());
            System.out.println(MessageUtil.optionMessage());
            inputChoose = InputOperatingUtil.getInput();
        }
    }
    public static void manageValid(){
        System.out.println(MessageUtil.validMessage());
        System.out.println(MessageUtil.optionMessage());
        inputChoose = InputOperatingUtil.getInput();
    }
}
