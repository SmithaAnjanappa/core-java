package com.xworkz.bankapp;

import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankRunner {
    BankRunner(String str){
        super();
        System.out.println("the bank runner constructor invoked");
        System.out.println(str);
    }

    public static void main(String[] args) {
       /* BankAccount smiAccount = new BankAccount();
        smiAccount.credit(10000.00);


        BankAccount friendAccount = new BankAccount();
        smiAccount.transfer(friendAccount, 500.00);
        System.out.println("the available balance:"+smiAccount.getBalance());
        System.out.println("the available balance :" +friendAccount.getBalance());*/

        SavingsAccount smithaAccount = new SavingsAccount("");
        smithaAccount.credit(15000);
        System.out.println("the smitha account balance is:"+smithaAccount.getBalance());


        SavingsAccount momsAccount = new SavingsAccount("");
        smithaAccount.transfer(momsAccount , 1000);
        System.out.println("the balance of smitha account is:"+smithaAccount.getBalance());
        System.out.println("the balance of moms account is:"+momsAccount.getBalance());

        SavingsAccount dadsAccount = new SavingsAccount("");
        smithaAccount.transfer(dadsAccount,500);
        System.out.println("the balance of smitha account is:"+smithaAccount.getBalance());
        System.out.println("the balance of dads account is:"+dadsAccount.getBalance());


        SavingsAccount brosAccount = new SavingsAccount("");
        dadsAccount.transfer(brosAccount , 200);
        System.out.println("the balance of dads account is:"+dadsAccount.getBalance());
        System.out.println("the balance of bros account is:"+brosAccount.getBalance());


        BankAccount gowthuAccount = new BankAccount("");
        brosAccount.transfer(smithaAccount,50);
        System.out.println("the balance of gowthu account is" +brosAccount.getBalance());
        System.out.println("the smitha account balance: "+smithaAccount.getBalance());

        SavingsAccount.dummy(); //not valid but it will run
        BankAccount.dummy(); // valid because static should be invoked through same class name

    }
}
