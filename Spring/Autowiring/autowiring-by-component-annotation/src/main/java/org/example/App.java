package org.example;

import org.example.beans.Employee;
import org.example.beans.Student;
import org.example.beans.User;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) context.getBean("emp");
        System.out.println(employee);

        Student student = (Student) context.getBean("student");
        System.out.println(student);

        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
