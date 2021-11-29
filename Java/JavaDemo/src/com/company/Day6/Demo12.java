package com.company.Day6;

import java.util.ArrayList;
import java.util.List;

public class Demo12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mark");
        list.add("Paul");
        list.add("Watson");

        //using lambda with forEach
        list.forEach((name) -> System.out.println(name));
    }
}
