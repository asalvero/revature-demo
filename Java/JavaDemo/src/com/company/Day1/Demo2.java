package com.company;

import java.sql.SQLOutput;

public class Demo2 {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 10;
        boolean e = true;
        boolean f = false;

        //arithmetic
        System.out.println(a + b); // addition
        System.out.println(a - b); // subtraction
        System.out.println(a * b); // multiplication
        System.out.println(a / b); // division

        //relational
        System.out.println(a > b); // greater than

        //logical
        System.out.println(a > b && a > c); // and
        System.out.println(a > b && a < b);
        System.out.println(a > b || a < c); // or

        //ternary
        int max = (a < b) ? a : b; // ternary operator
        System.out.println(max);
    }
}
