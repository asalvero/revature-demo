package com.company.Day5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo20 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data2.txt", true);
        fw.write(100);// add single character
        fw.write("\n");
        fw.write("This is some message");
        fw.write("\n");
        char[] c1 = {'h', 'e', 'l', 'l', 'o'};
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();
    }
}
