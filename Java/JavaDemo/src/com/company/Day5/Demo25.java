package com.company.Day5;

import java.util.Scanner;

public class Demo25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name and last name: ");
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}
