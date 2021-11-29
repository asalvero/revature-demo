package com.company;

// Look at JavaDemo/Day1/Demo9-11

public class For {
    public static void main(String[] args) {
        // regular for loop
        int i;
        for(i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println();

        for(i = 10; i > 0; i--){
            System.out.println(i);
        }

        System.out.println();

        // nested for loop
        for(int k = 1; k <= 10; k++){ //creates the line
            for(int j = 1; j <= k; j++){ // creates the stars
                System.out.print("* ");
            }
            System.out.println();
        }

        // nested loop, but upside down due to j variable
        for(int k = 1; k <= 10; k++){ //creates the line
            for(int j = 10; j >= k; j--){ // creates the stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
