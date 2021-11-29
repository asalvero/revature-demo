package com.company.Day2;

interface IEmployee{
    void print();
}

class Employee1 implements IEmployee{

    @Override
    public void print() {
        System.out.println("interface print method");
    }
}

public class Demo26 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.print();

        //IEmployee iEmployee = new IEmployee1(); cant do this
        IEmployee iEmployee = new Employee1(); // can do this
    }
}
