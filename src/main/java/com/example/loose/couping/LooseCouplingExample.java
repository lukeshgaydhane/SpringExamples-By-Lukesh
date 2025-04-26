package com.example.loose.couping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationIocLooseCoupling.xml");

        UserManager userManager= (UserManager) context.getBean("userManagerWithUserData");
        System.out.println(userManager.getUserInfo());

        UserManager webManager = (UserManager) context.getBean("userManagerWithWebService");
        System.out.println(webManager.getUserInfo());
    }

}
