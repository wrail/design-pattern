package com.wrial.aggregation;
/*
 * @Author  Wrial
 * @Date Created in 11:43 2019/9/15
 * @Description
 */

public class Computer {

    private Screen screen;
    private Monitor monitor = new Monitor();

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

}
