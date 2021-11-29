package com.company.Day5;

public class Demo22 {
    public static void main(String[] args) {
        //explicit conversion
        double a = 123.45;
        long b =(long) a; // converting double to long
        int c = (int) b; // converting long to int

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
