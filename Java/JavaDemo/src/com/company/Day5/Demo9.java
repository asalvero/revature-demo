package com.company.Day5;

class Bank{
    int balance = 10000;

    synchronized void withdraw(int amount){
        if(balance < amount){
            System.out.println("balance insufficient");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            balance -= amount;
            System.out.println("withdraw completed");


    }

    synchronized void deposit(int amount){
        System.out.println("Deposit processing");
        balance += amount;
        System.out.println("deposit completed");
        notify();
    }
}

class DepositThread extends Thread{
    Bank bank;
    public DepositThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.deposit(10000);
    }
}

class WithdrawThread extends Thread{
    Bank bank;
    public WithdrawThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.withdraw(15000);
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        DepositThread depositThread = new DepositThread(bank);
        WithdrawThread withdrawThread = new WithdrawThread(bank);

        withdrawThread.start();
        depositThread.start();
    }
}
