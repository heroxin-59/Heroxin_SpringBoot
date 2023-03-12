package com.heroxin.hello.po;

import lombok.Data;

import java.io.Serializable;

/*
    @Author Heroxin
    
    @Create 2023-03-07-11:15

    @Description:
*/
@Data

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String password;
}
