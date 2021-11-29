package com.company.Day4;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo21 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");
        System.out.println(names);

        //adding elements
        names.add(0, "John");
        System.out.println(names);

        //adding second list
        LinkedList<String> namesNew = new LinkedList<>();
        namesNew.add("Rangel");
        namesNew.add("Stacy");

        names.addAll(namesNew);
        System.out.println(names);

        //addFirst
        names.addFirst("First");
        System.out.println(names);

        //addLast
        names.addLast("Last");
        System.out.println(names);

        //remove()
        //removeFirst
        //removeLast
        //removeFirstOccurrence
        //removeLastOccurrence

        names.add("Paul");
        names.add("John");
        System.out.println(names);

        System.out.println();

        names.removeLastOccurrence("Paul");
        names.removeFirstOccurrence("John");
        System.out.println(names);

        //reverse element
        System.out.println("Original List");
        System.out.println(names);
        //traversing list element in reverse order
        Iterator iterator = names.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(int i = names.size() -1; i > 0; i--){
            System.out.println(names.get(i));
        }
    }
}
