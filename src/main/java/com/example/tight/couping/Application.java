package com.example.tight.couping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationIocTightCoupling.xml");

        UserManager manager = (UserManager) context.getBean("userManager");
        System.out.println(manager.getUserInfo());
    }
}
