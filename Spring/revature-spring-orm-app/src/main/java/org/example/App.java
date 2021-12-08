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
//        Employee emp = new Employee(124, "Paul", "paul@gmail.com");
//        Employee emp2 = new Employee(125, "Watson", "watson@gmail.com");
//        int r = dao.insert(emp);
//        int s = dao.insert(emp2);
//        System.out.println("done " + r);
//        System.out.println("done " + s);
//        dao.update(emp);
//        dao.delete(emp);
//        dao.getById(125);
        dao.getEmployees();
    }
}
