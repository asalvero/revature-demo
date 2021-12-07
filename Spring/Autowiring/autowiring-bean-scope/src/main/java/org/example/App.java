package org.example;

import org.example.beans.Employee;
import org.example.beans.Student;
import org.springframework.context.ApplicationContext;
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

        //Singleton
        Employee employee = (Employee) context.getBean("emp");
        System.out.println(employee.hashCode());

//        Employee employee2 = (Employee) context.getBean("emp2");
//        System.out.println(employee.hashCode());

        Student student = (Student) context.getBean("student1");
        System.out.println(student);
    }
}
