package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        //Exercise 1
//        Student student = (Student) context.getBean("student1");
//        System.out.println(student);
//
//        //Exercise 2
//        Student student1 = (Student) context.getBean("student2");
//        System.out.println(student1);
//
//        Student student2 = (Student) context.getBean("student3");
//        System.out.println(student2);
//
//        //Exercise 3
//        Employee employee = context.getBean("employee1", Employee.class);
//        System.out.println(employee);
//
//        //Exercise 4
//        Customer customer = context.getBean("customer1", Customer.class);
//        System.out.println(customer);
//
//        //Exercise 5
//        User user = context.getBean("user1", User.class);
//        System.out.println(user);
//
//        //Exercise 6
//        Product product = context.getBean("product1", Product.class);
//        System.out.println(product);
//
//        //Exercise 7
//        Calculator calculator = context.getBean("calculator1", Calculator.class);
//        calculator.sum();

        //EmployeeTwo
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();
//        EmployeeTwo employee2 = context.getBean("employee2", EmployeeTwo.class);
//        System.out.println(employee2);

        //StudentTwo
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
    }
}
