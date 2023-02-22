package csy.example;

import csy.example.dao.BookDao;
import csy.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//step3 创建新Application
public class App2 {

    public static void main(String[] args) {
        //step4 使用IoC容器获取并调用目标bean的方法
        //获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取DAO的bean
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //调用
        // bookDao.save();
        // System.out.println("=========================");
        //获取Service的bean
        BookService bookService = (BookService) ctx.getBean("bookService");
        //调用
        bookService.save();

    }
}
