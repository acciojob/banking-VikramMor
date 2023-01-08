package com.driver;

public class BankAccount {
    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception {
        if (digits * 9 < sum) {
            throw new Exception("Account Number can not be generated");
        } else {
            String accountNumber;
            for(accountNumber = ""; sum > 9; sum -= 9) {
                accountNumber = accountNumber + "9";
            }

            if (accountNumber.length() < digits) {
                accountNumber = accountNumber + sum;

                for(int count = accountNumber.length(); count < digits; ++count) {
                    accountNumber = accountNumber + "0";
                }
            }

            return accountNumber;
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (this.balance - amount >= this.minBalance) {
            this.balance -= amount;
        } else {
            throw new Exception("Insufficient Balance");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return this.minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
}
