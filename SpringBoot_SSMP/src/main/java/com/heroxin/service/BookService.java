package com.heroxin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.heroxin.domain.Book;


/**
 * @author Heroxin
 * @create 2022-04-12-16:51
 * @Description:
 */
public interface BookService extends IService<Book> {
//    根据自己的需求重写或添加方法
    IPage<Book> getPage(Integer currentPage, Integer pageSize, Book book);

//    MyBatisPlus 帮忙写
/*    boolean save(Book book);

    boolean update(Book book);

    boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();

    IPage<Book> getPage(Integer currentPage,Integer pageSize);*/
}
