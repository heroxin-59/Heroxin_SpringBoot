package com.heroxin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heroxin.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Heroxin
 * @create 2022-04-11-20:44
 * @Description:
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
