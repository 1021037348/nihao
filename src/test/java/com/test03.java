package com;

public class test03 extends Thread {
   public test03(String name){
       super(name);
   }
    @Override
    public void run() {
        while(true){
            synchronized (this){
                try {
                    System.out.println("线程执行");
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class dem{
    public static void main(String[] args) {
        test03 test=new test03("线程");
test.start();
    }
}
