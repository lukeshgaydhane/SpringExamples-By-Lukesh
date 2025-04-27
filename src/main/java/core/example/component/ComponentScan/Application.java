package core.example.component.ComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("componentScanEmployee.xml");

        Employee employee = context.getBean("employee" , Employee.class);  // use this .class if you don't want to make use of cast...
        System.out.println(employee.toString());
    }
}
