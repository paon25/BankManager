package com.bankmanager;

/**
 * Savings account - extends BankAccount.
 * Adds an annual interest rate.
 */
public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String account, double balance, double interestRate) {
        super(account, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    @Override
    public String toString() {
        return super.toString() + " | Taux: " + (interestRate * 100) + "% [Épargne]";
    }
}