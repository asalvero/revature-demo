package com.company.Day5;

public class Demo21 {
    public static void main(String[] args) {
        //implicit conversion
        int a = 10;
        long b = a; // automatically converts int to long
        float c = b; // automatically converts long to float

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
