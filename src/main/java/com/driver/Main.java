package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {

        SavingsAccount savingsAccount = new SavingsAccount("Vikram", 1000000, 50000, 8);
        CurrentAccount currentAccount = new CurrentAccount("Vikram Mor", 1000000, "SPRINGBOOT");
        StudentAccount studentAccount = new StudentAccount("Lakshita", 50000000, "IIT BOMBAY");

        System.out.println(savingsAccount.getSimpleInterest(5));
        System.out.println(savingsAccount.getCompoundInterest(10,5));
        System.out.println(savingsAccount.getMaxWithdrawalLimit());

        System.out.println(currentAccount.generateAccountNumber(12,77));
        currentAccount.validateLicenseId();
        System.out.println(currentAccount.getTradeLicenseId());

        System.out.println(studentAccount.getInstitutionName());
    }
}