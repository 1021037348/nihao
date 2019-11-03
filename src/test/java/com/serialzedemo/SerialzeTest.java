package com.serialzedemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialzeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "zhangsan";
        e.address = "beiqinglu";
        e.age = 20;

        try {
            // 创建序列化流对象
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java01.txt"));
            // 写出对象
            oos.writeObject(e);//将指定的对象,写到文件中保存起来。
            // 释放资源
            oos.close();

            System.out.println("Serialized data is saved"); // 姓名，地址被序列化，年龄没有被序列化。
        } catch(IOException i)   {
            i.printStackTrace();
        }
    }
}
