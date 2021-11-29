package com.company.Day2;

class Car{
    public String name;
    public String color;
    public String brand;
    public String engineType;
    public int price;

    public Car(String name, String brand, String color, String engineType, int price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
        this.price = price;
    }

    public Car(Car car){
        this.name = car.name;
        this.brand = car.brand;
        this.color = car.color;
        this.engineType = car.engineType;
        this.price = car.price;
    }

    public Car(Car car, int price){
        this.name = car.name;
        this.brand = car.brand;
        this.color = car.color;
        this.engineType = car.engineType;
        this.price = price;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Car car1 = new Car("A6", "Audi", "Black", "Petrol", 20000);
        Car car2 = new Car(car1);
        Car car3 = new Car(car1, 30000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
