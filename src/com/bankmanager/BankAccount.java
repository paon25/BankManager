package com.bankmanager;

/**
 * Classe de base représentant un compte bancaire générique.
 */
public class BankAccount {

    private String account;
    private double balance;

    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() { return account; }
    public void setAccount(String account) { this.account = account; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    @Override
    public String toString() {
        return "Compte: " + account + " | Solde: " + balance + " FCFA";
    }
}