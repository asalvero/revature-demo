package com.company.Day2;

interface Foo{
    public String name = "";
    private void display(){ // since it is private when interface is implemented it does not need to be carried over

    }
}

class Baz implements Foo{

}

public class Demo32 {
    public static void main(String[] args) {
        String a = Foo.name;
        System.out.println(a);
    }
}
