package com.company;

// Look at JavaDemo/Day1/Demo12-13

public class While {
    public static void main(String[] args) {
        // while loo[
        int a = 1;
        while(a <= 5){
            System.out.println(a);
            a++; //allows loop to end
        }

        /* creates a infinite loop
        while(a <= 5){
            System.out.println(a);
        }
         */

        System.out.println();

        //do while loop
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 5);
    }
}
