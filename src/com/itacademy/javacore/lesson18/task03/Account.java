package com.itacademy.javacore.lesson18.task03;

import java.util.Objects;

public class Account {
   private int accountNumber;
   private double balance;

   public Account(int accountNumber, double balance){
       this.accountNumber = accountNumber;
       this.balance = balance;
   }

   public double deposit(double sum){
       if (sum < 0){
           throw new RuntimeException("Deposit can't be negative.");
       }
       balance = balance + sum;
       return balance;
   }
   public double withdraw(double sum){
       if (sum > balance){
           throw new RuntimeException("Not enough money.");
       }
       balance = balance - sum;
       return balance;
   }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber && Double.compare(account.balance, balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
