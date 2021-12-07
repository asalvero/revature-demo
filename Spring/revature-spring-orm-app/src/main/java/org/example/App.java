package org.example;

import org.example.dao.EmployeeDao;
import org.example.entities.Employee;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
        Employee emp = new Employee(123, "Mark", "mark@gmail.com");
        int r = dao.insert(emp);
        System.out.println("done " + r);
    }
}
