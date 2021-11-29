package com.company.Day4;

import java.util.ArrayList;

public class Demo15 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");

        //get
        System.out.println(names.get(1)); //paul
        //set
        names.set(1, "Paul Smith");

        for(String name: names){
            System.out.println(names);
        }
    }
}
