package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class SavingsAccount extends BankAccount {

    public  SavingsAccount (String str){
        super(str);
        System.out.println("the savings account para constructor invoked");
        System.out.println(str);

    }
}
