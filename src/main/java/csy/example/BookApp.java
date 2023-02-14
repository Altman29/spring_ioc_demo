package csy.example;

import csy.example.service.BookService;
import csy.example.service.impl.BookServiceImpl;

public class BookApp {

    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();

        //单application
    }
}
