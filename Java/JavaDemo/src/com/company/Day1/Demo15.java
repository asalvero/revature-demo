package com.company;

public class Demo15 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                System.out.println();
                continue; // will skip 5
            }
            System.out.println(i);
        }
    }
}
