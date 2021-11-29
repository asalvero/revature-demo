package com.company;

// Look at JavaDemo/Day1/Demo14-15

public class Jump {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            if(i == 5){
                System.out.println("break");
                break;
            }
            System.out.println(i);
        }

        System.out.println();

        for(int i = 1; i <= 10; i++){
            if(i == 5){
                System.out.println();
                continue; //will skip 5
            }
            System.out.println(i);
        }
    }
}
