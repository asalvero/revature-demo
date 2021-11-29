package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Question4 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        System.out.println(colors);

        System.out.println();

        Iterator iterator = colors.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        TreeSet<Object> reverseColors = new TreeSet<>();
        //colors.pollLast();
        for(int i = colors.size() -1; i >= 0; i--){
            reverseColors.add(colors.pollLast());
            System.out.println(reverseColors);
        }
    }
}
