package com.company.Day6;

interface DrawSomething{
    void draw();
}

class Output2 implements DrawSomething{

    @Override
    public void draw() {
        System.out.println("drawing///");
    }
}

public class Demo10 {
    public static void main(String[] args) {
        // without lambda expression
        Output2 obj = new Output2();
        obj.draw();

        DrawSomething d = new DrawSomething() {
            @Override
            public void draw() {
                System.out.println("drawing...");
            }
        };
        d.draw();

        //with lambda expression
        DrawSomething d2 = () -> {
            System.out.println("drawing...");
        };
        d2.draw();
    }
}
