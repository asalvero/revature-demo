package com.company.Day4;

import java.util.HashSet;
import java.util.Iterator;

public class Demo22 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Mark");
        set.add("Paul");
        set.add("Watson");
        set.add("Mark");
        set.add(null);
        set.add(null);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove
        set.remove("Paul");
        System.out.println(set);

        //removeAll()
        //removeIf()
        //clear()
    }
}
