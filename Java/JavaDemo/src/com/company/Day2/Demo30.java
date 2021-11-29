package com.company.Day2;

interface Drawable2{
    void draw();
    static void area(){
        System.out.println("getting area...");
    }
}

class Circle2 implements Drawable2{

    @Override
    public void draw() {
        System.out.println("Drawing...");
    }
}

public class Demo30 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2();
        circle.draw();
        //circle.area(); static variable
        Drawable2.area();
    }
}
