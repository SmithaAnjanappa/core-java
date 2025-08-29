package com.xworkz.bankapp.bankaccount;

public class BankAccount {

    public  BankAccount(String str){
        super();
        System.out.println("the bank account para  constructor invoked");
        System.out.println(str);
    }

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void debit(double amount){
        balance=balance-amount;
    }

    public void credit(double amount){
        balance=balance+amount;
    }


    public void transfer(BankAccount beneficiaryAccount , double amount){
        this.debit(amount);
        beneficiaryAccount.credit(amount);


    }
    public static void dummy(){
        System.out.println("the dummy method invoked");
    }

}
