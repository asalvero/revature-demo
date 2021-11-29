package com.company.Day3;

public class Demo6 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");

        System.out.println(s1 == s2); //true because the contents are the same
        System.out.println(s1 == s3); //false because the contents are different instance
    }
}
