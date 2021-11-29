package com.company;

import java.util.HashSet;

public class Question3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Bert");
        hashSet.add("Che");
        hashSet.add("AJ");
        hashSet.add("Kayla");
        System.out.println(hashSet);

        System.out.println();

        System.out.println("HashSet has this many elements: "+ hashSet.size());
    }
}
