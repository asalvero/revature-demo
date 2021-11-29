package com.company;

class Family{
    private String name;
    private String relationship;
    private int age;

    public Family(String name, String relationship, int age){
        this.name = name;
        this.relationship = relationship;
        this.age = age;
    }

    public void display(){
        //System.out.println("Name: " + name + ", Relationship: " + relationship + ", Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Relationship: "+ relationship);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Family parent1 = new Family("Joe Villagio", "Father", 32);
        parent1.display();

        Family child1 = new Family("Joey Villagio", "Son", 12);
        child1.display();
    }
}
