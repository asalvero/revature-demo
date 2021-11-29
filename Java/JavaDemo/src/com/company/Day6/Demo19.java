package com.company.Day6;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo19 {
    public static void main(String[] args) {
        //create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,6);
        System.out.println(numbers);
        // demonstrate the use of map method
        // square of each element
        List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);

        System.out.println();

        //create a list of String
        List<String> names = Arrays.asList("Watson", "Mark", "Paul", "Stacy", "Smith");
        //demonstrate the use of filter
        // filter all the name sin the list which start with S
        List <String> resultList = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());

        //demonstrate of sort method
        List<String> sortedResult = names.stream().sorted().collect(Collectors.toList());
        //create a list of integer
        List<Integer> numberList = Arrays.asList(2,3,4,5,6);
        //demonstrate the forEach method
        numberList.stream().map(x -> x*x).forEach(y -> System.out.println(y));
    }
}
