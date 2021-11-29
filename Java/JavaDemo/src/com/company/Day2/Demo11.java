package com.company.Day2;

// without static
/*class Counter{
    int count = 0;

    public Counter(){
        count++;
        System.out.println(count);
    }
}
*/

class Counter{
    //static member variable
    static int count = 0;

    public Counter(){
        count++;
        System.out.println(count);
    }
}
public class Demo11 {
    public static void main(String[] args) {
        //counter is incremented once and is called 3x afterwards
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
