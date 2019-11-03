package demo;


import demo.pojo.Label;
import demo.pojo.Star;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class Proxydemo {

    public static void main(String[] args) {

Label label=new Label();
        Star jiji = (Star)Proxy.newProxyInstance(label.getClass().getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("对象被调用之前.....");
                Object invoke = method.invoke(label, args);
                System.out.println("对象被调用之后");
                return invoke;
            }
        });
RedisProperties.Jedis jedis=new RedisProperties.Jedis();


    }

}
