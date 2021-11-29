package com.company;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        //String line = in.nextLine();
        int i = 1;
        while(in.hasNext()){
            System.out.print(i + " " + in.nextLine());
            i++;
        }

    }
}
