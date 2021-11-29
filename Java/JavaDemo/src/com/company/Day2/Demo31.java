package com.company.Day2;

interface X2{
    void print();
    interface Y2{
        void display();
    }
}

class Z2 implements X2, X2.Y2{

    @Override
    public void print() {

    }

    @Override
    public void display() {

    }
}

public class Demo31 {
    public static void main(String[] args) {

    }
}
