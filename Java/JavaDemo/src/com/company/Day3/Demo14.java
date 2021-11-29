package com.company.Day3;

public class Demo14 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("Welcome to java class, have a nice day");
        System.out.println(sb.capacity());
    }
}
