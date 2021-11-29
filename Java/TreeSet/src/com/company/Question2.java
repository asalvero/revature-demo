package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Question2 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        System.out.println(colors);

        System.out.println();

        Iterator iterator = colors.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
