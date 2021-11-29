package com.company.Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo14 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Mark");
        //myList.add(10); ArrayList is of type String
        myList.add("Paul");
        myList.add("John");

        System.out.println(myList);

        //iterator
        Iterator iterator = myList.iterator();
        //hasNext() will check if iterator has the element
        while(iterator.hasNext()){
            System.out.println(iterator.next()); //print element and move the cursor to the next element
        }

        //forEach
        for(String name:myList){
            System.out.println(name);
        }
    }
}
