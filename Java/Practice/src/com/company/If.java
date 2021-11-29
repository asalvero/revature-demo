package com.company;

// Look at JavaDemo/Day1/Demo4-6

public class If {
    public static void main(String[] args) {
        int num = 75;

        if(num >= 90){
            System.out.println("A");
        } else if(num <= 90 && num >= 76){
            System.out.println("B");
        }else if(num <= 75 && num >= 50){
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }

        //simpler form of if/else statement
        int age = 20;
        String result = age >18 ? "eligible" : "not eligible";
        System.out.println(result);
    }
}
