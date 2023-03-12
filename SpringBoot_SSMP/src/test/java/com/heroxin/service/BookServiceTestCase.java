package com.heroxin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.heroxin.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Heroxin
 * @create 2022-04-12-17:14
 * @Description:
 */
@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private BookService bookService;

    @Test
    void selectById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void insert(){
        Book book = new Book();
        book.setName("heroxin");
        book.setType("测试");
        book.setDescription("测试");
        System.out.println(bookService.save(book));
    }

    @Test
    void delete(){
        System.out.println(bookService.removeById(11));
    }

    @Test
    void updateById(){
        Book book = new Book();
        book.setId(9);
        book.setName("heroxin");
        book.setType("测试");
        book.setDescription("xixi");
        System.out.println(bookService.updateById(book));
    }

    @Test
    void selectList(){
        List<Book> bookList = bookService.list();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Test
    void selectPage(){
        IPage<Book> page = new Page<>(1,5);
        bookService.page(page);
    }


}
