package com.company.Day4;

public class Demo12 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 0;

        try{
            c = a/b;
        }catch (ArithmeticException e){

        }catch (NullPointerException | NumberFormatException e){

        }catch (Exception e){

        }

    }
}
