package com.heroxin.controller.utils;

import lombok.Data;

/**
 * @author Heroxin
 * @create 2022-04-12-20:04
 * @Description:
 *          前后端统一数据协议
 *          所有数据用 data 返回
 *                   flag ： true 没查到
 *                          false 运行错误
 */
@Data
public class R {
    private boolean flag;
    private Object data;
    private String msg;
    public R(){}

    public R(boolean flag){
        this.flag = flag;
    }

    public R(boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
    public R(boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }
    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }
}
