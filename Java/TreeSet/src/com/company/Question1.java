package com.company;

import java.util.TreeSet;

public class Question1 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("green"); // doesn't print duplicates
        System.out.println(colors);
    }
}
