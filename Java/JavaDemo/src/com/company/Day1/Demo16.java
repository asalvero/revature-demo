package com.company;

/**
 * Book - title, author, price
 * */

class Book{
    //member variable
    public String title;
    public String author;
    public int price;

    //member method
    public void display(){
        System.out.println("Book: Title = "+title+", Author = "+author+", Price = "+price);
    }
}

public class Demo16 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Title 1";
        book1.author = "Author 1";
        book1.price = 100;

        Book book2 = new Book();
        book2.title = "Title 2";
        book2.author = "Author 2";
        book2.price = 200;

        book1.display();
        book2.display();

        //System.out.println("Book: Title = "+book1.title+", Author = "+book1.author+", Price = "+book1.price);
        //System.out.println("Book: Title = "+book2.title+", Author = "+book2.author+", Price = "+book2.price);

    }
}
