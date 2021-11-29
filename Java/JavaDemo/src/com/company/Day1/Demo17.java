package com.company;

class Book2{ //constructor
    //member variable
    private String title;
    private String author;
    private int price;

    public Book2(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //member method
    public void display(){
        System.out.println("Book: Title = "+ title+", Author = "+ author+", Price = "+ price);
    }
}

public class Demo17 {
    public static void main(String[] args) {
        Book2 book1 = new Book2("Title 1", "Author 1", 100);
        book1.display();

        Book2 book2 = new Book2("Title 2", "Author 2", 200);
        book2.display();
    }
}
