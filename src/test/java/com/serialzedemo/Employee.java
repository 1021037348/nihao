package com.serialzedemo;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int age; // transient瞬态修饰成员,不会被序列化,不会把这个属性保存到文件中,持久化

    public void addressCheck() {
        System.out.println("Address  check : " + name + " -- " + address+" -- "+age);
    }
}
