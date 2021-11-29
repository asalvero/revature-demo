package com.company.Day5;

class ThreadJoinDemo extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println("Thread name: "+ Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}

public class Demo7 {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();
        ThreadJoinDemo t3 = new ThreadJoinDemo();

        t1.start();
        //t1.join();
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
