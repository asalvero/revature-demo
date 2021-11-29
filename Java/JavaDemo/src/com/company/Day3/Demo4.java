package com.company.Day3;

public class Demo4 {
    public static void main(String[] args) {
        String str  = "Hello";
        str.concat("World"); //we are using concat() method to append to string at the end
        System.out.println(str); //will print "hello" because strings are immutable objects

        String str1 = "Hello";
        str1 = str1.concat("World");
        System.out.println(str1);
    }
}
