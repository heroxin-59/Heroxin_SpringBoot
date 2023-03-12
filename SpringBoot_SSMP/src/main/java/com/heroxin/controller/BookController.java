package com.heroxin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.heroxin.controller.utils.R;
import com.heroxin.domain.Book;
import com.heroxin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * @author Heroxin
 * @create 2022-04-12-17:53
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController {
//    原始返回值，现在统一返回数据类型
/*
    @GetMapping
    public List<Book> list(){
        return bookService.list();
    }

    @PostMapping
    public boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    public boolean updateById(@RequestBody Book book){
        return bookService.updateById(book);
    }

    @DeleteMapping("/{id}")
    public boolean removeById(@PathVariable Integer id){
        return bookService.removeById(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize){
        return bookService.getPage(currentPage,pageSize);
    }
*/

    @Autowired
    private BookService bookService;

    @GetMapping
    public R list(){
//        查询一定正确，已经测试过了，只可能查询为空
//        return new R(bookService.list() != null,bookService.list());
        return new R(true,bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        boolean flag = bookService.save(book);
        return new R(flag,flag?"添加成功!":"添加失败！");
    }

    @PutMapping
    public R updateById(@RequestBody Book book){
        return new R(bookService.updateById(book));
    }

    @DeleteMapping("/{id}")
    public R removeById(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        System.out.println("heroxin");
        return new R(true,bookService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize,Book book){
        IPage<Book> page = bookService.getPage(currentPage, pageSize,book);
        System.out.println(book);
        if (currentPage > page.getPages())
            page = bookService.getPage((int) page.getPages(),pageSize,book);
        return new R(true,page);
    }

}
