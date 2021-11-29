package com.company.Day2;

class A10{
    //static variable
    static int a = 10;

    //static method
    static{
        a = 20;
        System.out.println(a);
    }

    public void test(){
        a = 30;
        System.out.println(a);
    }
}

public class Demo15 {
    public static void main(String[] args) {
        A10 a1 = new A10();
        a1.test();
    }
}
