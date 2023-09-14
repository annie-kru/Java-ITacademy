package com.itacademy.javacore.lesson18.task03;

public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber,balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double withdraw(double sum) {
       if ( sum > (getBalance() + overdraftLimit)) {
           throw new RuntimeException("Not enough money.");
       }
       if (sum < getBalance()){
           setBalance(getBalance() - sum);
           return getBalance();
       } else{
           double overdraft = sum - getBalance();
           setBalance(-1 * overdraft);
           return getBalance();
       }
    }
}
