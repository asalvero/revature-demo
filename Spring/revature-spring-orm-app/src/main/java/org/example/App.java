package org.example;

import org.example.dao.EmployeeDao;
import org.example.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
//        int r = dao.addEmployee(emp);
//        int s = dao.addEmployee(emp2);
//        System.out.println("done " + r);
//        System.out.println("done " + s);
//        dao.update(emp);
//        dao.delete(emp);
//        dao.getById(125);
//        dao.getEmployees();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;

        while(flag){
            System.out.println("***********");
            System.out.println("Press 1: Add Employee");
            System.out.println("Press 2: Delete Employee");
            System.out.println("Press 3: Update Employee");
            System.out.println("Press 4: Get By Id Employee");
            System.out.println("Press 5: Get All Employee");
            System.out.println("Press 6: Exit");
            System.out.println("***********");


            Employee employee = new Employee();

            try{
                int input =  Integer.parseInt(br.readLine());

                switch(input){
                    case 1:
                        // add employee
                        System.out.println("Enter Employee Id: ");
                        int id = Integer.parseInt(br.readLine());
                        System.out.println("Enter Employee Name: ");
                        String name = br.readLine();
                        System.out.println("Enter Employee Email: ");
                        String email = br.readLine();
                        Employee newEmployee = new Employee();
                        newEmployee.setEmpId(id);
                        newEmployee.setName(name);
                        newEmployee.setEmail(email);

                        dao.addEmployee(newEmployee);
                        System.out.println("Employee inserted successfully");
                        break;
                    case 2:
                        //delete employee
                        dao.deleteEmployee(employee);
                        System.out.println("Employee successfully deleted");
                        break;
                    case 3:
                        //update employee
                        dao.updateEmployee(employee);
                        System.out.println("Employee successfully updated");
                        break;
                    case 4:
                        //get by id
                        System.out.println("Enter Employee Id: ");
                        int empId = Integer.parseInt(br.readLine());
                        dao.getEmployeeById(empId);
                        break;
                    case 5:
                        //get all employees
                        dao.getAllEmployees();
                        break;
                    case 6:
                        System.out.println("Thank you");
                        System.out.println("Closing...");
                        flag = false;
                        break;
                    default:
                        System.out.println("Choose an option between 1-6");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
