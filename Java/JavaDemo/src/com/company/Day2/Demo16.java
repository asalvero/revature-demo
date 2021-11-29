package com.company.Day2;

public class Demo16 {
    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println(message.indexOf('o')); // @ index 4
        System.out.println(message.indexOf('o', 5)); // starts counting at index 5
        System.out.println(message.indexOf("ll")); // @ index 2
    }
}
