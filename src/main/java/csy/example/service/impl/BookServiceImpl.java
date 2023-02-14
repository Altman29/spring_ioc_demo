package csy.example.service.impl;

import csy.example.dao.BookDao;
import csy.example.dao.impl.BookDaoImpl;
import csy.example.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();

    @Override
    public void save() {
        System.out.println("book service save >>>");
        bookDao.save();
    }
}
