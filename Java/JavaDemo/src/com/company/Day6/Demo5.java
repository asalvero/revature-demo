package com.company.Day6;

class Calculator{

    public boolean areEquals(int a, int b) {
        if(a==b){
            return true;
        }else{
            return false;
        }
    }

    public boolean areEquals(double a, double b) {
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean result = calculator.areEquals(10.23, 10.24);
        if(result){
            System.out.println("Are equal");
        } else{
            System.out.println("Not equal");
        }
    }
}
