package filecom;

import java.io.File;
import java.sql.ClientInfoStatus;
import java.util.Arrays;

public class FileTest01{
    String path="d://adfa/asd.test";
    String path02="test.txt";
    File file=new File(path,path02);

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程开始");
            }
        }).start();
new Thread(){
    public void run(){
        System.out.println("thread线程开始");
    }
}.start();


    }
}
