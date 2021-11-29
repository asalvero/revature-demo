package com.company.Day5;

class Company{
    int item;
    boolean flag = false;
    // flag = false it is producer turn
    // flag = true it is consumer turn

    synchronized void producer(int item) throws InterruptedException {
        if(flag == true){
            wait();
        }
        this.item = item;
        System.out.println("Producer: "+ this.item);
        flag = true;
        notify();
    }

    synchronized int consumer(int item) throws InterruptedException {
        if(flag != true){
            wait();
        }
        System.out.println("Consumer: "+ item);
        flag = false;
        notify();
        return item;
    }
}

class Producer extends Thread{
    Company company;
    public Producer(Company company){
        this.company = company;
    }

    @Override
    public void run() {
        try {
            company.producer(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread{
    Company company;
    public Consumer(Company company){
        this.company = company;
    }

    @Override
    public void run() {
        try {
            company.consumer(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Demo13 {
    public static void main(String[] args) {
        Company company = new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);
        producer.start();
        consumer.start();
    }
}
