package com.company.Day4;

class InsufficientFundException extends Exception{
    public InsufficientFundException(){
        System.out.println("Insufficient amount requested");
    }

    public InsufficientFundException(String message){
        System.out.println();
    }
}

class BankAccount{
    private int balance = 0;
    private int accountNumber;

    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Amount credited: " + amount);
    }

    public void withdraw(int amount) throws InsufficientFundException {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount debited: "+ amount);
        }else{
            throw new InsufficientFundException("Sorry we don't have sufficient balance");
        }
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456);
        System.out.println(account.getBalance());
        account.deposit(5000);
        try{
            account.withdraw(2000);
        }catch(InsufficientFundException ex){
            ex.printStackTrace();
        }
        account.deposit(1000);
        try{
            account.withdraw(10000);
        }catch(InsufficientFundException ex){
            ex.printStackTrace();
        }
    }
}
