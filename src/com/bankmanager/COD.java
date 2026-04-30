package com.bankmanager;

/**
 * Certificate of Deposit (COD) - extends BankAccount.
 * Adds a maturity date.
 */
public class COD extends BankAccount {

    private String maturityDate;

    public COD(String account, double balance, String maturityDate) {
        super(account, balance);
        this.maturityDate = maturityDate;
    }

    public String getMaturityDate() { return maturityDate; }
    public void setMaturityDate(String maturityDate) { this.maturityDate = maturityDate; }

    @Override
    public String toString() {
        return super.toString() + " | Échéance: " + maturityDate + " [COD]";
    }
}