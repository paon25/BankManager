package com.bankmanager;

/**
 * Classe principale — point d'entrée de l'application BankManager.
 */
public class Main {

    public static void main(String[] args) {

        // Création d'un compte courant
        CheckingAccount checking = new CheckingAccount("CHK-001", 500000, 100000);
        System.out.println(checking);

        // Modification des attributs hérités
        checking.setAccount("CHK-001-UPDATED");
        checking.setBalance(600000);
        System.out.println("Après modification : " + checking.getAccount() + " / " + checking.getBalance());

        // Création d'un compte épargne
        SavingsAccount savings = new SavingsAccount("SAV-002", 1500000, 0.05);
        System.out.println(savings);

        // Création d'un certificat de dépôt
        COD cod = new COD("COD-003", 2000000, "2026-12-31");
        System.out.println(cod);
    }
}