package com.heroxin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heroxin.dao.BookDao;
import com.heroxin.domain.Book;
import com.heroxin.service.BookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Heroxin
 * @create 2022-04-12-17:01
 * @Description:
 */

@Service
public class BookServiceImpl extends ServiceImpl<BookDao,Book> implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize, Book book) {
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();

        lambdaQueryWrapper.like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType());
        lambdaQueryWrapper.like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
        lambdaQueryWrapper.like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());

        IPage<Book> page = new Page<>(currentPage,pageSize);
        return bookDao.selectPage(page,lambdaQueryWrapper);
    }

    /*

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize) {
        IPage page = new Page(currentPage,pageSize);
        return bookDao.selectPage(page,null);
    }*/
}
