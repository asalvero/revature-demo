package com.company.Day4;

//provides StackOverFlowError

public class Demo11 {
    public static void main(String[] args) {
        try {
            print1();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void print1(){
        print2();
    }

    public static void print2(){
        print1();

    }
}
