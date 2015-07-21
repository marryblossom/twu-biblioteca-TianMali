package com.twu.biblioteca;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.entityDao.BookDao;
import com.twu.biblioteca.util.InputOperatingUtil;
import com.twu.biblioteca.util.MessageUtil;

import java.util.List;

public class BibliotecaApp {
    private static BookDao bookDao = new BookDao();
    private static List<Book> books = bookDao.getAllBooks();
    public static void main(String[] args) {
        System.out.println(MessageUtil.welcomeMessage());
        System.out.println(MessageUtil.optionMessage());
        String inputChoose = InputOperatingUtil.getInput();
        while (true) {
            if (inputChoose.equals("1")) {
                for (int i = 0; i < books.size(); i++) {
                    if (books.get(i).getState().equals("active")){
                        System.out.println(books.get(i).toString(books.get(i)));
                    }
                }
                String inputBookChoose = InputOperatingUtil.getInput();
                for (int i = 0; i < books.size(); i++) {
                    if(books.get(i).getId().equals(inputBookChoose)){
                        books.get(i).setState("locked");
                        System.out.println(MessageUtil.readThankfulMessage());
                        System.out.println(MessageUtil.optionMessage());
                        inputChoose = InputOperatingUtil.getInput();
                        break;
                    }else {
                        System.out.println(MessageUtil.bookNotAvailableMessage());
                        System.out.println(MessageUtil.optionMessage());
                        inputChoose = InputOperatingUtil.getInput();
                        break;
                    }
                }
            } else if(inputChoose.equals("2")){
                break;
            } else if(inputChoose.equals("3")){
                for (int i = 0; i < books.size(); i++) {
                    if (books.get(i).getState().equals("locked")){
                        System.out.println(books.get(i).toString(books.get(i)));
                    }
                }
                String returnInput = InputOperatingUtil.getInput();
                for (int i = 0; i < books.size(); i++) {
                    if (books.get(i).getState().equals("locked")&&books.get(i).getId().equals(returnInput)){
                        System.out.println(MessageUtil.readThankfulMessage());
                        break;
                    }else {
                        System.out.println(MessageUtil.returnValidateMessage());
                        returnInput = InputOperatingUtil.getInput();
                    }
                }
            } else {
                System.out.println(MessageUtil.validMessage());
                System.out.println(MessageUtil.optionMessage());
                inputChoose = InputOperatingUtil.getInput();
            }
        }

    }
}
