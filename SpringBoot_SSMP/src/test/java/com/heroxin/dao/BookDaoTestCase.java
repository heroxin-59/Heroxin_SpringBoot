package com.heroxin.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.heroxin.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Heroxin
 * @create 2022-04-11-20:42
 * @Description:
 */
@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;


    @Test
    void selectById(){
        System.out.println(bookDao.selectById(1));
    }
    @Test
    void insert(){
        Book book = new Book();
        book.setName("heroxin");
        book.setType("测试");
        book.setDescription("测试");
        bookDao.insert(book);
    }

    @Test
    void delete(){
        bookDao.deleteById(10);
    }

    @Test
    void updateById(){
        Book book = new Book();
        book.setId(9);
        book.setName("heroxin");
        book.setType("测试");
        book.setDescription("haha");
        bookDao.updateById(book);
    }

    @Test
    void selectList(){
        List<Book> bookList = bookDao.selectList(null);
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Test
    void selectPage(){
        IPage page = new Page(2,5);
        bookDao.selectPage(page, null);
    }

    @Test
    void getBy01(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("description","入门");
        bookDao.selectList(queryWrapper);
    }
    @Test
    void getBy02(){
        String str = "入门";
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(str != null,Book::getDescription,str);
        bookDao.selectList(lambdaQueryWrapper);
    }
}
