package com.company.Day4;


import java.util.ArrayList;

public class Demo19 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("John");
        names.add("Watson");
        names.add("Paul");

        System.out.println(names);

        //getting element on a specified index
        System.out.println(names.get(1));

        //adding element on a specified index
        names.add(1, "Rangel");
        System.out.println(names);

        //merge two list
        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Smith");
        newNames.add("Stacy");
        //names.addAll(newNames); // adds to end of ArrayList
        names.addAll(0, newNames); // adds to beginning of Arraylist with specific index
        System.out.println(names);

        //remove
        names.remove("Mark");
        System.out.println(names);

        //remove
        names.remove(0);
        System.out.println(names);

        // remove based on condition
        names.removeIf(name -> names.contains("Paul"));
        System.out.println(names);
    }
}
