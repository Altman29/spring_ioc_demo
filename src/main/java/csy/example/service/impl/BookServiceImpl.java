package csy.example.service.impl;

import csy.example.dao.BookDao;
import csy.example.service.BookService;

public class BookServiceImpl implements BookService {

    //step5 删除业务层中使用new方式创建的dao对象
    // private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    //step6 提供对应的set方法（idea的setter生成）
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save >>>");
        bookDao.save();
    }
}
