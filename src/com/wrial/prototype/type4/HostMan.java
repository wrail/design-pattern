package com.wrial.prototype.type4;
/*
 * @Author  Wrial
 * @Date Created in 17:19 2019/9/25
 * @Description 主人
 */


import java.io.Serializable;

public class HostMan implements Serializable {
    HostMan(String name) {
        this.name = name;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
