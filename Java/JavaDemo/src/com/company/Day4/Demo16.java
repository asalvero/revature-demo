package com.company.Day4;

import java.util.ArrayList;
import java.util.Collections;

public class Demo16 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("yellow");
        colors.add("orange");
        colors.add("red");
        colors.add("blue");
        colors.add("pink");

        //before sorting
        System.out.println("before sorting...");
        for(String color: colors){
            System.out.println(color);
        }

        System.out.println();

        //after sorting
        System.out.println("after sorting...");
        Collections.sort(colors);
        for(String color: colors){
            System.out.println(color);
        }

        //list of numbers
        ArrayList<Integer>  numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        numbers.add(3);

        //before sorting
        System.out.println("before sorting...");
        for(int number: numbers){
            System.out.println(number);
        }

        System.out.println();

        //after sorting
        System.out.println("after sorting...");
        Collections.sort(numbers);
        for(int number: numbers){
            System.out.println(number);
        }
    }
}
