package org.example.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = context.getBean("employee" , Employee.class);  // use this .class if you don't want to make use of cast...
        System.out.println(employee.toString());
        Manager  manager = context.getBean("manager", Manager.class);
        System.out.println(manager.toString());
    }

}
