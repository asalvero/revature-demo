package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Question4 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Bert");
        linkedList.add("AJ");
        linkedList.add("Jo");
        linkedList.add("Kayla");
        System.out.println(linkedList);

        System.out.println();

        //In original order
        Iterator ascending = linkedList.iterator();
        while(ascending.hasNext()){
            System.out.println(ascending.next());
        }

        System.out.println();

        //In reverse order
        Iterator descending = linkedList.descendingIterator();
        while (descending.hasNext()){
            System.out.println(descending.next());
        }
    }
}
