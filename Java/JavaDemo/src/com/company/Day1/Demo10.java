package com.company;

public class Demo10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){ // create new line
            for(int j = 1; j <= i; j++){ // create stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
