package com.company;

import java.util.LinkedList;

public class Question5 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Bert");
        linkedList.add("AJ");
        linkedList.add("Jo");
        linkedList.add("Kayla");
        System.out.println(linkedList);

        System.out.println();

        linkedList.add(2,"Che");
        System.out.println(linkedList);
    }
}
