package com.company;

//Look at JavaDemo/Day1/Demo16-17
// Look at JavaDemo/Day2/Demo1-4

class Phone{ //constructor
    // member variable
    public String brand;
    public String model;
    private String moniker;
    public int price;

    public Phone(){

    }

    public Phone(String brand, String model, String moniker, int price){
        this.brand = brand;
        this.model = model;
        this.moniker = moniker;
        this.price = price;
    }

    public void display(){
        System.out.println("Phone: Brand = "+ brand+", Model = "+ model+", Moniker: "+moniker+", Price = "+ price);
    }

}

public class Constructor {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "iPhone", "X",  1000);
        phone1.display();

        Phone phone2 = new Phone();
        phone2.brand = "Google";// cannot be performed with private modifier
        phone2.model = "Pixel";
        phone2.price = 1000;
        phone2.display();
    }
}
