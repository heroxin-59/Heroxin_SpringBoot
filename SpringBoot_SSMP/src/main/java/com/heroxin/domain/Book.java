package com.heroxin.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Heroxin
 * @create 2022-04-11-20:43
 * @Description:
 */
@Data
@TableName("book")
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
