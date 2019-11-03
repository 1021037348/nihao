package com;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("你啊"+Thread.currentThread().getName());
    }
}
class test{
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
     Thread m=new Thread(myThread,"线程一号");
     Thread me=new Thread(myThread,"线程二号");
     m.start();
     me.start();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(myThread);
        pool.shutdown();
    }


}
