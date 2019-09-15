package com.wrial.uml;
/*
 * @Author  Wrial
 * @Date Created in 23:37 2019/9/14
 * @Description
 */


import com.wrial.aggregation.Computer;

public class Person {

    private Computer computer;
    Person() {

    }
    private Integer id;
    private Integer name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }
}
