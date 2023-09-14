package com.itacademy.javacore.lesson18.task03;

public class SavingAccount extends Account{

    private double interestRate;
    public SavingAccount(int accountNumber, double balance, int interestRate) {
        super(accountNumber, balance);
        if (interestRate > 100) {
            throw new RuntimeException("Interest rate can't be higher than 100%.");
        }
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double addInterest(){
        setBalance(getBalance() + (getBalance() * (interestRate / 100)));
        return getBalance();
    }
}
