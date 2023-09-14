package com.itacademy.javacore.lesson18.task03;

public class Main {
    public static void main(String[] args) {

//        Account account1 = new Account(12345, 100.00);
//
//        account1.withdraw(55.00);
//        print(account1);
//        account1.deposit(40.00);
//        print(account1);

        CurrentAccount current = new CurrentAccount(12346, 100.00, 50.00);
        current.withdraw(50.00);
        print(current);
        current.withdraw(55.00);
        print(current);
        current.deposit(50.00);
        print(current);

        SavingAccount savings = new SavingAccount(12347, 100.00, 15);
        savings.deposit(100.00);
        print(savings);
        savings.addInterest();
        print(savings);

    }

    public static void print (Account account){
        System.out.println("Actual balance for account " + account.getAccountNumber() + " is " + account.getBalance() +
                ".");
    }
}
