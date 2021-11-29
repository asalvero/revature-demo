package com.company.Day2;

//Simple
//class A{
//
//}
//
//class B extends A{
//
//}

//Multilevel
class A{
    public void test1(){

    }
}

class B extends A{
    public void test2(){

    }
}

class C extends B{
    public void test3(){

    }
}

public class Demo7 {
    public static void main(String[] args) {
        A a = new A();
        a.test1();

        B b = new B();
        b.test1();
        b.test2();

        C c = new C();
        c.test1();
        c.test2();
        c.test3();
    }
}
