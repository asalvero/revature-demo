package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class Question2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Bert");
        hashSet.add("Che");
        hashSet.add("AJ");
        hashSet.add("Kayla");
        System.out.println(hashSet);

        System.out.println();

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
