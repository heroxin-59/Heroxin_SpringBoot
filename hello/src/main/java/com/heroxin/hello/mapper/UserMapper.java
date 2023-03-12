package com.heroxin.hello.mapper;

/*
    @Author Heroxin
    
    @Create 2023-03-07-11:17

    @Description:
*/

import com.heroxin.hello.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> getAllUser();
    @Delete("delete from user where id = #{id}")
    void deleteById(Integer id);
}
