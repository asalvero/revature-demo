package com.company;

import java.util.TreeSet;

public class Question3 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        System.out.println(colors);

        System.out.println();

        TreeSet<String> newColors = new TreeSet<>();
        newColors.addAll(colors);
        System.out.println(newColors);
        System.out.println(colors);
    }
}
