package com.company.Day2;

interface IBankAccount{
    boolean deposit(int amount);
    boolean withdraw(int amount);
    void getBalance();
}

class SavingAccount implements IBankAccount{

    private int _balance; // local variable for the class
    private int _perDayLimit;

    @Override
    public boolean deposit(int amount) {
        _balance += amount;
        System.out.println("Successfully deposited: " + amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if(_balance < amount){
            System.out.println("Insufficient balance");
            return false;
        }else if(_perDayLimit + amount > 5000){
            System.out.println("Withdraw attempt failed");
            return false;
        }else{
            _balance -= amount;
            _perDayLimit += amount;
            System.out.println("Successfully withdraw: " + amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Saving account balance: "+_balance);
    }
}

class CurrentAccount implements IBankAccount{

    private int _balance; // local variable for the class

    @Override
    public boolean deposit(int amount) {
        _balance += amount;
        System.out.println("Successfully deposited: " + amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if(_balance < amount){
            System.out.println("Insufficient balance");
            return false;
        }else{
            _balance -= amount;
            System.out.println("Successfully withdraw: " + amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Saving account balance: "+_balance);
    }
}

public class Demo27 {
    public static void main(String[] args) {
        IBankAccount savingAccount = new SavingAccount();
        IBankAccount currentAccount = new CurrentAccount();

        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.withdraw(6000);
        savingAccount.getBalance();

        System.out.println();

        currentAccount.deposit(5000);
        currentAccount.withdraw(6000);
        currentAccount.withdraw(2000);
        currentAccount.getBalance();
    }
}
