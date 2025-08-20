package com.xworkz.bankapp;
import com.xworkz.bankapp.bankaccount.BankAccount;

public class BankRunner {
    public static void main(String[] args) {
        BankAccount smiAccount = new BankAccount();
        smiAccount.credit(10000.00);


        BankAccount friendAccount = new BankAccount();
        smiAccount.transfer(friendAccount, 500.00);
        System.out.println("the available balance:"+smiAccount.getBalance());
        System.out.println("the available balance :" +friendAccount.getBalance());
    }
}
