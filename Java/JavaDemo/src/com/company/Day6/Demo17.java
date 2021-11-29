package com.company.Day6;

import java.io.*;

class Customer implements Serializable {
    int id;
    String name;
    String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

public class Demo17 {
    public static void main(String[] args) {
        //creating the object
        Customer customer1 = new Customer(101, "Mark", "m@gmail.com");

        //creating the stream and writing the object
        try {
            FileOutputStream fout = new FileOutputStream("cust.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(customer1);
            out.flush();
            //closing the stream
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
