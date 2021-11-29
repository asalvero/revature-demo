package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Bert");
        linkedList.add("AJ");
        linkedList.add("Jo");
        linkedList.add("Kayla");
        System.out.println(linkedList);

        System.out.println();

        Iterator iterator = linkedList.listIterator(1); // prints from specific index
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
