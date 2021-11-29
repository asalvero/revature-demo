package com.company;

import java.util.TreeSet;

public class Question5 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        System.out.println(colors);

        System.out.println();

        System.out.println(colors.pollFirst());
        System.out.println(colors.pollLast());
    }
}
