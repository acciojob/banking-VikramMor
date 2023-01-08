package com.driver;

public class SavingsAccount extends BankAccount {
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        super(name, balance, 0.0D);
        this.rate = rate;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= this.maxWithdrawalLimit) {
            super.withdraw(amount);
        } else {
            throw new Exception("Maximum Withdraw Limit Exceeded");
        }
    }

    public double getSimpleInterest(int years) {
        return this.getBalance() * (1.0D + this.rate / 100.0D * (double)years);
    }

    public double getCompoundInterest(int times, int years) {
        return this.getBalance() * Math.pow(1.0D + this.rate / 100.0D / (double)times, (double)(times * years));
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMaxWithdrawalLimit() {
        return this.maxWithdrawalLimit;
    }

    public void setMaxWithdrawalLimit(double maxWithdrawalLimit) {
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }
}
