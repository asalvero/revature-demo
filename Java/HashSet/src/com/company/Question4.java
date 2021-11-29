package com.company;

import java.util.Collection;
import java.util.HashSet;

public class Question4 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Bert");
        hashSet.add("Che");
        hashSet.add("AJ");
        hashSet.add("Kayla");
        System.out.println(hashSet);

        System.out.println();

        hashSet.removeAll(hashSet);
        System.out.println(hashSet);
    }
}
