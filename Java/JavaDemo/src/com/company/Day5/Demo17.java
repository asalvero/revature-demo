package com.company.Day5;

import java.io.File;

public class Demo17 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db");
        String[] list = file.list();
        for(String s: list){
            count++;
            System.out.println(s);
        }
    }
}
