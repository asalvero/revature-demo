package com.company.Day5;

public class Demo24 {
    public static void main(String[] args) {
        // converting all primitive type to into its wrapper class
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 12.3f;
        double f = 12.23;
        char g = 'a';
        boolean h = true;

        // autoboxing: converting primitive into object
        Byte byteObj = a;
        Short shortObj = b;

        //unboxing: converting object into primitive
        byte byteValue = byteObj;
        short shortValue = shortObj;
    }
}
