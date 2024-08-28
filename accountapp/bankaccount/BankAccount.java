package com.xworkz.accountapp.bankaccount;

public class BankAccount {
        public double balance;

        public void credit(double amount){
            System.out.println("credit method started");
            if(amount > 0)
                balance = balance+amount;
            else
                System.out.println("Amount cannot be zero");
            System.out.println("credit method ended");
        }
        public void debit(double amount){
            System.out.println("debit method started");
            if(amount< balance)
                balance=balance-amount;
            else
                System.out.println("insufficient balance");
            System.out.println("debit method ended");
        }
    }

