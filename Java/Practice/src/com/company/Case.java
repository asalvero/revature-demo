package com.company;

// Look at JavaDemo/Day1/Demo7-8

public class Case {
    public static void main(String[] args) {
        String str = "One";
        switch(str){
            case "One":
                System.out.println(1);
                break;
            case "Two":
                System.out.println(2);
                break;
            case "Three":
                System.out.println(3);
                break;
            default:
                System.out.println("Not a valid option");
        }
    }
}
