package com;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

public class MailUtil {
    public static void sendMail(String mail,String subject,String emailMsg) {
        Properties properties=new Properties();
        properties.setProperty("mail.transport.protocol","SMTP");//邮件收发协议
        properties.setProperty("mail.host","smtp.163.com");//邮件收发服务器的地址
        properties.setProperty("mail.smtp.auth","true");//指定验证密码为true
        //创建验证码器
        Authenticator auth=new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //发件人用户名(不带后缀的)和授权码(有就用没有就使用密码)
                return null;//super.getPasswordAuthentication("zhaoju_itcast","meiyoumima");
            }
        };
//Session session=Session.getInstance(properties,auth);
    }
}
