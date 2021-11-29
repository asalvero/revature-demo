package com.company.Day4;

public class Demo2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c = 0;

        try{
            c = a / b;
            System.out.println(c);
        }catch(ArithmeticException ex){
            System.out.println("Arithmetic Exception");
        }catch(NumberFormatException ex){
            System.out.println("Format Exception");
        }catch(Exception ex){
            System.out.println("Exception caught");
        }


    }
}
