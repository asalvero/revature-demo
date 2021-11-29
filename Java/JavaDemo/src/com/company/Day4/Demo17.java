package com.company.Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo17 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Mark");
        names.add("John");
        names.add("Watson");
        names.add("Stacy");

        //iterator
        Iterator iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //for-each
        for (String name: names){
            System.out.println(name);
        }

        //for
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //forEach
        names.forEach(name -> {
            System.out.println(name);
        });
    }
}
