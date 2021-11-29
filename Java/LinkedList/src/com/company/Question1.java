package com.company;

import java.util.LinkedList;

public class Question1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Bert");
        linkedList.add("AJ");
        linkedList.add("Jo");
        linkedList.add("Kayla");
        System.out.println(linkedList);

        linkedList.addLast("John");
        System.out.println(linkedList);

        linkedList.addFirst("Angie");
        System.out.println(linkedList);
    }
}
