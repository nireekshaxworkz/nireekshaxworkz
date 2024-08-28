package com.xworkz.accountapp;

import com.xworkz.accountapp.bankaccount.BankAccount;

public class AccountRunner {
    public static void main(String[] args) {
        BankAccount savingAccount=new SavingAccount();
        bankAccount.credit(5000.00);
        double closingBalance=savingAccount.fetchBalance;
        System.out.println();
        bankAccount.debit(200.00);
    }
}
