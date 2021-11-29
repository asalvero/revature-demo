package com.company.Day6;

// how to decouple

class Engine{
    public Engine(String type){
        System.out.println("Engine created");
    }
}

class Tire{
    public Tire(String type){
        System.out.println("Tire created");
    }
}

class Car{
    Engine engine;
    Tire tire;

    public Car(Engine engine, Tire tire){
        this.engine = engine;
        this.tire = tire;
        System.out.println("Car created");
    }
}

public class Demo16 {
    public static void main(String[] args) {
        //Car car = new Car();
    }
}
