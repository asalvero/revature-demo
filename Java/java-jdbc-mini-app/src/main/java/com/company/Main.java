package com.company;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
        //Employee Dao
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        Scanner scanner = new Scanner(System.in);

       boolean flag = true;
       while(flag){
           System.out.println();
           System.out.println("Select from the options below");
           System.out.println();
           System.out.println("PRESS 1: Add Employee");
           System.out.println("PRESS 2: Update Employee");
           System.out.println("PRESS 3: Delete Employee");
           System.out.println("PRESS 4: Get Employee List");
           System.out.println("PRESS 5: Get Employee by ID");
           System.out.println("PRESS 6: Exit");
           System.out.println();
           System.out.print("Enter number to perform action: ");
           System.out.println();

           int input = scanner.nextInt();
           switch(input){
               case 1:{// add
                   System.out.println("Enter name: ");
                   String name = scanner.next();
                   System.out.println("Enter email: ");
                   String email = scanner.next();
                   Employee employee = new Employee();
                   employee.setName(name);
                   employee.setEmail(email);
                   dao.addEmployee(employee);
                   break;
               }
               case 2:{// update
                   System.out.println("Enter name change: ");
                   String name = scanner.next();
                   System.out.println("Enter email change: ");
                   String email = scanner.next();
                   System.out.println("Enter the ID to implement the changes: ");
                   int id = scanner.nextInt();
                   Employee employee = new Employee(id, name, email);
                   employee.setId(id);
                   employee.setName(name);
                   employee.setEmail(email);
                   dao.updateEmployee(employee);
                   break;
               }
               case 3:{// delete
                   System.out.println("Enter ID to delete employee: ");
                   int id = scanner.nextInt();
                   dao.deleteEmployee(id);
                   break;
               }
               case 4:{// list
                   System.out.println("Printing list of employees: ");
                   List<Employee> employees = dao.getEmployees();
                   for(Employee employee : employees){
                       System.out.println(employee);
                   }
                   break;
               }
               case 5:{// id
                   System.out.println("Enter ID to search for employee: ");
                   int empId = scanner.nextInt();
                   Employee employee = dao.getEmployeeById(empId);
                   System.out.println(employee);
                   break;
               }
               case 6:{// exit
                   System.out.println("Exiting...");
                   flag = false;
                   break;
               }
               default:{
                   System.out.println("Wrong input selected. Please select the proper action.");
                   System.out.println();
               }
           }
       }
    }
}
